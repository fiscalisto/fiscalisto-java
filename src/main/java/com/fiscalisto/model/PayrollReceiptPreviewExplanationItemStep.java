// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollReceiptPreviewExplanationItemStep: PayrollReceiptPreviewExplanationItemStep.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewExplanationItemStep {
    /**
     * Qué cifra es: la base, la tasa, los días…
     */
    @JsonProperty("label")
    private String label;

    /**
     * La cifra, en la unidad de unit.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * mxn: pesos; pct: tasa (0.01125 es 1.125%); days: días.
     * <p>
     * Valores: mxn, pct, days.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * La operación con las cifras del recibo.
     */
    @JsonProperty("formula")
    private String formula;

    /**
     * Qué cifra es: la base, la tasa, los días…
     */
    public String getLabel() {
        return label;
    }

    public PayrollReceiptPreviewExplanationItemStep setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * La cifra, en la unidad de unit.
     */
    public BigDecimal getValue() {
        return value;
    }

    public PayrollReceiptPreviewExplanationItemStep setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewExplanationItemStep setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * mxn: pesos; pct: tasa (0.01125 es 1.125%); days: días.
     * <p>
     * Valores: mxn, pct, days.
     */
    public String getUnit() {
        return unit;
    }

    public PayrollReceiptPreviewExplanationItemStep setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * La operación con las cifras del recibo.
     */
    public String getFormula() {
        return formula;
    }

    public PayrollReceiptPreviewExplanationItemStep setFormula(String formula) {
        this.formula = formula;
        return this;
    }
}
