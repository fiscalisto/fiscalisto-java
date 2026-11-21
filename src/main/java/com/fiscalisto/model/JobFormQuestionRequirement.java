// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * JobFormQuestionRequirement: JobFormQuestionRequirement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobFormQuestionRequirement {
    /**
     * Las respuestas que lo cumplen.
     */
    @JsonProperty("answers")
    private List<String> answers;

    /**
     * En una number, el mínimo que lo cumple.
     */
    @JsonProperty("min")
    private BigDecimal min;

    /**
     * Las respuestas que lo cumplen.
     */
    public List<String> getAnswers() {
        return answers;
    }

    public JobFormQuestionRequirement setAnswers(List<String> answers) {
        this.answers = answers;
        return this;
    }

    /**
     * En una number, el mínimo que lo cumple.
     */
    public BigDecimal getMin() {
        return min;
    }

    public JobFormQuestionRequirement setMin(BigDecimal min) {
        this.min = min;
        return this;
    }

    @JsonIgnore
    public JobFormQuestionRequirement setMin(double min) {
        return setMin(BigDecimal.valueOf(min));
    }
}
