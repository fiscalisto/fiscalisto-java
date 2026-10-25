// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * EventData: Lo que cambió, en data.object: el comprobante (o el lote) completo, como lo contesta su GET.
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
     * El objeto como quedó: una factura, una constancia o un lote.
     */
    public Map<String, Object> getObject() {
        return object;
    }

    public EventData setObject(Map<String, Object> object) {
        this.object = object;
        return this;
    }
}
