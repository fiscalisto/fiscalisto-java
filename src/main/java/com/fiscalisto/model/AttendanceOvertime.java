// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceOvertime: Las horas extra que la empresa autorizó para un día de un empleado, antes o después de ese día.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceOvertime {
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
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El día, AAAA-MM-DD.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Hasta cuántos minutos de horas extra de ese día cuentan para la nómina; null: sin autorización.
     */
    @JsonProperty("minutes")
    private Long minutes;

    /**
     * Por qué, o null.
     */
    @JsonProperty("comment")
    private String comment;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceOvertime setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceOvertime setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public AttendanceOvertime setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * El día, AAAA-MM-DD.
     */
    public String getDate() {
        return date;
    }

    public AttendanceOvertime setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Hasta cuántos minutos de horas extra de ese día cuentan para la nómina; null: sin autorización.
     */
    public Long getMinutes() {
        return minutes;
    }

    public AttendanceOvertime setMinutes(Long minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonIgnore
    public AttendanceOvertime setMinutes(long minutes) {
        return setMinutes(Long.valueOf(minutes));
    }

    /**
     * Por qué, o null.
     */
    public String getComment() {
        return comment;
    }

    public AttendanceOvertime setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
