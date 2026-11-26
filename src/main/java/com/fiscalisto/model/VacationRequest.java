// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * VacationRequest: Días de vacaciones que un empleado pidió desde su enlace.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VacationRequest {
    /**
     * vrq_…
     */
    @JsonProperty("id")
    private String id;

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
    private StringOr<Employee> employee;

    /**
     * El nombre del empleado.
     */
    @JsonProperty("employee_name")
    private String employeeName;

    /**
     * El primer día (AAAA-MM-DD).
     */
    @JsonProperty("from")
    private String from;

    /**
     * El último día (AAAA-MM-DD).
     */
    @JsonProperty("to")
    private String to;

    /**
     * Los días que descuenta de sus vacaciones: los laborables entre las fechas (sin domingos ni días de descanso obligatorio), o los que se aprobaron.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * La nota del empleado.
     */
    @JsonProperty("note")
    private String note;

    /**
     * pending, por revisar; approved, aprobada; rejected, rechazada; canceled, el empleado la retiró.
     * <p>
     * Valores: pending, approved, rejected, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo se aprobó o rechazó.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * La nota de quien la decidió: el empleado la ve.
     */
    @JsonProperty("decision_note")
    private String decisionNote;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * vrq_…
     */
    public String getId() {
        return id;
    }

    public VacationRequest setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public VacationRequest setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public VacationRequest setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public VacationRequest setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public VacationRequest setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public VacationRequest setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * El nombre del empleado.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public VacationRequest setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * El primer día (AAAA-MM-DD).
     */
    public String getFrom() {
        return from;
    }

    public VacationRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * El último día (AAAA-MM-DD).
     */
    public String getTo() {
        return to;
    }

    public VacationRequest setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Los días que descuenta de sus vacaciones: los laborables entre las fechas (sin domingos ni días de descanso obligatorio), o los que se aprobaron.
     */
    public BigDecimal getDays() {
        return days;
    }

    public VacationRequest setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public VacationRequest setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * La nota del empleado.
     */
    public String getNote() {
        return note;
    }

    public VacationRequest setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * pending, por revisar; approved, aprobada; rejected, rechazada; canceled, el empleado la retiró.
     * <p>
     * Valores: pending, approved, rejected, canceled.
     */
    public String getStatus() {
        return status;
    }

    public VacationRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo se aprobó o rechazó.
     */
    public String getDecidedAt() {
        return decidedAt;
    }

    public VacationRequest setDecidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    /**
     * La nota de quien la decidió: el empleado la ve.
     */
    public String getDecisionNote() {
        return decisionNote;
    }

    public VacationRequest setDecisionNote(String decisionNote) {
        this.decisionNote = decisionNote;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public VacationRequest setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
