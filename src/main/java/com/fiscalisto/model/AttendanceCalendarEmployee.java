// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceCalendarEmployee: AttendanceCalendarEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceCalendarEmployee {
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
     * Su rol de turnos (atr_…), o null.
     */
    @JsonProperty("rotation")
    private String rotation;

    /**
     * Más de seis días de trabajo seguidos sin descanso en el mes (LFT art. 69).
     */
    @JsonProperty("warning")
    private String warning;

    /**
     * Cada día del mes.
     */
    @JsonProperty("days")
    private List<AttendanceCalendarEmployeeDay> days;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public AttendanceCalendarEmployee setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public AttendanceCalendarEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su número de empleado, o null.
     */
    public String getNumber() {
        return number;
    }

    public AttendanceCalendarEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su rol de turnos (atr_…), o null.
     */
    public String getRotation() {
        return rotation;
    }

    public AttendanceCalendarEmployee setRotation(String rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * Más de seis días de trabajo seguidos sin descanso en el mes (LFT art. 69).
     */
    public String getWarning() {
        return warning;
    }

    public AttendanceCalendarEmployee setWarning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * Cada día del mes.
     */
    public List<AttendanceCalendarEmployeeDay> getDays() {
        return days;
    }

    public AttendanceCalendarEmployee setDays(List<AttendanceCalendarEmployeeDay> days) {
        this.days = days;
        return this;
    }
}
