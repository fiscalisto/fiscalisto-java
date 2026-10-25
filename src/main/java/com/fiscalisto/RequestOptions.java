package com.fiscalisto;

import java.time.Duration;

/**
 * Lo que cambia en una sola llamada:
 * {@code client.invoices().create(params, RequestOptions.idempotencyKey("pedido-A-1042"))}.
 */
public final class RequestOptions {
    String idempotencyKey;
    Duration timeout;
    Integer maxRetries;

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
