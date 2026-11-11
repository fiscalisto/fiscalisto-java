// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkSupplierInvoicePaidParams: los campos de «Marcar pagada una factura de proveedor».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkSupplierInvoicePaidParams {
    /**
     * El día en que la pagó (AAAA-MM-DD, hoy o antes).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * La referencia del pago (la de la transferencia o del ERP), o null.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El día en que la pagó (AAAA-MM-DD, hoy o antes).
     * <p>
     * Obligatorio.
     */
    public String getPaidOn() {
        return paidOn;
    }

    public MarkSupplierInvoicePaidParams setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * La referencia del pago (la de la transferencia o del ERP), o null.
     */
    public String getReference() {
        return reference;
    }

    public MarkSupplierInvoicePaidParams setReference(String reference) {
        this.reference = reference;
        return this;
    }
}
