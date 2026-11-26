// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * VariableSalaryEmployee: VariableSalaryEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariableSalaryEmployee {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Su número de empleado.
     */
    @JsonProperty("employee_number")
    private String employeeNumber;

    /**
     * Su nombre.
     */
    @JsonProperty("employee_name")
    private String employeeName;

    /**
     * Lo que se integra del bimestre (artículo 27 de la LSS).
     */
    @JsonProperty("variable_income")
    private BigDecimal variableIncome;

    /**
     * Los días de salario devengado: los del bimestre menos faltas e incapacidades.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * variable_income entre days.
     */
    @JsonProperty("daily_variable")
    private BigDecimal dailyVariable;

    /**
     * El SDI de los elementos fijos.
     */
    @JsonProperty("fixed_integrated_daily_salary")
    private BigDecimal fixedIntegratedDailySalary;

    /**
     * La parte variable que tiene hoy.
     */
    @JsonProperty("current_variable")
    private BigDecimal currentVariable;

    /**
     * El SDI desde effective_date: el fijo más daily_variable.
     */
    @JsonProperty("new_integrated_daily_salary")
    private BigDecimal newIntegratedDailySalary;

    /**
     * Si cambia lo que tiene.
     */
    @JsonProperty("changes")
    private Boolean changes;

    /**
     * Si ya se aplicó este bimestre.
     */
    @JsonProperty("applied")
    private Boolean applied;

    /**
     * De dónde sale variable_income.
     */
    @JsonProperty("lines")
    private List<VariableSalaryEmployeeLine> lines;

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public VariableSalaryEmployee setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public VariableSalaryEmployee setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public VariableSalaryEmployee setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Su número de empleado.
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public VariableSalaryEmployee setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public VariableSalaryEmployee setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * Lo que se integra del bimestre (artículo 27 de la LSS).
     */
    public BigDecimal getVariableIncome() {
        return variableIncome;
    }

    public VariableSalaryEmployee setVariableIncome(BigDecimal variableIncome) {
        this.variableIncome = variableIncome;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setVariableIncome(double variableIncome) {
        return setVariableIncome(BigDecimal.valueOf(variableIncome));
    }

    /**
     * Los días de salario devengado: los del bimestre menos faltas e incapacidades.
     */
    public BigDecimal getDays() {
        return days;
    }

    public VariableSalaryEmployee setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * variable_income entre days.
     */
    public BigDecimal getDailyVariable() {
        return dailyVariable;
    }

    public VariableSalaryEmployee setDailyVariable(BigDecimal dailyVariable) {
        this.dailyVariable = dailyVariable;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setDailyVariable(double dailyVariable) {
        return setDailyVariable(BigDecimal.valueOf(dailyVariable));
    }

    /**
     * El SDI de los elementos fijos.
     */
    public BigDecimal getFixedIntegratedDailySalary() {
        return fixedIntegratedDailySalary;
    }

    public VariableSalaryEmployee setFixedIntegratedDailySalary(BigDecimal fixedIntegratedDailySalary) {
        this.fixedIntegratedDailySalary = fixedIntegratedDailySalary;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setFixedIntegratedDailySalary(double fixedIntegratedDailySalary) {
        return setFixedIntegratedDailySalary(BigDecimal.valueOf(fixedIntegratedDailySalary));
    }

    /**
     * La parte variable que tiene hoy.
     */
    public BigDecimal getCurrentVariable() {
        return currentVariable;
    }

    public VariableSalaryEmployee setCurrentVariable(BigDecimal currentVariable) {
        this.currentVariable = currentVariable;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setCurrentVariable(double currentVariable) {
        return setCurrentVariable(BigDecimal.valueOf(currentVariable));
    }

    /**
     * El SDI desde effective_date: el fijo más daily_variable.
     */
    public BigDecimal getNewIntegratedDailySalary() {
        return newIntegratedDailySalary;
    }

    public VariableSalaryEmployee setNewIntegratedDailySalary(BigDecimal newIntegratedDailySalary) {
        this.newIntegratedDailySalary = newIntegratedDailySalary;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployee setNewIntegratedDailySalary(double newIntegratedDailySalary) {
        return setNewIntegratedDailySalary(BigDecimal.valueOf(newIntegratedDailySalary));
    }

    /**
     * Si cambia lo que tiene.
     */
    public Boolean getChanges() {
        return changes;
    }

    public VariableSalaryEmployee setChanges(Boolean changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Si ya se aplicó este bimestre.
     */
    public Boolean getApplied() {
        return applied;
    }

    public VariableSalaryEmployee setApplied(Boolean applied) {
        this.applied = applied;
        return this;
    }

    /**
     * De dónde sale variable_income.
     */
    public List<VariableSalaryEmployeeLine> getLines() {
        return lines;
    }

    public VariableSalaryEmployee setLines(List<VariableSalaryEmployeeLine> lines) {
        this.lines = lines;
        return this;
    }
}
