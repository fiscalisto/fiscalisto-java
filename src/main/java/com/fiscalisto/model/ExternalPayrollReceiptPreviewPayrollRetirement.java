// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollRetirement: JubilacionPensionRetiro (percepciones 039, 044).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollRetirement {
    /**
     * total_one_payment.
     */
    @JsonProperty("total_one_payment")
    private BigDecimal totalOnePayment;

    /**
     * total_installment.
     */
    @JsonProperty("total_installment")
    private BigDecimal totalInstallment;

    /**
     * daily_amount.
     */
    @JsonProperty("daily_amount")
    private BigDecimal dailyAmount;

    /**
     * accumulable_income.
     */
    @JsonProperty("accumulable_income")
    private BigDecimal accumulableIncome;

    /**
     * non_accumulable_income.
     */
    @JsonProperty("non_accumulable_income")
    private BigDecimal nonAccumulableIncome;

    /**
     * total_one_payment.
     */
    public BigDecimal getTotalOnePayment() {
        return totalOnePayment;
    }

    public ExternalPayrollReceiptPreviewPayrollRetirement setTotalOnePayment(BigDecimal totalOnePayment) {
        this.totalOnePayment = totalOnePayment;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollRetirement setTotalOnePayment(double totalOnePayment) {
        return setTotalOnePayment(BigDecimal.valueOf(totalOnePayment));
    }

    /**
     * total_installment.
     */
    public BigDecimal getTotalInstallment() {
        return totalInstallment;
    }

    public ExternalPayrollReceiptPreviewPayrollRetirement setTotalInstallment(BigDecimal totalInstallment) {
        this.totalInstallment = totalInstallment;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollRetirement setTotalInstallment(double totalInstallment) {
        return setTotalInstallment(BigDecimal.valueOf(totalInstallment));
    }

    /**
     * daily_amount.
     */
    public BigDecimal getDailyAmount() {
        return dailyAmount;
    }

    public ExternalPayrollReceiptPreviewPayrollRetirement setDailyAmount(BigDecimal dailyAmount) {
        this.dailyAmount = dailyAmount;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollRetirement setDailyAmount(double dailyAmount) {
        return setDailyAmount(BigDecimal.valueOf(dailyAmount));
    }

    /**
     * accumulable_income.
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public ExternalPayrollReceiptPreviewPayrollRetirement setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollRetirement setAccumulableIncome(double accumulableIncome) {
        return setAccumulableIncome(BigDecimal.valueOf(accumulableIncome));
    }

    /**
     * non_accumulable_income.
     */
    public BigDecimal getNonAccumulableIncome() {
        return nonAccumulableIncome;
    }

    public ExternalPayrollReceiptPreviewPayrollRetirement setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollRetirement setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
