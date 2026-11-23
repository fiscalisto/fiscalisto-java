// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRuleParamsFollowUp: CreateRuleParamsFollowUp.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRuleParamsFollowUp {
    /**
     * Días después de que hizo lo de actions (cada paso, más que el anterior).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Lo que hace ese día, si sus condiciones aún se cumplen.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("actions")
    private List<CreateRuleParamsFollowUpAction> actions;

    /**
     * Días después de que hizo lo de actions (cada paso, más que el anterior).
     * <p>
     * Obligatorio.
     */
    public Long getDays() {
        return days;
    }

    public CreateRuleParamsFollowUp setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsFollowUp setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Lo que hace ese día, si sus condiciones aún se cumplen.
     * <p>
     * Obligatorio.
     */
    public List<CreateRuleParamsFollowUpAction> getActions() {
        return actions;
    }

    public CreateRuleParamsFollowUp setActions(List<CreateRuleParamsFollowUpAction> actions) {
        this.actions = actions;
        return this;
    }
}
