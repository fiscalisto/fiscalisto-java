// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ReviewCycle: Un ciclo de evaluación (Nómina › Desempeño).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycle {
    /**
     * El ciclo (rvc_…).
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
    private String issuer;

    /**
     * Su nombre, como «Evaluación 2026».
     */
    @JsonProperty("title")
    private String title;

    /**
     * draft, open o closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Desde cuándo se evalúa.
     */
    @JsonProperty("period_start")
    private String periodStart;

    /**
     * Hasta cuándo.
     */
    @JsonProperty("period_end")
    private String periodEnd;

    /**
     * La fecha límite para contestar.
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * Cuántas personas se evalúan.
     */
    @JsonProperty("people")
    private Long people;

    /**
     * Cuántas evaluaciones hay que hacer (cero en borrador).
     */
    @JsonProperty("evaluations")
    private Long evaluations;

    /**
     * Cuántas ya se enviaron.
     */
    @JsonProperty("evaluations_done")
    private Long evaluationsDone;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * La sucursal con que se armó (brn_…).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * El departamento con que se armó.
     */
    @JsonProperty("department")
    private String department;

    /**
     * Cómo se califica (al ver un ciclo).
     */
    @JsonProperty("rules")
    private ReviewCycleRules rules;

    /**
     * Lo que se califica de cada persona.
     */
    @JsonProperty("competencies")
    private List<ReviewCycleCompetency> competencies;

    /**
     * Compañeros al azar por persona, para quien no tenga elegidos.
     */
    @JsonProperty("peers_count")
    private Long peersCount;

    /**
     * Si cada persona ve su resultado en su portal al cerrar.
     */
    @JsonProperty("share_results")
    private Boolean shareResults;

    /**
     * Cuándo se abrió.
     */
    @JsonProperty("opened_at")
    private String openedAt;

    /**
     * Cuándo se cerró.
     */
    @JsonProperty("closed_at")
    private String closedAt;

    /**
     * Cada persona que se evalúa (al ver un ciclo).
     */
    @JsonProperty("participants")
    private List<ReviewCycleParticipant> participants;

    /**
     * El ciclo (rvc_…).
     */
    public String getId() {
        return id;
    }

    public ReviewCycle setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ReviewCycle setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ReviewCycle setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public ReviewCycle setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su nombre, como «Evaluación 2026».
     */
    public String getTitle() {
        return title;
    }

    public ReviewCycle setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * draft, open o closed.
     */
    public String getStatus() {
        return status;
    }

    public ReviewCycle setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Desde cuándo se evalúa.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public ReviewCycle setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Hasta cuándo.
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public ReviewCycle setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * La fecha límite para contestar.
     */
    public String getClosesOn() {
        return closesOn;
    }

    public ReviewCycle setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }

    /**
     * Cuántas personas se evalúan.
     */
    public Long getPeople() {
        return people;
    }

    public ReviewCycle setPeople(Long people) {
        this.people = people;
        return this;
    }

    @JsonIgnore
    public ReviewCycle setPeople(long people) {
        return setPeople(Long.valueOf(people));
    }

    /**
     * Cuántas evaluaciones hay que hacer (cero en borrador).
     */
    public Long getEvaluations() {
        return evaluations;
    }

    public ReviewCycle setEvaluations(Long evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    @JsonIgnore
    public ReviewCycle setEvaluations(long evaluations) {
        return setEvaluations(Long.valueOf(evaluations));
    }

    /**
     * Cuántas ya se enviaron.
     */
    public Long getEvaluationsDone() {
        return evaluationsDone;
    }

    public ReviewCycle setEvaluationsDone(Long evaluationsDone) {
        this.evaluationsDone = evaluationsDone;
        return this;
    }

    @JsonIgnore
    public ReviewCycle setEvaluationsDone(long evaluationsDone) {
        return setEvaluationsDone(Long.valueOf(evaluationsDone));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ReviewCycle setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * La sucursal con que se armó (brn_…).
     */
    public String getBranch() {
        return branch;
    }

    public ReviewCycle setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * El departamento con que se armó.
     */
    public String getDepartment() {
        return department;
    }

    public ReviewCycle setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Cómo se califica (al ver un ciclo).
     */
    public ReviewCycleRules getRules() {
        return rules;
    }

    public ReviewCycle setRules(ReviewCycleRules rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Lo que se califica de cada persona.
     */
    public List<ReviewCycleCompetency> getCompetencies() {
        return competencies;
    }

    public ReviewCycle setCompetencies(List<ReviewCycleCompetency> competencies) {
        this.competencies = competencies;
        return this;
    }

    /**
     * Compañeros al azar por persona, para quien no tenga elegidos.
     */
    public Long getPeersCount() {
        return peersCount;
    }

    public ReviewCycle setPeersCount(Long peersCount) {
        this.peersCount = peersCount;
        return this;
    }

    @JsonIgnore
    public ReviewCycle setPeersCount(long peersCount) {
        return setPeersCount(Long.valueOf(peersCount));
    }

    /**
     * Si cada persona ve su resultado en su portal al cerrar.
     */
    public Boolean getShareResults() {
        return shareResults;
    }

    public ReviewCycle setShareResults(Boolean shareResults) {
        this.shareResults = shareResults;
        return this;
    }

    /**
     * Cuándo se abrió.
     */
    public String getOpenedAt() {
        return openedAt;
    }

    public ReviewCycle setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    /**
     * Cuándo se cerró.
     */
    public String getClosedAt() {
        return closedAt;
    }

    public ReviewCycle setClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Cada persona que se evalúa (al ver un ciclo).
     */
    public List<ReviewCycleParticipant> getParticipants() {
        return participants;
    }

    public ReviewCycle setParticipants(List<ReviewCycleParticipant> participants) {
        this.participants = participants;
        return this;
    }
}
