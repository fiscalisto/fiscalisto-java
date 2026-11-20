// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CancelPayoutParams: los campos de «Cancelar un pago a proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelPayoutParams {
    /**
     * Por qué se cancela; lo ve el equipo en el pago.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Por qué se cancela; lo ve el equipo en el pago.
     */
    public String getReason() {
        return reason;
    }

    public CancelPayoutParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
