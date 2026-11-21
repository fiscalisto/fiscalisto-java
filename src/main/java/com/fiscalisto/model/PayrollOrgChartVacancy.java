// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollOrgChartVacancy: PayrollOrgChartVacancy.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartVacancy {
    /**
     * La vacante (vac_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * El puesto.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Bajo qué jefe (emp_…).
     */
    @JsonProperty("manager")
    private String manager;

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Desde cuándo está abierta (YYYY-MM-DD).
     */
    @JsonProperty("opened_on")
    private String openedOn;

    /**
     * La vacante (vac_…).
     */
    public String getId() {
        return id;
    }

    public PayrollOrgChartVacancy setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * El puesto.
     */
    public String getTitle() {
        return title;
    }

    public PayrollOrgChartVacancy setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public PayrollOrgChartVacancy setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Bajo qué jefe (emp_…).
     */
    public String getManager() {
        return manager;
    }

    public PayrollOrgChartVacancy setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    public String getBranch() {
        return branch;
    }

    public PayrollOrgChartVacancy setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Desde cuándo está abierta (YYYY-MM-DD).
     */
    public String getOpenedOn() {
        return openedOn;
    }

    public PayrollOrgChartVacancy setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
        return this;
    }
}
