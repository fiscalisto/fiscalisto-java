// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BudgetComparisonItemYearToDate: De enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetComparisonItemYearToDate {
    /**
     * De enero al mes: lo presupuestado.
     */
    @JsonProperty("budget")
    private BigDecimal budget;

    /**
     * De enero al mes: lo real, de sus pólizas.
     */
    @JsonProperty("actual")
    private BigDecimal actual;

    /**
     * Real menos presupuesto.
     */
    @JsonProperty("variance")
    private BigDecimal variance;

    /**
     * La variación como porcentaje del presupuesto (null sin presupuesto).
     */
    @JsonProperty("variance_percent")
    private BigDecimal variancePercent;

    /**
     * true si lo real deja al menos la utilidad presupuestada: más ingresos o menos gastos.
     */
    @JsonProperty("favorable")
    private Boolean favorable;

    /**
     * De enero al mes: lo presupuestado.
     */
    public BigDecimal getBudget() {
        return budget;
    }

    public BudgetComparisonItemYearToDate setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemYearToDate setBudget(double budget) {
        return setBudget(BigDecimal.valueOf(budget));
    }

    /**
     * De enero al mes: lo real, de sus pólizas.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public BudgetComparisonItemYearToDate setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemYearToDate setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }

    /**
     * Real menos presupuesto.
     */
    public BigDecimal getVariance() {
        return variance;
    }

    public BudgetComparisonItemYearToDate setVariance(BigDecimal variance) {
        this.variance = variance;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemYearToDate setVariance(double variance) {
        return setVariance(BigDecimal.valueOf(variance));
    }

    /**
     * La variación como porcentaje del presupuesto (null sin presupuesto).
     */
    public BigDecimal getVariancePercent() {
        return variancePercent;
    }

    public BudgetComparisonItemYearToDate setVariancePercent(BigDecimal variancePercent) {
        this.variancePercent = variancePercent;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemYearToDate setVariancePercent(double variancePercent) {
        return setVariancePercent(BigDecimal.valueOf(variancePercent));
    }

    /**
     * true si lo real deja al menos la utilidad presupuestada: más ingresos o menos gastos.
     */
    public Boolean getFavorable() {
        return favorable;
    }

    public BudgetComparisonItemYearToDate setFavorable(Boolean favorable) {
        this.favorable = favorable;
        return this;
    }
}
