// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptCreateRetirement: JubilacionPensionRetiro: con las percepciones 039 o 044.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptCreateRetirement {
    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("total_one_payment")
    private BigDecimal totalOnePayment;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("total_installment")
    private BigDecimal totalInstallment;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("daily_amount")
    private BigDecimal dailyAmount;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("accumulable_income")
    private BigDecimal accumulableIncome;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("non_accumulable_income")
    private BigDecimal nonAccumulableIncome;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getTotalOnePayment() {
        return totalOnePayment;
    }

    public ExternalPayrollReceiptCreateRetirement setTotalOnePayment(BigDecimal totalOnePayment) {
        this.totalOnePayment = totalOnePayment;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateRetirement setTotalOnePayment(double totalOnePayment) {
        return setTotalOnePayment(BigDecimal.valueOf(totalOnePayment));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getTotalInstallment() {
        return totalInstallment;
    }

    public ExternalPayrollReceiptCreateRetirement setTotalInstallment(BigDecimal totalInstallment) {
        this.totalInstallment = totalInstallment;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateRetirement setTotalInstallment(double totalInstallment) {
        return setTotalInstallment(BigDecimal.valueOf(totalInstallment));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getDailyAmount() {
        return dailyAmount;
    }

    public ExternalPayrollReceiptCreateRetirement setDailyAmount(BigDecimal dailyAmount) {
        this.dailyAmount = dailyAmount;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateRetirement setDailyAmount(double dailyAmount) {
        return setDailyAmount(BigDecimal.valueOf(dailyAmount));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public ExternalPayrollReceiptCreateRetirement setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateRetirement setAccumulableIncome(double accumulableIncome) {
        return setAccumulableIncome(BigDecimal.valueOf(accumulableIncome));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNonAccumulableIncome() {
        return nonAccumulableIncome;
    }

    public ExternalPayrollReceiptCreateRetirement setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateRetirement setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
