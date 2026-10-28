// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollReceiptPreview: El recibo como se timbraría: percepciones, deducciones (ISR, IMSS), otros pagos (subsidio) y el neto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreview {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * El periodo de pago: primer y último día y el día de pago (FechaInicialPago, FechaFinalPago y FechaPago).
     */
    @JsonProperty("period")
    private PayrollReceiptPreviewPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    @JsonProperty("contribution_base_salary")
    private BigDecimal contributionBaseSalary;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<PayrollReceiptPreviewPerception> perceptions;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<PayrollReceiptPreviewDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<PayrollReceiptPreviewOtherPayment> otherPayments;

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    @JsonProperty("isr")
    private PayrollReceiptPreviewIsr isr;

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    @JsonProperty("totals")
    private PayrollReceiptPreviewTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollReceiptPreview setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollReceiptPreview setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public PayrollReceiptPreview setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * El periodo de pago: primer y último día y el día de pago (FechaInicialPago, FechaFinalPago y FechaPago).
     */
    public PayrollReceiptPreviewPeriod getPeriod() {
        return period;
    }

    public PayrollReceiptPreview setPeriod(PayrollReceiptPreviewPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public BigDecimal getDays() {
        return days;
    }

    public PayrollReceiptPreview setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreview setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    public BigDecimal getContributionBaseSalary() {
        return contributionBaseSalary;
    }

    public PayrollReceiptPreview setContributionBaseSalary(BigDecimal contributionBaseSalary) {
        this.contributionBaseSalary = contributionBaseSalary;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreview setContributionBaseSalary(double contributionBaseSalary) {
        return setContributionBaseSalary(BigDecimal.valueOf(contributionBaseSalary));
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<PayrollReceiptPreviewPerception> getPerceptions() {
        return perceptions;
    }

    public PayrollReceiptPreview setPerceptions(List<PayrollReceiptPreviewPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<PayrollReceiptPreviewDeduction> getDeductions() {
        return deductions;
    }

    public PayrollReceiptPreview setDeductions(List<PayrollReceiptPreviewDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<PayrollReceiptPreviewOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public PayrollReceiptPreview setOtherPayments(List<PayrollReceiptPreviewOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    public PayrollReceiptPreviewIsr getIsr() {
        return isr;
    }

    public PayrollReceiptPreview setIsr(PayrollReceiptPreviewIsr isr) {
        this.isr = isr;
        return this;
    }

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    public PayrollReceiptPreviewTotals getTotals() {
        return totals;
    }

    public PayrollReceiptPreview setTotals(PayrollReceiptPreviewTotals totals) {
        this.totals = totals;
        return this;
    }
}
