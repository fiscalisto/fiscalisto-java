// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * TrainingCourse: Un curso de capacitación (Nómina › Capacitación).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingCourse {
    /**
     * El curso (trc_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * El nombre del curso.
     */
    @JsonProperty("name")
    private String name;

    /**
     * La clave del área temática del catálogo de la STPS (1000 a 9000).
     */
    @JsonProperty("thematic_area")
    private String thematicArea;

    /**
     * La duración en horas.
     */
    @JsonProperty("hours")
    private BigDecimal hours;

    /**
     * presencial, en_linea o mixta.
     */
    @JsonProperty("modality")
    private String modality;

    /**
     * internal, external, supplier, foreign o stps.
     */
    @JsonProperty("trainer_kind")
    private String trainerKind;

    /**
     * El agente capacitador.
     */
    @JsonProperty("trainer_name")
    private String trainerName;

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
     * Si se canceló teniendo constancias emitidas (se conservan).
     */
    @JsonProperty("canceled")
    private Boolean canceled;

    /**
     * El registro del agente externo ante la STPS.
     */
    @JsonProperty("trainer_registration")
    private String trainerRegistration;

    /**
     * Quien firma como instructor o tutor.
     */
    @JsonProperty("instructor_name")
    private String instructorName;

    /**
     * Cada cuántos meses se renueva.
     */
    @JsonProperty("validity_months")
    private Long validityMonths;

    /**
     * La calificación mínima.
     */
    @JsonProperty("passing_score")
    private BigDecimal passingScore;

    /**
     * Dónde se imparte.
     */
    @JsonProperty("place")
    private String place;

    /**
     * El objetivo del curso.
     */
    @JsonProperty("objective")
    private String objective;

    /**
     * Qué falta de quién firma las constancias.
     */
    @JsonProperty("signers_problem")
    private String signersProblem;

    /**
     * Quienes lo tomaron (al ver un curso; no en la lista).
     */
    @JsonProperty("participants")
    private List<TrainingParticipant> participants;

    /**
     * Los totales (en la lista).
     */
    @JsonProperty("counts")
    private TrainingCourseCounts counts;

    /**
     * El curso (trc_…).
     */
    public String getId() {
        return id;
    }

    public TrainingCourse setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TrainingCourse setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TrainingCourse setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public TrainingCourse setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public TrainingCourse setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public TrainingCourse setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El nombre del curso.
     */
    public String getName() {
        return name;
    }

    public TrainingCourse setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * La clave del área temática del catálogo de la STPS (1000 a 9000).
     */
    public String getThematicArea() {
        return thematicArea;
    }

    public TrainingCourse setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
        return this;
    }

    /**
     * La duración en horas.
     */
    public BigDecimal getHours() {
        return hours;
    }

    public TrainingCourse setHours(BigDecimal hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public TrainingCourse setHours(double hours) {
        return setHours(BigDecimal.valueOf(hours));
    }

    /**
     * presencial, en_linea o mixta.
     */
    public String getModality() {
        return modality;
    }

    public TrainingCourse setModality(String modality) {
        this.modality = modality;
        return this;
    }

    /**
     * internal, external, supplier, foreign o stps.
     */
    public String getTrainerKind() {
        return trainerKind;
    }

    public TrainingCourse setTrainerKind(String trainerKind) {
        this.trainerKind = trainerKind;
        return this;
    }

    /**
     * El agente capacitador.
     */
    public String getTrainerName() {
        return trainerName;
    }

    public TrainingCourse setTrainerName(String trainerName) {
        this.trainerName = trainerName;
        return this;
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public TrainingCourse setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public TrainingCourse setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Si se canceló teniendo constancias emitidas (se conservan).
     */
    public Boolean getCanceled() {
        return canceled;
    }

    public TrainingCourse setCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * El registro del agente externo ante la STPS.
     */
    public String getTrainerRegistration() {
        return trainerRegistration;
    }

    public TrainingCourse setTrainerRegistration(String trainerRegistration) {
        this.trainerRegistration = trainerRegistration;
        return this;
    }

    /**
     * Quien firma como instructor o tutor.
     */
    public String getInstructorName() {
        return instructorName;
    }

    public TrainingCourse setInstructorName(String instructorName) {
        this.instructorName = instructorName;
        return this;
    }

    /**
     * Cada cuántos meses se renueva.
     */
    public Long getValidityMonths() {
        return validityMonths;
    }

    public TrainingCourse setValidityMonths(Long validityMonths) {
        this.validityMonths = validityMonths;
        return this;
    }

    @JsonIgnore
    public TrainingCourse setValidityMonths(long validityMonths) {
        return setValidityMonths(Long.valueOf(validityMonths));
    }

    /**
     * La calificación mínima.
     */
    public BigDecimal getPassingScore() {
        return passingScore;
    }

    public TrainingCourse setPassingScore(BigDecimal passingScore) {
        this.passingScore = passingScore;
        return this;
    }

    @JsonIgnore
    public TrainingCourse setPassingScore(double passingScore) {
        return setPassingScore(BigDecimal.valueOf(passingScore));
    }

    /**
     * Dónde se imparte.
     */
    public String getPlace() {
        return place;
    }

    public TrainingCourse setPlace(String place) {
        this.place = place;
        return this;
    }

    /**
     * El objetivo del curso.
     */
    public String getObjective() {
        return objective;
    }

    public TrainingCourse setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    /**
     * Qué falta de quién firma las constancias.
     */
    public String getSignersProblem() {
        return signersProblem;
    }

    public TrainingCourse setSignersProblem(String signersProblem) {
        this.signersProblem = signersProblem;
        return this;
    }

    /**
     * Quienes lo tomaron (al ver un curso; no en la lista).
     */
    public List<TrainingParticipant> getParticipants() {
        return participants;
    }

    public TrainingCourse setParticipants(List<TrainingParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Los totales (en la lista).
     */
    public TrainingCourseCounts getCounts() {
        return counts;
    }

    public TrainingCourse setCounts(TrainingCourseCounts counts) {
        this.counts = counts;
        return this;
    }
}
