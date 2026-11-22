// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReviewCycleCompetency: ReviewCycleCompetency.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleCompetency {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ReviewCycleCompetency setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewCycleCompetency setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public ReviewCycleCompetency setDescription(String description) {
        this.description = description;
        return this;
    }
}
