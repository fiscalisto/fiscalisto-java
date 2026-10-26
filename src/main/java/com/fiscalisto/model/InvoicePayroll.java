// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePayroll: Solo en un recibo de nómina (type N).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayroll {
    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     */
    @JsonProperty("period")
    private InvoicePayrollPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    @JsonProperty("employer")
    private InvoicePayrollEmployer employer;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private InvoicePayrollEmployee employee;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<InvoicePayrollPerception> perceptions;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<InvoicePayrollDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<InvoicePayrollOtherPayment> otherPayments;

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public InvoicePayroll setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     */
    public InvoicePayrollPeriod getPeriod() {
        return period;
    }

    public InvoicePayroll setPeriod(InvoicePayrollPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public BigDecimal getDays() {
        return days;
    }

    public InvoicePayroll setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public InvoicePayroll setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    public InvoicePayrollEmployer getEmployer() {
        return employer;
    }

    public InvoicePayroll setEmployer(InvoicePayrollEmployer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public InvoicePayrollEmployee getEmployee() {
        return employee;
    }

    public InvoicePayroll setEmployee(InvoicePayrollEmployee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<InvoicePayrollPerception> getPerceptions() {
        return perceptions;
    }

    public InvoicePayroll setPerceptions(List<InvoicePayrollPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<InvoicePayrollDeduction> getDeductions() {
        return deductions;
    }

    public InvoicePayroll setDeductions(List<InvoicePayrollDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<InvoicePayrollOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public InvoicePayroll setOtherPayments(List<InvoicePayrollOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }
}
