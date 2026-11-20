// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateEmployeeRaiseParams: los campos de «Aumento de sueldo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateEmployeeRaiseParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Los empleados (emp_…). Sin employees, todos los que trabajan en effective_date.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Aumento en porcentaje: 5 es 5%.
     */
    @JsonProperty("percent")
    private BigDecimal percent;

    /**
     * Aumento en pesos por día.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Un salario diario nuevo, igual para todos.
     */
    @JsonProperty("daily_salary")
    private BigDecimal dailySalary;

    /**
     * Desde cuándo rige, hoy o antes (por omisión, hoy). Es la fecha de la modificación de salario.
     */
    @JsonProperty("effective_date")
    private String effectiveDate;

    /**
     * true: dice cómo quedaría cada empleado, sin guardar nada.
     */
    @JsonProperty("dry_run")
    private Boolean dryRun;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateEmployeeRaiseParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Los empleados (emp_…). Sin employees, todos los que trabajan en effective_date.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public CreateEmployeeRaiseParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * Aumento en porcentaje: 5 es 5%.
     */
    public BigDecimal getPercent() {
        return percent;
    }

    public CreateEmployeeRaiseParams setPercent(BigDecimal percent) {
        this.percent = percent;
        return this;
    }

    @JsonIgnore
    public CreateEmployeeRaiseParams setPercent(double percent) {
        return setPercent(BigDecimal.valueOf(percent));
    }

    /**
     * Aumento en pesos por día.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateEmployeeRaiseParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateEmployeeRaiseParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Un salario diario nuevo, igual para todos.
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public CreateEmployeeRaiseParams setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    @JsonIgnore
    public CreateEmployeeRaiseParams setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * Desde cuándo rige, hoy o antes (por omisión, hoy). Es la fecha de la modificación de salario.
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CreateEmployeeRaiseParams setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * true: dice cómo quedaría cada empleado, sin guardar nada.
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public CreateEmployeeRaiseParams setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
}
