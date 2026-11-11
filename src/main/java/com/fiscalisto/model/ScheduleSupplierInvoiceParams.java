// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleSupplierInvoiceParams: los campos de «Programar el pago de una factura de proveedor».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleSupplierInvoiceParams {
    /**
     * El día en que la pagará (AAAA-MM-DD, hoy o después). El proveedor lo ve.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * El día en que la pagará (AAAA-MM-DD, hoy o después). El proveedor lo ve.
     * <p>
     * Obligatorio.
     */
    public String getPayOn() {
        return payOn;
    }

    public ScheduleSupplierInvoiceParams setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }
}
