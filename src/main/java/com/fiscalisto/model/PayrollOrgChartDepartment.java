// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollOrgChartDepartment: PayrollOrgChartDepartment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartDepartment {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El departamento dentro del que está.
     */
    @JsonProperty("parent")
    private String parent;

    /**
     * Su responsable (emp_…).
     */
    @JsonProperty("lead")
    private String lead;

    /**
     * Personas en él.
     */
    @JsonProperty("employees")
    private Long employees;

    /**
     * Personas en él y en sus subdepartamentos.
     */
    @JsonProperty("total_employees")
    private Long totalEmployees;

    /**
     * 0 arriba, 1 dentro de uno, y así.
     */
    @JsonProperty("depth")
    private Long depth;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollOrgChartDepartment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El departamento dentro del que está.
     */
    public String getParent() {
        return parent;
    }

    public PayrollOrgChartDepartment setParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Su responsable (emp_…).
     */
    public String getLead() {
        return lead;
    }

    public PayrollOrgChartDepartment setLead(String lead) {
        this.lead = lead;
        return this;
    }

    /**
     * Personas en él.
     */
    public Long getEmployees() {
        return employees;
    }

    public PayrollOrgChartDepartment setEmployees(Long employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartDepartment setEmployees(long employees) {
        return setEmployees(Long.valueOf(employees));
    }

    /**
     * Personas en él y en sus subdepartamentos.
     */
    public Long getTotalEmployees() {
        return totalEmployees;
    }

    public PayrollOrgChartDepartment setTotalEmployees(Long totalEmployees) {
        this.totalEmployees = totalEmployees;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartDepartment setTotalEmployees(long totalEmployees) {
        return setTotalEmployees(Long.valueOf(totalEmployees));
    }

    /**
     * 0 arriba, 1 dentro de uno, y así.
     */
    public Long getDepth() {
        return depth;
    }

    public PayrollOrgChartDepartment setDepth(Long depth) {
        this.depth = depth;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartDepartment setDepth(long depth) {
        return setDepth(Long.valueOf(depth));
    }
}
