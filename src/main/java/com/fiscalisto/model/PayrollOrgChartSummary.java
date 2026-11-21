// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollOrgChartSummary: Las cuentas del organigrama y lo que conviene revisar.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartSummary {
    /**
     * Empleados de hoy.
     */
    @JsonProperty("employees")
    private Long employees;

    /**
     * Cuántos tienen al menos una persona directamente a su cargo.
     */
    @JsonProperty("managers")
    private Long managers;

    /**
     * Personas directas por jefe, en promedio (un decimal).
     */
    @JsonProperty("average_span")
    private BigDecimal averageSpan;

    /**
     * Departamentos, con los que solo llevan los recibos.
     */
    @JsonProperty("departments")
    private Long departments;

    /**
     * En cuántas sucursales (con la matriz) hay personas.
     */
    @JsonProperty("branches")
    private Long branches;

    /**
     * Puestos sin persona.
     */
    @JsonProperty("vacancies")
    private Long vacancies;

    /**
     * Quienes quedan arriba sin ser la cabeza (todos los de arriba menos el del equipo más grande).
     */
    @JsonProperty("without_manager")
    private List<String> withoutManager;

    /**
     * Jefes con más de 10 personas directas.
     */
    @JsonProperty("wide_span")
    private List<String> wideSpan;

    /**
     * Sin departamento: sus recibos no llevan uno.
     */
    @JsonProperty("without_department")
    private List<String> withoutDepartment;

    /**
     * Empleados de hoy.
     */
    public Long getEmployees() {
        return employees;
    }

    public PayrollOrgChartSummary setEmployees(Long employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setEmployees(long employees) {
        return setEmployees(Long.valueOf(employees));
    }

    /**
     * Cuántos tienen al menos una persona directamente a su cargo.
     */
    public Long getManagers() {
        return managers;
    }

    public PayrollOrgChartSummary setManagers(Long managers) {
        this.managers = managers;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setManagers(long managers) {
        return setManagers(Long.valueOf(managers));
    }

    /**
     * Personas directas por jefe, en promedio (un decimal).
     */
    public BigDecimal getAverageSpan() {
        return averageSpan;
    }

    public PayrollOrgChartSummary setAverageSpan(BigDecimal averageSpan) {
        this.averageSpan = averageSpan;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setAverageSpan(double averageSpan) {
        return setAverageSpan(BigDecimal.valueOf(averageSpan));
    }

    /**
     * Departamentos, con los que solo llevan los recibos.
     */
    public Long getDepartments() {
        return departments;
    }

    public PayrollOrgChartSummary setDepartments(Long departments) {
        this.departments = departments;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setDepartments(long departments) {
        return setDepartments(Long.valueOf(departments));
    }

    /**
     * En cuántas sucursales (con la matriz) hay personas.
     */
    public Long getBranches() {
        return branches;
    }

    public PayrollOrgChartSummary setBranches(Long branches) {
        this.branches = branches;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setBranches(long branches) {
        return setBranches(Long.valueOf(branches));
    }

    /**
     * Puestos sin persona.
     */
    public Long getVacancies() {
        return vacancies;
    }

    public PayrollOrgChartSummary setVacancies(Long vacancies) {
        this.vacancies = vacancies;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartSummary setVacancies(long vacancies) {
        return setVacancies(Long.valueOf(vacancies));
    }

    /**
     * Quienes quedan arriba sin ser la cabeza (todos los de arriba menos el del equipo más grande).
     */
    public List<String> getWithoutManager() {
        return withoutManager;
    }

    public PayrollOrgChartSummary setWithoutManager(List<String> withoutManager) {
        this.withoutManager = withoutManager;
        return this;
    }

    /**
     * Jefes con más de 10 personas directas.
     */
    public List<String> getWideSpan() {
        return wideSpan;
    }

    public PayrollOrgChartSummary setWideSpan(List<String> wideSpan) {
        this.wideSpan = wideSpan;
        return this;
    }

    /**
     * Sin departamento: sus recibos no llevan uno.
     */
    public List<String> getWithoutDepartment() {
        return withoutDepartment;
    }

    public PayrollOrgChartSummary setWithoutDepartment(List<String> withoutDepartment) {
        this.withoutDepartment = withoutDepartment;
        return this;
    }
}
