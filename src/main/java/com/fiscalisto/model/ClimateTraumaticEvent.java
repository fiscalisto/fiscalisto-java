// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * ClimateTraumaticEvent: Quien dijo haber vivido un acontecimiento traumático severo (Guía I).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateTraumaticEvent {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * La encuesta (cls_…).
     */
    @JsonProperty("survey")
    private String survey;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Si requiere valoración clínica según la Guía I (numeral 5.5).
     */
    @JsonProperty("needs_attention")
    private Boolean needsAttention;

    /**
     * Cuándo contestó.
     */
    @JsonProperty("answered_on")
    private String answeredOn;

    /**
     * A dónde se le canalizó.
     */
    @JsonProperty("referred_to")
    private String referredTo;

    /**
     * Cuándo se le canalizó.
     */
    @JsonProperty("referred_on")
    private String referredOn;

    /**
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ClimateTraumaticEvent setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * La encuesta (cls_…).
     */
    public String getSurvey() {
        return survey;
    }

    public ClimateTraumaticEvent setSurvey(String survey) {
        this.survey = survey;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public ClimateTraumaticEvent setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ClimateTraumaticEvent setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public ClimateTraumaticEvent setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateTraumaticEvent setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Si requiere valoración clínica según la Guía I (numeral 5.5).
     */
    public Boolean getNeedsAttention() {
        return needsAttention;
    }

    public ClimateTraumaticEvent setNeedsAttention(Boolean needsAttention) {
        this.needsAttention = needsAttention;
        return this;
    }

    /**
     * Cuándo contestó.
     */
    public String getAnsweredOn() {
        return answeredOn;
    }

    public ClimateTraumaticEvent setAnsweredOn(String answeredOn) {
        this.answeredOn = answeredOn;
        return this;
    }

    /**
     * A dónde se le canalizó.
     */
    public String getReferredTo() {
        return referredTo;
    }

    public ClimateTraumaticEvent setReferredTo(String referredTo) {
        this.referredTo = referredTo;
        return this;
    }

    /**
     * Cuándo se le canalizó.
     */
    public String getReferredOn() {
        return referredOn;
    }

    public ClimateTraumaticEvent setReferredOn(String referredOn) {
        this.referredOn = referredOn;
        return this;
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public ClimateTraumaticEvent setNote(String note) {
        this.note = note;
        return this;
    }
}
