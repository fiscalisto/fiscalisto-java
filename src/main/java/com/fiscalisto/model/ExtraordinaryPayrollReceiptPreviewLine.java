// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExtraordinaryPayrollReceiptPreviewLine: ExtraordinaryPayrollReceiptPreviewLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraordinaryPayrollReceiptPreviewLine {
    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Cómo se calculó (días, años, salario).
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Importe.
     */
    @JsonProperty("gross")
    private BigDecimal gross;

    /**
     * De él, la parte exenta del ISR.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    public String getConcept() {
        return concept;
    }

    public ExtraordinaryPayrollReceiptPreviewLine setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Cómo se calculó (días, años, salario).
     */
    public String getDetail() {
        return detail;
    }

    public ExtraordinaryPayrollReceiptPreviewLine setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getGross() {
        return gross;
    }

    public ExtraordinaryPayrollReceiptPreviewLine setGross(BigDecimal gross) {
        this.gross = gross;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewLine setGross(double gross) {
        return setGross(BigDecimal.valueOf(gross));
    }

    /**
     * De él, la parte exenta del ISR.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public ExtraordinaryPayrollReceiptPreviewLine setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewLine setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }
}
