// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAttendanceCalendarParams: los campos de «Ver el calendario de turnos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAttendanceCalendarParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes, AAAA-MM.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Solo este empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetAttendanceCalendarParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes, AAAA-MM.
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetAttendanceCalendarParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Solo este empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public GetAttendanceCalendarParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
