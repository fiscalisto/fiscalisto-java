// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceCalendar: El calendario de turnos de un mes, como Nómina › Asistencia › Turnos: el turno de cada empleado cada día y de dónde sale.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceCalendar {
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
     * El mes, AAAA-MM.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Primer día, AAAA-MM-DD.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Último día, AAAA-MM-DD.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Desde cuándo un día da horas extra: agreed, al pasar el horario acordado de cada quien (LFT art. 58); law, al pasar la jornada de la ley para su turno (art. 61).
     * <p>
     * Valores: agreed, law.
     */
    @JsonProperty("daily_jornada")
    private String dailyJornada;

    /**
     * Cada empleado del emisor que registra asistencia.
     */
    @JsonProperty("employees")
    private List<AttendanceCalendarEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceCalendar setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceCalendar setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public AttendanceCalendar setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes, AAAA-MM.
     */
    public String getMonth() {
        return month;
    }

    public AttendanceCalendar setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Primer día, AAAA-MM-DD.
     */
    public String getFrom() {
        return from;
    }

    public AttendanceCalendar setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Último día, AAAA-MM-DD.
     */
    public String getTo() {
        return to;
    }

    public AttendanceCalendar setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Desde cuándo un día da horas extra: agreed, al pasar el horario acordado de cada quien (LFT art. 58); law, al pasar la jornada de la ley para su turno (art. 61).
     * <p>
     * Valores: agreed, law.
     */
    public String getDailyJornada() {
        return dailyJornada;
    }

    public AttendanceCalendar setDailyJornada(String dailyJornada) {
        this.dailyJornada = dailyJornada;
        return this;
    }

    /**
     * Cada empleado del emisor que registra asistencia.
     */
    public List<AttendanceCalendarEmployee> getEmployees() {
        return employees;
    }

    public AttendanceCalendar setEmployees(List<AttendanceCalendarEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
