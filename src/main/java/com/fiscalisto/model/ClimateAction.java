// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * ClimateAction: Una acción del Programa de intervención (numerales 8.3 a 8.5).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateAction {
    /**
     * La acción (cla_…).
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
     * La encuesta de la que sale (cls_…).
     */
    @JsonProperty("survey")
    private String survey;

    /**
     * La categoría o el dominio que atiende.
     */
    @JsonProperty("area")
    private String area;

    /**
     * primer, segundo o tercer nivel (numeral 8.5).
     */
    @JsonProperty("level")
    private String level;

    /**
     * Qué se va a hacer.
     */
    @JsonProperty("action")
    private String action;

    /**
     * El responsable.
     */
    @JsonProperty("owner")
    private String owner;

    /**
     * Para cuándo.
     */
    @JsonProperty("due_on")
    private String dueOn;

    /**
     * pending, in_progress o done.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo se terminó.
     */
    @JsonProperty("done_on")
    private String doneOn;

    /**
     * Cómo resultó (numeral 8.4 c)).
     */
    @JsonProperty("evaluation")
    private String evaluation;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * La acción (cla_…).
     */
    public String getId() {
        return id;
    }

    public ClimateAction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ClimateAction setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ClimateAction setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public ClimateAction setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ClimateAction setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public ClimateAction setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * La encuesta de la que sale (cls_…).
     */
    public String getSurvey() {
        return survey;
    }

    public ClimateAction setSurvey(String survey) {
        this.survey = survey;
        return this;
    }

    /**
     * La categoría o el dominio que atiende.
     */
    public String getArea() {
        return area;
    }

    public ClimateAction setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * primer, segundo o tercer nivel (numeral 8.5).
     */
    public String getLevel() {
        return level;
    }

    public ClimateAction setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Qué se va a hacer.
     */
    public String getAction() {
        return action;
    }

    public ClimateAction setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * El responsable.
     */
    public String getOwner() {
        return owner;
    }

    public ClimateAction setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Para cuándo.
     */
    public String getDueOn() {
        return dueOn;
    }

    public ClimateAction setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * pending, in_progress o done.
     */
    public String getStatus() {
        return status;
    }

    public ClimateAction setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo se terminó.
     */
    public String getDoneOn() {
        return doneOn;
    }

    public ClimateAction setDoneOn(String doneOn) {
        this.doneOn = doneOn;
        return this;
    }

    /**
     * Cómo resultó (numeral 8.4 c)).
     */
    public String getEvaluation() {
        return evaluation;
    }

    public ClimateAction setEvaluation(String evaluation) {
        this.evaluation = evaluation;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ClimateAction setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
