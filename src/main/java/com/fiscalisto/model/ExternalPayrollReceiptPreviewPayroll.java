// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ExternalPayrollReceiptPreviewPayroll: El complemento de nómina 1.2 como se timbró: tipo, periodo, patrón, empleado, percepciones, deducciones, otros pagos, sus nodos y los totales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayroll {
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
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y el día de pago (FechaPago).
     */
    @JsonProperty("period")
    private ExternalPayrollReceiptPreviewPayrollPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Los ids de su sistema de nómina (solo en recibos external).
     */
    @JsonProperty("references")
    private ExternalPayrollReceiptPreviewPayrollReferences references;

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    @JsonProperty("employer")
    private ExternalPayrollReceiptPreviewPayrollEmployer employer;

    /**
     * El empleado como va en el Receptor de Nómina 1.2 (CURP, NSS, contrato, jornada, régimen, riesgo y salarios), con su id (emp_…).
     */
    @JsonProperty("employee")
    private ExternalPayrollReceiptPreviewPayrollEmployee employee;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<ExternalPayrollReceiptPreviewPayrollPerception> perceptions;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<ExternalPayrollReceiptPreviewPayrollDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<ExternalPayrollReceiptPreviewPayrollOtherPayment> otherPayments;

    /**
     * SeparacionIndemnizacion (percepciones 022, 023, 025).
     */
    @JsonProperty("separation")
    private ExternalPayrollReceiptPreviewPayrollSeparation separation;

    /**
     * JubilacionPensionRetiro (percepciones 039, 044).
     */
    @JsonProperty("retirement")
    private ExternalPayrollReceiptPreviewPayrollRetirement retirement;

    /**
     * Incapacidades (percepción 014 o deducción 006).
     */
    @JsonProperty("disabilities")
    private List<ExternalPayrollReceiptPreviewPayrollDisability> disabilities;

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    @JsonProperty("totals")
    private ExternalPayrollReceiptPreviewPayrollTotals totals;

    /**
     * TipoNomina: O ordinaria, E extraordinaria.
     * <p>
     * Valores: O, E.
     */
    public String getType() {
        return type;
    }

    public ExternalPayrollReceiptPreviewPayroll setType(String type) {
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

    public ExternalPayrollReceiptPreviewPayroll setCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public ExternalPayrollReceiptPreviewPayroll setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y el día de pago (FechaPago).
     */
    public ExternalPayrollReceiptPreviewPayrollPeriod getPeriod() {
        return period;
    }

    public ExternalPayrollReceiptPreviewPayroll setPeriod(ExternalPayrollReceiptPreviewPayrollPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public BigDecimal getDays() {
        return days;
    }

    public ExternalPayrollReceiptPreviewPayroll setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayroll setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Los ids de su sistema de nómina (solo en recibos external).
     */
    public ExternalPayrollReceiptPreviewPayrollReferences getReferences() {
        return references;
    }

    public ExternalPayrollReceiptPreviewPayroll setReferences(ExternalPayrollReceiptPreviewPayrollReferences references) {
        this.references = references;
        return this;
    }

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    public ExternalPayrollReceiptPreviewPayrollEmployer getEmployer() {
        return employer;
    }

    public ExternalPayrollReceiptPreviewPayroll setEmployer(ExternalPayrollReceiptPreviewPayrollEmployer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * El empleado como va en el Receptor de Nómina 1.2 (CURP, NSS, contrato, jornada, régimen, riesgo y salarios), con su id (emp_…).
     */
    public ExternalPayrollReceiptPreviewPayrollEmployee getEmployee() {
        return employee;
    }

    public ExternalPayrollReceiptPreviewPayroll setEmployee(ExternalPayrollReceiptPreviewPayrollEmployee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<ExternalPayrollReceiptPreviewPayrollPerception> getPerceptions() {
        return perceptions;
    }

    public ExternalPayrollReceiptPreviewPayroll setPerceptions(List<ExternalPayrollReceiptPreviewPayrollPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<ExternalPayrollReceiptPreviewPayrollDeduction> getDeductions() {
        return deductions;
    }

    public ExternalPayrollReceiptPreviewPayroll setDeductions(List<ExternalPayrollReceiptPreviewPayrollDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<ExternalPayrollReceiptPreviewPayrollOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public ExternalPayrollReceiptPreviewPayroll setOtherPayments(List<ExternalPayrollReceiptPreviewPayrollOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    /**
     * SeparacionIndemnizacion (percepciones 022, 023, 025).
     */
    public ExternalPayrollReceiptPreviewPayrollSeparation getSeparation() {
        return separation;
    }

    public ExternalPayrollReceiptPreviewPayroll setSeparation(ExternalPayrollReceiptPreviewPayrollSeparation separation) {
        this.separation = separation;
        return this;
    }

    /**
     * JubilacionPensionRetiro (percepciones 039, 044).
     */
    public ExternalPayrollReceiptPreviewPayrollRetirement getRetirement() {
        return retirement;
    }

    public ExternalPayrollReceiptPreviewPayroll setRetirement(ExternalPayrollReceiptPreviewPayrollRetirement retirement) {
        this.retirement = retirement;
        return this;
    }

    /**
     * Incapacidades (percepción 014 o deducción 006).
     */
    public List<ExternalPayrollReceiptPreviewPayrollDisability> getDisabilities() {
        return disabilities;
    }

    public ExternalPayrollReceiptPreviewPayroll setDisabilities(List<ExternalPayrollReceiptPreviewPayrollDisability> disabilities) {
        this.disabilities = disabilities;
        return this;
    }

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    public ExternalPayrollReceiptPreviewPayrollTotals getTotals() {
        return totals;
    }

    public ExternalPayrollReceiptPreviewPayroll setTotals(ExternalPayrollReceiptPreviewPayrollTotals totals) {
        this.totals = totals;
        return this;
    }
}
