// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AssignPayrollOrgChartParams: los campos de «Cambiar jefe, departamento o sucursal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssignPayrollOrgChartParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * A quiénes (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Su jefe directo (emp_…), o null para ponerlos arriba. Se omite si no cambia.
     */
    @JsonProperty("manager")
    private String manager;

    /**
     * Su departamento, como lo llevan sus recibos (Departamento), o null para ninguno. Se omite si no cambia.
     */
    @JsonProperty("department")
    private String department;

    /**
     * Una sucursal del emisor (brn_…), o null para la matriz.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public AssignPayrollOrgChartParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * A quiénes (emp_…).
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public AssignPayrollOrgChartParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * Su jefe directo (emp_…), o null para ponerlos arriba. Se omite si no cambia.
     */
    public String getManager() {
        return manager;
    }

    public AssignPayrollOrgChartParams setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Su departamento, como lo llevan sus recibos (Departamento), o null para ninguno. Se omite si no cambia.
     */
    public String getDepartment() {
        return department;
    }

    public AssignPayrollOrgChartParams setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Una sucursal del emisor (brn_…), o null para la matriz.
     */
    public String getBranch() {
        return branch;
    }

    public AssignPayrollOrgChartParams setBranch(String branch) {
        this.branch = branch;
        return this;
    }
}
