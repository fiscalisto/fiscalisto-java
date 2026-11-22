// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateReviewCycleParams: los campos de «Crear un ciclo de evaluación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateReviewCycleParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su nombre, como «Evaluación 2026».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("title")
    private String title;

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
     * La fecha límite para contestar que ve cada evaluador (opcional).
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * Cómo se califica. Por omisión, escala de 1 a 5, autoevaluación y jefe, objetivos 60 %.
     */
    @JsonProperty("rules")
    private CreateReviewCycleParamsRules rules;

    /**
     * Lo que se califica de cada persona. Por omisión, cinco de ejemplo.
     */
    @JsonProperty("competencies")
    private List<CreateReviewCycleParamsCompetency> competencies;

    /**
     * Con peer: cuántos compañeros se toman al azar, entre quienes tienen el mismo jefe, para quien no tenga elegidos. Por omisión, 3.
     */
    @JsonProperty("peers_count")
    private Long peersCount;

    /**
     * Al cerrar, cada persona ve su resultado en su portal. Por omisión, no.
     */
    @JsonProperty("share_results")
    private Boolean shareResults;

    /**
     * Solo quien trabaja en esta sucursal (brn_…). null u omitido: todo el emisor.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Solo quien es de este departamento.
     */
    @JsonProperty("department")
    private String department;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateReviewCycleParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su nombre, como «Evaluación 2026».
     * <p>
     * Obligatorio.
     */
    public String getTitle() {
        return title;
    }

    public CreateReviewCycleParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Desde cuándo se evalúa.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public CreateReviewCycleParams setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Hasta cuándo.
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public CreateReviewCycleParams setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * La fecha límite para contestar que ve cada evaluador (opcional).
     */
    public String getClosesOn() {
        return closesOn;
    }

    public CreateReviewCycleParams setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }

    /**
     * Cómo se califica. Por omisión, escala de 1 a 5, autoevaluación y jefe, objetivos 60 %.
     */
    public CreateReviewCycleParamsRules getRules() {
        return rules;
    }

    public CreateReviewCycleParams setRules(CreateReviewCycleParamsRules rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Lo que se califica de cada persona. Por omisión, cinco de ejemplo.
     */
    public List<CreateReviewCycleParamsCompetency> getCompetencies() {
        return competencies;
    }

    public CreateReviewCycleParams setCompetencies(List<CreateReviewCycleParamsCompetency> competencies) {
        this.competencies = competencies;
        return this;
    }

    /**
     * Con peer: cuántos compañeros se toman al azar, entre quienes tienen el mismo jefe, para quien no tenga elegidos. Por omisión, 3.
     */
    public Long getPeersCount() {
        return peersCount;
    }

    public CreateReviewCycleParams setPeersCount(Long peersCount) {
        this.peersCount = peersCount;
        return this;
    }

    @JsonIgnore
    public CreateReviewCycleParams setPeersCount(long peersCount) {
        return setPeersCount(Long.valueOf(peersCount));
    }

    /**
     * Al cerrar, cada persona ve su resultado en su portal. Por omisión, no.
     */
    public Boolean getShareResults() {
        return shareResults;
    }

    public CreateReviewCycleParams setShareResults(Boolean shareResults) {
        this.shareResults = shareResults;
        return this;
    }

    /**
     * Solo quien trabaja en esta sucursal (brn_…). null u omitido: todo el emisor.
     */
    public String getBranch() {
        return branch;
    }

    public CreateReviewCycleParams setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Solo quien es de este departamento.
     */
    public String getDepartment() {
        return department;
    }

    public CreateReviewCycleParams setDepartment(String department) {
        this.department = department;
        return this;
    }
}
