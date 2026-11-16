// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAttendanceParams: los campos de «Ver la asistencia de un periodo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAttendanceParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Primer día, AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Último día, AAAA-MM-DD (hasta 92 días después de from).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Solo este empleado (emp_…), con sus días y marcas.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetAttendanceParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Primer día, AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getFrom() {
        return from;
    }

    public GetAttendanceParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Último día, AAAA-MM-DD (hasta 92 días después de from).
     * <p>
     * Obligatorio.
     */
    public String getTo() {
        return to;
    }

    public GetAttendanceParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Solo este empleado (emp_…), con sus días y marcas.
     */
    public String getEmployee() {
        return employee;
    }

    public GetAttendanceParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
