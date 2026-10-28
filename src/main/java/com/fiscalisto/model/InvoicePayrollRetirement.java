// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollRetirement: JubilacionPensionRetiro (percepciones 039, 044).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollRetirement {
    /**
     * Total en una exhibición (TotalUnaExhibicion).
     */
    @JsonProperty("total_one_payment")
    private BigDecimal totalOnePayment;

    /**
     * Total en parcialidades (TotalParcialidad).
     */
    @JsonProperty("total_installment")
    private BigDecimal totalInstallment;

    /**
     * Monto diario (MontoDiario).
     */
    @JsonProperty("daily_amount")
    private BigDecimal dailyAmount;

    /**
     * Ingreso acumulable (IngresoAcumulable).
     */
    @JsonProperty("accumulable_income")
    private BigDecimal accumulableIncome;

    /**
     * Ingreso no acumulable (IngresoNoAcumulable).
     */
    @JsonProperty("non_accumulable_income")
    private BigDecimal nonAccumulableIncome;

    /**
     * Total en una exhibición (TotalUnaExhibicion).
     */
    public BigDecimal getTotalOnePayment() {
        return totalOnePayment;
    }

    public InvoicePayrollRetirement setTotalOnePayment(BigDecimal totalOnePayment) {
        this.totalOnePayment = totalOnePayment;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollRetirement setTotalOnePayment(double totalOnePayment) {
        return setTotalOnePayment(BigDecimal.valueOf(totalOnePayment));
    }

    /**
     * Total en parcialidades (TotalParcialidad).
     */
    public BigDecimal getTotalInstallment() {
        return totalInstallment;
    }

    public InvoicePayrollRetirement setTotalInstallment(BigDecimal totalInstallment) {
        this.totalInstallment = totalInstallment;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollRetirement setTotalInstallment(double totalInstallment) {
        return setTotalInstallment(BigDecimal.valueOf(totalInstallment));
    }

    /**
     * Monto diario (MontoDiario).
     */
    public BigDecimal getDailyAmount() {
        return dailyAmount;
    }

    public InvoicePayrollRetirement setDailyAmount(BigDecimal dailyAmount) {
        this.dailyAmount = dailyAmount;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollRetirement setDailyAmount(double dailyAmount) {
        return setDailyAmount(BigDecimal.valueOf(dailyAmount));
    }

    /**
     * Ingreso acumulable (IngresoAcumulable).
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public InvoicePayrollRetirement setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollRetirement setAccumulableIncome(double accumulableIncome) {
        return setAccumulableIncome(BigDecimal.valueOf(accumulableIncome));
    }

    /**
     * Ingreso no acumulable (IngresoNoAcumulable).
     */
    public BigDecimal getNonAccumulableIncome() {
        return nonAccumulableIncome;
    }

    public InvoicePayrollRetirement setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollRetirement setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
