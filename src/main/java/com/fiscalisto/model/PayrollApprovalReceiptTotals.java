// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollApprovalReceiptTotals: Los importes aprobados: se timbra solo un recibo que los tenga.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollApprovalReceiptTotals {
    /**
     * Percepciones.
     */
    @JsonProperty("perceptions")
    private BigDecimal perceptions;

    /**
     * Deducciones.
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * Otros pagos.
     */
    @JsonProperty("other_payments")
    private BigDecimal otherPayments;

    /**
     * ISR retenido.
     */
    @JsonProperty("taxes_withheld")
    private BigDecimal taxesWithheld;

    /**
     * Neto a pagar.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Percepciones.
     */
    public BigDecimal getPerceptions() {
        return perceptions;
    }

    public PayrollApprovalReceiptTotals setPerceptions(BigDecimal perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceiptTotals setPerceptions(double perceptions) {
        return setPerceptions(BigDecimal.valueOf(perceptions));
    }

    /**
     * Deducciones.
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public PayrollApprovalReceiptTotals setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceiptTotals setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * Otros pagos.
     */
    public BigDecimal getOtherPayments() {
        return otherPayments;
    }

    public PayrollApprovalReceiptTotals setOtherPayments(BigDecimal otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceiptTotals setOtherPayments(double otherPayments) {
        return setOtherPayments(BigDecimal.valueOf(otherPayments));
    }

    /**
     * ISR retenido.
     */
    public BigDecimal getTaxesWithheld() {
        return taxesWithheld;
    }

    public PayrollApprovalReceiptTotals setTaxesWithheld(BigDecimal taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceiptTotals setTaxesWithheld(double taxesWithheld) {
        return setTaxesWithheld(BigDecimal.valueOf(taxesWithheld));
    }

    /**
     * Neto a pagar.
     */
    public BigDecimal getNet() {
        return net;
    }

    public PayrollApprovalReceiptTotals setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceiptTotals setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }
}
