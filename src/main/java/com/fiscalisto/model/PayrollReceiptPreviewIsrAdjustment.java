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
     * El subsidio para el empleo que se revierte en el ajuste.
     */
    @JsonProperty("reversed")
    private BigDecimal reversed;

    /**
     * El ISR que se retiene después del ajuste.
     */
    @JsonProperty("isr")
    private BigDecimal isr;

    /**
     * El subsidio para el empleo que se revierte en el ajuste.
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
     * El ISR que se retiene después del ajuste.
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
