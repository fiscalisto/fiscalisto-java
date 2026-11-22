// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetReviewParticipantsParams: los campos de «Elegir a quién se evalúa».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetReviewParticipantsParams {
    /**
     * Todas las personas que se evalúan (emp_…), en borrador. Reemplaza la lista.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Todas las personas que se evalúan (emp_…), en borrador. Reemplaza la lista.
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public SetReviewParticipantsParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
