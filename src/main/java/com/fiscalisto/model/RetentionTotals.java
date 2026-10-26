// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * RetentionTotals: Totales (Totales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionTotals {
    /**
     * Monto total de la operación (MontoTotOperacion).
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
     * Total retenido (MontoTotRet).
     */
    @JsonProperty("withheld")
    private BigDecimal withheld;

    /**
     * Monto total de la operación (MontoTotOperacion).
     */
    public BigDecimal getOperation() {
        return operation;
    }

    public RetentionTotals setOperation(BigDecimal operation) {
        this.operation = operation;
        return this;
    }

    @JsonIgnore
    public RetentionTotals setOperation(double operation) {
        return setOperation(BigDecimal.valueOf(operation));
    }

    /**
     * Monto gravado (MontoTotGrav). Por omisión, operation menos exempt.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public RetentionTotals setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public RetentionTotals setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Monto exento (MontoTotExent). Por omisión 0.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public RetentionTotals setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public RetentionTotals setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Total retenido (MontoTotRet).
     */
    public BigDecimal getWithheld() {
        return withheld;
    }

    public RetentionTotals setWithheld(BigDecimal withheld) {
        this.withheld = withheld;
        return this;
    }

    @JsonIgnore
    public RetentionTotals setWithheld(double withheld) {
        return setWithheld(BigDecimal.valueOf(withheld));
    }
}
