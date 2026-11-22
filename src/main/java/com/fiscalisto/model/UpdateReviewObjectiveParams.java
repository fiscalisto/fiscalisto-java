// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateReviewObjectiveParams: los campos de «Cambiar un objetivo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateReviewObjectiveParams {
    /**
     * Qué tiene que lograr.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("title")
    private String title;

    /**
     * La meta, si se mide con un número.
     */
    @JsonProperty("target")
    private BigDecimal target;

    /**
     * El avance.
     */
    @JsonProperty("actual")
    private BigDecimal actual;

    /**
     * La unidad: pesos, %, piezas.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * La meta es un máximo (quejas, mermas): menos es mejor.
     */
    @JsonProperty("lower_better")
    private Boolean lowerBetter;

    /**
     * Cuánto cuenta frente a sus otros objetivos. Por omisión, 1.
     */
    @JsonProperty("weight")
    private BigDecimal weight;

    /**
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Qué tiene que lograr.
     * <p>
     * Obligatorio.
     */
    public String getTitle() {
        return title;
    }

    public UpdateReviewObjectiveParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * La meta, si se mide con un número.
     */
    public BigDecimal getTarget() {
        return target;
    }

    public UpdateReviewObjectiveParams setTarget(BigDecimal target) {
        this.target = target;
        return this;
    }

    @JsonIgnore
    public UpdateReviewObjectiveParams setTarget(double target) {
        return setTarget(BigDecimal.valueOf(target));
    }

    /**
     * El avance.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public UpdateReviewObjectiveParams setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public UpdateReviewObjectiveParams setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }

    /**
     * La unidad: pesos, %, piezas.
     */
    public String getUnit() {
        return unit;
    }

    public UpdateReviewObjectiveParams setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * La meta es un máximo (quejas, mermas): menos es mejor.
     */
    public Boolean getLowerBetter() {
        return lowerBetter;
    }

    public UpdateReviewObjectiveParams setLowerBetter(Boolean lowerBetter) {
        this.lowerBetter = lowerBetter;
        return this;
    }

    /**
     * Cuánto cuenta frente a sus otros objetivos. Por omisión, 1.
     */
    public BigDecimal getWeight() {
        return weight;
    }

    public UpdateReviewObjectiveParams setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    @JsonIgnore
    public UpdateReviewObjectiveParams setWeight(double weight) {
        return setWeight(BigDecimal.valueOf(weight));
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public UpdateReviewObjectiveParams setNote(String note) {
        this.note = note;
        return this;
    }
}
