// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * ClimateSurvey: Una encuesta NOM-035 o de clima (Nómina › Clima laboral).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurvey {
    /**
     * La encuesta (cls_…).
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
     * nom035 o clima.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Su nombre.
     */
    @JsonProperty("title")
    private String title;

    /**
     * El centro de trabajo (brn_…); null: todos los trabajadores del emisor.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * El nombre del centro de trabajo.
     */
    @JsonProperty("centro")
    private String centro;

    /**
     * NOM-035: II (de 16 a 50 trabajadores), III (más de 50) o null (hasta 15: solo la Guía I), numeral 7.1.
     */
    @JsonProperty("guide")
    private String guide;

    /**
     * Si también pregunta la Guía I.
     */
    @JsonProperty("guide_i")
    private Boolean guideI;

    /**
     * Si se aplica a una muestra (Guía III).
     */
    @JsonProperty("sample")
    private Boolean sample;

    /**
     * draft, open o closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La fecha límite para contestar.
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * Los trabajadores del centro cuando se abrió.
     */
    @JsonProperty("workers")
    private Long workers;

    /**
     * A cuántos se les pidió contestarla.
     */
    @JsonProperty("invited")
    private Long invited;

    /**
     * Cuántos la contestaron.
     */
    @JsonProperty("answered")
    private Long answered;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

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
     * Encuesta de clima: sus preguntas (al ver una encuesta).
     */
    @JsonProperty("questions")
    private List<ClimateSurveyQuestion> questions;

    /**
     * Lo que dice el informe además de los resultados (numeral 7.7).
     */
    @JsonProperty("report")
    private ClimateSurveyReport report;

    /**
     * Los resultados, sin nombres.
     */
    @JsonProperty("results")
    private ClimateSurveyResults results;

    /**
     * A quién se le pidió y si contestó, para recordarle a quien falta.
     */
    @JsonProperty("invites")
    private List<ClimateSurveyInvite> invites;

    /**
     * La encuesta (cls_…).
     */
    public String getId() {
        return id;
    }

    public ClimateSurvey setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ClimateSurvey setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ClimateSurvey setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public ClimateSurvey setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ClimateSurvey setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public ClimateSurvey setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * nom035 o clima.
     */
    public String getKind() {
        return kind;
    }

    public ClimateSurvey setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getTitle() {
        return title;
    }

    public ClimateSurvey setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El centro de trabajo (brn_…); null: todos los trabajadores del emisor.
     */
    public String getBranch() {
        return branch;
    }

    public ClimateSurvey setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * El nombre del centro de trabajo.
     */
    public String getCentro() {
        return centro;
    }

    public ClimateSurvey setCentro(String centro) {
        this.centro = centro;
        return this;
    }

    /**
     * NOM-035: II (de 16 a 50 trabajadores), III (más de 50) o null (hasta 15: solo la Guía I), numeral 7.1.
     */
    public String getGuide() {
        return guide;
    }

    public ClimateSurvey setGuide(String guide) {
        this.guide = guide;
        return this;
    }

    /**
     * Si también pregunta la Guía I.
     */
    public Boolean getGuideI() {
        return guideI;
    }

    public ClimateSurvey setGuideI(Boolean guideI) {
        this.guideI = guideI;
        return this;
    }

    /**
     * Si se aplica a una muestra (Guía III).
     */
    public Boolean getSample() {
        return sample;
    }

    public ClimateSurvey setSample(Boolean sample) {
        this.sample = sample;
        return this;
    }

    /**
     * draft, open o closed.
     */
    public String getStatus() {
        return status;
    }

    public ClimateSurvey setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La fecha límite para contestar.
     */
    public String getClosesOn() {
        return closesOn;
    }

    public ClimateSurvey setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }

    /**
     * Los trabajadores del centro cuando se abrió.
     */
    public Long getWorkers() {
        return workers;
    }

    public ClimateSurvey setWorkers(Long workers) {
        this.workers = workers;
        return this;
    }

    @JsonIgnore
    public ClimateSurvey setWorkers(long workers) {
        return setWorkers(Long.valueOf(workers));
    }

    /**
     * A cuántos se les pidió contestarla.
     */
    public Long getInvited() {
        return invited;
    }

    public ClimateSurvey setInvited(Long invited) {
        this.invited = invited;
        return this;
    }

    @JsonIgnore
    public ClimateSurvey setInvited(long invited) {
        return setInvited(Long.valueOf(invited));
    }

    /**
     * Cuántos la contestaron.
     */
    public Long getAnswered() {
        return answered;
    }

    public ClimateSurvey setAnswered(Long answered) {
        this.answered = answered;
        return this;
    }

    @JsonIgnore
    public ClimateSurvey setAnswered(long answered) {
        return setAnswered(Long.valueOf(answered));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ClimateSurvey setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo se abrió.
     */
    public String getOpenedAt() {
        return openedAt;
    }

    public ClimateSurvey setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    /**
     * Cuándo se cerró.
     */
    public String getClosedAt() {
        return closedAt;
    }

    public ClimateSurvey setClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Encuesta de clima: sus preguntas (al ver una encuesta).
     */
    public List<ClimateSurveyQuestion> getQuestions() {
        return questions;
    }

    public ClimateSurvey setQuestions(List<ClimateSurveyQuestion> questions) {
        this.questions = questions;
        return this;
    }

    /**
     * Lo que dice el informe además de los resultados (numeral 7.7).
     */
    public ClimateSurveyReport getReport() {
        return report;
    }

    public ClimateSurvey setReport(ClimateSurveyReport report) {
        this.report = report;
        return this;
    }

    /**
     * Los resultados, sin nombres.
     */
    public ClimateSurveyResults getResults() {
        return results;
    }

    public ClimateSurvey setResults(ClimateSurveyResults results) {
        this.results = results;
        return this;
    }

    /**
     * A quién se le pidió y si contestó, para recordarle a quien falta.
     */
    public List<ClimateSurveyInvite> getInvites() {
        return invites;
    }

    public ClimateSurvey setInvites(List<ClimateSurveyInvite> invites) {
        this.invites = invites;
        return this;
    }
}
