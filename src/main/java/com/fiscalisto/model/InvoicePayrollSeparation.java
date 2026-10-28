// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollSeparation: SeparacionIndemnizacion (percepciones 022, 023, 025).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollSeparation {
    /**
     * Total pagado (TotalPagado).
     */
    @JsonProperty("total_paid")
    private BigDecimal totalPaid;

    /**
     * Años de servicio (NumAñosServicio).
     */
    @JsonProperty("years_of_service")
    private Long yearsOfService;

    /**
     * Último sueldo mensual ordinario (UltimoSueldoMensOrd).
     */
    @JsonProperty("last_monthly_salary")
    private BigDecimal lastMonthlySalary;

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
     * Total pagado (TotalPagado).
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public InvoicePayrollSeparation setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollSeparation setTotalPaid(double totalPaid) {
        return setTotalPaid(BigDecimal.valueOf(totalPaid));
    }

    /**
     * Años de servicio (NumAñosServicio).
     */
    public Long getYearsOfService() {
        return yearsOfService;
    }

    public InvoicePayrollSeparation setYearsOfService(Long yearsOfService) {
        this.yearsOfService = yearsOfService;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollSeparation setYearsOfService(long yearsOfService) {
        return setYearsOfService(Long.valueOf(yearsOfService));
    }

    /**
     * Último sueldo mensual ordinario (UltimoSueldoMensOrd).
     */
    public BigDecimal getLastMonthlySalary() {
        return lastMonthlySalary;
    }

    public InvoicePayrollSeparation setLastMonthlySalary(BigDecimal lastMonthlySalary) {
        this.lastMonthlySalary = lastMonthlySalary;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollSeparation setLastMonthlySalary(double lastMonthlySalary) {
        return setLastMonthlySalary(BigDecimal.valueOf(lastMonthlySalary));
    }

    /**
     * Ingreso acumulable (IngresoAcumulable).
     */
    public BigDecimal getAccumulableIncome() {
        return accumulableIncome;
    }

    public InvoicePayrollSeparation setAccumulableIncome(BigDecimal accumulableIncome) {
        this.accumulableIncome = accumulableIncome;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollSeparation setAccumulableIncome(double accumulableIncome) {
        return setAccumulableIncome(BigDecimal.valueOf(accumulableIncome));
    }

    /**
     * Ingreso no acumulable (IngresoNoAcumulable).
     */
    public BigDecimal getNonAccumulableIncome() {
        return nonAccumulableIncome;
    }

    public InvoicePayrollSeparation setNonAccumulableIncome(BigDecimal nonAccumulableIncome) {
        this.nonAccumulableIncome = nonAccumulableIncome;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollSeparation setNonAccumulableIncome(double nonAccumulableIncome) {
        return setNonAccumulableIncome(BigDecimal.valueOf(nonAccumulableIncome));
    }
}
