// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateRuleParamsConditions: Si: lo que tiene que cumplir. Sin condiciones, corre siempre.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRuleParamsConditions {
    /**
     * all: se cumplen todas (las condiciones y los grupos); any: basta con una.
     * <p>
     * Valores: all, any.
     */
    @JsonProperty("match")
    private String match;

    /**
     * Las condiciones sueltas.
     */
    @JsonProperty("conditions")
    private List<UpdateRuleParamsConditionsCondition> conditions;

    /**
     * Condiciones que van juntas, con su propio all / any (un nivel).
     */
    @JsonProperty("groups")
    private List<UpdateRuleParamsConditionsGroup> groups;

    /**
     * all: se cumplen todas (las condiciones y los grupos); any: basta con una.
     * <p>
     * Valores: all, any.
     */
    public String getMatch() {
        return match;
    }

    public UpdateRuleParamsConditions setMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * Las condiciones sueltas.
     */
    public List<UpdateRuleParamsConditionsCondition> getConditions() {
        return conditions;
    }

    public UpdateRuleParamsConditions setConditions(List<UpdateRuleParamsConditionsCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Condiciones que van juntas, con su propio all / any (un nivel).
     */
    public List<UpdateRuleParamsConditionsGroup> getGroups() {
        return groups;
    }

    public UpdateRuleParamsConditions setGroups(List<UpdateRuleParamsConditionsGroup> groups) {
        this.groups = groups;
        return this;
    }
}
