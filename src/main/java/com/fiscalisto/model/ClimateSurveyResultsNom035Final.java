// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * ClimateSurveyResultsNom035Final: La calificación final y su nivel de riesgo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsNom035Final {
    /**
     * La calificación final del cuestionario.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Nivel educativo (nivelEducativo).
     */
    @JsonProperty("level")
    private String level;

    /**
     * Cuántos trabajadores quedaron en cada nivel (nulo, bajo, medio, alto, muy_alto).
     */
    @JsonProperty("levels")
    private Map<String, Object> levels;

    /**
     * La calificación final del cuestionario.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ClimateSurveyResultsNom035Final setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsNom035Final setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Nivel educativo (nivelEducativo).
     */
    public String getLevel() {
        return level;
    }

    public ClimateSurveyResultsNom035Final setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Cuántos trabajadores quedaron en cada nivel (nulo, bajo, medio, alto, muy_alto).
     */
    public Map<String, Object> getLevels() {
        return levels;
    }

    public ClimateSurveyResultsNom035Final setLevels(Map<String, Object> levels) {
        this.levels = levels;
        return this;
    }
}
