// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ComparativeStatementsBalanceSheetItemTotal: El total de la sección.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsBalanceSheetItemTotal {
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

    public ComparativeStatementsBalanceSheetItemTotal setCurrent(BigDecimal current) {
        this.current = current;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsBalanceSheetItemTotal setCurrent(double current) {
        return setCurrent(BigDecimal.valueOf(current));
    }

    /**
     * El del periodo con que se compara.
     */
    public BigDecimal getPrevious() {
        return previous;
    }

    public ComparativeStatementsBalanceSheetItemTotal setPrevious(BigDecimal previous) {
        this.previous = previous;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsBalanceSheetItemTotal setPrevious(double previous) {
        return setPrevious(BigDecimal.valueOf(previous));
    }

    /**
     * current − previous.
     */
    public BigDecimal getChange() {
        return change;
    }

    public ComparativeStatementsBalanceSheetItemTotal setChange(BigDecimal change) {
        this.change = change;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsBalanceSheetItemTotal setChange(double change) {
        return setChange(BigDecimal.valueOf(change));
    }

    /**
     * change entre previous, en porcentaje (null cuando previous es 0).
     */
    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public ComparativeStatementsBalanceSheetItemTotal setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
        return this;
    }

    @JsonIgnore
    public ComparativeStatementsBalanceSheetItemTotal setChangePercent(double changePercent) {
        return setChangePercent(BigDecimal.valueOf(changePercent));
    }
}
