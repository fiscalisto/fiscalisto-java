// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ReviewResultRelation: ReviewResultRelation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResultRelation {
    /**
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    @JsonProperty("relation")
    private String relation;

    /**
     * Cuántos la evaluaron así.
     */
    @JsonProperty("answers")
    private Long answers;

    /**
     * Su promedio.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Menos respuestas que anonymous_min: no cuenta ni se muestra.
     */
    @JsonProperty("hidden")
    private Boolean hidden;

    /**
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    public String getRelation() {
        return relation;
    }

    public ReviewResultRelation setRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Cuántos la evaluaron así.
     */
    public Long getAnswers() {
        return answers;
    }

    public ReviewResultRelation setAnswers(Long answers) {
        this.answers = answers;
        return this;
    }

    @JsonIgnore
    public ReviewResultRelation setAnswers(long answers) {
        return setAnswers(Long.valueOf(answers));
    }

    /**
     * Su promedio.
     */
    public BigDecimal getScore() {
        return score;
    }

    public ReviewResultRelation setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public ReviewResultRelation setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Menos respuestas que anonymous_min: no cuenta ni se muestra.
     */
    public Boolean getHidden() {
        return hidden;
    }

    public ReviewResultRelation setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
}
