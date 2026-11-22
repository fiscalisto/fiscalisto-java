// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateReviewCycleParamsCompetency: UpdateReviewCycleParamsCompetency.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateReviewCycleParamsCompetency {
    /**
     * Su id, único en el ciclo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Qué se espera, en una frase; lo ve cada evaluador.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Su id, único en el ciclo.
     * <p>
     * Obligatorio.
     */
    public String getId() {
        return id;
    }

    public UpdateReviewCycleParamsCompetency setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public UpdateReviewCycleParamsCompetency setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Qué se espera, en una frase; lo ve cada evaluador.
     */
    public String getDescription() {
        return description;
    }

    public UpdateReviewCycleParamsCompetency setDescription(String description) {
        this.description = description;
        return this;
    }
}
