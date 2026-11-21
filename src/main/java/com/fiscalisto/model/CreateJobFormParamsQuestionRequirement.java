// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateJobFormParamsQuestionRequirement: CreateJobFormParamsQuestionRequirement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateJobFormParamsQuestionRequirement {
    /**
     * Las respuestas que cumplen: ["si"] o ["no"] en una yesno, opciones en select y multiselect.
     */
    @JsonProperty("answers")
    private List<String> answers;

    /**
     * En una number, el mínimo que cumple (años de experiencia…).
     */
    @JsonProperty("min")
    private BigDecimal min;

    /**
     * Las respuestas que cumplen: ["si"] o ["no"] en una yesno, opciones en select y multiselect.
     */
    public List<String> getAnswers() {
        return answers;
    }

    public CreateJobFormParamsQuestionRequirement setAnswers(List<String> answers) {
        this.answers = answers;
        return this;
    }

    /**
     * En una number, el mínimo que cumple (años de experiencia…).
     */
    public BigDecimal getMin() {
        return min;
    }

    public CreateJobFormParamsQuestionRequirement setMin(BigDecimal min) {
        this.min = min;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRequirement setMin(double min) {
        return setMin(BigDecimal.valueOf(min));
    }
}
