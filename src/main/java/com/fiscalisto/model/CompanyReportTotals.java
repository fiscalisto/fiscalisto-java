// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportTotals: Totales del periodo, en pesos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportTotals {
    /**
     * Ingresos del periodo, netos de notas de crédito.
     */
    @JsonProperty("income")
    private BigDecimal income;

    /**
     * Gastos del periodo, netos de notas de crédito.
     */
    @JsonProperty("expenses")
    private BigDecimal expenses;

    /**
     * Lo que le deben sus clientes del periodo.
     */
    @JsonProperty("receivable")
    private BigDecimal receivable;

    /**
     * Lo que debe a sus proveedores del periodo.
     */
    @JsonProperty("payable")
    private BigDecimal payable;

    /**
     * Ingresos del periodo, netos de notas de crédito.
     */
    public BigDecimal getIncome() {
        return income;
    }

    public CompanyReportTotals setIncome(BigDecimal income) {
        this.income = income;
        return this;
    }

    @JsonIgnore
    public CompanyReportTotals setIncome(double income) {
        return setIncome(BigDecimal.valueOf(income));
    }

    /**
     * Gastos del periodo, netos de notas de crédito.
     */
    public BigDecimal getExpenses() {
        return expenses;
    }

    public CompanyReportTotals setExpenses(BigDecimal expenses) {
        this.expenses = expenses;
        return this;
    }

    @JsonIgnore
    public CompanyReportTotals setExpenses(double expenses) {
        return setExpenses(BigDecimal.valueOf(expenses));
    }

    /**
     * Lo que le deben sus clientes del periodo.
     */
    public BigDecimal getReceivable() {
        return receivable;
    }

    public CompanyReportTotals setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
        return this;
    }

    @JsonIgnore
    public CompanyReportTotals setReceivable(double receivable) {
        return setReceivable(BigDecimal.valueOf(receivable));
    }

    /**
     * Lo que debe a sus proveedores del periodo.
     */
    public BigDecimal getPayable() {
        return payable;
    }

    public CompanyReportTotals setPayable(BigDecimal payable) {
        this.payable = payable;
        return this;
    }

    @JsonIgnore
    public CompanyReportTotals setPayable(double payable) {
        return setPayable(BigDecimal.valueOf(payable));
    }
}
