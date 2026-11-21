// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SavePayrollDepartmentParams: los campos de «Crear o cambiar un departamento».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SavePayrollDepartmentParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El departamento. Si no existe, se crea; si existe, se cambia.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su nuevo nombre: se cambia también en sus empleados y vacantes.
     */
    @JsonProperty("new_name")
    private String newName;

    /**
     * El departamento dentro del que está, o null para ponerlo arriba.
     */
    @JsonProperty("parent")
    private String parent;

    /**
     * Su responsable (emp_…).
     */
    @JsonProperty("lead")
    private String lead;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public SavePayrollDepartmentParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El departamento. Si no existe, se crea; si existe, se cambia.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public SavePayrollDepartmentParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su nuevo nombre: se cambia también en sus empleados y vacantes.
     */
    public String getNewName() {
        return newName;
    }

    public SavePayrollDepartmentParams setNewName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * El departamento dentro del que está, o null para ponerlo arriba.
     */
    public String getParent() {
        return parent;
    }

    public SavePayrollDepartmentParams setParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Su responsable (emp_…).
     */
    public String getLead() {
        return lead;
    }

    public SavePayrollDepartmentParams setLead(String lead) {
        this.lead = lead;
        return this;
    }
}
