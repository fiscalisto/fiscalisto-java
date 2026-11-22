// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CalibrateReviewParams: los campos de «Calibrar el resultado de una persona».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalibrateReviewParams {
    /**
     * La persona (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * La calificación calibrada, en la escala del ciclo; null usa la calculada.
     */
    @JsonProperty("calibrated")
    private BigDecimal calibrated;

    /**
     * Por qué cambia; se pide con calibrated.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El potencial para la matriz de 9 cuadros: 1 bajo, 2 medio, 3 alto.
     */
    @JsonProperty("potential")
    private Long potential;

    /**
     * La persona (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CalibrateReviewParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * La calificación calibrada, en la escala del ciclo; null usa la calculada.
     */
    public BigDecimal getCalibrated() {
        return calibrated;
    }

    public CalibrateReviewParams setCalibrated(BigDecimal calibrated) {
        this.calibrated = calibrated;
        return this;
    }

    @JsonIgnore
    public CalibrateReviewParams setCalibrated(double calibrated) {
        return setCalibrated(BigDecimal.valueOf(calibrated));
    }

    /**
     * Por qué cambia; se pide con calibrated.
     */
    public String getNote() {
        return note;
    }

    public CalibrateReviewParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * El potencial para la matriz de 9 cuadros: 1 bajo, 2 medio, 3 alto.
     */
    public Long getPotential() {
        return potential;
    }

    public CalibrateReviewParams setPotential(Long potential) {
        this.potential = potential;
        return this;
    }

    @JsonIgnore
    public CalibrateReviewParams setPotential(long potential) {
        return setPotential(Long.valueOf(potential));
    }
}
