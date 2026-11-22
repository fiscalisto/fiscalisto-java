// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateClimateActionParams: los campos de «Cambiar una acción del Programa de intervención».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimateActionParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La encuesta de la que sale (cls_…), si sale de una.
     */
    @JsonProperty("survey")
    private String survey;

    /**
     * La categoría o el dominio que atiende (su clave en results), o un texto libre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("area")
    private String area;

    /**
     * El nivel de la acción (numeral 8.5): primer (la organización, por omisión), segundo (grupos) o tercer (cada persona).
     * <p>
     * Valores: primer, segundo, tercer.
     */
    @JsonProperty("level")
    private String level;

    /**
     * Qué se va a hacer.
     * <p>
     * Obligatorio.
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
     * pending (por omisión), in_progress o done.
     * <p>
     * Valores: pending, in_progress, done.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Al terminarla: cómo resultó (numeral 8.4 c)).
     */
    @JsonProperty("evaluation")
    private String evaluation;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateClimateActionParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La encuesta de la que sale (cls_…), si sale de una.
     */
    public String getSurvey() {
        return survey;
    }

    public UpdateClimateActionParams setSurvey(String survey) {
        this.survey = survey;
        return this;
    }

    /**
     * La categoría o el dominio que atiende (su clave en results), o un texto libre.
     * <p>
     * Obligatorio.
     */
    public String getArea() {
        return area;
    }

    public UpdateClimateActionParams setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * El nivel de la acción (numeral 8.5): primer (la organización, por omisión), segundo (grupos) o tercer (cada persona).
     * <p>
     * Valores: primer, segundo, tercer.
     */
    public String getLevel() {
        return level;
    }

    public UpdateClimateActionParams setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Qué se va a hacer.
     * <p>
     * Obligatorio.
     */
    public String getAction() {
        return action;
    }

    public UpdateClimateActionParams setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * El responsable.
     */
    public String getOwner() {
        return owner;
    }

    public UpdateClimateActionParams setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Para cuándo.
     */
    public String getDueOn() {
        return dueOn;
    }

    public UpdateClimateActionParams setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * pending (por omisión), in_progress o done.
     * <p>
     * Valores: pending, in_progress, done.
     */
    public String getStatus() {
        return status;
    }

    public UpdateClimateActionParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Al terminarla: cómo resultó (numeral 8.4 c)).
     */
    public String getEvaluation() {
        return evaluation;
    }

    public UpdateClimateActionParams setEvaluation(String evaluation) {
        this.evaluation = evaluation;
        return this;
    }
}
