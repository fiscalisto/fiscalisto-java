// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateTrainingCourseParams: los campos de «Registrar un curso de capacitación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTrainingCourseParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El nombre del curso, como va en la constancia.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * La clave del área temática del catálogo de la STPS (1000 Producción general … 9000 Participación social).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("thematic_area")
    private String thematicArea;

    /**
     * La duración en horas.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("hours")
    private BigDecimal hours;

    /**
     * presencial (por omisión), en_linea o mixta.
     * <p>
     * Valores: presencial, en_linea, mixta.
     */
    @JsonProperty("modality")
    private String modality;

    /**
     * El día en que empezó.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * El día en que terminó; de ahí corren los 20 días hábiles para entregar las constancias.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Quién lo imparte: internal (instructor interno, por omisión: la constancia dice el nombre de la empresa como agente), external (agente capacitador externo, con su registro), supplier (proveedor de un bien o servicio), foreign (capacitador extranjero) o stps.
     * <p>
     * Valores: internal, external, supplier, foreign, stps.
     */
    @JsonProperty("trainer_kind")
    private String trainerKind;

    /**
     * El nombre del agente capacitador, salvo internal y stps.
     */
    @JsonProperty("trainer_name")
    private String trainerName;

    /**
     * El registro del agente externo ante la STPS.
     */
    @JsonProperty("trainer_registration")
    private String trainerRegistration;

    /**
     * Quien firma la constancia como instructor o tutor.
     */
    @JsonProperty("instructor_name")
    private String instructorName;

    /**
     * Cada cuántos meses se renueva (para avisar); null, sin vigencia.
     */
    @JsonProperty("validity_months")
    private Long validityMonths;

    /**
     * La calificación mínima para aprobar (opcional).
     */
    @JsonProperty("passing_score")
    private BigDecimal passingScore;

    /**
     * Dónde se impartió.
     */
    @JsonProperty("place")
    private String place;

    /**
     * Su objetivo.
     */
    @JsonProperty("objective")
    private String objective;

    /**
     * Quiénes lo tomaron (emp_…); en una actualización reemplaza la lista.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateTrainingCourseParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El nombre del curso, como va en la constancia.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateTrainingCourseParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * La clave del área temática del catálogo de la STPS (1000 Producción general … 9000 Participación social).
     * <p>
     * Obligatorio.
     */
    public String getThematicArea() {
        return thematicArea;
    }

    public CreateTrainingCourseParams setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
        return this;
    }

    /**
     * La duración en horas.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getHours() {
        return hours;
    }

    public CreateTrainingCourseParams setHours(BigDecimal hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public CreateTrainingCourseParams setHours(double hours) {
        return setHours(BigDecimal.valueOf(hours));
    }

    /**
     * presencial (por omisión), en_linea o mixta.
     * <p>
     * Valores: presencial, en_linea, mixta.
     */
    public String getModality() {
        return modality;
    }

    public CreateTrainingCourseParams setModality(String modality) {
        this.modality = modality;
        return this;
    }

    /**
     * El día en que empezó.
     * <p>
     * Obligatorio.
     */
    public String getStartDate() {
        return startDate;
    }

    public CreateTrainingCourseParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * El día en que terminó; de ahí corren los 20 días hábiles para entregar las constancias.
     * <p>
     * Obligatorio.
     */
    public String getEndDate() {
        return endDate;
    }

    public CreateTrainingCourseParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Quién lo imparte: internal (instructor interno, por omisión: la constancia dice el nombre de la empresa como agente), external (agente capacitador externo, con su registro), supplier (proveedor de un bien o servicio), foreign (capacitador extranjero) o stps.
     * <p>
     * Valores: internal, external, supplier, foreign, stps.
     */
    public String getTrainerKind() {
        return trainerKind;
    }

    public CreateTrainingCourseParams setTrainerKind(String trainerKind) {
        this.trainerKind = trainerKind;
        return this;
    }

    /**
     * El nombre del agente capacitador, salvo internal y stps.
     */
    public String getTrainerName() {
        return trainerName;
    }

    public CreateTrainingCourseParams setTrainerName(String trainerName) {
        this.trainerName = trainerName;
        return this;
    }

    /**
     * El registro del agente externo ante la STPS.
     */
    public String getTrainerRegistration() {
        return trainerRegistration;
    }

    public CreateTrainingCourseParams setTrainerRegistration(String trainerRegistration) {
        this.trainerRegistration = trainerRegistration;
        return this;
    }

    /**
     * Quien firma la constancia como instructor o tutor.
     */
    public String getInstructorName() {
        return instructorName;
    }

    public CreateTrainingCourseParams setInstructorName(String instructorName) {
        this.instructorName = instructorName;
        return this;
    }

    /**
     * Cada cuántos meses se renueva (para avisar); null, sin vigencia.
     */
    public Long getValidityMonths() {
        return validityMonths;
    }

    public CreateTrainingCourseParams setValidityMonths(Long validityMonths) {
        this.validityMonths = validityMonths;
        return this;
    }

    @JsonIgnore
    public CreateTrainingCourseParams setValidityMonths(long validityMonths) {
        return setValidityMonths(Long.valueOf(validityMonths));
    }

    /**
     * La calificación mínima para aprobar (opcional).
     */
    public BigDecimal getPassingScore() {
        return passingScore;
    }

    public CreateTrainingCourseParams setPassingScore(BigDecimal passingScore) {
        this.passingScore = passingScore;
        return this;
    }

    @JsonIgnore
    public CreateTrainingCourseParams setPassingScore(double passingScore) {
        return setPassingScore(BigDecimal.valueOf(passingScore));
    }

    /**
     * Dónde se impartió.
     */
    public String getPlace() {
        return place;
    }

    public CreateTrainingCourseParams setPlace(String place) {
        this.place = place;
        return this;
    }

    /**
     * Su objetivo.
     */
    public String getObjective() {
        return objective;
    }

    public CreateTrainingCourseParams setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    /**
     * Quiénes lo tomaron (emp_…); en una actualización reemplaza la lista.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public CreateTrainingCourseParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
