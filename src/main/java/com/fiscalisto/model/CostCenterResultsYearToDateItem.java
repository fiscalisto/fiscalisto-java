// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CostCenterResultsYearToDateItem: CostCenterResultsYearToDateItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostCenterResultsYearToDateItem {
    /**
     * El centro de costo (ccn_…), o null: lo que no tiene centro.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Su nombre.
     */
    @JsonProperty("cost_center_name")
    private String costCenterName;

    /**
     * Ingresos.
     */
    @JsonProperty("revenue")
    private BigDecimal revenue;

    /**
     * Costo de ventas, en negativo.
     */
    @JsonProperty("cost_of_sales")
    private BigDecimal costOfSales;

    /**
     * Gastos de operación, en negativo.
     */
    @JsonProperty("operating_expenses")
    private BigDecimal operatingExpenses;

    /**
     * Resultado integral de financiamiento.
     */
    @JsonProperty("financing")
    private BigDecimal financing;

    /**
     * Otros ingresos y gastos.
     */
    @JsonProperty("other")
    private BigDecimal other;

    /**
     * Utilidad (o pérdida) antes de impuestos.
     */
    @JsonProperty("income_before_taxes")
    private BigDecimal incomeBeforeTaxes;

    /**
     * Utilidad entre ingresos, en porcentaje (null sin ingresos).
     */
    @JsonProperty("margin_percent")
    private BigDecimal marginPercent;

    /**
     * El centro de costo (ccn_…), o null: lo que no tiene centro.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public CostCenterResultsYearToDateItem setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getCostCenterName() {
        return costCenterName;
    }

    public CostCenterResultsYearToDateItem setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
        return this;
    }

    /**
     * Ingresos.
     */
    public BigDecimal getRevenue() {
        return revenue;
    }

    public CostCenterResultsYearToDateItem setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setRevenue(double revenue) {
        return setRevenue(BigDecimal.valueOf(revenue));
    }

    /**
     * Costo de ventas, en negativo.
     */
    public BigDecimal getCostOfSales() {
        return costOfSales;
    }

    public CostCenterResultsYearToDateItem setCostOfSales(BigDecimal costOfSales) {
        this.costOfSales = costOfSales;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setCostOfSales(double costOfSales) {
        return setCostOfSales(BigDecimal.valueOf(costOfSales));
    }

    /**
     * Gastos de operación, en negativo.
     */
    public BigDecimal getOperatingExpenses() {
        return operatingExpenses;
    }

    public CostCenterResultsYearToDateItem setOperatingExpenses(BigDecimal operatingExpenses) {
        this.operatingExpenses = operatingExpenses;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setOperatingExpenses(double operatingExpenses) {
        return setOperatingExpenses(BigDecimal.valueOf(operatingExpenses));
    }

    /**
     * Resultado integral de financiamiento.
     */
    public BigDecimal getFinancing() {
        return financing;
    }

    public CostCenterResultsYearToDateItem setFinancing(BigDecimal financing) {
        this.financing = financing;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setFinancing(double financing) {
        return setFinancing(BigDecimal.valueOf(financing));
    }

    /**
     * Otros ingresos y gastos.
     */
    public BigDecimal getOther() {
        return other;
    }

    public CostCenterResultsYearToDateItem setOther(BigDecimal other) {
        this.other = other;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setOther(double other) {
        return setOther(BigDecimal.valueOf(other));
    }

    /**
     * Utilidad (o pérdida) antes de impuestos.
     */
    public BigDecimal getIncomeBeforeTaxes() {
        return incomeBeforeTaxes;
    }

    public CostCenterResultsYearToDateItem setIncomeBeforeTaxes(BigDecimal incomeBeforeTaxes) {
        this.incomeBeforeTaxes = incomeBeforeTaxes;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setIncomeBeforeTaxes(double incomeBeforeTaxes) {
        return setIncomeBeforeTaxes(BigDecimal.valueOf(incomeBeforeTaxes));
    }

    /**
     * Utilidad entre ingresos, en porcentaje (null sin ingresos).
     */
    public BigDecimal getMarginPercent() {
        return marginPercent;
    }

    public CostCenterResultsYearToDateItem setMarginPercent(BigDecimal marginPercent) {
        this.marginPercent = marginPercent;
        return this;
    }

    @JsonIgnore
    public CostCenterResultsYearToDateItem setMarginPercent(double marginPercent) {
        return setMarginPercent(BigDecimal.valueOf(marginPercent));
    }
}
