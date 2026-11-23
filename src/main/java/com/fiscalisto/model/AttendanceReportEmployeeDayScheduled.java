// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
     * Sus tramos: uno, o dos o tres en un turno partido.
     */
    @JsonProperty("segments")
    private List<AttendanceReportEmployeeDayScheduledSegment> segments;

    /**
     * true: el descanso cuenta como jornada porque no puede salir del lugar (LFT art. 64).
     */
    @JsonProperty("break_paid")
    private Boolean breakPaid;

    /**
     * El turno (ats_…) de ese día, de su rol o del calendario; null: su horario.
     */
    @JsonProperty("shift")
    private String shift;

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

    /**
     * Sus tramos: uno, o dos o tres en un turno partido.
     */
    public List<AttendanceReportEmployeeDayScheduledSegment> getSegments() {
        return segments;
    }

    public AttendanceReportEmployeeDayScheduled setSegments(List<AttendanceReportEmployeeDayScheduledSegment> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * true: el descanso cuenta como jornada porque no puede salir del lugar (LFT art. 64).
     */
    public Boolean getBreakPaid() {
        return breakPaid;
    }

    public AttendanceReportEmployeeDayScheduled setBreakPaid(Boolean breakPaid) {
        this.breakPaid = breakPaid;
        return this;
    }

    /**
     * El turno (ats_…) de ese día, de su rol o del calendario; null: su horario.
     */
    public String getShift() {
        return shift;
    }

    public AttendanceReportEmployeeDayScheduled setShift(String shift) {
        this.shift = shift;
        return this;
    }
}
