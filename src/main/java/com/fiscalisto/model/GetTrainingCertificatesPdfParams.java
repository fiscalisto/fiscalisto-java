// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetTrainingCertificatesPdfParams: los campos de «Descargar constancias DC-3».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTrainingCertificatesPdfParams {
    /**
     * Solo las de estos empleados (emp_…, separados por comas).
     */
    @JsonProperty("employees")
    private String employees;

    /**
     * Solo las de estos empleados (emp_…, separados por comas).
     */
    public String getEmployees() {
        return employees;
    }

    public GetTrainingCertificatesPdfParams setEmployees(String employees) {
        this.employees = employees;
        return this;
    }
}
