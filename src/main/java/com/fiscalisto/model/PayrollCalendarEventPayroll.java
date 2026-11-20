// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollCalendarEventPayroll: PayrollCalendarEventPayroll.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCalendarEventPayroll {
    /**
     * c_PeriodicidadPago.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * El periodo de pago: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     */
    @JsonProperty("period")
    private PayrollCalendarEventPayrollPeriod period;

    /**
     * El último día para timbrar sus recibos (RMF 2.7.5.1: 3 a 11 días hábiles después del pago, según cuántos trabajadores).
     */
    @JsonProperty("stamp_by")
    private String stampBy;

    /**
     * Los empleados que paga ese periodo.
     */
    @JsonProperty("employees")
    private Long employees;

    /**
     * Los que ya tienen su recibo timbrado.
     */
    @JsonProperty("stamped")
    private Long stamped;

    /**
     * c_PeriodicidadPago.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public PayrollCalendarEventPayroll setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * El periodo de pago: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     */
    public PayrollCalendarEventPayrollPeriod getPeriod() {
        return period;
    }

    public PayrollCalendarEventPayroll setPeriod(PayrollCalendarEventPayrollPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * El último día para timbrar sus recibos (RMF 2.7.5.1: 3 a 11 días hábiles después del pago, según cuántos trabajadores).
     */
    public String getStampBy() {
        return stampBy;
    }

    public PayrollCalendarEventPayroll setStampBy(String stampBy) {
        this.stampBy = stampBy;
        return this;
    }

    /**
     * Los empleados que paga ese periodo.
     */
    public Long getEmployees() {
        return employees;
    }

    public PayrollCalendarEventPayroll setEmployees(Long employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public PayrollCalendarEventPayroll setEmployees(long employees) {
        return setEmployees(Long.valueOf(employees));
    }

    /**
     * Los que ya tienen su recibo timbrado.
     */
    public Long getStamped() {
        return stamped;
    }

    public PayrollCalendarEventPayroll setStamped(Long stamped) {
        this.stamped = stamped;
        return this;
    }

    @JsonIgnore
    public PayrollCalendarEventPayroll setStamped(long stamped) {
        return setStamped(Long.valueOf(stamped));
    }
}
