// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollReceiptPreviewIsrAdjustment: El ajuste de fin de mes: subsidio revertido y el ISR que retiene.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewIsrAdjustment {
    /**
     * Subsidio causado antes en el mes que se revierte.
     */
    @JsonProperty("reversed")
    private BigDecimal reversed;

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    @JsonProperty("isr")
    private BigDecimal isr;

    /**
     * Subsidio causado antes en el mes que se revierte.
     */
    public BigDecimal getReversed() {
        return reversed;
    }

    public PayrollReceiptPreviewIsrAdjustment setReversed(BigDecimal reversed) {
        this.reversed = reversed;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewIsrAdjustment setReversed(double reversed) {
        return setReversed(BigDecimal.valueOf(reversed));
    }

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    public BigDecimal getIsr() {
        return isr;
    }

    public PayrollReceiptPreviewIsrAdjustment setIsr(BigDecimal isr) {
        this.isr = isr;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewIsrAdjustment setIsr(double isr) {
        return setIsr(BigDecimal.valueOf(isr));
    }
}
