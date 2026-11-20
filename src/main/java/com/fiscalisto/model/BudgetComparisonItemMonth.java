// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BudgetComparisonItemMonth: El mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetComparisonItemMonth {
    /**
     * El mes: lo presupuestado.
     */
    @JsonProperty("budget")
    private BigDecimal budget;

    /**
     * El mes: lo real, de sus pólizas.
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
     * El mes: lo presupuestado.
     */
    public BigDecimal getBudget() {
        return budget;
    }

    public BudgetComparisonItemMonth setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemMonth setBudget(double budget) {
        return setBudget(BigDecimal.valueOf(budget));
    }

    /**
     * El mes: lo real, de sus pólizas.
     */
    public BigDecimal getActual() {
        return actual;
    }

    public BudgetComparisonItemMonth setActual(BigDecimal actual) {
        this.actual = actual;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemMonth setActual(double actual) {
        return setActual(BigDecimal.valueOf(actual));
    }

    /**
     * Real menos presupuesto.
     */
    public BigDecimal getVariance() {
        return variance;
    }

    public BudgetComparisonItemMonth setVariance(BigDecimal variance) {
        this.variance = variance;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemMonth setVariance(double variance) {
        return setVariance(BigDecimal.valueOf(variance));
    }

    /**
     * La variación como porcentaje del presupuesto (null sin presupuesto).
     */
    public BigDecimal getVariancePercent() {
        return variancePercent;
    }

    public BudgetComparisonItemMonth setVariancePercent(BigDecimal variancePercent) {
        this.variancePercent = variancePercent;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItemMonth setVariancePercent(double variancePercent) {
        return setVariancePercent(BigDecimal.valueOf(variancePercent));
    }

    /**
     * true si lo real deja al menos la utilidad presupuestada: más ingresos o menos gastos.
     */
    public Boolean getFavorable() {
        return favorable;
    }

    public BudgetComparisonItemMonth setFavorable(Boolean favorable) {
        this.favorable = favorable;
        return this;
    }
}
