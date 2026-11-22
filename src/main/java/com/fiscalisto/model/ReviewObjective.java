// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ReviewObjective: Un objetivo de una persona en un ciclo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewObjective {
    /**
     * El objetivo (rvo_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El ciclo (rvc_…).
     */
    @JsonProperty("cycle")
    private String cycle;

    /**
     * De quién es (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Qué tiene que lograr.
     */
    @JsonProperty("title")
    private String title;

    /**
     * La meta.
     */
    @JsonProperty("target")
    private BigDecimal target;

    /**
     * El avance; lo anota la persona en su portal o usted aquí.
     */
    @JsonProperty("actual")
    private BigDecimal actual;

    /**
     * La unidad.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * La meta es un máximo: menos es mejor.
     */
    @JsonProperty("lower_better")
    private Boolean lowerBetter;

    /**
     * Cuánto cuenta frente a sus otros objetivos.
     */
    @JsonProperty("weight")
    private BigDecimal weight;

    /**
     * Una nota sobre el objetivo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * % logrado: avance entre meta, o al revés con lower_better. null sin los dos.
     */
    @JsonProperty("achievement")
    private BigDecimal achievement;

    /**
     * La calificación que le dio su jefe al evaluarla.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * El objetivo (rvo_…).
     */
    public String getId() {
        return id;
    }

    public ReviewObjective setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ReviewObjective setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El ciclo (rvc_…).
     */
    public String getCycle() {
        return cycle;
    }

    public ReviewObjective setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * De quién es (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ReviewObjective setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Qué tiene que lograr.
     */
    public String getTitle() {
        return title;
    }

    public ReviewObjective setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * La meta.
     */
    public BigDecimal getTarget() {
        return target;
    }

    public ReviewObjective setTarget(BigDecimal target) {
        this.target = target;
        return this;
    }

    @JsonIgnore
    public ReviewObjective setTarget(double target) {
        return setTarget(BigDecimal.valueOf(target));
    }

    /**
     * El avance; lo anota la persona en su portal o usted aquí.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public ReviewObjective setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public ReviewObjective setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }

    /**
     * La unidad.
     */
    public String getUnit() {
        return unit;
    }

    public ReviewObjective setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * La meta es un máximo: menos es mejor.
     */
    public Boolean getLowerBetter() {
        return lowerBetter;
    }

    public ReviewObjective setLowerBetter(Boolean lowerBetter) {
        this.lowerBetter = lowerBetter;
        return this;
    }

    /**
     * Cuánto cuenta frente a sus otros objetivos.
     */
    public BigDecimal getWeight() {
        return weight;
    }

    public ReviewObjective setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    @JsonIgnore
    public ReviewObjective setWeight(double weight) {
        return setWeight(BigDecimal.valueOf(weight));
    }

    /**
     * Una nota sobre el objetivo.
     */
    public String getNote() {
        return note;
    }

    public ReviewObjective setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * % logrado: avance entre meta, o al revés con lower_better. null sin los dos.
     */
    public BigDecimal getAchievement() {
        return achievement;
    }

    public ReviewObjective setAchievement(BigDecimal achievement) {
        this.achievement = achievement;
        return this;
    }

    @JsonIgnore
    public ReviewObjective setAchievement(double achievement) {
        return setAchievement(BigDecimal.valueOf(achievement));
    }

    /**
     * La calificación que le dio su jefe al evaluarla.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ReviewObjective setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ReviewObjective setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }
}
