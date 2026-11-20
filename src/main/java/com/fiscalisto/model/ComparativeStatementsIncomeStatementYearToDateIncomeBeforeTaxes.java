// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes: La utilidad antes de impuestos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes {
    /**
     * El importe del periodo.
     */
    @JsonProperty("current")
    private BigDecimal current;

    /**
     * El del periodo con que se compara.
     */
    @JsonProperty("previous")
    private BigDecimal previous;

    /**
     * current − previous.
     */
    @JsonProperty("change")
    private BigDecimal change;

    /**
     * change entre previous, en porcentaje (null cuando previous es 0).
     */
    @JsonProperty("change_percent")
    private BigDecimal changePercent;

    /**
     * El importe del periodo.
     */
    public BigDecimal getCurrent() {
        return current;
    }

    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setCurrent(BigDecimal current) {
        this.current = current;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setCurrent(double current) {
        return setCurrent(BigDecimal.valueOf(current));
    }

    /**
     * El del periodo con que se compara.
     */
    public BigDecimal getPrevious() {
        return previous;
    }

    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setPrevious(BigDecimal previous) {
        this.previous = previous;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setPrevious(double previous) {
        return setPrevious(BigDecimal.valueOf(previous));
    }

    /**
     * current − previous.
     */
    public BigDecimal getChange() {
        return change;
    }

    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setChange(BigDecimal change) {
        this.change = change;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setChange(double change) {
        return setChange(BigDecimal.valueOf(change));
    }

    /**
     * change entre previous, en porcentaje (null cuando previous es 0).
     */
    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes setChangePercent(double changePercent) {
        return setChangePercent(BigDecimal.valueOf(changePercent));
    }
}
