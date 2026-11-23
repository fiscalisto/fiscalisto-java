// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleFollowUp: RuleFollowUp.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleFollowUp {
    /**
     * Días después de que hizo lo de actions.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Lo que hace ese día, si sus condiciones aún se cumplen.
     */
    @JsonProperty("actions")
    private List<RuleFollowUpAction> actions;

    /**
     * Días después de que hizo lo de actions.
     */
    public Long getDays() {
        return days;
    }

    public RuleFollowUp setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public RuleFollowUp setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Lo que hace ese día, si sus condiciones aún se cumplen.
     */
    public List<RuleFollowUpAction> getActions() {
        return actions;
    }

    public RuleFollowUp setActions(List<RuleFollowUpAction> actions) {
        this.actions = actions;
        return this;
    }
}
