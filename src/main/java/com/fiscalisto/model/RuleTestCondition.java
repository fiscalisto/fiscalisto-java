// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleTestCondition: RuleTestCondition.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleTestCondition {
    /**
     * La condición, en palabras.
     */
    @JsonProperty("condition")
    private String condition;

    /**
     * Si se cumple.
     */
    @JsonProperty("holds")
    private Boolean holds;

    /**
     * Lo que tiene el registro.
     */
    @JsonProperty("actual")
    private String actual;

    /**
     * La condición, en palabras.
     */
    public String getCondition() {
        return condition;
    }

    public RuleTestCondition setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Si se cumple.
     */
    public Boolean getHolds() {
        return holds;
    }

    public RuleTestCondition setHolds(Boolean holds) {
        this.holds = holds;
        return this;
    }

    /**
     * Lo que tiene el registro.
     */
    public String getActual() {
        return actual;
    }

    public RuleTestCondition setActual(String actual) {
        this.actual = actual;
        return this;
    }
}
