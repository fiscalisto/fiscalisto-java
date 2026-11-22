// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetTrainingResultsParams: los campos de «Calificar un curso».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetTrainingResultsParams {
    /**
     * La calificación de cada empleado, hasta 1,000 a la vez.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("results")
    private List<SetTrainingResultsParamsResult> results;

    /**
     * La calificación de cada empleado, hasta 1,000 a la vez.
     * <p>
     * Obligatorio.
     */
    public List<SetTrainingResultsParamsResult> getResults() {
        return results;
    }

    public SetTrainingResultsParams setResults(List<SetTrainingResultsParamsResult> results) {
        this.results = results;
        return this;
    }
}
