// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollOtherPayment: InvoicePayrollOtherPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollOtherPayment {
    /**
     * Tipo de otro pago (TipoOtroPago), c_TipoOtroPago: 002 subsidio para el empleo.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Clave del patrón (Clave).
     */
    @JsonProperty("key")
    private String key;

    /**
     * Concepto (Concepto).
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Importe pagado (Importe).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Subsidio causado (SubsidioCausado).
     */
    @JsonProperty("subsidy_caused")
    private BigDecimal subsidyCaused;

    /**
     * Del subsidio causado, el ISR que evitó (no va en el XML).
     */
    @JsonProperty("subsidy_applied")
    private BigDecimal subsidyApplied;

    /**
     * Compensación del saldo a favor (CompensacionSaldosAFavor), con el 004.
     */
    @JsonProperty("balance_compensation")
    private InvoicePayrollOtherPaymentBalanceCompensation balanceCompensation;

    /**
     * Tipo de otro pago (TipoOtroPago), c_TipoOtroPago: 002 subsidio para el empleo.
     */
    public String getType() {
        return type;
    }

    public InvoicePayrollOtherPayment setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave del patrón (Clave).
     */
    public String getKey() {
        return key;
    }

    public InvoicePayrollOtherPayment setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto (Concepto).
     */
    public String getConcept() {
        return concept;
    }

    public InvoicePayrollOtherPayment setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Importe pagado (Importe).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InvoicePayrollOtherPayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollOtherPayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Subsidio causado (SubsidioCausado).
     */
    public BigDecimal getSubsidyCaused() {
        return subsidyCaused;
    }

    public InvoicePayrollOtherPayment setSubsidyCaused(BigDecimal subsidyCaused) {
        this.subsidyCaused = subsidyCaused;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollOtherPayment setSubsidyCaused(double subsidyCaused) {
        return setSubsidyCaused(BigDecimal.valueOf(subsidyCaused));
    }

    /**
     * Del subsidio causado, el ISR que evitó (no va en el XML).
     */
    public BigDecimal getSubsidyApplied() {
        return subsidyApplied;
    }

    public InvoicePayrollOtherPayment setSubsidyApplied(BigDecimal subsidyApplied) {
        this.subsidyApplied = subsidyApplied;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollOtherPayment setSubsidyApplied(double subsidyApplied) {
        return setSubsidyApplied(BigDecimal.valueOf(subsidyApplied));
    }

    /**
     * Compensación del saldo a favor (CompensacionSaldosAFavor), con el 004.
     */
    public InvoicePayrollOtherPaymentBalanceCompensation getBalanceCompensation() {
        return balanceCompensation;
    }

    public InvoicePayrollOtherPayment setBalanceCompensation(InvoicePayrollOtherPaymentBalanceCompensation balanceCompensation) {
        this.balanceCompensation = balanceCompensation;
        return this;
    }
}
