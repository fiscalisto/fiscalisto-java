// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTotals: Totales (Totales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTotals {
    /**
     * Monto total de la operación (MontoTotOperacion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("operation")
    private BigDecimal operation;

    /**
     * Monto gravado (MontoTotGrav). Por omisión, operation menos exempt.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Monto exento (MontoTotExent). Por omisión 0.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Monto total de la operación (MontoTotOperacion).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getOperation() {
        return operation;
    }

    public CreateRetentionParamsTotals setOperation(BigDecimal operation) {
        this.operation = operation;
        return this;
    }

    public CreateRetentionParamsTotals setOperation(double operation) {
        return setOperation(BigDecimal.valueOf(operation));
    }

    /**
     * Monto gravado (MontoTotGrav). Por omisión, operation menos exempt.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public CreateRetentionParamsTotals setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    public CreateRetentionParamsTotals setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Monto exento (MontoTotExent). Por omisión 0.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public CreateRetentionParamsTotals setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    public CreateRetentionParamsTotals setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }
}
