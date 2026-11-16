// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

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
