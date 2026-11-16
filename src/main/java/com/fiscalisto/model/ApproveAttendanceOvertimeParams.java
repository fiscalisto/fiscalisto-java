// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApproveAttendanceOvertimeParams: los campos de «Autorizar horas extra».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApproveAttendanceOvertimeParams {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Hasta cuántos minutos de horas extra de ese día cuentan para la nómina (0 a 960); null quita la autorización.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("minutes")
    private Long minutes;

    /**
     * Por qué (opcional).
     */
    @JsonProperty("comment")
    private String comment;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public ApproveAttendanceOvertimeParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public ApproveAttendanceOvertimeParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Hasta cuántos minutos de horas extra de ese día cuentan para la nómina (0 a 960); null quita la autorización.
     * <p>
     * Obligatorio.
     */
    public Long getMinutes() {
        return minutes;
    }

    public ApproveAttendanceOvertimeParams setMinutes(Long minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonIgnore
    public ApproveAttendanceOvertimeParams setMinutes(long minutes) {
        return setMinutes(Long.valueOf(minutes));
    }

    /**
     * Por qué (opcional).
     */
    public String getComment() {
        return comment;
    }

    public ApproveAttendanceOvertimeParams setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
