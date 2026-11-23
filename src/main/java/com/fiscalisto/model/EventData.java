// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * EventData: Lo que cambió, en data.object: el comprobante (o el lote, el cliente…) completo, como lo contesta su GET. En customer.updated y product.updated, data.previous_attributes trae lo que tenían antes los campos que cambiaron.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventData {
    /**
     * El objeto como quedó: una factura, una constancia o un lote.
     */
    @JsonProperty("object")
    private Map<String, Object> object;

    /**
     * Solo en customer.updated y product.updated: los campos que cambiaron, con el valor que tenían antes. Los demás quedaron igual.
     */
    @JsonProperty("previous_attributes")
    private Map<String, Object> previousAttributes;

    /**
     * El objeto como quedó: una factura, una constancia o un lote.
     */
    public Map<String, Object> getObject() {
        return object;
    }

    public EventData setObject(Map<String, Object> object) {
        this.object = object;
        return this;
    }

    /**
     * Solo en customer.updated y product.updated: los campos que cambiaron, con el valor que tenían antes. Los demás quedaron igual.
     */
    public Map<String, Object> getPreviousAttributes() {
        return previousAttributes;
    }

    public EventData setPreviousAttributes(Map<String, Object> previousAttributes) {
        this.previousAttributes = previousAttributes;
        return this;
    }
}
