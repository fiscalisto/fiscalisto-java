package com.fiscalisto;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fiscalisto.model.Customer;
import com.fiscalisto.model.Event;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.InvoiceCreate;
import com.fiscalisto.model.InvoiceCreateCustomer;
import com.fiscalisto.model.InvoiceCreateItem;
import com.fiscalisto.model.ListInvoicesParams;
import com.fiscalisto.model.UpdateCustomerParams;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ClientTest {
    interface Handler {
        void handle(HttpExchange ex, String body) throws IOException;
    }

    private HttpServer server;
    private final List<Long> waited = new ArrayList<>();

    @AfterEach
    void stop() {
        if (server != null) server.stop(0);
    }

    private FiscalistoClient client(Handler h) throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", ex -> {
            String body = new String(ex.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            h.handle(ex, body);
            ex.close();
        });
        server.start();
        return new FiscalistoClient(ClientOptions.builder()
                .apiKey("fk_test_abc")
                .baseUrl("http://127.0.0.1:" + server.getAddress().getPort())
                .sleeper(waited::add)
                .build());
    }

    private static void reply(HttpExchange ex, int status, String json) throws IOException {
        byte[] b = json.getBytes(StandardCharsets.UTF_8);
        ex.getResponseHeaders().set("Content-Type", "application/json");
        ex.sendResponseHeaders(status, b.length == 0 ? -1 : b.length);
        if (b.length > 0) ex.getResponseBody().write(b);
    }

    @Test
    void keys() {
        assertThrows(IllegalArgumentException.class, () -> new FiscalistoClient("whsec_x"));
        assertTrue(new FiscalistoClient("fk_live_x").livemode());
        assertFalse(new FiscalistoClient("fk_test_x").livemode());
    }

    @Test
    void createSendsJsonAndKeepsTheIdempotencyKeyOnRetry() throws IOException {
        List<String> keys = new ArrayList<>();
        FiscalistoClient c = client((ex, body) -> {
            assertEquals("Bearer fk_test_abc", ex.getRequestHeaders().getFirst("Authorization"));
            assertTrue(ex.getRequestHeaders().getFirst("User-Agent").startsWith("fiscalisto-java/"));
            keys.add(ex.getRequestHeaders().getFirst("Idempotency-Key"));
            if (keys.size() == 1) {
                reply(ex, 502, "");
                return;
            }
            JsonNode sent = ApiClient.MAPPER.readTree(body);
            assertEquals("cus_1", sent.get("customer").asText());
            assertEquals("03", sent.get("payment_form").asText());
            assertEquals(2500, sent.get("items").get(0).get("unit_price").asInt());
            assertNull(sent.get("series"));
            ex.getResponseHeaders().set("Request-Id", "req_1");
            reply(ex, 200, "{\"id\":\"inv_1\",\"object\":\"invoice\",\"status\":\"valid\",\"customer\":{\"tax_id\":\"XAXX010101000\"},\"total\":116.10,\"uuid\":null,\"extra\":1}");
        });
        Invoice inv = c.invoices().create(new InvoiceCreate()
                .setCustomer("cus_1")
                .setPaymentForm("03")
                .setItems(List.of(new InvoiceCreateItem().setProduct("prd_1").setUnitPrice(2500))));
        assertEquals("inv_1", inv.getId());
        assertEquals(0, new BigDecimal("116.10").compareTo(inv.getTotal()));
        assertNull(inv.getUuid());
        assertEquals(2, keys.size());
        assertNotNull(keys.get(0));
        assertEquals(keys.get(0), keys.get(1));
    }

    @Test
    void ownIdempotencyKeyAndObjectCustomer() throws IOException {
        FiscalistoClient c = client((ex, body) -> {
            assertEquals("pedido-1", ex.getRequestHeaders().getFirst("Idempotency-Key"));
            assertEquals("ICV060329BY0", ApiClient.MAPPER.readTree(body).get("customer").get("tax_id").asText());
            reply(ex, 200, "{\"id\":\"inv_2\"}");
        });
        c.invoices().create(new InvoiceCreate()
                .setCustomer(new InvoiceCreateCustomer().setTaxId("ICV060329BY0").setLegalName("INMOBILIARIA CVA").setTaxSystem("601").setZip("33826"))
                .setItems(List.of()), RequestOptions.idempotencyKey("pedido-1"));
    }

    @Test
    void errors() throws IOException {
        AtomicInteger calls = new AtomicInteger();
        FiscalistoClient c = client((ex, body) -> {
            calls.incrementAndGet();
            assertEquals("/v1/invoices/inv%2F1", ex.getRequestURI().getRawPath());
            ex.getResponseHeaders().set("Request-Id", "req_9");
            reply(ex, 422, "{\"error\":{\"type\":\"invoice_error\",\"code\":\"invoice_rejected\",\"message\":\"El SAT no la aceptó.\",\"sat_code\":\"CFDI40145\",\"request_id\":\"req_9\"}}");
        });
        FiscalistoException e = assertThrows(FiscalistoException.class, () -> c.invoices().get("inv/1"));
        assertEquals(ErrorCode.INVOICE_REJECTED, e.getCode());
        assertEquals("CFDI40145", e.getSatCode());
        assertEquals(422, e.getStatusCode());
        assertEquals("req_9", e.getRequestId());
        assertEquals("El SAT no la aceptó.", e.getMessage());
        assertEquals(1, calls.get());
    }

    @Test
    void postWithoutKeyIsNotRetried() throws IOException {
        AtomicInteger calls = new AtomicInteger();
        FiscalistoClient c = client((ex, body) -> {
            calls.incrementAndGet();
            reply(ex, 500, "");
        });
        FiscalistoException e = assertThrows(FiscalistoException.class, () -> c.customers().update("cus_1", new UpdateCustomerParams()));
        assertEquals(500, e.getStatusCode());
        assertEquals(1, calls.get());
    }

    @Test
    void rateLimitHonorsRetryAfter() throws IOException {
        AtomicInteger calls = new AtomicInteger();
        FiscalistoClient c = client((ex, body) -> {
            if (calls.incrementAndGet() == 1) {
                ex.getResponseHeaders().set("Retry-After", "3");
                reply(ex, 429, "{\"error\":{\"type\":\"rate_limit_error\",\"code\":\"rate_limited\",\"message\":\"x\"}}");
                return;
            }
            reply(ex, 200, "{\"id\":\"cus_1\",\"object\":\"customer\"}");
        });
        Customer cus = c.customers().get("cus_1");
        assertEquals("cus_1", cus.getId());
        assertEquals(List.of(3000L), waited);
    }

    @Test
    void listsPageThemselves() throws IOException {
        FiscalistoClient c = client((ex, body) -> {
            String q = ex.getRequestURI().getQuery();
            assertTrue(q.contains("limit=2") && q.contains("status=valid"), q);
            if (q.contains("starting_after=inv_2"))
                reply(ex, 200, "{\"object\":\"list\",\"data\":[{\"id\":\"inv_3\"}],\"has_more\":false}");
            else
                reply(ex, 200, "{\"object\":\"list\",\"data\":[{\"id\":\"inv_1\"},{\"id\":\"inv_2\"}],\"has_more\":true}");
        });
        ListInvoicesParams params = new ListInvoicesParams().setLimit(2).setStatus("valid");
        List<String> ids = new ArrayList<>();
        for (Invoice inv : c.invoices().listAutoPaging(params)) ids.add(inv.getId());
        assertEquals(List.of("inv_1", "inv_2", "inv_3"), ids);
        var page = c.invoices().list(params);
        assertEquals(2, page.getData().size());
        assertTrue(page.hasMore());
        assertNull(page.next().next());
    }

    @Test
    void bytes() throws IOException {
        FiscalistoClient c = client((ex, body) -> {
            assertEquals("/v1/invoices/inv_1/pdf", ex.getRequestURI().getPath());
            byte[] b = "%PDF-1.7".getBytes(StandardCharsets.UTF_8);
            ex.sendResponseHeaders(200, b.length);
            ex.getResponseBody().write(b);
        });
        assertEquals("%PDF-1.7", new String(c.invoices().pdf("inv_1"), StandardCharsets.UTF_8));
    }

    @Test
    void connectionError() {
        FiscalistoClient c = new FiscalistoClient(ClientOptions.builder()
                .apiKey("fk_test_abc").baseUrl("http://127.0.0.1:1").maxRetries(0).build());
        FiscalistoException e = assertThrows(FiscalistoException.class, () -> c.customers().get("cus_1"));
        assertEquals("connection_error", e.getType());
        assertEquals(ErrorCode.CONNECTION_FAILED, e.getCode());
        assertEquals(0, e.getStatusCode());
    }

    private static JsonNode fixture(String name) throws IOException {
        return ApiClient.MAPPER.readTree(Files.readString(Path.of("../fixtures/" + name)));
    }

    @Test
    void everyRouteHasAMethod() throws IOException {
        FiscalistoClient c = new FiscalistoClient("fk_test_x");
        var calls = fixture("calls.json");
        calls.fields().forEachRemaining(e -> {
            String[] call = e.getValue().get("java").asText().split("\\.");
            try {
                Object svc = FiscalistoClient.class.getMethod(call[0]).invoke(c);
                boolean found = false;
                for (Method m : svc.getClass().getMethods()) found |= m.getName().equals(call[1]);
                assertTrue(found, e.getKey());
            } catch (ReflectiveOperationException ex) {
                fail(e.getKey() + ": " + ex);
            }
        });
    }

    @Test
    void sharedWebhookVector() throws IOException {
        JsonNode v = fixture("webhook.json");
        Map<String, Object> h = new HashMap<>();
        v.get("headers").fields().forEachRemaining(e -> h.put(e.getKey(), e.getValue().asText()));
        String secret = v.get("secret").asText();
        byte[] body = v.get("body").asText().getBytes(StandardCharsets.UTF_8);
        Instant at = Instant.ofEpochSecond(v.get("timestamp").asLong());
        Event event = Webhooks.verify(body, h, secret, at, Webhooks.DEFAULT_TOLERANCE);
        assertEquals("invoice.stamped", event.getType());
        assertNotNull(event.dataObject(Invoice.class).getId());
        // Spring's and the Servlet's headers: any case, lists of values.
        Map<String, Object> spring = new HashMap<>();
        h.forEach((k, val) -> spring.put(k.toUpperCase(), List.of(val)));
        spring.put("WEBHOOK-SIGNATURE", List.of(v.get("overlap_signature").asText()));
        Webhooks.verify(body, spring, secret, at, Webhooks.DEFAULT_TOLERANCE);
        h.put("webhook-signature", v.get("wrong_signature").asText());
        assertThrows(Webhooks.VerificationException.class, () -> Webhooks.verify(body, h, secret, at, Webhooks.DEFAULT_TOLERANCE));
        h.put("webhook-signature", v.get("headers").get("webhook-signature").asText());
        assertThrows(Webhooks.VerificationException.class,
                () -> Webhooks.verify(body, h, secret, at.plus(Duration.ofMinutes(10)), Webhooks.DEFAULT_TOLERANCE));
    }
}
