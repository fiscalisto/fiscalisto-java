// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * EventResend: Un evento que se mandó otra vez: a cuántos webhooks salió. Cada entrega es un intento aparte, ahora; véalo en las entregas del webhook.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResend {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El evento (evt_…) que se mandó otra vez.
     */
    @JsonProperty("event")
    private StringOr<Event> event;

    /**
     * A cuántos webhooks salió. 0 si ninguno encendido escucha ese tipo de evento.
     */
    @JsonProperty("deliveries")
    private Long deliveries;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EventResend setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El evento (evt_…) que se mandó otra vez.
     */
    public StringOr<Event> getEvent() {
        return event;
    }

    public EventResend setEvent(StringOr<Event> event) {
        this.event = event;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EventResend setEvent(String id) {
        return setEvent(StringOr.<Event>id(id));
    }

    @JsonIgnore
    public EventResend setEvent(Event event) {
        return setEvent(StringOr.of(event));
    }

    /**
     * A cuántos webhooks salió. 0 si ninguno encendido escucha ese tipo de evento.
     */
    public Long getDeliveries() {
        return deliveries;
    }

    public EventResend setDeliveries(Long deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    @JsonIgnore
    public EventResend setDeliveries(long deliveries) {
        return setDeliveries(Long.valueOf(deliveries));
    }
}
