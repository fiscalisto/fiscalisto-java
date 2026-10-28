// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PreviewExternalPayrollReceiptParamsTotals: Los totales que calculó su sistema: Fiscalisto los compara al centavo con las líneas y rechaza el recibo si no cuadran.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParamsTotals {
    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("perceptions")
    private BigDecimal perceptions;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("other_payments")
    private BigDecimal otherPayments;

    /**
     * Neto: percepciones más otros pagos menos deducciones.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("salaries")
    private BigDecimal salaries;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("separation")
    private BigDecimal separation;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("retirement")
    private BigDecimal retirement;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("taxes_withheld")
    private BigDecimal taxesWithheld;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("other_deductions")
    private BigDecimal otherDeductions;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPerceptions() {
        return perceptions;
    }

    public PreviewExternalPayrollReceiptParamsTotals setPerceptions(BigDecimal perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setPerceptions(double perceptions) {
        return setPerceptions(BigDecimal.valueOf(perceptions));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public PreviewExternalPayrollReceiptParamsTotals setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getOtherPayments() {
        return otherPayments;
    }

    public PreviewExternalPayrollReceiptParamsTotals setOtherPayments(BigDecimal otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setOtherPayments(double otherPayments) {
        return setOtherPayments(BigDecimal.valueOf(otherPayments));
    }

    /**
     * Neto: percepciones más otros pagos menos deducciones.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNet() {
        return net;
    }

    public PreviewExternalPayrollReceiptParamsTotals setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getSalaries() {
        return salaries;
    }

    public PreviewExternalPayrollReceiptParamsTotals setSalaries(BigDecimal salaries) {
        this.salaries = salaries;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setSalaries(double salaries) {
        return setSalaries(BigDecimal.valueOf(salaries));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getSeparation() {
        return separation;
    }

    public PreviewExternalPayrollReceiptParamsTotals setSeparation(BigDecimal separation) {
        this.separation = separation;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setSeparation(double separation) {
        return setSeparation(BigDecimal.valueOf(separation));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getRetirement() {
        return retirement;
    }

    public PreviewExternalPayrollReceiptParamsTotals setRetirement(BigDecimal retirement) {
        this.retirement = retirement;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setRetirement(double retirement) {
        return setRetirement(BigDecimal.valueOf(retirement));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public PreviewExternalPayrollReceiptParamsTotals setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public PreviewExternalPayrollReceiptParamsTotals setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getTaxesWithheld() {
        return taxesWithheld;
    }

    public PreviewExternalPayrollReceiptParamsTotals setTaxesWithheld(BigDecimal taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setTaxesWithheld(double taxesWithheld) {
        return setTaxesWithheld(BigDecimal.valueOf(taxesWithheld));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getOtherDeductions() {
        return otherDeductions;
    }

    public PreviewExternalPayrollReceiptParamsTotals setOtherDeductions(BigDecimal otherDeductions) {
        this.otherDeductions = otherDeductions;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsTotals setOtherDeductions(double otherDeductions) {
        return setOtherDeductions(BigDecimal.valueOf(otherDeductions));
    }
}
