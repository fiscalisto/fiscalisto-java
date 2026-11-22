// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TrainingCertificate: Una constancia DC-3 emitida, con lo que pide el aviso a la STPS.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingCertificate {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    @JsonProperty("folio")
    private Long folio;

    /**
     * Apellido paterno, materno y nombre(s).
     */
    @JsonProperty("name")
    private String name;

    /**
     * CURP, 18 caracteres.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Su ocupación del Catálogo Nacional de Ocupaciones, clave y nombre («06 Transporte»).
     */
    @JsonProperty("occupation")
    private String occupation;

    /**
     * Puesto (Puesto).
     */
    @JsonProperty("position")
    private String position;

    /**
     * Su grado de estudios terminados.
     */
    @JsonProperty("education")
    private String education;

    /**
     * El nombre del curso.
     */
    @JsonProperty("course")
    private String course;

    /**
     * El área temática, clave y nombre («6000 Seguridad»).
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
     * El agente capacitador como va en la constancia.
     */
    @JsonProperty("trainer")
    private String trainer;

    /**
     * El registro del agente externo ante la STPS.
     */
    @JsonProperty("trainer_registration")
    private String trainerRegistration;

    /**
     * Cuándo se entregó.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TrainingCertificate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public Long getFolio() {
        return folio;
    }

    public TrainingCertificate setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    @JsonIgnore
    public TrainingCertificate setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Apellido paterno, materno y nombre(s).
     */
    public String getName() {
        return name;
    }

    public TrainingCertificate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public TrainingCertificate setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Su ocupación del Catálogo Nacional de Ocupaciones, clave y nombre («06 Transporte»).
     */
    public String getOccupation() {
        return occupation;
    }

    public TrainingCertificate setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public TrainingCertificate setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Su grado de estudios terminados.
     */
    public String getEducation() {
        return education;
    }

    public TrainingCertificate setEducation(String education) {
        this.education = education;
        return this;
    }

    /**
     * El nombre del curso.
     */
    public String getCourse() {
        return course;
    }

    public TrainingCertificate setCourse(String course) {
        this.course = course;
        return this;
    }

    /**
     * El área temática, clave y nombre («6000 Seguridad»).
     */
    public String getThematicArea() {
        return thematicArea;
    }

    public TrainingCertificate setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
        return this;
    }

    /**
     * La duración en horas.
     */
    public BigDecimal getHours() {
        return hours;
    }

    public TrainingCertificate setHours(BigDecimal hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public TrainingCertificate setHours(double hours) {
        return setHours(BigDecimal.valueOf(hours));
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public TrainingCertificate setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public TrainingCertificate setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * El agente capacitador como va en la constancia.
     */
    public String getTrainer() {
        return trainer;
    }

    public TrainingCertificate setTrainer(String trainer) {
        this.trainer = trainer;
        return this;
    }

    /**
     * El registro del agente externo ante la STPS.
     */
    public String getTrainerRegistration() {
        return trainerRegistration;
    }

    public TrainingCertificate setTrainerRegistration(String trainerRegistration) {
        this.trainerRegistration = trainerRegistration;
        return this;
    }

    /**
     * Cuándo se entregó.
     */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    public TrainingCertificate setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }
}
