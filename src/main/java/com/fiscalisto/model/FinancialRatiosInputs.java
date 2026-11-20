// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FinancialRatiosInputs: Las cifras de que salen.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialRatiosInputs {
    /**
     * Activo circulante (101 a 121).
     */
    @JsonProperty("current_assets")
    private BigDecimal currentAssets;

    /**
     * Pasivo a corto plazo (201 a 218).
     */
    @JsonProperty("current_liabilities")
    private BigDecimal currentLiabilities;

    /**
     * Inventario (115, menos su estimación 116).
     */
    @JsonProperty("inventory")
    private BigDecimal inventory;

    /**
     * Clientes (105, menos incobrables 108).
     */
    @JsonProperty("receivables")
    private BigDecimal receivables;

    /**
     * Proveedores (201).
     */
    @JsonProperty("payables")
    private BigDecimal payables;

    /**
     * Activo total.
     */
    @JsonProperty("total_assets")
    private BigDecimal totalAssets;

    /**
     * Pasivo total.
     */
    @JsonProperty("total_liabilities")
    private BigDecimal totalLiabilities;

    /**
     * Capital contable con el resultado del ejercicio.
     */
    @JsonProperty("equity")
    private BigDecimal equity;

    /**
     * Ingresos de enero al mes.
     */
    @JsonProperty("revenue_year_to_date")
    private BigDecimal revenueYearToDate;

    /**
     * Utilidad antes de impuestos de enero al mes.
     */
    @JsonProperty("income_before_taxes_year_to_date")
    private BigDecimal incomeBeforeTaxesYearToDate;

    /**
     * Activo circulante (101 a 121).
     */
    public BigDecimal getCurrentAssets() {
        return currentAssets;
    }

    public FinancialRatiosInputs setCurrentAssets(BigDecimal currentAssets) {
        this.currentAssets = currentAssets;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setCurrentAssets(double currentAssets) {
        return setCurrentAssets(BigDecimal.valueOf(currentAssets));
    }

    /**
     * Pasivo a corto plazo (201 a 218).
     */
    public BigDecimal getCurrentLiabilities() {
        return currentLiabilities;
    }

    public FinancialRatiosInputs setCurrentLiabilities(BigDecimal currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setCurrentLiabilities(double currentLiabilities) {
        return setCurrentLiabilities(BigDecimal.valueOf(currentLiabilities));
    }

    /**
     * Inventario (115, menos su estimación 116).
     */
    public BigDecimal getInventory() {
        return inventory;
    }

    public FinancialRatiosInputs setInventory(BigDecimal inventory) {
        this.inventory = inventory;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setInventory(double inventory) {
        return setInventory(BigDecimal.valueOf(inventory));
    }

    /**
     * Clientes (105, menos incobrables 108).
     */
    public BigDecimal getReceivables() {
        return receivables;
    }

    public FinancialRatiosInputs setReceivables(BigDecimal receivables) {
        this.receivables = receivables;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setReceivables(double receivables) {
        return setReceivables(BigDecimal.valueOf(receivables));
    }

    /**
     * Proveedores (201).
     */
    public BigDecimal getPayables() {
        return payables;
    }

    public FinancialRatiosInputs setPayables(BigDecimal payables) {
        this.payables = payables;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setPayables(double payables) {
        return setPayables(BigDecimal.valueOf(payables));
    }

    /**
     * Activo total.
     */
    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    public FinancialRatiosInputs setTotalAssets(BigDecimal totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setTotalAssets(double totalAssets) {
        return setTotalAssets(BigDecimal.valueOf(totalAssets));
    }

    /**
     * Pasivo total.
     */
    public BigDecimal getTotalLiabilities() {
        return totalLiabilities;
    }

    public FinancialRatiosInputs setTotalLiabilities(BigDecimal totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setTotalLiabilities(double totalLiabilities) {
        return setTotalLiabilities(BigDecimal.valueOf(totalLiabilities));
    }

    /**
     * Capital contable con el resultado del ejercicio.
     */
    public BigDecimal getEquity() {
        return equity;
    }

    public FinancialRatiosInputs setEquity(BigDecimal equity) {
        this.equity = equity;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setEquity(double equity) {
        return setEquity(BigDecimal.valueOf(equity));
    }

    /**
     * Ingresos de enero al mes.
     */
    public BigDecimal getRevenueYearToDate() {
        return revenueYearToDate;
    }

    public FinancialRatiosInputs setRevenueYearToDate(BigDecimal revenueYearToDate) {
        this.revenueYearToDate = revenueYearToDate;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setRevenueYearToDate(double revenueYearToDate) {
        return setRevenueYearToDate(BigDecimal.valueOf(revenueYearToDate));
    }

    /**
     * Utilidad antes de impuestos de enero al mes.
     */
    public BigDecimal getIncomeBeforeTaxesYearToDate() {
        return incomeBeforeTaxesYearToDate;
    }

    public FinancialRatiosInputs setIncomeBeforeTaxesYearToDate(BigDecimal incomeBeforeTaxesYearToDate) {
        this.incomeBeforeTaxesYearToDate = incomeBeforeTaxesYearToDate;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosInputs setIncomeBeforeTaxesYearToDate(double incomeBeforeTaxesYearToDate) {
        return setIncomeBeforeTaxesYearToDate(BigDecimal.valueOf(incomeBeforeTaxesYearToDate));
    }
}
