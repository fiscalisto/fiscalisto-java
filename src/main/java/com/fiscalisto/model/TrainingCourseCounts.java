// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingCourseCounts: Los totales (en la lista).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingCourseCounts {
    /**
     * Quienes lo tomaron.
     */
    @JsonProperty("participants")
    private Long participants;

    /**
     * Quienes aprobaron (o el examen de suficiencia).
     */
    @JsonProperty("passed")
    private Long passed;

    /**
     * Quienes faltan por calificar.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * Constancias emitidas.
     */
    @JsonProperty("issued")
    private Long issued;

    /**
     * Constancias entregadas.
     */
    @JsonProperty("delivered")
    private Long delivered;

    /**
     * Constancias que se deben (aprobaron) y no se han entregado.
     */
    @JsonProperty("due")
    private Long due;

    /**
     * De due, las que pasaron los 20 días hábiles (artículo 24, fracción III).
     */
    @JsonProperty("late")
    private Long late;

    /**
     * Quienes lo tomaron.
     */
    public Long getParticipants() {
        return participants;
    }

    public TrainingCourseCounts setParticipants(Long participants) {
        this.participants = participants;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setParticipants(long participants) {
        return setParticipants(Long.valueOf(participants));
    }

    /**
     * Quienes aprobaron (o el examen de suficiencia).
     */
    public Long getPassed() {
        return passed;
    }

    public TrainingCourseCounts setPassed(Long passed) {
        this.passed = passed;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setPassed(long passed) {
        return setPassed(Long.valueOf(passed));
    }

    /**
     * Quienes faltan por calificar.
     */
    public Long getPending() {
        return pending;
    }

    public TrainingCourseCounts setPending(Long pending) {
        this.pending = pending;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setPending(long pending) {
        return setPending(Long.valueOf(pending));
    }

    /**
     * Constancias emitidas.
     */
    public Long getIssued() {
        return issued;
    }

    public TrainingCourseCounts setIssued(Long issued) {
        this.issued = issued;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setIssued(long issued) {
        return setIssued(Long.valueOf(issued));
    }

    /**
     * Constancias entregadas.
     */
    public Long getDelivered() {
        return delivered;
    }

    public TrainingCourseCounts setDelivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setDelivered(long delivered) {
        return setDelivered(Long.valueOf(delivered));
    }

    /**
     * Constancias que se deben (aprobaron) y no se han entregado.
     */
    public Long getDue() {
        return due;
    }

    public TrainingCourseCounts setDue(Long due) {
        this.due = due;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setDue(long due) {
        return setDue(Long.valueOf(due));
    }

    /**
     * De due, las que pasaron los 20 días hábiles (artículo 24, fracción III).
     */
    public Long getLate() {
        return late;
    }

    public TrainingCourseCounts setLate(Long late) {
        this.late = late;
        return this;
    }

    @JsonIgnore
    public TrainingCourseCounts setLate(long late) {
        return setLate(Long.valueOf(late));
    }
}
