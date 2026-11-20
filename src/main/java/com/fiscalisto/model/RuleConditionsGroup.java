// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleConditionsGroup: RuleConditionsGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleConditionsGroup {
    /**
     * Cómo se juntan las del grupo.
     * <p>
     * Valores: all, any.
     */
    @JsonProperty("match")
    private String match;

    /**
     * Las condiciones del grupo.
     */
    @JsonProperty("conditions")
    private List<RuleConditionsGroupCondition> conditions;

    /**
     * Cómo se juntan las del grupo.
     * <p>
     * Valores: all, any.
     */
    public String getMatch() {
        return match;
    }

    public RuleConditionsGroup setMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * Las condiciones del grupo.
     */
    public List<RuleConditionsGroupCondition> getConditions() {
        return conditions;
    }

    public RuleConditionsGroup setConditions(List<RuleConditionsGroupCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
}
