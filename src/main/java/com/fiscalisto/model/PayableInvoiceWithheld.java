// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayableInvoiceWithheld: PayableInvoiceWithheld.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayableInvoiceWithheld {
    /**
     * ISR retenido en toda la factura.
     */
    @JsonProperty("isr")
    private BigDecimal isr;

    /**
     * IVA retenido en toda la factura.
     */
    @JsonProperty("vat")
    private BigDecimal vat;

    /**
     * ISR retenido en toda la factura.
     */
    public BigDecimal getIsr() {
        return isr;
    }

    public PayableInvoiceWithheld setIsr(BigDecimal isr) {
        this.isr = isr;
        return this;
    }

    @JsonIgnore
    public PayableInvoiceWithheld setIsr(double isr) {
        return setIsr(BigDecimal.valueOf(isr));
    }

    /**
     * IVA retenido en toda la factura.
     */
    public BigDecimal getVat() {
        return vat;
    }

    public PayableInvoiceWithheld setVat(BigDecimal vat) {
        this.vat = vat;
        return this;
    }

    @JsonIgnore
    public PayableInvoiceWithheld setVat(double vat) {
        return setVat(BigDecimal.valueOf(vat));
    }
}
