// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastTotals: Las 13 semanas juntas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastTotals {
    /**
     * Lo que entra en las 13 semanas.
     */
    @JsonProperty("inflows")
    private BigDecimal inflows;

    /**
     * Lo que sale en las 13 semanas.
     */
    @JsonProperty("outflows")
    private BigDecimal outflows;

    /**
     * El saldo al final de la semana 13.
     */
    @JsonProperty("ending_balance")
    private BigDecimal endingBalance;

    /**
     * El saldo más bajo al cierre de una semana.
     */
    @JsonProperty("lowest_balance")
    private BigDecimal lowestBalance;

    /**
     * La semana de ese saldo (1 a 13).
     */
    @JsonProperty("lowest_week")
    private Long lowestWeek;

    /**
     * Cuántas semanas cierran debajo de minimum_balance (o de 0).
     */
    @JsonProperty("weeks_below_minimum")
    private Long weeksBelowMinimum;

    /**
     * Lo que se dejó fuera por llevar más de 90 días de atraso.
     */
    @JsonProperty("doubtful_left_out")
    private BigDecimal doubtfulLeftOut;

    /**
     * Lo que entra en las 13 semanas.
     */
    public BigDecimal getInflows() {
        return inflows;
    }

    public CashForecastTotals setInflows(BigDecimal inflows) {
        this.inflows = inflows;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setInflows(double inflows) {
        return setInflows(BigDecimal.valueOf(inflows));
    }

    /**
     * Lo que sale en las 13 semanas.
     */
    public BigDecimal getOutflows() {
        return outflows;
    }

    public CashForecastTotals setOutflows(BigDecimal outflows) {
        this.outflows = outflows;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setOutflows(double outflows) {
        return setOutflows(BigDecimal.valueOf(outflows));
    }

    /**
     * El saldo al final de la semana 13.
     */
    public BigDecimal getEndingBalance() {
        return endingBalance;
    }

    public CashForecastTotals setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setEndingBalance(double endingBalance) {
        return setEndingBalance(BigDecimal.valueOf(endingBalance));
    }

    /**
     * El saldo más bajo al cierre de una semana.
     */
    public BigDecimal getLowestBalance() {
        return lowestBalance;
    }

    public CashForecastTotals setLowestBalance(BigDecimal lowestBalance) {
        this.lowestBalance = lowestBalance;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setLowestBalance(double lowestBalance) {
        return setLowestBalance(BigDecimal.valueOf(lowestBalance));
    }

    /**
     * La semana de ese saldo (1 a 13).
     */
    public Long getLowestWeek() {
        return lowestWeek;
    }

    public CashForecastTotals setLowestWeek(Long lowestWeek) {
        this.lowestWeek = lowestWeek;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setLowestWeek(long lowestWeek) {
        return setLowestWeek(Long.valueOf(lowestWeek));
    }

    /**
     * Cuántas semanas cierran debajo de minimum_balance (o de 0).
     */
    public Long getWeeksBelowMinimum() {
        return weeksBelowMinimum;
    }

    public CashForecastTotals setWeeksBelowMinimum(Long weeksBelowMinimum) {
        this.weeksBelowMinimum = weeksBelowMinimum;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setWeeksBelowMinimum(long weeksBelowMinimum) {
        return setWeeksBelowMinimum(Long.valueOf(weeksBelowMinimum));
    }

    /**
     * Lo que se dejó fuera por llevar más de 90 días de atraso.
     */
    public BigDecimal getDoubtfulLeftOut() {
        return doubtfulLeftOut;
    }

    public CashForecastTotals setDoubtfulLeftOut(BigDecimal doubtfulLeftOut) {
        this.doubtfulLeftOut = doubtfulLeftOut;
        return this;
    }

    @JsonIgnore
    public CashForecastTotals setDoubtfulLeftOut(double doubtfulLeftOut) {
        return setDoubtfulLeftOut(BigDecimal.valueOf(doubtfulLeftOut));
    }
}
