// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CloseSalesOrderParams: los campos de «Cerrar un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloseSalesOrderParams {
    /**
     * Por qué (queda en el historial).
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Por qué (queda en el historial).
     */
    public String getReason() {
        return reason;
    }

    public CloseSalesOrderParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
