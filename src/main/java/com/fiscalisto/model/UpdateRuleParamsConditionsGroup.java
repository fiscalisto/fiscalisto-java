// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateRuleParamsConditionsGroup: UpdateRuleParamsConditionsGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRuleParamsConditionsGroup {
    /**
     * Cómo se juntan las del grupo.
     * <p>
     * Valores: all, any.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("match")
    private String match;

    /**
     * Las condiciones del grupo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("conditions")
    private List<UpdateRuleParamsConditionsGroupCondition> conditions;

    /**
     * Cómo se juntan las del grupo.
     * <p>
     * Valores: all, any.
     * <p>
     * Obligatorio.
     */
    public String getMatch() {
        return match;
    }

    public UpdateRuleParamsConditionsGroup setMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * Las condiciones del grupo.
     * <p>
     * Obligatorio.
     */
    public List<UpdateRuleParamsConditionsGroupCondition> getConditions() {
        return conditions;
    }

    public UpdateRuleParamsConditionsGroup setConditions(List<UpdateRuleParamsConditionsGroupCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
}
