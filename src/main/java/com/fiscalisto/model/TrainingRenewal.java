// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingRenewal: TrainingRenewal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingRenewal {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El nombre del curso.
     */
    @JsonProperty("course")
    private String course;

    /**
     * La clave del área temática.
     */
    @JsonProperty("thematic_area")
    private String thematicArea;

    /**
     * Hasta cuándo está vigente.
     */
    @JsonProperty("until")
    private String until;

    /**
     * Si ya venció.
     */
    @JsonProperty("expired")
    private Boolean expired;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public TrainingRenewal setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public TrainingRenewal setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El nombre del curso.
     */
    public String getCourse() {
        return course;
    }

    public TrainingRenewal setCourse(String course) {
        this.course = course;
        return this;
    }

    /**
     * La clave del área temática.
     */
    public String getThematicArea() {
        return thematicArea;
    }

    public TrainingRenewal setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
        return this;
    }

    /**
     * Hasta cuándo está vigente.
     */
    public String getUntil() {
        return until;
    }

    public TrainingRenewal setUntil(String until) {
        this.until = until;
        return this;
    }

    /**
     * Si ya venció.
     */
    public Boolean getExpired() {
        return expired;
    }

    public TrainingRenewal setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
}
