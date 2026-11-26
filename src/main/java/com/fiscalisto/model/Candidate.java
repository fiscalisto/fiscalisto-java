// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Candidate: Una solicitud que llegó por la página de empleos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Candidate {
    /**
     * La solicitud (cnd_…).
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
     * La vacante a la que se postuló (vac_…).
     */
    @JsonProperty("vacancy")
    private String vacancy;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Su teléfono, si lo dio.
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * Su etapa, una de stages de hiring.
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * De 1 a 5.
     */
    @JsonProperty("rating")
    private Long rating;

    /**
     * La nota de su equipo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Si cumple todas las preguntas que son requisito.
     */
    @JsonProperty("meets_requirements")
    private Boolean meetsRequirements;

    /**
     * Las preguntas requisito que no cumple.
     */
    @JsonProperty("unmet_requirements")
    private List<String> unmetRequirements;

    /**
     * Sus respuestas, en el orden de las preguntas que contestó.
     */
    @JsonProperty("answers")
    private List<CandidateAnswer> answers;

    /**
     * El empleado (emp_…) si se le contrató.
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * La solicitud (cnd_…).
     */
    public String getId() {
        return id;
    }

    public Candidate setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Candidate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Candidate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Candidate setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Candidate setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Candidate setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * La vacante a la que se postuló (vac_…).
     */
    public String getVacancy() {
        return vacancy;
    }

    public Candidate setVacancy(String vacancy) {
        this.vacancy = vacancy;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Candidate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public Candidate setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Su teléfono, si lo dio.
     */
    public String getPhone() {
        return phone;
    }

    public Candidate setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Su etapa, una de stages de hiring.
     */
    public String getStage() {
        return stage;
    }

    public Candidate setStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * De 1 a 5.
     */
    public Long getRating() {
        return rating;
    }

    public Candidate setRating(Long rating) {
        this.rating = rating;
        return this;
    }

    @JsonIgnore
    public Candidate setRating(long rating) {
        return setRating(Long.valueOf(rating));
    }

    /**
     * La nota de su equipo.
     */
    public String getNote() {
        return note;
    }

    public Candidate setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Si cumple todas las preguntas que son requisito.
     */
    public Boolean getMeetsRequirements() {
        return meetsRequirements;
    }

    public Candidate setMeetsRequirements(Boolean meetsRequirements) {
        this.meetsRequirements = meetsRequirements;
        return this;
    }

    /**
     * Las preguntas requisito que no cumple.
     */
    public List<String> getUnmetRequirements() {
        return unmetRequirements;
    }

    public Candidate setUnmetRequirements(List<String> unmetRequirements) {
        this.unmetRequirements = unmetRequirements;
        return this;
    }

    /**
     * Sus respuestas, en el orden de las preguntas que contestó.
     */
    public List<CandidateAnswer> getAnswers() {
        return answers;
    }

    public Candidate setAnswers(List<CandidateAnswer> answers) {
        this.answers = answers;
        return this;
    }

    /**
     * El empleado (emp_…) si se le contrató.
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public Candidate setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Candidate setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public Candidate setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Candidate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
