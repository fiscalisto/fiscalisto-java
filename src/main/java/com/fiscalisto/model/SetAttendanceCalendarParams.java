// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetAttendanceCalendarParams: los campos de «Poner turnos en el calendario».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetAttendanceCalendarParams {
    /**
     * Los empleados (emp_…), todos del mismo emisor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Los días, AAAA-MM-DD (hasta 62).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("dates")
    private List<String> dates;

    /**
     * El turno (ats_…) que tienen esos días, o null para descanso. Gana sobre su rol y su horario.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("shift")
    private String shift;

    /**
     * true quita lo que se puso en el calendario: esos días vuelven a su rol de turnos o a su horario de la semana (shift se ignora).
     */
    @JsonProperty("clear")
    private Boolean clear;

    /**
     * Por qué (un cambio de turno, un descanso extra).
     */
    @JsonProperty("comment")
    private String comment;

    /**
     * Los empleados (emp_…), todos del mismo emisor.
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public SetAttendanceCalendarParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * Los días, AAAA-MM-DD (hasta 62).
     * <p>
     * Obligatorio.
     */
    public List<String> getDates() {
        return dates;
    }

    public SetAttendanceCalendarParams setDates(List<String> dates) {
        this.dates = dates;
        return this;
    }

    /**
     * El turno (ats_…) que tienen esos días, o null para descanso. Gana sobre su rol y su horario.
     * <p>
     * Obligatorio.
     */
    public String getShift() {
        return shift;
    }

    public SetAttendanceCalendarParams setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * true quita lo que se puso en el calendario: esos días vuelven a su rol de turnos o a su horario de la semana (shift se ignora).
     */
    public Boolean getClear() {
        return clear;
    }

    public SetAttendanceCalendarParams setClear(Boolean clear) {
        this.clear = clear;
        return this;
    }

    /**
     * Por qué (un cambio de turno, un descanso extra).
     */
    public String getComment() {
        return comment;
    }

    public SetAttendanceCalendarParams setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
