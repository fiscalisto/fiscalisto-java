// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePayroll: El complemento de nómina 1.2 como se timbró: tipo, periodo, patrón, empleado, percepciones, deducciones, otros pagos, sus nodos y los totales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayroll {
    /**
     * TipoNomina: O ordinaria, E extraordinaria.
     * <p>
     * Valores: O, E.
     */
    @JsonProperty("type")
    private String type;

    /**
     * fiscalisto: lo calculó Fiscalisto (POST /v1/payroll_receipts); external: lo calculó su sistema de nómina y se timbró tal cual (POST /v1/payroll_receipts/external).
     * <p>
     * Valores: fiscalisto, external.
     */
    @JsonProperty("calculation")
    private String calculation;

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * Periodo pagado: FechaInicialPago, FechaFinalPago y FechaPago.
     */
    @JsonProperty("period")
    private InvoicePayrollPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Los ids de su sistema de nómina (solo en recibos external).
     */
    @JsonProperty("references")
    private InvoicePayrollReferences references;

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    @JsonProperty("employer")
    private InvoicePayrollEmployer employer;

    /**
     * El empleado (Nomina/Receptor), como se timbró.
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
     * SeparacionIndemnizacion (percepciones 022, 023, 025).
     */
    @JsonProperty("separation")
    private InvoicePayrollSeparation separation;

    /**
     * JubilacionPensionRetiro (percepciones 039, 044).
     */
    @JsonProperty("retirement")
    private InvoicePayrollRetirement retirement;

    /**
     * Incapacidades (percepción 014 o deducción 006).
     */
    @JsonProperty("disabilities")
    private List<InvoicePayrollDisability> disabilities;

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    @JsonProperty("totals")
    private InvoicePayrollTotals totals;

    /**
     * TipoNomina: O ordinaria, E extraordinaria.
     * <p>
     * Valores: O, E.
     */
    public String getType() {
        return type;
    }

    public InvoicePayroll setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * fiscalisto: lo calculó Fiscalisto (POST /v1/payroll_receipts); external: lo calculó su sistema de nómina y se timbró tal cual (POST /v1/payroll_receipts/external).
     * <p>
     * Valores: fiscalisto, external.
     */
    public String getCalculation() {
        return calculation;
    }

    public InvoicePayroll setCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

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
     * Periodo pagado: FechaInicialPago, FechaFinalPago y FechaPago.
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
     * Los ids de su sistema de nómina (solo en recibos external).
     */
    public InvoicePayrollReferences getReferences() {
        return references;
    }

    public InvoicePayroll setReferences(InvoicePayrollReferences references) {
        this.references = references;
        return this;
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
     * El empleado (Nomina/Receptor), como se timbró.
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

    /**
     * SeparacionIndemnizacion (percepciones 022, 023, 025).
     */
    public InvoicePayrollSeparation getSeparation() {
        return separation;
    }

    public InvoicePayroll setSeparation(InvoicePayrollSeparation separation) {
        this.separation = separation;
        return this;
    }

    /**
     * JubilacionPensionRetiro (percepciones 039, 044).
     */
    public InvoicePayrollRetirement getRetirement() {
        return retirement;
    }

    public InvoicePayroll setRetirement(InvoicePayrollRetirement retirement) {
        this.retirement = retirement;
        return this;
    }

    /**
     * Incapacidades (percepción 014 o deducción 006).
     */
    public List<InvoicePayrollDisability> getDisabilities() {
        return disabilities;
    }

    public InvoicePayroll setDisabilities(List<InvoicePayrollDisability> disabilities) {
        this.disabilities = disabilities;
        return this;
    }

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    public InvoicePayrollTotals getTotals() {
        return totals;
    }

    public InvoicePayroll setTotals(InvoicePayrollTotals totals) {
        this.totals = totals;
        return this;
    }
}
