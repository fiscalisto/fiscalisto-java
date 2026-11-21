// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollOrgChartVacancyMonthlyCostMin: PayrollOrgChartVacancyMonthlyCostMin.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartVacancyMonthlyCostMin {
    /**
     * El sueldo del mes.
     */
    @JsonProperty("salary")
    private BigDecimal salary;

    /**
     * Lo que paga el patrón al IMSS, SAR e Infonavit al mes (cuotas obrero-patronales).
     */
    @JsonProperty("employer_contributions")
    private BigDecimal employerContributions;

    /**
     * El impuesto sobre nómina del estado al mes.
     */
    @JsonProperty("payroll_tax")
    private BigDecimal payrollTax;

    /**
     * Lo que cuesta a la empresa al mes.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El sueldo del mes.
     */
    public BigDecimal getSalary() {
        return salary;
    }

    public PayrollOrgChartVacancyMonthlyCostMin setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancyMonthlyCostMin setSalary(double salary) {
        return setSalary(BigDecimal.valueOf(salary));
    }

    /**
     * Lo que paga el patrón al IMSS, SAR e Infonavit al mes (cuotas obrero-patronales).
     */
    public BigDecimal getEmployerContributions() {
        return employerContributions;
    }

    public PayrollOrgChartVacancyMonthlyCostMin setEmployerContributions(BigDecimal employerContributions) {
        this.employerContributions = employerContributions;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancyMonthlyCostMin setEmployerContributions(double employerContributions) {
        return setEmployerContributions(BigDecimal.valueOf(employerContributions));
    }

    /**
     * El impuesto sobre nómina del estado al mes.
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public PayrollOrgChartVacancyMonthlyCostMin setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancyMonthlyCostMin setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }

    /**
     * Lo que cuesta a la empresa al mes.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollOrgChartVacancyMonthlyCostMin setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancyMonthlyCostMin setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
