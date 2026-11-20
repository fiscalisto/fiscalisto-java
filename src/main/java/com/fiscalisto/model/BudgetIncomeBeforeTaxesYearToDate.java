// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BudgetIncomeBeforeTaxesYearToDate: De enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetIncomeBeforeTaxesYearToDate {
    /**
     * Presupuestada.
     */
    @JsonProperty("budget")
    private BigDecimal budget;

    /**
     * Real.
     */
    @JsonProperty("actual")
    private BigDecimal actual;

    /**
     * Presupuestada.
     */
    public BigDecimal getBudget() {
        return budget;
    }

    public BudgetIncomeBeforeTaxesYearToDate setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }

    @JsonIgnore
    public BudgetIncomeBeforeTaxesYearToDate setBudget(double budget) {
        return setBudget(BigDecimal.valueOf(budget));
    }

    /**
     * Real.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public BudgetIncomeBeforeTaxesYearToDate setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public BudgetIncomeBeforeTaxesYearToDate setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }
}
