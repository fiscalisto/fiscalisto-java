// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * WebhookRecovery: Los eventos que un webhook no recibió, mandados otra vez: desde cuándo se buscaron, cuántos salieron y, si quedaron más de 1,000, desde dónde seguir.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookRecovery {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El webhook (whe_…) al que se mandaron.
     */
    @JsonProperty("endpoint")
    private StringOr<WebhookEndpoint> endpoint;

    /**
     * Desde cuándo se buscaron: el since que mandó, o la creación del webhook si es posterior.
     */
    @JsonProperty("since")
    private String since;

    /**
     * Cuántos eventos salieron otra vez. 0: no le faltaba ninguno.
     */
    @JsonProperty("events")
    private Long events;

    /**
     * Si quedaron más de 1,000: llame otra vez con este since. null: ya salieron todos.
     */
    @JsonProperty("next_since")
    private String nextSince;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public WebhookRecovery setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El webhook (whe_…) al que se mandaron.
     */
    public StringOr<WebhookEndpoint> getEndpoint() {
        return endpoint;
    }

    public WebhookRecovery setEndpoint(StringOr<WebhookEndpoint> endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public WebhookRecovery setEndpoint(String id) {
        return setEndpoint(StringOr.<WebhookEndpoint>id(id));
    }

    @JsonIgnore
    public WebhookRecovery setEndpoint(WebhookEndpoint endpoint) {
        return setEndpoint(StringOr.of(endpoint));
    }

    /**
     * Desde cuándo se buscaron: el since que mandó, o la creación del webhook si es posterior.
     */
    public String getSince() {
        return since;
    }

    public WebhookRecovery setSince(String since) {
        this.since = since;
        return this;
    }

    /**
     * Cuántos eventos salieron otra vez. 0: no le faltaba ninguno.
     */
    public Long getEvents() {
        return events;
    }

    public WebhookRecovery setEvents(Long events) {
        this.events = events;
        return this;
    }

    @JsonIgnore
    public WebhookRecovery setEvents(long events) {
        return setEvents(Long.valueOf(events));
    }

    /**
     * Si quedaron más de 1,000: llame otra vez con este since. null: ya salieron todos.
     */
    public String getNextSince() {
        return nextSince;
    }

    public WebhookRecovery setNextSince(String nextSince) {
        this.nextSince = nextSince;
        return this;
    }
}
