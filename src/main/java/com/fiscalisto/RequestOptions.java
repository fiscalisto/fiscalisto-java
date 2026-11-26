package com.fiscalisto;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lo que cambia en una sola llamada:
 * {@code client.invoices().create(params, RequestOptions.idempotencyKey("pedido-A-1042"))}.
 */
public final class RequestOptions {
    String idempotencyKey;
    Duration timeout;
    Integer maxRetries;
    final List<String> expand = new ArrayList<>();

    public static RequestOptions builder() {
        return new RequestOptions();
    }

    /**
     * Su propia Idempotency-Key (la de su pedido, por ejemplo): repetir la llamada con la misma
     * llave devuelve el mismo comprobante, nunca uno nuevo.
     */
    public static RequestOptions idempotencyKey(String key) {
        return new RequestOptions().setIdempotencyKey(key);
    }

    /**
     * Que esos campos, que guardan el id de otro objeto, lleguen como el objeto completo
     * (expand[], https://fiscalisto.com/docs/api/expandir). El campo es un {@link StringOr}:
     * {@code invoice.getIssuer().getObject()} trae el emisor, {@code getId()} su id.
     * <p>
     * {@code client.invoices().get("inv_…", null, RequestOptions.expand("issuer", "recurring_invoice"))}
     */
    public static RequestOptions expand(String... fields) {
        return new RequestOptions().addExpand(fields);
    }

    /** Agrega campos a expandir: vea {@link #expand(String...)}. */
    public RequestOptions addExpand(String... fields) {
        expand.addAll(Arrays.asList(fields));
        return this;
    }

    public RequestOptions setIdempotencyKey(String key) {
        this.idempotencyKey = key;
        return this;
    }

    /** La espera de esta llamada. */
    public RequestOptions setTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /** Los reintentos de esta llamada. */
    public RequestOptions setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
}
