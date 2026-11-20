// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEmployeePayStatementParams: los campos de «Constancia de sueldos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEmployeePayStatementParams {
    /**
     * El año (AAAA), desde 2014.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private String year;

    /**
     * El año (AAAA), desde 2014.
     * <p>
     * Obligatorio.
     */
    public String getYear() {
        return year;
    }

    public GetEmployeePayStatementParams setYear(String year) {
        this.year = year;
        return this;
    }
}
