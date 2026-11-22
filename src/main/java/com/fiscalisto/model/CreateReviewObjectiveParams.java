// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateReviewObjectiveParams: los campos de «Agregar un objetivo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateReviewObjectiveParams {
    /**
     * El ciclo (rvc_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cycle")
    private String cycle;

    /**
     * La persona (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

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
     * El ciclo (rvc_…).
     * <p>
     * Obligatorio.
     */
    public String getCycle() {
        return cycle;
    }

    public CreateReviewObjectiveParams setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * La persona (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreateReviewObjectiveParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Qué tiene que lograr.
     * <p>
     * Obligatorio.
     */
    public String getTitle() {
        return title;
    }

    public CreateReviewObjectiveParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * La meta, si se mide con un número.
     */
    public BigDecimal getTarget() {
        return target;
    }

    public CreateReviewObjectiveParams setTarget(BigDecimal target) {
        this.target = target;
        return this;
    }

    @JsonIgnore
    public CreateReviewObjectiveParams setTarget(double target) {
        return setTarget(BigDecimal.valueOf(target));
    }

    /**
     * El avance.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public CreateReviewObjectiveParams setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public CreateReviewObjectiveParams setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }

    /**
     * La unidad: pesos, %, piezas.
     */
    public String getUnit() {
        return unit;
    }

    public CreateReviewObjectiveParams setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * La meta es un máximo (quejas, mermas): menos es mejor.
     */
    public Boolean getLowerBetter() {
        return lowerBetter;
    }

    public CreateReviewObjectiveParams setLowerBetter(Boolean lowerBetter) {
        this.lowerBetter = lowerBetter;
        return this;
    }

    /**
     * Cuánto cuenta frente a sus otros objetivos. Por omisión, 1.
     */
    public BigDecimal getWeight() {
        return weight;
    }

    public CreateReviewObjectiveParams setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    @JsonIgnore
    public CreateReviewObjectiveParams setWeight(double weight) {
        return setWeight(BigDecimal.valueOf(weight));
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public CreateReviewObjectiveParams setNote(String note) {
        this.note = note;
        return this;
    }
}
