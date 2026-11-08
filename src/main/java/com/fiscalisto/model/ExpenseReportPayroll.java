// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExpenseReportPayroll: ExpenseReportPayroll.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseReportPayroll {
    /**
     * Viáticos exentos comprobados (OtroPago/Percepción 050, ImporteExento).
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Lo que grava como sueldo (050, ImporteGravado): lo gastado sin comprobar.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Lo que se descuenta (deducción 081) por lo que ya se le dio y sobró.
     */
    @JsonProperty("adjustment")
    private BigDecimal adjustment;

    /**
     * Lo que neto cobra o paga en el recibo por esta comprobación.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Viáticos exentos comprobados (OtroPago/Percepción 050, ImporteExento).
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public ExpenseReportPayroll setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public ExpenseReportPayroll setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Lo que grava como sueldo (050, ImporteGravado): lo gastado sin comprobar.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public ExpenseReportPayroll setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public ExpenseReportPayroll setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Lo que se descuenta (deducción 081) por lo que ya se le dio y sobró.
     */
    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public ExpenseReportPayroll setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    @JsonIgnore
    public ExpenseReportPayroll setAdjustment(double adjustment) {
        return setAdjustment(BigDecimal.valueOf(adjustment));
    }

    /**
     * Lo que neto cobra o paga en el recibo por esta comprobación.
     */
    public BigDecimal getNet() {
        return net;
    }

    public ExpenseReportPayroll setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public ExpenseReportPayroll setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }
}
