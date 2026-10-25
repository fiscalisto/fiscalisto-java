// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookTestDelivery: Cómo le fue: ok si contestó 2xx, el código, el error y el inicio de su respuesta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookTestDelivery {
    /**
     * true si su servidor contestó 2xx.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * El código HTTP que contestó; null si no se pudo conectar.
     */
    @JsonProperty("status")
    private Long status;

    /**
     * Qué falló (sin respuesta, no se pudo conectar, otro código), o null.
     */
    @JsonProperty("error")
    private String error;

    /**
     * El inicio de lo que contestó su servidor (hasta 2,000 caracteres).
     */
    @JsonProperty("response_body")
    private String responseBody;

    /**
     * Cuánto tardó su servidor, en milisegundos.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * true si su servidor contestó 2xx.
     */
    public Boolean getOk() {
        return ok;
    }

    public WebhookTestDelivery setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * El código HTTP que contestó; null si no se pudo conectar.
     */
    public Long getStatus() {
        return status;
    }

    public WebhookTestDelivery setStatus(Long status) {
        this.status = status;
        return this;
    }

    public WebhookTestDelivery setStatus(long status) {
        return setStatus(Long.valueOf(status));
    }

    /**
     * Qué falló (sin respuesta, no se pudo conectar, otro código), o null.
     */
    public String getError() {
        return error;
    }

    public WebhookTestDelivery setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * El inicio de lo que contestó su servidor (hasta 2,000 caracteres).
     */
    public String getResponseBody() {
        return responseBody;
    }

    public WebhookTestDelivery setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    /**
     * Cuánto tardó su servidor, en milisegundos.
     */
    public Long getDurationMs() {
        return durationMs;
    }

    public WebhookTestDelivery setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public WebhookTestDelivery setDurationMs(long durationMs) {
        return setDurationMs(Long.valueOf(durationMs));
    }
}
