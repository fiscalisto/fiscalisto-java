// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceReportEmployeeDayScheduled: AttendanceReportEmployeeDayScheduled.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceReportEmployeeDayScheduled {
    /**
     * Hora de entrada, HH:MM.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Hora de salida, HH:MM (antes de la entrada: al día siguiente).
     */
    @JsonProperty("end")
    private String end;

    /**
     * Minutos de comida que no se pagan.
     */
    @JsonProperty("break_minutes")
    private Long breakMinutes;

    /**
     * Hora de entrada, HH:MM.
     */
    public String getStart() {
        return start;
    }

    public AttendanceReportEmployeeDayScheduled setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Hora de salida, HH:MM (antes de la entrada: al día siguiente).
     */
    public String getEnd() {
        return end;
    }

    public AttendanceReportEmployeeDayScheduled setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Minutos de comida que no se pagan.
     */
    public Long getBreakMinutes() {
        return breakMinutes;
    }

    public AttendanceReportEmployeeDayScheduled setBreakMinutes(Long breakMinutes) {
        this.breakMinutes = breakMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDayScheduled setBreakMinutes(long breakMinutes) {
        return setBreakMinutes(Long.valueOf(breakMinutes));
    }
}
