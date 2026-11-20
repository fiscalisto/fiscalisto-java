// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ComparativeStatementsIncomeStatementMonthSectionLine: ComparativeStatementsIncomeStatementMonthSectionLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementMonthSectionLine {
    /**
     * El código agrupador (primer nivel).
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

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
     * El código agrupador (primer nivel).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El importe del periodo.
     */
    public BigDecimal getCurrent() {
        return current;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setCurrent(BigDecimal current) {
        this.current = current;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementMonthSectionLine setCurrent(double current) {
        return setCurrent(BigDecimal.valueOf(current));
    }

    /**
     * El del periodo con que se compara.
     */
    public BigDecimal getPrevious() {
        return previous;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setPrevious(BigDecimal previous) {
        this.previous = previous;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementMonthSectionLine setPrevious(double previous) {
        return setPrevious(BigDecimal.valueOf(previous));
    }

    /**
     * current − previous.
     */
    public BigDecimal getChange() {
        return change;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setChange(BigDecimal change) {
        this.change = change;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementMonthSectionLine setChange(double change) {
        return setChange(BigDecimal.valueOf(change));
    }

    /**
     * change entre previous, en porcentaje (null cuando previous es 0).
     */
    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public ComparativeStatementsIncomeStatementMonthSectionLine setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsIncomeStatementMonthSectionLine setChangePercent(double changePercent) {
        return setChangePercent(BigDecimal.valueOf(changePercent));
    }
}
