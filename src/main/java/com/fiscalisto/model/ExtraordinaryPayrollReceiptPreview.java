// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ExtraordinaryPayrollReceiptPreview: Un aguinaldo, PTU o finiquito como se timbraría (nómina extraordinaria): lo que paga, su parte exenta, el ISR y el neto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraordinaryPayrollReceiptPreview {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Lo calculó Fiscalisto, como nómina extraordinaria.
     */
    @JsonProperty("calculation")
    private String calculation;

    /**
     * Mándelo en POST /v1/payroll_receipts/extraordinary para timbrar exactamente este recibo: si al timbrar se calcula otro, contesta 409 payroll_calculation_changed sin timbrar.
     */
    @JsonProperty("confirmation_token")
    private String confirmationToken;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Qué paga: aguinaldo, ptu o finiquito.
     * <p>
     * Valores: aguinaldo, ptu, finiquito.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * El periodo (FechaInicialPago, FechaFinalPago) de un recibo extraordinario es un solo día: payment_date (aguinaldo, PTU) o el último día trabajado (finiquito); payment_date es FechaPago.
     */
    @JsonProperty("period")
    private ExtraordinaryPayrollReceiptPreviewPeriod period;

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    @JsonProperty("contribution_base_salary")
    private BigDecimal contributionBaseSalary;

    /**
     * Lo que paga, como lo muestra la app.
     */
    @JsonProperty("lines")
    private List<ExtraordinaryPayrollReceiptPreviewLine> lines;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<ExtraordinaryPayrollReceiptPreviewPerception> perceptions;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<ExtraordinaryPayrollReceiptPreviewDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<ExtraordinaryPayrollReceiptPreviewOtherPayment> otherPayments;

    /**
     * SeparacionIndemnizacion: solo en una liquidación (indemnización y prima de antigüedad).
     */
    @JsonProperty("separation")
    private ExtraordinaryPayrollReceiptPreviewSeparation separation;

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    @JsonProperty("isr")
    private ExtraordinaryPayrollReceiptPreviewIsr isr;

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    @JsonProperty("totals")
    private ExtraordinaryPayrollReceiptPreviewTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExtraordinaryPayrollReceiptPreview setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Lo calculó Fiscalisto, como nómina extraordinaria.
     */
    public String getCalculation() {
        return calculation;
    }

    public ExtraordinaryPayrollReceiptPreview setCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * Mándelo en POST /v1/payroll_receipts/extraordinary para timbrar exactamente este recibo: si al timbrar se calcula otro, contesta 409 payroll_calculation_changed sin timbrar.
     */
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public ExtraordinaryPayrollReceiptPreview setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ExtraordinaryPayrollReceiptPreview setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Qué paga: aguinaldo, ptu o finiquito.
     * <p>
     * Valores: aguinaldo, ptu, finiquito.
     */
    public String getKind() {
        return kind;
    }

    public ExtraordinaryPayrollReceiptPreview setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * El periodo (FechaInicialPago, FechaFinalPago) de un recibo extraordinario es un solo día: payment_date (aguinaldo, PTU) o el último día trabajado (finiquito); payment_date es FechaPago.
     */
    public ExtraordinaryPayrollReceiptPreviewPeriod getPeriod() {
        return period;
    }

    public ExtraordinaryPayrollReceiptPreview setPeriod(ExtraordinaryPayrollReceiptPreviewPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    public BigDecimal getContributionBaseSalary() {
        return contributionBaseSalary;
    }

    public ExtraordinaryPayrollReceiptPreview setContributionBaseSalary(BigDecimal contributionBaseSalary) {
        this.contributionBaseSalary = contributionBaseSalary;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreview setContributionBaseSalary(double contributionBaseSalary) {
        return setContributionBaseSalary(BigDecimal.valueOf(contributionBaseSalary));
    }

    /**
     * Lo que paga, como lo muestra la app.
     */
    public List<ExtraordinaryPayrollReceiptPreviewLine> getLines() {
        return lines;
    }

    public ExtraordinaryPayrollReceiptPreview setLines(List<ExtraordinaryPayrollReceiptPreviewLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<ExtraordinaryPayrollReceiptPreviewPerception> getPerceptions() {
        return perceptions;
    }

    public ExtraordinaryPayrollReceiptPreview setPerceptions(List<ExtraordinaryPayrollReceiptPreviewPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<ExtraordinaryPayrollReceiptPreviewDeduction> getDeductions() {
        return deductions;
    }

    public ExtraordinaryPayrollReceiptPreview setDeductions(List<ExtraordinaryPayrollReceiptPreviewDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<ExtraordinaryPayrollReceiptPreviewOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public ExtraordinaryPayrollReceiptPreview setOtherPayments(List<ExtraordinaryPayrollReceiptPreviewOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    /**
     * SeparacionIndemnizacion: solo en una liquidación (indemnización y prima de antigüedad).
     */
    public ExtraordinaryPayrollReceiptPreviewSeparation getSeparation() {
        return separation;
    }

    public ExtraordinaryPayrollReceiptPreview setSeparation(ExtraordinaryPayrollReceiptPreviewSeparation separation) {
        this.separation = separation;
        return this;
    }

    /**
     * El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
     */
    public ExtraordinaryPayrollReceiptPreviewIsr getIsr() {
        return isr;
    }

    public ExtraordinaryPayrollReceiptPreview setIsr(ExtraordinaryPayrollReceiptPreviewIsr isr) {
        this.isr = isr;
        return this;
    }

    /**
     * Totales: percepciones, deducciones, otros pagos y el neto a pagar.
     */
    public ExtraordinaryPayrollReceiptPreviewTotals getTotals() {
        return totals;
    }

    public ExtraordinaryPayrollReceiptPreview setTotals(ExtraordinaryPayrollReceiptPreviewTotals totals) {
        this.totals = totals;
        return this;
    }
}
