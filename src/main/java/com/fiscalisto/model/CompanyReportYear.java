// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportYear: CompanyReportYear.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportYear {
    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El año en curso, hasta hoy.
     */
    @JsonProperty("partial")
    private Boolean partial;

    /**
     * Ingresos facturados sin impuestos, no cancelados.
     */
    @JsonProperty("income")
    private BigDecimal income;

    /**
     * Ingresos facturados y cancelados.
     */
    @JsonProperty("income_canceled")
    private BigDecimal incomeCanceled;

    /**
     * Por ciento de ingresos en PUE.
     */
    @JsonProperty("cash_share")
    private BigDecimal cashShare;

    /**
     * Por ciento de ingresos en PPD.
     */
    @JsonProperty("credit_share")
    private BigDecimal creditShare;

    /**
     * Por ciento de lo PPD ya cobrado (con complemento).
     */
    @JsonProperty("collected_share")
    private BigDecimal collectedShare;

    /**
     * Días promedio (ponderados) de la factura al cobro.
     */
    @JsonProperty("days_to_collect")
    private BigDecimal daysToCollect;

    /**
     * Gastos recibidos sin impuestos, no cancelados.
     */
    @JsonProperty("expenses")
    private BigDecimal expenses;

    /**
     * Gastos recibidos y cancelados.
     */
    @JsonProperty("expenses_canceled")
    private BigDecimal expensesCanceled;

    /**
     * Por ciento de lo PPD ya pagado.
     */
    @JsonProperty("paid_share")
    private BigDecimal paidShare;

    /**
     * Días promedio de la factura al pago.
     */
    @JsonProperty("days_to_pay")
    private BigDecimal daysToPay;

    /**
     * Nómina que timbró: lo que percibieron sus trabajadores, antes de deducciones.
     */
    @JsonProperty("payroll_paid")
    private BigDecimal payrollPaid;

    /**
     * Sueldos que recibió de sus patrones (recibos de nómina a su RFC), antes de deducciones: lo que gana una persona física asalariada.
     */
    @JsonProperty("payroll_received")
    private BigDecimal payrollReceived;

    /**
     * Lo que de verdad recibió de esos sueldos: el total de los recibos, después del ISR retenido y las deducciones.
     */
    @JsonProperty("payroll_received_net")
    private BigDecimal payrollReceivedNet;

    /**
     * Ingresos menos gastos y nómina.
     */
    @JsonProperty("profit")
    private BigDecimal profit;

    /**
     * Lo que queda, por ciento de ingresos.
     */
    @JsonProperty("margin")
    private BigDecimal margin;

    /**
     * Año (Ejercicio).
     */
    public Long getYear() {
        return year;
    }

    public CompanyReportYear setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El año en curso, hasta hoy.
     */
    public Boolean getPartial() {
        return partial;
    }

    public CompanyReportYear setPartial(Boolean partial) {
        this.partial = partial;
        return this;
    }

    /**
     * Ingresos facturados sin impuestos, no cancelados.
     */
    public BigDecimal getIncome() {
        return income;
    }

    public CompanyReportYear setIncome(BigDecimal income) {
        this.income = income;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setIncome(double income) {
        return setIncome(BigDecimal.valueOf(income));
    }

    /**
     * Ingresos facturados y cancelados.
     */
    public BigDecimal getIncomeCanceled() {
        return incomeCanceled;
    }

    public CompanyReportYear setIncomeCanceled(BigDecimal incomeCanceled) {
        this.incomeCanceled = incomeCanceled;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setIncomeCanceled(double incomeCanceled) {
        return setIncomeCanceled(BigDecimal.valueOf(incomeCanceled));
    }

    /**
     * Por ciento de ingresos en PUE.
     */
    public BigDecimal getCashShare() {
        return cashShare;
    }

    public CompanyReportYear setCashShare(BigDecimal cashShare) {
        this.cashShare = cashShare;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setCashShare(double cashShare) {
        return setCashShare(BigDecimal.valueOf(cashShare));
    }

    /**
     * Por ciento de ingresos en PPD.
     */
    public BigDecimal getCreditShare() {
        return creditShare;
    }

    public CompanyReportYear setCreditShare(BigDecimal creditShare) {
        this.creditShare = creditShare;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setCreditShare(double creditShare) {
        return setCreditShare(BigDecimal.valueOf(creditShare));
    }

    /**
     * Por ciento de lo PPD ya cobrado (con complemento).
     */
    public BigDecimal getCollectedShare() {
        return collectedShare;
    }

    public CompanyReportYear setCollectedShare(BigDecimal collectedShare) {
        this.collectedShare = collectedShare;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setCollectedShare(double collectedShare) {
        return setCollectedShare(BigDecimal.valueOf(collectedShare));
    }

    /**
     * Días promedio (ponderados) de la factura al cobro.
     */
    public BigDecimal getDaysToCollect() {
        return daysToCollect;
    }

    public CompanyReportYear setDaysToCollect(BigDecimal daysToCollect) {
        this.daysToCollect = daysToCollect;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setDaysToCollect(double daysToCollect) {
        return setDaysToCollect(BigDecimal.valueOf(daysToCollect));
    }

    /**
     * Gastos recibidos sin impuestos, no cancelados.
     */
    public BigDecimal getExpenses() {
        return expenses;
    }

    public CompanyReportYear setExpenses(BigDecimal expenses) {
        this.expenses = expenses;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setExpenses(double expenses) {
        return setExpenses(BigDecimal.valueOf(expenses));
    }

    /**
     * Gastos recibidos y cancelados.
     */
    public BigDecimal getExpensesCanceled() {
        return expensesCanceled;
    }

    public CompanyReportYear setExpensesCanceled(BigDecimal expensesCanceled) {
        this.expensesCanceled = expensesCanceled;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setExpensesCanceled(double expensesCanceled) {
        return setExpensesCanceled(BigDecimal.valueOf(expensesCanceled));
    }

    /**
     * Por ciento de lo PPD ya pagado.
     */
    public BigDecimal getPaidShare() {
        return paidShare;
    }

    public CompanyReportYear setPaidShare(BigDecimal paidShare) {
        this.paidShare = paidShare;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setPaidShare(double paidShare) {
        return setPaidShare(BigDecimal.valueOf(paidShare));
    }

    /**
     * Días promedio de la factura al pago.
     */
    public BigDecimal getDaysToPay() {
        return daysToPay;
    }

    public CompanyReportYear setDaysToPay(BigDecimal daysToPay) {
        this.daysToPay = daysToPay;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setDaysToPay(double daysToPay) {
        return setDaysToPay(BigDecimal.valueOf(daysToPay));
    }

    /**
     * Nómina que timbró: lo que percibieron sus trabajadores, antes de deducciones.
     */
    public BigDecimal getPayrollPaid() {
        return payrollPaid;
    }

    public CompanyReportYear setPayrollPaid(BigDecimal payrollPaid) {
        this.payrollPaid = payrollPaid;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setPayrollPaid(double payrollPaid) {
        return setPayrollPaid(BigDecimal.valueOf(payrollPaid));
    }

    /**
     * Sueldos que recibió de sus patrones (recibos de nómina a su RFC), antes de deducciones: lo que gana una persona física asalariada.
     */
    public BigDecimal getPayrollReceived() {
        return payrollReceived;
    }

    public CompanyReportYear setPayrollReceived(BigDecimal payrollReceived) {
        this.payrollReceived = payrollReceived;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setPayrollReceived(double payrollReceived) {
        return setPayrollReceived(BigDecimal.valueOf(payrollReceived));
    }

    /**
     * Lo que de verdad recibió de esos sueldos: el total de los recibos, después del ISR retenido y las deducciones.
     */
    public BigDecimal getPayrollReceivedNet() {
        return payrollReceivedNet;
    }

    public CompanyReportYear setPayrollReceivedNet(BigDecimal payrollReceivedNet) {
        this.payrollReceivedNet = payrollReceivedNet;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setPayrollReceivedNet(double payrollReceivedNet) {
        return setPayrollReceivedNet(BigDecimal.valueOf(payrollReceivedNet));
    }

    /**
     * Ingresos menos gastos y nómina.
     */
    public BigDecimal getProfit() {
        return profit;
    }

    public CompanyReportYear setProfit(BigDecimal profit) {
        this.profit = profit;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setProfit(double profit) {
        return setProfit(BigDecimal.valueOf(profit));
    }

    /**
     * Lo que queda, por ciento de ingresos.
     */
    public BigDecimal getMargin() {
        return margin;
    }

    public CompanyReportYear setMargin(BigDecimal margin) {
        this.margin = margin;
        return this;
    }

    @JsonIgnore
    public CompanyReportYear setMargin(double margin) {
        return setMargin(BigDecimal.valueOf(margin));
    }
}
