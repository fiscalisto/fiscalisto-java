// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleMatchRule: La regla que se cumplió.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleMatchRule {
    /**
     * La regla (rul_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * La regla (rul_…).
     */
    public String getId() {
        return id;
    }

    public RuleMatchRule setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public RuleMatchRule setName(String name) {
        this.name = name;
        return this;
    }
}
