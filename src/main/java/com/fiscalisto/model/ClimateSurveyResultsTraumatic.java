// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateSurveyResultsTraumatic: ClimateSurveyResultsTraumatic.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsTraumatic {
    /**
     * Quienes dijeron haber vivido un acontecimiento traumático severo.
     */
    @JsonProperty("yes")
    private Long yes;

    /**
     * De ellos, quienes requieren valoración clínica (Guía I).
     */
    @JsonProperty("needs_attention")
    private Long needsAttention;

    /**
     * Quienes dijeron haber vivido un acontecimiento traumático severo.
     */
    public Long getYes() {
        return yes;
    }

    public ClimateSurveyResultsTraumatic setYes(Long yes) {
        this.yes = yes;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsTraumatic setYes(long yes) {
        return setYes(Long.valueOf(yes));
    }

    /**
     * De ellos, quienes requieren valoración clínica (Guía I).
     */
    public Long getNeedsAttention() {
        return needsAttention;
    }

    public ClimateSurveyResultsTraumatic setNeedsAttention(Long needsAttention) {
        this.needsAttention = needsAttention;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsTraumatic setNeedsAttention(long needsAttention) {
        return setNeedsAttention(Long.valueOf(needsAttention));
    }
}
