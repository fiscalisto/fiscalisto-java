// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateReviewCycleParamsRulesRaters: Quién evalúa: self (autoevaluación), manager (su jefe en el organigrama), peer (compañeros), report (las personas a su cargo).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateReviewCycleParamsRulesRaters {
    /**
     * Si cuenta lo que dice la persona misma.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("self")
    private Boolean self;

    /**
     * Si cuenta lo que dice su jefe en el organigrama.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("manager")
    private Boolean manager;

    /**
     * Si cuenta lo que dice sus compañeros.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("peer")
    private Boolean peer;

    /**
     * Si cuenta lo que dice las personas a su cargo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("report")
    private Boolean report;

    /**
     * Si cuenta lo que dice la persona misma.
     * <p>
     * Obligatorio.
     */
    public Boolean getSelf() {
        return self;
    }

    public UpdateReviewCycleParamsRulesRaters setSelf(Boolean self) {
        this.self = self;
        return this;
    }

    /**
     * Si cuenta lo que dice su jefe en el organigrama.
     * <p>
     * Obligatorio.
     */
    public Boolean getManager() {
        return manager;
    }

    public UpdateReviewCycleParamsRulesRaters setManager(Boolean manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Si cuenta lo que dice sus compañeros.
     * <p>
     * Obligatorio.
     */
    public Boolean getPeer() {
        return peer;
    }

    public UpdateReviewCycleParamsRulesRaters setPeer(Boolean peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Si cuenta lo que dice las personas a su cargo.
     * <p>
     * Obligatorio.
     */
    public Boolean getReport() {
        return report;
    }

    public UpdateReviewCycleParamsRulesRaters setReport(Boolean report) {
        this.report = report;
        return this;
    }
}
