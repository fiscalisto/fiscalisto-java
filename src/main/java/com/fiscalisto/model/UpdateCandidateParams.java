// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateCandidateParams: los campos de «Cambiar un candidato».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCandidateParams {
    /**
     * Una de las etapas (stages).
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * Su calificación, de 1 a 5; null se la quita.
     */
    @JsonProperty("rating")
    private Long rating;

    /**
     * La nota de su equipo; no la ve el candidato.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Una de las etapas (stages).
     */
    public String getStage() {
        return stage;
    }

    public UpdateCandidateParams setStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Su calificación, de 1 a 5; null se la quita.
     */
    public Long getRating() {
        return rating;
    }

    public UpdateCandidateParams setRating(Long rating) {
        this.rating = rating;
        return this;
    }

    @JsonIgnore
    public UpdateCandidateParams setRating(long rating) {
        return setRating(Long.valueOf(rating));
    }

    /**
     * La nota de su equipo; no la ve el candidato.
     */
    public String getNote() {
        return note;
    }

    public UpdateCandidateParams setNote(String note) {
        this.note = note;
        return this;
    }
}
