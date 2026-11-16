// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * CashForecastWeek: CashForecastWeek.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastWeek {
    /**
     * 1 a 13; la 1 va de hoy al domingo.
     */
    @JsonProperty("week")
    private Long week;

    /**
     * El primer día (AAAA-MM-DD).
     */
    @JsonProperty("start")
    private String start;

    /**
     * El último día, un domingo.
     */
    @JsonProperty("end")
    private String end;

    /**
     * El saldo al empezar la semana.
     */
    @JsonProperty("starting_balance")
    private BigDecimal startingBalance;

    /**
     * Lo que entra.
     */
    @JsonProperty("inflows")
    private BigDecimal inflows;

    /**
     * Lo que sale.
     */
    @JsonProperty("outflows")
    private BigDecimal outflows;

    /**
     * El saldo al cerrar la semana.
     */
    @JsonProperty("ending_balance")
    private BigDecimal endingBalance;

    /**
     * Lo de cada tipo de renglón (lines[].type) esa semana, en pesos.
     */
    @JsonProperty("by_type")
    private Map<String, Object> byType;

    /**
     * 1 a 13; la 1 va de hoy al domingo.
     */
    public Long getWeek() {
        return week;
    }

    public CashForecastWeek setWeek(Long week) {
        this.week = week;
        return this;
    }

    @JsonIgnore
    public CashForecastWeek setWeek(long week) {
        return setWeek(Long.valueOf(week));
    }

    /**
     * El primer día (AAAA-MM-DD).
     */
    public String getStart() {
        return start;
    }

    public CashForecastWeek setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * El último día, un domingo.
     */
    public String getEnd() {
        return end;
    }

    public CashForecastWeek setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * El saldo al empezar la semana.
     */
    public BigDecimal getStartingBalance() {
        return startingBalance;
    }

    public CashForecastWeek setStartingBalance(BigDecimal startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }

    @JsonIgnore
    public CashForecastWeek setStartingBalance(double startingBalance) {
        return setStartingBalance(BigDecimal.valueOf(startingBalance));
    }

    /**
     * Lo que entra.
     */
    public BigDecimal getInflows() {
        return inflows;
    }

    public CashForecastWeek setInflows(BigDecimal inflows) {
        this.inflows = inflows;
        return this;
    }

    @JsonIgnore
    public CashForecastWeek setInflows(double inflows) {
        return setInflows(BigDecimal.valueOf(inflows));
    }

    /**
     * Lo que sale.
     */
    public BigDecimal getOutflows() {
        return outflows;
    }

    public CashForecastWeek setOutflows(BigDecimal outflows) {
        this.outflows = outflows;
        return this;
    }

    @JsonIgnore
    public CashForecastWeek setOutflows(double outflows) {
        return setOutflows(BigDecimal.valueOf(outflows));
    }

    /**
     * El saldo al cerrar la semana.
     */
    public BigDecimal getEndingBalance() {
        return endingBalance;
    }

    public CashForecastWeek setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
        return this;
    }

    @JsonIgnore
    public CashForecastWeek setEndingBalance(double endingBalance) {
        return setEndingBalance(BigDecimal.valueOf(endingBalance));
    }

    /**
     * Lo de cada tipo de renglón (lines[].type) esa semana, en pesos.
     */
    public Map<String, Object> getByType() {
        return byType;
    }

    public CashForecastWeek setByType(Map<String, Object> byType) {
        this.byType = byType;
        return this;
    }
}
