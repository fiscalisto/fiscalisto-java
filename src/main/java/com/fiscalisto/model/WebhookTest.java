// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookTest: Un evento de prueba que se mandó a su webhook, y lo que respondió su servidor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookTest {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El evento que se mandó, como lo recibió su servidor.
     */
    @JsonProperty("event")
    private Event event;

    /**
     * Cómo le fue: ok si contestó 2xx, el código, el error y el inicio de su respuesta.
     */
    @JsonProperty("delivery")
    private WebhookTestDelivery delivery;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public WebhookTest setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El evento que se mandó, como lo recibió su servidor.
     */
    public Event getEvent() {
        return event;
    }

    public WebhookTest setEvent(Event event) {
        this.event = event;
        return this;
    }

    /**
     * Cómo le fue: ok si contestó 2xx, el código, el error y el inicio de su respuesta.
     */
    public WebhookTestDelivery getDelivery() {
        return delivery;
    }

    public WebhookTest setDelivery(WebhookTestDelivery delivery) {
        this.delivery = delivery;
        return this;
    }
}
