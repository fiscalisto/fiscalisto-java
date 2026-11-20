// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleConditions: Si: lo que tiene que cumplir la factura u orden. Sin condiciones, corre siempre.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleConditions {
    /**
     * all: se cumplen todas; any: basta con una.
     * <p>
     * Valores: all, any.
     */
    @JsonProperty("match")
    private String match;

    /**
     * Las condiciones sueltas.
     */
    @JsonProperty("conditions")
    private List<RuleConditionsCondition> conditions;

    /**
     * Condiciones que van juntas, con su propio match.
     */
    @JsonProperty("groups")
    private List<RuleConditionsGroup> groups;

    /**
     * all: se cumplen todas; any: basta con una.
     * <p>
     * Valores: all, any.
     */
    public String getMatch() {
        return match;
    }

    public RuleConditions setMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * Las condiciones sueltas.
     */
    public List<RuleConditionsCondition> getConditions() {
        return conditions;
    }

    public RuleConditions setConditions(List<RuleConditionsCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Condiciones que van juntas, con su propio match.
     */
    public List<RuleConditionsGroup> getGroups() {
        return groups;
    }

    public RuleConditions setGroups(List<RuleConditionsGroup> groups) {
        this.groups = groups;
        return this;
    }
}
