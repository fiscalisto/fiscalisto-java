package com.fiscalisto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Lo que hace cada llamada del SDK: la llave, la Idempotency-Key, los reintentos seguros, los
 * errores y las listas. Los servicios generados solo dicen qué ruta llamar.
 */
public final class ApiClient {
    /** La versión del SDK, en el User-Agent. */
    public static final String VERSION = "0.1.1";
    /** La versión de la API para la que se hizo este SDK (cabecera Fiscalisto-Version). */
    public static final String API_VERSION = "2026-10-24";

    /** El ObjectMapper del SDK: campos desconocidos se ignoran; nulls no se mandan. */
    public static final ObjectMapper MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    interface Sleeper {
        void sleep(long millis) throws InterruptedException;
    }

    private final String key;
    private final String baseUrl;
    private final String apiVersion;
    private final String language;
    private final int maxRetries;
    private final Duration timeout;
    private final HttpClient http;
    private final Sleeper sleeper;

    ApiClient(ClientOptions options) {
        String k = options.apiKey != null ? options.apiKey : System.getenv("FISCALISTO_API_KEY");
        if (k == null || k.isEmpty())
            throw new IllegalArgumentException("Falta la llave de la API: new FiscalistoClient(\"fk_test_…\") o la variable "
                    + "FISCALISTO_API_KEY. Créela en Desarrolladores › Llaves.");
        if (!k.startsWith("fk_live_") && !k.startsWith("fk_test_"))
            throw new IllegalArgumentException(
                    "La llave de la API empieza con fk_live_ o fk_test_. (Un secreto whsec_ es para verificar webhooks.)");
        this.key = k;
        this.baseUrl = options.baseUrl;
        this.apiVersion = options.apiVersion;
        this.language = options.language;
        this.maxRetries = options.maxRetries;
        this.timeout = options.timeout;
        // Over plain http (fiscalisto mock, a local proxy) HTTP/2 would start with an h2c upgrade that
        // most local servers drop without answering: HTTP/1.1 there, HTTP/2 over https.
        this.http = options.httpClient != null
                ? options.httpClient
                : HttpClient.newBuilder()
                        .connectTimeout(Duration.ofSeconds(30))
                        .version(options.baseUrl.startsWith("http://")
                                ? HttpClient.Version.HTTP_1_1
                                : HttpClient.Version.HTTP_2)
                        .build();
        this.sleeper = options.sleeper;
    }

    boolean livemode() {
        return key.startsWith("fk_live_");
    }

    /** A path segment, escaped. */
    static String encode(String segment) {
        return URLEncoder.encode(segment, StandardCharsets.UTF_8).replace("+", "%20");
    }

    <T> T request(String method, String path, Object body, Object query, boolean idempotent, Class<T> type, RequestOptions options) {
        return read(answer(method, path, body, query, idempotent, options), MAPPER.constructType(type));
    }

    <T> Page<T> list(String path, Object query, Class<T> item, RequestOptions options) {
        return list(path, queryOf(query), null, item, options);
    }

    private <T> Page<T> list(String path, Map<String, String> query, String startingAfter, Class<T> item, RequestOptions options) {
        Map<String, String> q = new java.util.LinkedHashMap<>(query);
        if (startingAfter != null) q.put("starting_after", startingAfter);
        JavaType type = MAPPER.getTypeFactory().constructParametricType(Page.class, item);
        Page<T> page = read(answer("GET", path, null, q, false, options), type);
        page.setFetch(after -> list(path, query, after, item, options));
        return page;
    }

    /** A success's body, with what an unreadable one needs to say where it came from. */
    private record Answer(byte[] body, int status, String requestId) {}

    private static <T> T read(Answer answer, JavaType type) {
        try {
            if (new String(answer.body(), StandardCharsets.UTF_8).isBlank()) throw new JsonParseException(null, "vacía");
            return MAPPER.readValue(answer.body(), type);
        } catch (JsonParseException e) {
            throw invalidResponse(answer, e);
        } catch (IOException e) {
            throw new IllegalStateException("La respuesta de la API no se pudo leer: " + e.getMessage(), e);
        }
    }

    /** A success that isn't the API's JSON: a proxy's or a network portal's page answered instead. */
    private static FiscalistoException invalidResponse(Answer answer, Exception cause) {
        String text = new String(answer.body(), StandardCharsets.UTF_8).trim().replaceAll("\\s+", " ");
        if (text.length() > 80) text = text.substring(0, 80);
        ObjectNode raw = JsonNodeFactory.instance.objectNode();
        raw.put("type", "api_error");
        raw.put("code", ErrorCode.INVALID_RESPONSE);
        raw.put("message", "La respuesta (" + answer.status() + ") no es de la API: " + (text.isEmpty() ? "vacía" : text)
                + ". ¿Hay un proxy o un portal de por medio?");
        return new FiscalistoException(raw, answer.status(), answer.requestId(), null, cause);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, String> queryOf(Object params) {
        Map<String, String> out = new java.util.LinkedHashMap<>();
        if (params == null) return out;
        if (params instanceof Map<?, ?> m && m.values().stream().allMatch(v -> v instanceof String)) {
            ((Map<String, String>) m).forEach(out::put);
            return out;
        }
        JsonNode tree = MAPPER.valueToTree(params);
        tree.fields().forEachRemaining(e -> {
            JsonNode v = e.getValue();
            if (v.isNull()) return;
            if (!v.isValueNode()) throw new IllegalArgumentException(e.getKey() + " no va en la dirección.");
            out.put(e.getKey(), v.asText());
        });
        return out;
    }

    /** 0.5 s, 1 s, 2 s… hasta 8 s, con algo de azar para no llegar todos juntos. */
    private static long backoff(int attempt) {
        double d = Math.min(8.0, 0.5 * Math.pow(2, attempt));
        return (long) (d * (0.75 + ThreadLocalRandom.current().nextDouble() / 2) * 1000);
    }

    byte[] bytes(String method, String path, Object body, Object query, boolean idempotent, RequestOptions options) {
        return answer(method, path, body, query, idempotent, options).body();
    }

    private Answer answer(String method, String path, Object body, Object query, boolean idempotent, RequestOptions options) {
        RequestOptions o = options != null ? options : new RequestOptions();
        int retries = o.maxRetries != null ? o.maxRetries : maxRetries;
        Duration wait = o.timeout != null ? o.timeout : timeout;
        Map<String, String> q = queryOf(query);
        StringJoiner qs = new StringJoiner("&");
        q.forEach((k, v) -> qs.add(URLEncoder.encode(k, StandardCharsets.UTF_8) + "=" + URLEncoder.encode(v, StandardCharsets.UTF_8)));
        URI uri = URI.create(baseUrl + path + (q.isEmpty() ? "" : "?" + qs));
        byte[] data = null;
        if (method.equals("POST")) {
            try {
                data = body == null ? "{}".getBytes(StandardCharsets.UTF_8) : MAPPER.writeValueAsBytes(body);
            } catch (JsonProcessingException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        }
        String idempotencyKey = idempotent ? (o.idempotencyKey != null ? o.idempotencyKey : UUID.randomUUID().toString()) : null;
        // Only what can't do something twice is repeated after a failure we can't see through:
        // reads, deletes and requests with an Idempotency-Key. A 429 was never processed.
        boolean safe = method.equals("GET") || method.equals("DELETE") || idempotencyKey != null;

        HttpRequest.Builder req = HttpRequest.newBuilder(uri)
                .timeout(wait)
                .header("Authorization", "Bearer " + key)
                .header("User-Agent", "fiscalisto-java/" + VERSION)
                .header("Accept", "application/json")
                .method(method, data == null ? HttpRequest.BodyPublishers.noBody() : HttpRequest.BodyPublishers.ofByteArray(data));
        if (apiVersion != null) req.header("Fiscalisto-Version", apiVersion);
        if (language != null) req.header("Accept-Language", language);
        if (data != null) req.header("Content-Type", "application/json");
        if (idempotencyKey != null) req.header("Idempotency-Key", idempotencyKey);
        HttpRequest request = req.build();

        for (int attempt = 0; ; attempt++) {
            HttpResponse<byte[]> res;
            try {
                res = http.send(request, HttpResponse.BodyHandlers.ofByteArray());
            } catch (IOException e) {
                if (safe && attempt < retries) {
                    pause(backoff(attempt));
                    continue;
                }
                throw connectionError(e, idempotencyKey, wait);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw connectionError(e, idempotencyKey, wait);
            }
            int status = res.statusCode();
            String requestId = res.headers().firstValue("request-id").orElse(null);
            if (status >= 200 && status < 300) return new Answer(res.body(), status, requestId);
            JsonNode raw = null;
            try {
                JsonNode parsed = MAPPER.readTree(res.body());
                if (parsed != null && parsed.get("error") instanceof ObjectNode err) raw = err;
            } catch (IOException ignored) {
                // Not JSON: a proxy's page.
            }
            if (raw == null) raw = JsonNodeFactory.instance.objectNode();
            double retryAfter = res.headers().firstValue("retry-after").map(ApiClient::number).orElse(0.0);
            JsonNode code = raw.get("code");
            boolean retryable = status == 429
                    || (code != null && ErrorCode.REQUEST_IN_PROGRESS.equals(code.asText()))
                    || (safe && status >= 500);
            if (retryable && attempt < retries && retryAfter <= 60) {
                pause(retryAfter > 0 ? (long) (retryAfter * 1000) : backoff(attempt));
                continue;
            }
            throw new FiscalistoException(raw, status, requestId, idempotencyKey, null);
        }
    }

    private static double number(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void pause(long millis) {
        try {
            sleeper.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    private static FiscalistoException connectionError(Exception e, String idempotencyKey, Duration wait) {
        boolean timedOut = e instanceof HttpTimeoutException;
        ObjectNode raw = JsonNodeFactory.instance.objectNode();
        raw.put("type", "connection_error");
        raw.put("code", timedOut ? ErrorCode.TIMEOUT : ErrorCode.CONNECTION_FAILED);
        String hint = idempotencyKey != null
                ? " Repita con la misma Idempotency-Key (" + idempotencyKey + ") para saber si se timbró."
                : "";
        raw.put("message", timedOut
                ? "La API no contestó en " + wait.toSeconds() + " s." + hint
                : "No se pudo conectar con la API: " + e);
        return new FiscalistoException(raw, 0, null, idempotencyKey, e);
    }
}
