// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CancelSalesOrderParams: los campos de «Cancelar un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelSalesOrderParams {
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

    public CancelSalesOrderParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
