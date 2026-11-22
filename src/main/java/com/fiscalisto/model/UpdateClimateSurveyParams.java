// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateClimateSurveyParams: los campos de «Cambiar una encuesta de clima laboral».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimateSurveyParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * nom035 (las guías de la norma por centro de trabajo) o clima (una encuesta propia con sus preguntas).
     * <p>
     * Valores: nom035, clima.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Su nombre; por omisión «NOM-035 2026» o «Encuesta de clima 2026».
     */
    @JsonProperty("title")
    private String title;

    /**
     * El centro de trabajo: una sucursal (brn_…). null u omitido: todos los trabajadores del emisor.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * NOM-035: también pregunta la Guía I, para identificar a quien vivió un acontecimiento traumático severo (numeral 5.5). Por omisión, sí.
     */
    @JsonProperty("guide_i")
    private Boolean guideI;

    /**
     * NOM-035 con la Guía III (más de 50 trabajadores): la aplica a una muestra elegida al azar según la Ecuación 1 de la norma, en proporción de hombres y mujeres.
     */
    @JsonProperty("sample")
    private Boolean sample;

    /**
     * Encuesta de clima: sus preguntas, en orden.
     */
    @JsonProperty("questions")
    private List<UpdateClimateSurveyParamsQuestion> questions;

    /**
     * La fecha límite para contestar (opcional).
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateClimateSurveyParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * nom035 (las guías de la norma por centro de trabajo) o clima (una encuesta propia con sus preguntas).
     * <p>
     * Valores: nom035, clima.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public UpdateClimateSurveyParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Su nombre; por omisión «NOM-035 2026» o «Encuesta de clima 2026».
     */
    public String getTitle() {
        return title;
    }

    public UpdateClimateSurveyParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El centro de trabajo: una sucursal (brn_…). null u omitido: todos los trabajadores del emisor.
     */
    public String getBranch() {
        return branch;
    }

    public UpdateClimateSurveyParams setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * NOM-035: también pregunta la Guía I, para identificar a quien vivió un acontecimiento traumático severo (numeral 5.5). Por omisión, sí.
     */
    public Boolean getGuideI() {
        return guideI;
    }

    public UpdateClimateSurveyParams setGuideI(Boolean guideI) {
        this.guideI = guideI;
        return this;
    }

    /**
     * NOM-035 con la Guía III (más de 50 trabajadores): la aplica a una muestra elegida al azar según la Ecuación 1 de la norma, en proporción de hombres y mujeres.
     */
    public Boolean getSample() {
        return sample;
    }

    public UpdateClimateSurveyParams setSample(Boolean sample) {
        this.sample = sample;
        return this;
    }

    /**
     * Encuesta de clima: sus preguntas, en orden.
     */
    public List<UpdateClimateSurveyParamsQuestion> getQuestions() {
        return questions;
    }

    public UpdateClimateSurveyParams setQuestions(List<UpdateClimateSurveyParamsQuestion> questions) {
        this.questions = questions;
        return this;
    }

    /**
     * La fecha límite para contestar (opcional).
     */
    public String getClosesOn() {
        return closesOn;
    }

    public UpdateClimateSurveyParams setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }
}
