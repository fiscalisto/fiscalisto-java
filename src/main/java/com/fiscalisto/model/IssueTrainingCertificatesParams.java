// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * IssueTrainingCertificatesParams: los campos de «Emitir constancias DC-3».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueTrainingCertificatesParams {
    /**
     * A quiénes; por omisión a todos los que aprobaron y no la tienen.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * A quiénes; por omisión a todos los que aprobaron y no la tienen.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public IssueTrainingCertificatesParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
