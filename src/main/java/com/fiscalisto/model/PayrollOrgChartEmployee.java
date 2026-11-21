// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollOrgChartEmployee: PayrollOrgChartEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartEmployee {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su número de empleado.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su puesto.
     */
    @JsonProperty("position")
    private String position;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Su sucursal (brn_…); null es la matriz.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Su jefe directo (emp_…); null si está arriba.
     */
    @JsonProperty("manager")
    private String manager;

    /**
     * Personas directamente a su cargo.
     */
    @JsonProperty("direct_reports")
    private Long directReports;

    /**
     * Todas las personas que dependen de él, en toda su cadena.
     */
    @JsonProperty("total_reports")
    private Long totalReports;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollOrgChartEmployee setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su número de empleado.
     */
    public String getNumber() {
        return number;
    }

    public PayrollOrgChartEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollOrgChartEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su puesto.
     */
    public String getPosition() {
        return position;
    }

    public PayrollOrgChartEmployee setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public PayrollOrgChartEmployee setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Su sucursal (brn_…); null es la matriz.
     */
    public String getBranch() {
        return branch;
    }

    public PayrollOrgChartEmployee setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Su jefe directo (emp_…); null si está arriba.
     */
    public String getManager() {
        return manager;
    }

    public PayrollOrgChartEmployee setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Personas directamente a su cargo.
     */
    public Long getDirectReports() {
        return directReports;
    }

    public PayrollOrgChartEmployee setDirectReports(Long directReports) {
        this.directReports = directReports;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartEmployee setDirectReports(long directReports) {
        return setDirectReports(Long.valueOf(directReports));
    }

    /**
     * Todas las personas que dependen de él, en toda su cadena.
     */
    public Long getTotalReports() {
        return totalReports;
    }

    public PayrollOrgChartEmployee setTotalReports(Long totalReports) {
        this.totalReports = totalReports;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartEmployee setTotalReports(long totalReports) {
        return setTotalReports(Long.valueOf(totalReports));
    }
}
