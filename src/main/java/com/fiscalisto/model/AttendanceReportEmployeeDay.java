// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceReportEmployeeDay: AttendanceReportEmployeeDay.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceReportEmployeeDay {
    /**
     * AAAA-MM-DD.
     */
    @JsonProperty("date")
    private String date;

    /**
     * worked (trabajó), incomplete (falta una marca), absent (falta), rest (descanso), holiday (día festivo), excused (justificado con una nota), upcoming (por venir), before (antes de empezar su registro).
     * <p>
     * Valores: worked, incomplete, absent, rest, holiday, excused, upcoming, before.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Su horario ese día, o null si descansa.
     */
    @JsonProperty("scheduled")
    private AttendanceReportEmployeeDayScheduled scheduled;

    /**
     * La jornada de ese día por ley, o null si descansa.
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    @JsonProperty("jornada")
    private String jornada;

    /**
     * Minutos trabajados ese día.
     */
    @JsonProperty("worked_minutes")
    private Long workedMinutes;

    /**
     * Minutos de retardo, pasada la tolerancia.
     */
    @JsonProperty("late_minutes")
    private Long lateMinutes;

    /**
     * Minutos de más ese día (horas extra).
     */
    @JsonProperty("overtime_minutes")
    private Long overtimeMinutes;

    /**
     * De esos, los que cuentan para la nómina: con overtime_policy approval, hasta lo autorizado ese día; con all, todos; con none, ninguno.
     */
    @JsonProperty("approved_overtime_minutes")
    private Long approvedOvertimeMinutes;

    /**
     * De esos, los que la empresa rechazó ese día: no cuentan para la nómina.
     */
    @JsonProperty("rejected_overtime_minutes")
    private Long rejectedOvertimeMinutes;

    /**
     * Minutos de su horario de ese día que pasan de la jornada ordinaria de la semana (ordinary_week_hours, LFT art. 59): son horas extra por ley aunque estén en su horario, y cuentan para la nómina.
     */
    @JsonProperty("week_excess_minutes")
    private Long weekExcessMinutes;

    /**
     * La nota del día que puso la empresa, o null.
     * <p>
     * Valores: vacaciones, incapacidad, permiso_con_goce, permiso_sin_goce, descanso, festivo, falta.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El nombre del día festivo, o null.
     */
    @JsonProperty("holiday")
    private String holiday;

    /**
     * AAAA-MM-DD.
     */
    public String getDate() {
        return date;
    }

    public AttendanceReportEmployeeDay setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * worked (trabajó), incomplete (falta una marca), absent (falta), rest (descanso), holiday (día festivo), excused (justificado con una nota), upcoming (por venir), before (antes de empezar su registro).
     * <p>
     * Valores: worked, incomplete, absent, rest, holiday, excused, upcoming, before.
     */
    public String getStatus() {
        return status;
    }

    public AttendanceReportEmployeeDay setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Su horario ese día, o null si descansa.
     */
    public AttendanceReportEmployeeDayScheduled getScheduled() {
        return scheduled;
    }

    public AttendanceReportEmployeeDay setScheduled(AttendanceReportEmployeeDayScheduled scheduled) {
        this.scheduled = scheduled;
        return this;
    }

    /**
     * La jornada de ese día por ley, o null si descansa.
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    public String getJornada() {
        return jornada;
    }

    public AttendanceReportEmployeeDay setJornada(String jornada) {
        this.jornada = jornada;
        return this;
    }

    /**
     * Minutos trabajados ese día.
     */
    public Long getWorkedMinutes() {
        return workedMinutes;
    }

    public AttendanceReportEmployeeDay setWorkedMinutes(Long workedMinutes) {
        this.workedMinutes = workedMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setWorkedMinutes(long workedMinutes) {
        return setWorkedMinutes(Long.valueOf(workedMinutes));
    }

    /**
     * Minutos de retardo, pasada la tolerancia.
     */
    public Long getLateMinutes() {
        return lateMinutes;
    }

    public AttendanceReportEmployeeDay setLateMinutes(Long lateMinutes) {
        this.lateMinutes = lateMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setLateMinutes(long lateMinutes) {
        return setLateMinutes(Long.valueOf(lateMinutes));
    }

    /**
     * Minutos de más ese día (horas extra).
     */
    public Long getOvertimeMinutes() {
        return overtimeMinutes;
    }

    public AttendanceReportEmployeeDay setOvertimeMinutes(Long overtimeMinutes) {
        this.overtimeMinutes = overtimeMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setOvertimeMinutes(long overtimeMinutes) {
        return setOvertimeMinutes(Long.valueOf(overtimeMinutes));
    }

    /**
     * De esos, los que cuentan para la nómina: con overtime_policy approval, hasta lo autorizado ese día; con all, todos; con none, ninguno.
     */
    public Long getApprovedOvertimeMinutes() {
        return approvedOvertimeMinutes;
    }

    public AttendanceReportEmployeeDay setApprovedOvertimeMinutes(Long approvedOvertimeMinutes) {
        this.approvedOvertimeMinutes = approvedOvertimeMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setApprovedOvertimeMinutes(long approvedOvertimeMinutes) {
        return setApprovedOvertimeMinutes(Long.valueOf(approvedOvertimeMinutes));
    }

    /**
     * De esos, los que la empresa rechazó ese día: no cuentan para la nómina.
     */
    public Long getRejectedOvertimeMinutes() {
        return rejectedOvertimeMinutes;
    }

    public AttendanceReportEmployeeDay setRejectedOvertimeMinutes(Long rejectedOvertimeMinutes) {
        this.rejectedOvertimeMinutes = rejectedOvertimeMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setRejectedOvertimeMinutes(long rejectedOvertimeMinutes) {
        return setRejectedOvertimeMinutes(Long.valueOf(rejectedOvertimeMinutes));
    }

    /**
     * Minutos de su horario de ese día que pasan de la jornada ordinaria de la semana (ordinary_week_hours, LFT art. 59): son horas extra por ley aunque estén en su horario, y cuentan para la nómina.
     */
    public Long getWeekExcessMinutes() {
        return weekExcessMinutes;
    }

    public AttendanceReportEmployeeDay setWeekExcessMinutes(Long weekExcessMinutes) {
        this.weekExcessMinutes = weekExcessMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployeeDay setWeekExcessMinutes(long weekExcessMinutes) {
        return setWeekExcessMinutes(Long.valueOf(weekExcessMinutes));
    }

    /**
     * La nota del día que puso la empresa, o null.
     * <p>
     * Valores: vacaciones, incapacidad, permiso_con_goce, permiso_sin_goce, descanso, festivo, falta.
     */
    public String getNote() {
        return note;
    }

    public AttendanceReportEmployeeDay setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * El nombre del día festivo, o null.
     */
    public String getHoliday() {
        return holiday;
    }

    public AttendanceReportEmployeeDay setHoliday(String holiday) {
        this.holiday = holiday;
        return this;
    }
}
