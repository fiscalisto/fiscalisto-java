// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReviewResultComment: ReviewResultComment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResultComment {
    /**
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    @JsonProperty("relation")
    private String relation;

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    @JsonProperty("text")
    private String text;

    /**
     * Solo de la autoevaluación y del jefe; compañeros y personas a su cargo van sin nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    public String getRelation() {
        return relation;
    }

    public ReviewResultComment setRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    public String getText() {
        return text;
    }

    public ReviewResultComment setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Solo de la autoevaluación y del jefe; compañeros y personas a su cargo van sin nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewResultComment setName(String name) {
        this.name = name;
        return this;
    }
}
