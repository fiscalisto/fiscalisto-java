// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * ReviewResultCompetency: ReviewResultCompetency.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResultCompetency {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su calificación, con el peso de cada tipo de evaluador.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Lo que dio cada tipo de evaluador que cuenta.
     */
    @JsonProperty("by_relation")
    private Map<String, Object> byRelation;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ReviewResultCompetency setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewResultCompetency setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su calificación, con el peso de cada tipo de evaluador.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ReviewResultCompetency setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ReviewResultCompetency setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Lo que dio cada tipo de evaluador que cuenta.
     */
    public Map<String, Object> getByRelation() {
        return byRelation;
    }

    public ReviewResultCompetency setByRelation(Map<String, Object> byRelation) {
        this.byRelation = byRelation;
        return this;
    }
}
