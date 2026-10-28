// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollSeparation: SeparacionIndemnizacion (percepciones 022, 023, 025).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollSeparation {
    /**
     * total_paid.
     */
    @JsonProperty("total_paid")
    private BigDecimal totalPaid;

    /**
     * years_of_service.
     */
    @JsonProperty("years_of_service")
    private Long yearsOfService;

    /**
     * last_monthly_salary.
     */
    @JsonProperty("last_monthly_salary")
    private BigDecimal lastMonthlySalary;

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
     * total_paid.
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public ExternalPayrollReceiptPreviewPayrollSeparation setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollSeparation setTotalPaid(double totalPaid) {
        return setTotalPaid(BigDecimal.valueOf(totalPaid));
    }

    /**
     * years_of_service.
     */
    public Long getYearsOfService() {
        return yearsOfService;
    }

    public ExternalPayrollReceiptPreviewPayrollSeparation setYearsOfService(Long yearsOfService) {
        this.yearsOfService = yearsOfService;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollSeparation setYearsOfService(long yearsOfService) {
        return setYearsOfService(Long.valueOf(yearsOfService));
    }

    /**
     * last_monthly_salary.
     */
    public BigDecimal getLastMonthlySalary() {
        return lastMonthlySalary;
    }

    public ExternalPayrollReceiptPreviewPayrollSeparation setLastMonthlySalary(BigDecimal lastMonthlySalary) {
        this.lastMonthlySalary = lastMonthlySalary;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollSeparation setLastMonthlySalary(double lastMonthlySalary) {
        return setLastMonthlySalary(BigDecimal.valueOf(lastMonthlySalary));
    }

    /**
     * accumulable_income.
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public ExternalPayrollReceiptPreviewPayrollSeparation setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollSeparation setAccumulableIncome(double accumulableIncome) {
        return setAccumulableIncome(BigDecimal.valueOf(accumulableIncome));
    }

    /**
     * non_accumulable_income.
     */
    public BigDecimal getNonAccumulableIncome() {
        return nonAccumulableIncome;
    }

    public ExternalPayrollReceiptPreviewPayrollSeparation setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollSeparation setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
