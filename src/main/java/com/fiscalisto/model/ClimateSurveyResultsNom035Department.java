// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ClimateSurveyResultsNom035Department: ClimateSurveyResultsNom035Department.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsNom035Department {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuántos de ahí contestaron.
     */
    @JsonProperty("answered")
    private Long answered;

    /**
     * La calificación final promedio del departamento.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Nivel educativo (nivelEducativo).
     */
    @JsonProperty("level")
    private String level;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateSurveyResultsNom035Department setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuántos de ahí contestaron.
     */
    public Long getAnswered() {
        return answered;
    }

    public ClimateSurveyResultsNom035Department setAnswered(Long answered) {
        this.answered = answered;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsNom035Department setAnswered(long answered) {
        return setAnswered(Long.valueOf(answered));
    }

    /**
     * La calificación final promedio del departamento.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ClimateSurveyResultsNom035Department setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsNom035Department setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Nivel educativo (nivelEducativo).
     */
    public String getLevel() {
        return level;
    }

    public ClimateSurveyResultsNom035Department setLevel(String level) {
        this.level = level;
        return this;
    }
}
