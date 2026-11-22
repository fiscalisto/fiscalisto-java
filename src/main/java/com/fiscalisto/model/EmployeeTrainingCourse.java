// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EmployeeTrainingCourse: EmployeeTrainingCourse.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeTrainingCourse {
    /**
     * El curso (trc_…).
     */
    @JsonProperty("course")
    private String course;

    /**
     * Su lugar en el curso (trp_…).
     */
    @JsonProperty("participant")
    private String participant;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El área temática, clave y nombre.
     */
    @JsonProperty("thematic_area")
    private String thematicArea;

    /**
     * La duración en horas.
     */
    @JsonProperty("hours")
    private BigDecimal hours;

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * pending, passed, failed o sufficiency.
     */
    @JsonProperty("result")
    private String result;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    @JsonProperty("folio")
    private Long folio;

    /**
     * Cuándo se emitió su constancia.
     */
    @JsonProperty("issued_at")
    private String issuedAt;

    /**
     * Cuándo se le entregó.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Hasta cuándo está vigente, si el curso tiene vigencia.
     */
    @JsonProperty("expires_on")
    private String expiresOn;

    /**
     * El curso (trc_…).
     */
    public String getCourse() {
        return course;
    }

    public EmployeeTrainingCourse setCourse(String course) {
        this.course = course;
        return this;
    }

    /**
     * Su lugar en el curso (trp_…).
     */
    public String getParticipant() {
        return participant;
    }

    public EmployeeTrainingCourse setParticipant(String participant) {
        this.participant = participant;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public EmployeeTrainingCourse setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El área temática, clave y nombre.
     */
    public String getThematicArea() {
        return thematicArea;
    }

    public EmployeeTrainingCourse setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
        return this;
    }

    /**
     * La duración en horas.
     */
    public BigDecimal getHours() {
        return hours;
    }

    public EmployeeTrainingCourse setHours(BigDecimal hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public EmployeeTrainingCourse setHours(double hours) {
        return setHours(BigDecimal.valueOf(hours));
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public EmployeeTrainingCourse setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public EmployeeTrainingCourse setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * pending, passed, failed o sufficiency.
     */
    public String getResult() {
        return result;
    }

    public EmployeeTrainingCourse setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public Long getFolio() {
        return folio;
    }

    public EmployeeTrainingCourse setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    @JsonIgnore
    public EmployeeTrainingCourse setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Cuándo se emitió su constancia.
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public EmployeeTrainingCourse setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * Cuándo se le entregó.
     */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    public EmployeeTrainingCourse setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /**
     * Hasta cuándo está vigente, si el curso tiene vigencia.
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    public EmployeeTrainingCourse setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }
}
