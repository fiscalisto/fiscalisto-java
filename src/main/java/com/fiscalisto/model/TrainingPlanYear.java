// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingPlanYear: TrainingPlanYear.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingPlanYear {
    /**
     * El primer día del año del plan.
     */
    @JsonProperty("from")
    private String from;

    /**
     * El último día del año del plan.
     */
    @JsonProperty("to")
    private String to;

    /**
     * El día límite del aviso a la STPS (60 días hábiles después de to).
     */
    @JsonProperty("list_by")
    private String listBy;

    /**
     * El primer día del año del plan.
     */
    public String getFrom() {
        return from;
    }

    public TrainingPlanYear setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * El último día del año del plan.
     */
    public String getTo() {
        return to;
    }

    public TrainingPlanYear setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * El día límite del aviso a la STPS (60 días hábiles después de to).
     */
    public String getListBy() {
        return listBy;
    }

    public TrainingPlanYear setListBy(String listBy) {
        this.listBy = listBy;
        return this;
    }
}
