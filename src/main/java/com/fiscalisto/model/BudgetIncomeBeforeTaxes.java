// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BudgetIncomeBeforeTaxes: La utilidad antes de impuestos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetIncomeBeforeTaxes {
    /**
     * El mes.
     */
    @JsonProperty("month")
    private BudgetIncomeBeforeTaxesMonth month;

    /**
     * De enero al mes.
     */
    @JsonProperty("year_to_date")
    private BudgetIncomeBeforeTaxesYearToDate yearToDate;

    /**
     * Presupuestada en todo el año.
     */
    @JsonProperty("annual_budget")
    private BigDecimal annualBudget;

    /**
     * El mes.
     */
    public BudgetIncomeBeforeTaxesMonth getMonth() {
        return month;
    }

    public BudgetIncomeBeforeTaxes setMonth(BudgetIncomeBeforeTaxesMonth month) {
        this.month = month;
        return this;
    }

    /**
     * De enero al mes.
     */
    public BudgetIncomeBeforeTaxesYearToDate getYearToDate() {
        return yearToDate;
    }

    public BudgetIncomeBeforeTaxes setYearToDate(BudgetIncomeBeforeTaxesYearToDate yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }

    /**
     * Presupuestada en todo el año.
     */
    public BigDecimal getAnnualBudget() {
        return annualBudget;
    }

    public BudgetIncomeBeforeTaxes setAnnualBudget(BigDecimal annualBudget) {
        this.annualBudget = annualBudget;
        return this;
    }

    @JsonIgnore
    public BudgetIncomeBeforeTaxes setAnnualBudget(double annualBudget) {
        return setAnnualBudget(BigDecimal.valueOf(annualBudget));
    }
}
