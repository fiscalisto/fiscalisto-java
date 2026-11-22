// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetTrainingParticipantsParams: los campos de «Quién tomó un curso».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetTrainingParticipantsParams {
    /**
     * Los empleados (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Los empleados (emp_…).
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public SetTrainingParticipantsParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
