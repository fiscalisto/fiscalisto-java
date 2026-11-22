// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateComplaints: Las quejas del buzón que esperan atención.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateComplaints {
    /**
     * Quejas nuevas.
     */
    @JsonProperty("new")
    private Long new_;

    /**
     * Quejas en atención.
     */
    @JsonProperty("in_progress")
    private Long inProgress;

    /**
     * Quejas nuevas.
     */
    public Long getNew() {
        return new_;
    }

    public ClimateComplaints setNew(Long new_) {
        this.new_ = new_;
        return this;
    }

    @JsonIgnore
    public ClimateComplaints setNew(long new_) {
        return setNew(Long.valueOf(new_));
    }

    /**
     * Quejas en atención.
     */
    public Long getInProgress() {
        return inProgress;
    }

    public ClimateComplaints setInProgress(Long inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    @JsonIgnore
    public ClimateComplaints setInProgress(long inProgress) {
        return setInProgress(Long.valueOf(inProgress));
    }
}
