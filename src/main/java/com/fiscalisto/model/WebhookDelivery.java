// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookDelivery: Lo que pasó con un evento en un webhook: su último intento, cuántos lleva y cuándo va el siguiente.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookDelivery {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El último intento (whd_…). Úselo en starting_after para la página siguiente.
     */
    @JsonProperty("id")
    private String id;

    /**
     * El webhook (whe_…).
     */
    @JsonProperty("webhook_endpoint")
    private String webhookEndpoint;

    /**
     * El evento (evt_…). Reenvíelo con POST /v1/events/{id}/resend.
     */
    @JsonProperty("event")
    private String event;

    /**
     * El tipo del evento (invoice.stamped…).
     */
    @JsonProperty("event_type")
    private String eventType;

    /**
     * true si su servidor contestó 2xx en el último intento.
     */
    @JsonProperty("succeeded")
    private Boolean succeeded;

    /**
     * El código HTTP que contestó su servidor; null si no se pudo conectar.
     */
    @JsonProperty("status")
    private Long status;

    /**
     * Qué falló (tiempo de espera, DNS, o el inicio de su respuesta); null si llegó.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Cuánto tardó su servidor en contestar el último intento.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Cuántas veces se ha mandado a este webhook, reenvíos incluidos.
     */
    @JsonProperty("attempts")
    private Long attempts;

    /**
     * true si el último intento fue un reenvío (POST /v1/events/{id}/resend).
     */
    @JsonProperty("resent")
    private Boolean resent;

    /**
     * true si es un evento de prueba (POST /v1/webhook_endpoints/{id}/test); no se reintenta.
     */
    @JsonProperty("test")
    private Boolean test;

    /**
     * Cuándo fue el último intento.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo va el siguiente reintento automático; null si llegó o ya no hay más.
     */
    @JsonProperty("next_retry_at")
    private String nextRetryAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public WebhookDelivery setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El último intento (whd_…). Úselo en starting_after para la página siguiente.
     */
    public String getId() {
        return id;
    }

    public WebhookDelivery setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * El webhook (whe_…).
     */
    public String getWebhookEndpoint() {
        return webhookEndpoint;
    }

    public WebhookDelivery setWebhookEndpoint(String webhookEndpoint) {
        this.webhookEndpoint = webhookEndpoint;
        return this;
    }

    /**
     * El evento (evt_…). Reenvíelo con POST /v1/events/{id}/resend.
     */
    public String getEvent() {
        return event;
    }

    public WebhookDelivery setEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * El tipo del evento (invoice.stamped…).
     */
    public String getEventType() {
        return eventType;
    }

    public WebhookDelivery setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * true si su servidor contestó 2xx en el último intento.
     */
    public Boolean getSucceeded() {
        return succeeded;
    }

    public WebhookDelivery setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * El código HTTP que contestó su servidor; null si no se pudo conectar.
     */
    public Long getStatus() {
        return status;
    }

    public WebhookDelivery setStatus(Long status) {
        this.status = status;
        return this;
    }

    @JsonIgnore
    public WebhookDelivery setStatus(long status) {
        return setStatus(Long.valueOf(status));
    }

    /**
     * Qué falló (tiempo de espera, DNS, o el inicio de su respuesta); null si llegó.
     */
    public String getError() {
        return error;
    }

    public WebhookDelivery setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Cuánto tardó su servidor en contestar el último intento.
     */
    public Long getDurationMs() {
        return durationMs;
    }

    public WebhookDelivery setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @JsonIgnore
    public WebhookDelivery setDurationMs(long durationMs) {
        return setDurationMs(Long.valueOf(durationMs));
    }

    /**
     * Cuántas veces se ha mandado a este webhook, reenvíos incluidos.
     */
    public Long getAttempts() {
        return attempts;
    }

    public WebhookDelivery setAttempts(Long attempts) {
        this.attempts = attempts;
        return this;
    }

    @JsonIgnore
    public WebhookDelivery setAttempts(long attempts) {
        return setAttempts(Long.valueOf(attempts));
    }

    /**
     * true si el último intento fue un reenvío (POST /v1/events/{id}/resend).
     */
    public Boolean getResent() {
        return resent;
    }

    public WebhookDelivery setResent(Boolean resent) {
        this.resent = resent;
        return this;
    }

    /**
     * true si es un evento de prueba (POST /v1/webhook_endpoints/{id}/test); no se reintenta.
     */
    public Boolean getTest() {
        return test;
    }

    public WebhookDelivery setTest(Boolean test) {
        this.test = test;
        return this;
    }

    /**
     * Cuándo fue el último intento.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public WebhookDelivery setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo va el siguiente reintento automático; null si llegó o ya no hay más.
     */
    public String getNextRetryAt() {
        return nextRetryAt;
    }

    public WebhookDelivery setNextRetryAt(String nextRetryAt) {
        this.nextRetryAt = nextRetryAt;
        return this;
    }
}
