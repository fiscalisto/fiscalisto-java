// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkInvoicePaidParams: los campos de «Marcar pagada».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkInvoicePaidParams {
    /**
     * El día en que el cliente pagó (AAAA-MM-DD, no antes de la factura ni después de hoy); hoy si no se indica. Queda en paid_on.
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * El día en que el cliente pagó (AAAA-MM-DD, no antes de la factura ni después de hoy); hoy si no se indica. Queda en paid_on.
     */
    public String getPaidOn() {
        return paidOn;
    }

    public MarkInvoicePaidParams setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }
}
