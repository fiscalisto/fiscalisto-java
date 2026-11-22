// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReviewCycleRulesRaters: Quién evalúa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleRulesRaters {
    /**
     * Si cuenta lo que dice la persona misma.
     */
    @JsonProperty("self")
    private Boolean self;

    /**
     * Si cuenta lo que dice su jefe en el organigrama.
     */
    @JsonProperty("manager")
    private Boolean manager;

    /**
     * Si cuenta lo que dice sus compañeros.
     */
    @JsonProperty("peer")
    private Boolean peer;

    /**
     * Si cuenta lo que dice las personas a su cargo.
     */
    @JsonProperty("report")
    private Boolean report;

    /**
     * Si cuenta lo que dice la persona misma.
     */
    public Boolean getSelf() {
        return self;
    }

    public ReviewCycleRulesRaters setSelf(Boolean self) {
        this.self = self;
        return this;
    }

    /**
     * Si cuenta lo que dice su jefe en el organigrama.
     */
    public Boolean getManager() {
        return manager;
    }

    public ReviewCycleRulesRaters setManager(Boolean manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Si cuenta lo que dice sus compañeros.
     */
    public Boolean getPeer() {
        return peer;
    }

    public ReviewCycleRulesRaters setPeer(Boolean peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Si cuenta lo que dice las personas a su cargo.
     */
    public Boolean getReport() {
        return report;
    }

    public ReviewCycleRulesRaters setReport(Boolean report) {
        this.report = report;
        return this;
    }
}
