// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptCreateSeparation: SeparacionIndemnizacion: con las percepciones 022, 023 o 025.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptCreateSeparation {
    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total_paid")
    private BigDecimal totalPaid;

    /**
     * NumAñosServicio.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("years_of_service")
    private BigDecimal yearsOfService;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("last_monthly_salary")
    private BigDecimal lastMonthlySalary;

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
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public ExternalPayrollReceiptCreateSeparation setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateSeparation setTotalPaid(double totalPaid) {
        return setTotalPaid(BigDecimal.valueOf(totalPaid));
    }

    /**
     * NumAñosServicio.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getYearsOfService() {
        return yearsOfService;
    }

    public ExternalPayrollReceiptCreateSeparation setYearsOfService(BigDecimal yearsOfService) {
        this.yearsOfService = yearsOfService;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateSeparation setYearsOfService(double yearsOfService) {
        return setYearsOfService(BigDecimal.valueOf(yearsOfService));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getLastMonthlySalary() {
        return lastMonthlySalary;
    }

    public ExternalPayrollReceiptCreateSeparation setLastMonthlySalary(BigDecimal lastMonthlySalary) {
        this.lastMonthlySalary = lastMonthlySalary;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateSeparation setLastMonthlySalary(double lastMonthlySalary) {
        return setLastMonthlySalary(BigDecimal.valueOf(lastMonthlySalary));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public ExternalPayrollReceiptCreateSeparation setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateSeparation setAccumulableIncome(double accumulableIncome) {
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

    public ExternalPayrollReceiptCreateSeparation setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateSeparation setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
