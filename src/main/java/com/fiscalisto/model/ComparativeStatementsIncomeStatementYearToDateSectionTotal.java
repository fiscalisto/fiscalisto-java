// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ComparativeStatementsIncomeStatementYearToDateSectionTotal: El total de la sección.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementYearToDateSectionTotal {
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

    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setCurrent(BigDecimal current) {
        this.current = current;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setCurrent(double current) {
        return setCurrent(BigDecimal.valueOf(current));
    }

    /**
     * El del periodo con que se compara.
     */
    public BigDecimal getPrevious() {
        return previous;
    }

    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setPrevious(BigDecimal previous) {
        this.previous = previous;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setPrevious(double previous) {
        return setPrevious(BigDecimal.valueOf(previous));
    }

    /**
     * current − previous.
     */
    public BigDecimal getChange() {
        return change;
    }

    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setChange(BigDecimal change) {
        this.change = change;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setChange(double change) {
        return setChange(BigDecimal.valueOf(change));
    }

    /**
     * change entre previous, en porcentaje (null cuando previous es 0).
     */
    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementYearToDateSectionTotal setChangePercent(double changePercent) {
        return setChangePercent(BigDecimal.valueOf(changePercent));
    }
}
