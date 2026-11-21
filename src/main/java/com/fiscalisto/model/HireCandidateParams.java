// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HireCandidateParams: los campos de «Contratar a un candidato».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HireCandidateParams {
    /**
     * El empleado (emp_…) que ya dio de alta con POST /v1/employees: cubre la vacante con él.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El empleado (emp_…) que ya dio de alta con POST /v1/employees: cubre la vacante con él.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public HireCandidateParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
