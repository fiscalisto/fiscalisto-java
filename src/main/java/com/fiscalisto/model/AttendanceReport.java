// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceReport: La asistencia de un periodo, por empleado: horas contra su horario, faltas, retardos y horas extra dobles y triples por semana, como Nómina › Asistencia › Registro.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceReport {
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
     * El emisor (iss_…), el patrón.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Primer día del periodo, AAAA-MM-DD.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Último día del periodo, AAAA-MM-DD.
     */
    @JsonProperty("to")
    private String to;

    /**
     * true: las horas extra cuentan solo hasta lo que la empresa autorizó cada día.
     */
    @JsonProperty("overtime_approval")
    private Boolean overtimeApproval;

    /**
     * Cómo llegan las horas extra a la nómina: approval (necesitan autorización), all (cuentan todas) o none (no hay horas extra: quedan en el registro y nunca cuentan).
     * <p>
     * Valores: approval, all, none.
     */
    @JsonProperty("overtime_policy")
    private String overtimePolicy;

    /**
     * La jornada ordinaria de la semana al último día del periodo: la de la ley (48 en 2026, 46 en 2027, 44 en 2028, 42 en 2029 y 40 desde 2030; LFT art. 59 y transitorio segundo del decreto DOF 01-05-2026) o la de la empresa si es menor. Lo trabajado de más en la semana son horas extra.
     */
    @JsonProperty("ordinary_week_hours")
    private Long ordinaryWeekHours;

    /**
     * La jornada semanal que fijó la empresa en Horario y reglas, o null si sigue la de la ley.
     */
    @JsonProperty("weekly_hours")
    private Long weeklyHours;

    /**
     * Desde cuándo un día da horas extra: agreed, al pasar el horario acordado de cada quien (LFT art. 58); law, al pasar la jornada de la ley para su turno (art. 61).
     * <p>
     * Valores: agreed, law.
     */
    @JsonProperty("daily_jornada")
    private String dailyJornada;

    /**
     * Cada empleado del emisor en el periodo.
     */
    @JsonProperty("employees")
    private List<AttendanceReportEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceReport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceReport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…), el patrón.
     */
    public String getIssuer() {
        return issuer;
    }

    public AttendanceReport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Primer día del periodo, AAAA-MM-DD.
     */
    public String getFrom() {
        return from;
    }

    public AttendanceReport setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Último día del periodo, AAAA-MM-DD.
     */
    public String getTo() {
        return to;
    }

    public AttendanceReport setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * true: las horas extra cuentan solo hasta lo que la empresa autorizó cada día.
     */
    public Boolean getOvertimeApproval() {
        return overtimeApproval;
    }

    public AttendanceReport setOvertimeApproval(Boolean overtimeApproval) {
        this.overtimeApproval = overtimeApproval;
        return this;
    }

    /**
     * Cómo llegan las horas extra a la nómina: approval (necesitan autorización), all (cuentan todas) o none (no hay horas extra: quedan en el registro y nunca cuentan).
     * <p>
     * Valores: approval, all, none.
     */
    public String getOvertimePolicy() {
        return overtimePolicy;
    }

    public AttendanceReport setOvertimePolicy(String overtimePolicy) {
        this.overtimePolicy = overtimePolicy;
        return this;
    }

    /**
     * La jornada ordinaria de la semana al último día del periodo: la de la ley (48 en 2026, 46 en 2027, 44 en 2028, 42 en 2029 y 40 desde 2030; LFT art. 59 y transitorio segundo del decreto DOF 01-05-2026) o la de la empresa si es menor. Lo trabajado de más en la semana son horas extra.
     */
    public Long getOrdinaryWeekHours() {
        return ordinaryWeekHours;
    }

    public AttendanceReport setOrdinaryWeekHours(Long ordinaryWeekHours) {
        this.ordinaryWeekHours = ordinaryWeekHours;
        return this;
    }

    @JsonIgnore
    public AttendanceReport setOrdinaryWeekHours(long ordinaryWeekHours) {
        return setOrdinaryWeekHours(Long.valueOf(ordinaryWeekHours));
    }

    /**
     * La jornada semanal que fijó la empresa en Horario y reglas, o null si sigue la de la ley.
     */
    public Long getWeeklyHours() {
        return weeklyHours;
    }

    public AttendanceReport setWeeklyHours(Long weeklyHours) {
        this.weeklyHours = weeklyHours;
        return this;
    }

    @JsonIgnore
    public AttendanceReport setWeeklyHours(long weeklyHours) {
        return setWeeklyHours(Long.valueOf(weeklyHours));
    }

    /**
     * Desde cuándo un día da horas extra: agreed, al pasar el horario acordado de cada quien (LFT art. 58); law, al pasar la jornada de la ley para su turno (art. 61).
     * <p>
     * Valores: agreed, law.
     */
    public String getDailyJornada() {
        return dailyJornada;
    }

    public AttendanceReport setDailyJornada(String dailyJornada) {
        this.dailyJornada = dailyJornada;
        return this;
    }

    /**
     * Cada empleado del emisor en el periodo.
     */
    public List<AttendanceReportEmployee> getEmployees() {
        return employees;
    }

    public AttendanceReport setEmployees(List<AttendanceReportEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
