// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceReportEmployee: AttendanceReportEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceReportEmployee {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su número de empleado, o null.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Donde marca, o null (cualquier lugar).
     */
    @JsonProperty("place")
    private String place;

    /**
     * Minutos trabajados en el periodo.
     */
    @JsonProperty("worked_minutes")
    private Long workedMinutes;

    /**
     * Minutos de su horario en el periodo.
     */
    @JsonProperty("scheduled_minutes")
    private Long scheduledMinutes;

    /**
     * Faltas: días de trabajo sin marcas ni nota.
     */
    @JsonProperty("absences")
    private Long absences;

    /**
     * Días con nota de incapacidad.
     */
    @JsonProperty("disability_days")
    private Long disabilityDays;

    /**
     * Días con nota de vacaciones.
     */
    @JsonProperty("vacation_days")
    private Long vacationDays;

    /**
     * Cuántos días llegó tarde.
     */
    @JsonProperty("late_count")
    private Long lateCount;

    /**
     * Minutos de retardo en total.
     */
    @JsonProperty("late_minutes")
    private Long lateMinutes;

    /**
     * Días con una marca sin su pareja (sin salida).
     */
    @JsonProperty("incomplete_days")
    private Long incompleteDays;

    /**
     * Marcas con una nota para revisar (flags).
     */
    @JsonProperty("flagged_marks")
    private Long flaggedMarks;

    /**
     * Horas extra que se pagan dobles (hasta 9 por semana en 2026, 12 desde 2027).
     */
    @JsonProperty("overtime_double_minutes")
    private Long overtimeDoubleMinutes;

    /**
     * Horas extra que se pagan triples (las que pasan del límite de la semana).
     */
    @JsonProperty("overtime_triple_minutes")
    private Long overtimeTripleMinutes;

    /**
     * Días de descanso en que trabajó.
     */
    @JsonProperty("rest_days_worked")
    private Long restDaysWorked;

    /**
     * Días festivos en que trabajó.
     */
    @JsonProperty("holidays_worked")
    private Long holidaysWorked;

    /**
     * Semanas que el empleado confirmó en su enlace.
     */
    @JsonProperty("weeks_confirmed")
    private Long weeksConfirmed;

    /**
     * Las semanas con las que el empleado no está de acuerdo.
     */
    @JsonProperty("weeks_disputed")
    private List<AttendanceReportEmployeeWeeksDisputedItem> weeksDisputed;

    /**
     * Cada día del periodo, solo cuando se pide un employee; si no, null.
     */
    @JsonProperty("days")
    private List<AttendanceReportEmployeeDay> days;

    /**
     * Sus marcas, también las quitadas, solo cuando se pide un employee; si no, null.
     */
    @JsonProperty("marks")
    private List<AttendanceMark> marks;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public AttendanceReportEmployee setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public AttendanceReportEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su número de empleado, o null.
     */
    public String getNumber() {
        return number;
    }

    public AttendanceReportEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Donde marca, o null (cualquier lugar).
     */
    public String getPlace() {
        return place;
    }

    public AttendanceReportEmployee setPlace(String place) {
        this.place = place;
        return this;
    }

    /**
     * Minutos trabajados en el periodo.
     */
    public Long getWorkedMinutes() {
        return workedMinutes;
    }

    public AttendanceReportEmployee setWorkedMinutes(Long workedMinutes) {
        this.workedMinutes = workedMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setWorkedMinutes(long workedMinutes) {
        return setWorkedMinutes(Long.valueOf(workedMinutes));
    }

    /**
     * Minutos de su horario en el periodo.
     */
    public Long getScheduledMinutes() {
        return scheduledMinutes;
    }

    public AttendanceReportEmployee setScheduledMinutes(Long scheduledMinutes) {
        this.scheduledMinutes = scheduledMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setScheduledMinutes(long scheduledMinutes) {
        return setScheduledMinutes(Long.valueOf(scheduledMinutes));
    }

    /**
     * Faltas: días de trabajo sin marcas ni nota.
     */
    public Long getAbsences() {
        return absences;
    }

    public AttendanceReportEmployee setAbsences(Long absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setAbsences(long absences) {
        return setAbsences(Long.valueOf(absences));
    }

    /**
     * Días con nota de incapacidad.
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public AttendanceReportEmployee setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Días con nota de vacaciones.
     */
    public Long getVacationDays() {
        return vacationDays;
    }

    public AttendanceReportEmployee setVacationDays(Long vacationDays) {
        this.vacationDays = vacationDays;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setVacationDays(long vacationDays) {
        return setVacationDays(Long.valueOf(vacationDays));
    }

    /**
     * Cuántos días llegó tarde.
     */
    public Long getLateCount() {
        return lateCount;
    }

    public AttendanceReportEmployee setLateCount(Long lateCount) {
        this.lateCount = lateCount;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setLateCount(long lateCount) {
        return setLateCount(Long.valueOf(lateCount));
    }

    /**
     * Minutos de retardo en total.
     */
    public Long getLateMinutes() {
        return lateMinutes;
    }

    public AttendanceReportEmployee setLateMinutes(Long lateMinutes) {
        this.lateMinutes = lateMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setLateMinutes(long lateMinutes) {
        return setLateMinutes(Long.valueOf(lateMinutes));
    }

    /**
     * Días con una marca sin su pareja (sin salida).
     */
    public Long getIncompleteDays() {
        return incompleteDays;
    }

    public AttendanceReportEmployee setIncompleteDays(Long incompleteDays) {
        this.incompleteDays = incompleteDays;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setIncompleteDays(long incompleteDays) {
        return setIncompleteDays(Long.valueOf(incompleteDays));
    }

    /**
     * Marcas con una nota para revisar (flags).
     */
    public Long getFlaggedMarks() {
        return flaggedMarks;
    }

    public AttendanceReportEmployee setFlaggedMarks(Long flaggedMarks) {
        this.flaggedMarks = flaggedMarks;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setFlaggedMarks(long flaggedMarks) {
        return setFlaggedMarks(Long.valueOf(flaggedMarks));
    }

    /**
     * Horas extra que se pagan dobles (hasta 9 por semana en 2026, 12 desde 2027).
     */
    public Long getOvertimeDoubleMinutes() {
        return overtimeDoubleMinutes;
    }

    public AttendanceReportEmployee setOvertimeDoubleMinutes(Long overtimeDoubleMinutes) {
        this.overtimeDoubleMinutes = overtimeDoubleMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setOvertimeDoubleMinutes(long overtimeDoubleMinutes) {
        return setOvertimeDoubleMinutes(Long.valueOf(overtimeDoubleMinutes));
    }

    /**
     * Horas extra que se pagan triples (las que pasan del límite de la semana).
     */
    public Long getOvertimeTripleMinutes() {
        return overtimeTripleMinutes;
    }

    public AttendanceReportEmployee setOvertimeTripleMinutes(Long overtimeTripleMinutes) {
        this.overtimeTripleMinutes = overtimeTripleMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setOvertimeTripleMinutes(long overtimeTripleMinutes) {
        return setOvertimeTripleMinutes(Long.valueOf(overtimeTripleMinutes));
    }

    /**
     * Días de descanso en que trabajó.
     */
    public Long getRestDaysWorked() {
        return restDaysWorked;
    }

    public AttendanceReportEmployee setRestDaysWorked(Long restDaysWorked) {
        this.restDaysWorked = restDaysWorked;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setRestDaysWorked(long restDaysWorked) {
        return setRestDaysWorked(Long.valueOf(restDaysWorked));
    }

    /**
     * Días festivos en que trabajó.
     */
    public Long getHolidaysWorked() {
        return holidaysWorked;
    }

    public AttendanceReportEmployee setHolidaysWorked(Long holidaysWorked) {
        this.holidaysWorked = holidaysWorked;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setHolidaysWorked(long holidaysWorked) {
        return setHolidaysWorked(Long.valueOf(holidaysWorked));
    }

    /**
     * Semanas que el empleado confirmó en su enlace.
     */
    public Long getWeeksConfirmed() {
        return weeksConfirmed;
    }

    public AttendanceReportEmployee setWeeksConfirmed(Long weeksConfirmed) {
        this.weeksConfirmed = weeksConfirmed;
        return this;
    }

    @JsonIgnore
    public AttendanceReportEmployee setWeeksConfirmed(long weeksConfirmed) {
        return setWeeksConfirmed(Long.valueOf(weeksConfirmed));
    }

    /**
     * Las semanas con las que el empleado no está de acuerdo.
     */
    public List<AttendanceReportEmployeeWeeksDisputedItem> getWeeksDisputed() {
        return weeksDisputed;
    }

    public AttendanceReportEmployee setWeeksDisputed(List<AttendanceReportEmployeeWeeksDisputedItem> weeksDisputed) {
        this.weeksDisputed = weeksDisputed;
        return this;
    }

    /**
     * Cada día del periodo, solo cuando se pide un employee; si no, null.
     */
    public List<AttendanceReportEmployeeDay> getDays() {
        return days;
    }

    public AttendanceReportEmployee setDays(List<AttendanceReportEmployeeDay> days) {
        this.days = days;
        return this;
    }

    /**
     * Sus marcas, también las quitadas, solo cuando se pide un employee; si no, null.
     */
    public List<AttendanceMark> getMarks() {
        return marks;
    }

    public AttendanceReportEmployee setMarks(List<AttendanceMark> marks) {
        this.marks = marks;
        return this;
    }
}
