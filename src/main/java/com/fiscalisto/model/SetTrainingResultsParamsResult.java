// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SetTrainingResultsParamsResult: SetTrainingResultsParamsResult.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetTrainingResultsParamsResult {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * pending (por calificar), passed (aprobó), failed (no aprobó) o sufficiency (aprobó el examen de suficiencia, art. 24, fr. III, inciso b).
     * <p>
     * Valores: pending, passed, failed, sufficiency.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("result")
    private String result;

    /**
     * Su calificación de 0 a 100.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public SetTrainingResultsParamsResult setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * pending (por calificar), passed (aprobó), failed (no aprobó) o sufficiency (aprobó el examen de suficiencia, art. 24, fr. III, inciso b).
     * <p>
     * Valores: pending, passed, failed, sufficiency.
     * <p>
     * Obligatorio.
     */
    public String getResult() {
        return result;
    }

    public SetTrainingResultsParamsResult setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Su calificación de 0 a 100.
     */
    public BigDecimal getScore() {
        return score;
    }

    public SetTrainingResultsParamsResult setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public SetTrainingResultsParamsResult setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public SetTrainingResultsParamsResult setNote(String note) {
        this.note = note;
        return this;
    }
}
