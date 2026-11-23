// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceCalendarEmployeeDay: AttendanceCalendarEmployeeDay.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceCalendarEmployeeDay {
    /**
     * AAAA-MM-DD.
     */
    @JsonProperty("date")
    private String date;

    /**
     * De dónde sale: calendar (un cambio puesto en el calendario), rotation (su rol de turnos) o week (su horario de la semana).
     * <p>
     * Valores: calendar, rotation, week.
     */
    @JsonProperty("source")
    private String source;

    /**
     * El turno (ats_…), o null.
     */
    @JsonProperty("shift")
    private String shift;

    /**
     * Hora de entrada, HH:MM; null si descansa.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Hora de salida, HH:MM, o null.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Sus tramos, o null si descansa.
     */
    @JsonProperty("segments")
    private List<AttendanceCalendarEmployeeDaySegment> segments;

    /**
     * Minutos de jornada.
     */
    @JsonProperty("minutes")
    private Long minutes;

    /**
     * Su jornada por ley (LFT art. 60): diurna, nocturna o mixta; null si descansa.
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    @JsonProperty("jornada")
    private String jornada;

    /**
     * La nota del día que puso la empresa, o null.
     * <p>
     * Valores: vacaciones, incapacidad, permiso_con_goce, permiso_sin_goce, descanso, festivo, falta.
     */
    @JsonProperty("note")
    private String note;

    /**
     * AAAA-MM-DD.
     */
    public String getDate() {
        return date;
    }

    public AttendanceCalendarEmployeeDay setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * De dónde sale: calendar (un cambio puesto en el calendario), rotation (su rol de turnos) o week (su horario de la semana).
     * <p>
     * Valores: calendar, rotation, week.
     */
    public String getSource() {
        return source;
    }

    public AttendanceCalendarEmployeeDay setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El turno (ats_…), o null.
     */
    public String getShift() {
        return shift;
    }

    public AttendanceCalendarEmployeeDay setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Hora de entrada, HH:MM; null si descansa.
     */
    public String getStart() {
        return start;
    }

    public AttendanceCalendarEmployeeDay setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Hora de salida, HH:MM, o null.
     */
    public String getEnd() {
        return end;
    }

    public AttendanceCalendarEmployeeDay setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Sus tramos, o null si descansa.
     */
    public List<AttendanceCalendarEmployeeDaySegment> getSegments() {
        return segments;
    }

    public AttendanceCalendarEmployeeDay setSegments(List<AttendanceCalendarEmployeeDaySegment> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * Minutos de jornada.
     */
    public Long getMinutes() {
        return minutes;
    }

    public AttendanceCalendarEmployeeDay setMinutes(Long minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonIgnore
    public AttendanceCalendarEmployeeDay setMinutes(long minutes) {
        return setMinutes(Long.valueOf(minutes));
    }

    /**
     * Su jornada por ley (LFT art. 60): diurna, nocturna o mixta; null si descansa.
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    public String getJornada() {
        return jornada;
    }

    public AttendanceCalendarEmployeeDay setJornada(String jornada) {
        this.jornada = jornada;
        return this;
    }

    /**
     * La nota del día que puso la empresa, o null.
     * <p>
     * Valores: vacaciones, incapacidad, permiso_con_goce, permiso_sin_goce, descanso, festivo, falta.
     */
    public String getNote() {
        return note;
    }

    public AttendanceCalendarEmployeeDay setNote(String note) {
        this.note = note;
        return this;
    }
}
