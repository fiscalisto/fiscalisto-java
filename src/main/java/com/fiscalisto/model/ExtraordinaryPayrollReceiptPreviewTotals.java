// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExtraordinaryPayrollReceiptPreviewTotals: Totales: percepciones, deducciones, otros pagos y el neto a pagar.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraordinaryPayrollReceiptPreviewTotals {
    /**
     * Total de sueldos, salarios y asimilados (TotalSueldos).
     */
    @JsonProperty("salaries")
    private BigDecimal salaries;

    /**
     * Total gravado (TotalGravado).
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Total exento (TotalExento).
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Total de separación e indemnización (TotalSeparacionIndemnizacion).
     */
    @JsonProperty("separation")
    private BigDecimal separation;

    /**
     * Total de jubilación, pensión o retiro (TotalJubilacionPensionRetiro).
     */
    @JsonProperty("retirement")
    private BigDecimal retirement;

    /**
     * Total de percepciones (TotalPercepciones).
     */
    @JsonProperty("perceptions")
    private BigDecimal perceptions;

    /**
     * Otras deducciones (TotalOtrasDeducciones).
     */
    @JsonProperty("other_deductions")
    private BigDecimal otherDeductions;

    /**
     * Impuestos retenidos (TotalImpuestosRetenidos).
     */
    @JsonProperty("taxes_withheld")
    private BigDecimal taxesWithheld;

    /**
     * Total de deducciones (TotalDeducciones).
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * Total de otros pagos (TotalOtrosPagos).
     */
    @JsonProperty("other_payments")
    private BigDecimal otherPayments;

    /**
     * Subtotal del comprobante: percepciones más otros pagos.
     */
    @JsonProperty("subtotal")
    private BigDecimal subtotal;

    /**
     * Neto a pagar al empleado.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Total de sueldos, salarios y asimilados (TotalSueldos).
     */
    public BigDecimal getSalaries() {
        return salaries;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setSalaries(BigDecimal salaries) {
        this.salaries = salaries;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setSalaries(double salaries) {
        return setSalaries(BigDecimal.valueOf(salaries));
    }

    /**
     * Total gravado (TotalGravado).
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Total exento (TotalExento).
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Total de separación e indemnización (TotalSeparacionIndemnizacion).
     */
    public BigDecimal getSeparation() {
        return separation;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setSeparation(BigDecimal separation) {
        this.separation = separation;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setSeparation(double separation) {
        return setSeparation(BigDecimal.valueOf(separation));
    }

    /**
     * Total de jubilación, pensión o retiro (TotalJubilacionPensionRetiro).
     */
    public BigDecimal getRetirement() {
        return retirement;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setRetirement(BigDecimal retirement) {
        this.retirement = retirement;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setRetirement(double retirement) {
        return setRetirement(BigDecimal.valueOf(retirement));
    }

    /**
     * Total de percepciones (TotalPercepciones).
     */
    public BigDecimal getPerceptions() {
        return perceptions;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setPerceptions(BigDecimal perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setPerceptions(double perceptions) {
        return setPerceptions(BigDecimal.valueOf(perceptions));
    }

    /**
     * Otras deducciones (TotalOtrasDeducciones).
     */
    public BigDecimal getOtherDeductions() {
        return otherDeductions;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setOtherDeductions(BigDecimal otherDeductions) {
        this.otherDeductions = otherDeductions;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setOtherDeductions(double otherDeductions) {
        return setOtherDeductions(BigDecimal.valueOf(otherDeductions));
    }

    /**
     * Impuestos retenidos (TotalImpuestosRetenidos).
     */
    public BigDecimal getTaxesWithheld() {
        return taxesWithheld;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setTaxesWithheld(BigDecimal taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setTaxesWithheld(double taxesWithheld) {
        return setTaxesWithheld(BigDecimal.valueOf(taxesWithheld));
    }

    /**
     * Total de deducciones (TotalDeducciones).
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * Total de otros pagos (TotalOtrosPagos).
     */
    public BigDecimal getOtherPayments() {
        return otherPayments;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setOtherPayments(BigDecimal otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setOtherPayments(double otherPayments) {
        return setOtherPayments(BigDecimal.valueOf(otherPayments));
    }

    /**
     * Subtotal del comprobante: percepciones más otros pagos.
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * Neto a pagar al empleado.
     */
    public BigDecimal getNet() {
        return net;
    }

    public ExtraordinaryPayrollReceiptPreviewTotals setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewTotals setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }
}
