// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceCalendarChange: Lo que cambió en el calendario de turnos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceCalendarChange {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * A cuántos empleados.
     */
    @JsonProperty("employees")
    private Long employees;

    /**
     * Cuántos días a cada uno.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * El turno que se puso (ats_…), o null: descanso o quitado.
     */
    @JsonProperty("shift")
    private String shift;

    /**
     * true: se quitó lo del calendario y esos días vuelven a su rol u horario.
     */
    @JsonProperty("cleared")
    private Boolean cleared;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceCalendarChange setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceCalendarChange setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public AttendanceCalendarChange setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * A cuántos empleados.
     */
    public Long getEmployees() {
        return employees;
    }

    public AttendanceCalendarChange setEmployees(Long employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public AttendanceCalendarChange setEmployees(long employees) {
        return setEmployees(Long.valueOf(employees));
    }

    /**
     * Cuántos días a cada uno.
     */
    public Long getDays() {
        return days;
    }

    public AttendanceCalendarChange setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public AttendanceCalendarChange setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * El turno que se puso (ats_…), o null: descanso o quitado.
     */
    public String getShift() {
        return shift;
    }

    public AttendanceCalendarChange setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * true: se quitó lo del calendario y esos días vuelven a su rol u horario.
     */
    public Boolean getCleared() {
        return cleared;
    }

    public AttendanceCalendarChange setCleared(Boolean cleared) {
        this.cleared = cleared;
        return this;
    }
}
