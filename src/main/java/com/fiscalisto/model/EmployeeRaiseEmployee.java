// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * EmployeeRaiseEmployee: EmployeeRaiseEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeRaiseEmployee {
    /**
     * emp_…
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Su número de empleado.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su salario diario antes.
     */
    @JsonProperty("daily_salary_before")
    private BigDecimal dailySalaryBefore;

    /**
     * Su salario diario nuevo.
     */
    @JsonProperty("daily_salary")
    private BigDecimal dailySalary;

    /**
     * Su SDI antes (la parte fija).
     */
    @JsonProperty("integrated_daily_salary_before")
    private BigDecimal integratedDailySalaryBefore;

    /**
     * Su SDI nuevo, con el mismo factor de integración.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * Por qué no puede recibir el aumento, o null.
     */
    @JsonProperty("error")
    private String error;

    /**
     * emp_…
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public EmployeeRaiseEmployee setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeRaiseEmployee setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public EmployeeRaiseEmployee setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Su número de empleado.
     */
    public String getNumber() {
        return number;
    }

    public EmployeeRaiseEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public EmployeeRaiseEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su salario diario antes.
     */
    public BigDecimal getDailySalaryBefore() {
        return dailySalaryBefore;
    }

    public EmployeeRaiseEmployee setDailySalaryBefore(BigDecimal dailySalaryBefore) {
        this.dailySalaryBefore = dailySalaryBefore;
        return this;
    }

    @JsonIgnore
    public EmployeeRaiseEmployee setDailySalaryBefore(double dailySalaryBefore) {
        return setDailySalaryBefore(BigDecimal.valueOf(dailySalaryBefore));
    }

    /**
     * Su salario diario nuevo.
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public EmployeeRaiseEmployee setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    @JsonIgnore
    public EmployeeRaiseEmployee setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * Su SDI antes (la parte fija).
     */
    public BigDecimal getIntegratedDailySalaryBefore() {
        return integratedDailySalaryBefore;
    }

    public EmployeeRaiseEmployee setIntegratedDailySalaryBefore(BigDecimal integratedDailySalaryBefore) {
        this.integratedDailySalaryBefore = integratedDailySalaryBefore;
        return this;
    }

    @JsonIgnore
    public EmployeeRaiseEmployee setIntegratedDailySalaryBefore(double integratedDailySalaryBefore) {
        return setIntegratedDailySalaryBefore(BigDecimal.valueOf(integratedDailySalaryBefore));
    }

    /**
     * Su SDI nuevo, con el mismo factor de integración.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public EmployeeRaiseEmployee setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public EmployeeRaiseEmployee setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * Por qué no puede recibir el aumento, o null.
     */
    public String getError() {
        return error;
    }

    public EmployeeRaiseEmployee setError(String error) {
        this.error = error;
        return this;
    }
}
