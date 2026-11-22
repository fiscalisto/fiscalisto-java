// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * ClimateSurveyResultsNom035Domain: ClimateSurveyResultsNom035Domain.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsNom035Domain {
    /**
     * Su clave (la que va en area de una acción).
     */
    @JsonProperty("key")
    private String key;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El promedio de las calificaciones de los trabajadores.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * El nivel de riesgo de ese promedio según las tablas de la norma: nulo, bajo, medio, alto o muy_alto.
     */
    @JsonProperty("level")
    private String level;

    /**
     * Cuántos trabajadores quedaron en cada nivel (nulo, bajo, medio, alto, muy_alto).
     */
    @JsonProperty("levels")
    private Map<String, Object> levels;

    /**
     * De medio para arriba pide un Programa de intervención (numeral 8.3).
     */
    @JsonProperty("needs_program")
    private Boolean needsProgram;

    /**
     * Su clave (la que va en area de una acción).
     */
    public String getKey() {
        return key;
    }

    public ClimateSurveyResultsNom035Domain setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateSurveyResultsNom035Domain setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El promedio de las calificaciones de los trabajadores.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ClimateSurveyResultsNom035Domain setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsNom035Domain setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * El nivel de riesgo de ese promedio según las tablas de la norma: nulo, bajo, medio, alto o muy_alto.
     */
    public String getLevel() {
        return level;
    }

    public ClimateSurveyResultsNom035Domain setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Cuántos trabajadores quedaron en cada nivel (nulo, bajo, medio, alto, muy_alto).
     */
    public Map<String, Object> getLevels() {
        return levels;
    }

    public ClimateSurveyResultsNom035Domain setLevels(Map<String, Object> levels) {
        this.levels = levels;
        return this;
    }

    /**
     * De medio para arriba pide un Programa de intervención (numeral 8.3).
     */
    public Boolean getNeedsProgram() {
        return needsProgram;
    }

    public ClimateSurveyResultsNom035Domain setNeedsProgram(Boolean needsProgram) {
        this.needsProgram = needsProgram;
        return this;
    }
}
