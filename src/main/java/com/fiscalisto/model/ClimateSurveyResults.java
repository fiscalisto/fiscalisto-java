// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ClimateSurveyResults: Los resultados, sin nombres.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResults {
    /**
     * A cuántos se les pidió.
     */
    @JsonProperty("invited")
    private Long invited;

    /**
     * Cuántos contestaron.
     */
    @JsonProperty("answered")
    private Long answered;

    /**
     * Cuántas respuestas hacen falta para mostrar resultados (5).
     */
    @JsonProperty("min_group")
    private Long minGroup;

    /**
     * true con menos de min_group respuestas: no se muestra nada, para que no se distinga lo que contestó cada quien.
     */
    @JsonProperty("hidden")
    private Boolean hidden;

    /**
     * La calificación final, por categoría y por dominio (Guías II y III).
     */
    @JsonProperty("nom035")
    private ClimateSurveyResultsNom035 nom035;

    /**
     * Encuesta de clima: cada pregunta.
     */
    @JsonProperty("climate")
    private List<ClimateSurveyResultsClimateItem> climate;

    /**
     * Guía I: cuántos dijeron «Sí» (los nombres, en traumatic_events).
     */
    @JsonProperty("traumatic")
    private ClimateSurveyResultsTraumatic traumatic;

    /**
     * A cuántos se les pidió.
     */
    public Long getInvited() {
        return invited;
    }

    public ClimateSurveyResults setInvited(Long invited) {
        this.invited = invited;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResults setInvited(long invited) {
        return setInvited(Long.valueOf(invited));
    }

    /**
     * Cuántos contestaron.
     */
    public Long getAnswered() {
        return answered;
    }

    public ClimateSurveyResults setAnswered(Long answered) {
        this.answered = answered;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResults setAnswered(long answered) {
        return setAnswered(Long.valueOf(answered));
    }

    /**
     * Cuántas respuestas hacen falta para mostrar resultados (5).
     */
    public Long getMinGroup() {
        return minGroup;
    }

    public ClimateSurveyResults setMinGroup(Long minGroup) {
        this.minGroup = minGroup;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResults setMinGroup(long minGroup) {
        return setMinGroup(Long.valueOf(minGroup));
    }

    /**
     * true con menos de min_group respuestas: no se muestra nada, para que no se distinga lo que contestó cada quien.
     */
    public Boolean getHidden() {
        return hidden;
    }

    public ClimateSurveyResults setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * La calificación final, por categoría y por dominio (Guías II y III).
     */
    public ClimateSurveyResultsNom035 getNom035() {
        return nom035;
    }

    public ClimateSurveyResults setNom035(ClimateSurveyResultsNom035 nom035) {
        this.nom035 = nom035;
        return this;
    }

    /**
     * Encuesta de clima: cada pregunta.
     */
    public List<ClimateSurveyResultsClimateItem> getClimate() {
        return climate;
    }

    public ClimateSurveyResults setClimate(List<ClimateSurveyResultsClimateItem> climate) {
        this.climate = climate;
        return this;
    }

    /**
     * Guía I: cuántos dijeron «Sí» (los nombres, en traumatic_events).
     */
    public ClimateSurveyResultsTraumatic getTraumatic() {
        return traumatic;
    }

    public ClimateSurveyResults setTraumatic(ClimateSurveyResultsTraumatic traumatic) {
        this.traumatic = traumatic;
        return this;
    }
}
