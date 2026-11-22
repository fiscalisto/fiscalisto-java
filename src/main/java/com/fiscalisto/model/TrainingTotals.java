// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingTotals: Totales (Totales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingTotals {
    /**
     * Constancias por entregar.
     */
    @JsonProperty("due")
    private Long due;

    /**
     * De ellas, fuera de plazo.
     */
    @JsonProperty("late")
    private Long late;

    /**
     * Empleados activos sin ocupación del catálogo.
     */
    @JsonProperty("missing_occupation")
    private Long missingOccupation;

    /**
     * Constancias por entregar.
     */
    public Long getDue() {
        return due;
    }

    public TrainingTotals setDue(Long due) {
        this.due = due;
        return this;
    }

    @JsonIgnore
    public TrainingTotals setDue(long due) {
        return setDue(Long.valueOf(due));
    }

    /**
     * De ellas, fuera de plazo.
     */
    public Long getLate() {
        return late;
    }

    public TrainingTotals setLate(Long late) {
        this.late = late;
        return this;
    }

    @JsonIgnore
    public TrainingTotals setLate(long late) {
        return setLate(Long.valueOf(late));
    }

    /**
     * Empleados activos sin ocupación del catálogo.
     */
    public Long getMissingOccupation() {
        return missingOccupation;
    }

    public TrainingTotals setMissingOccupation(Long missingOccupation) {
        this.missingOccupation = missingOccupation;
        return this;
    }

    @JsonIgnore
    public TrainingTotals setMissingOccupation(long missingOccupation) {
        return setMissingOccupation(Long.valueOf(missingOccupation));
    }
}
