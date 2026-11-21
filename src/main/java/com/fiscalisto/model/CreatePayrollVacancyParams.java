// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePayrollVacancyParams: los campos de «Abrir una vacante».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollVacancyParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El puesto que falta cubrir.
     * <p>
     * Obligatorio.
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
     * Una sucursal del emisor (brn_…), o null para la matriz.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Desde cuándo está abierta (YYYY-MM-DD); por omisión hoy.
     */
    @JsonProperty("opened_on")
    private String openedOn;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollVacancyParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El puesto que falta cubrir.
     * <p>
     * Obligatorio.
     */
    public String getTitle() {
        return title;
    }

    public CreatePayrollVacancyParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public CreatePayrollVacancyParams setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Bajo qué jefe (emp_…).
     */
    public String getManager() {
        return manager;
    }

    public CreatePayrollVacancyParams setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Una sucursal del emisor (brn_…), o null para la matriz.
     */
    public String getBranch() {
        return branch;
    }

    public CreatePayrollVacancyParams setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Desde cuándo está abierta (YYYY-MM-DD); por omisión hoy.
     */
    public String getOpenedOn() {
        return openedOn;
    }

    public CreatePayrollVacancyParams setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
        return this;
    }
}
