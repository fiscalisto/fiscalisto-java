// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConsolidatedStatementsIncomeStatement: El estado de resultados consolidado: del mes y de enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsIncomeStatement {
    /**
     * El estado de resultados del mes.
     */
    @JsonProperty("month")
    private ConsolidatedStatementsIncomeStatementMonth month;

    /**
     * El estado de resultados de enero al mes.
     */
    @JsonProperty("year_to_date")
    private ConsolidatedStatementsIncomeStatementYearToDate yearToDate;

    /**
     * El estado de resultados del mes.
     */
    public ConsolidatedStatementsIncomeStatementMonth getMonth() {
        return month;
    }

    public ConsolidatedStatementsIncomeStatement setMonth(ConsolidatedStatementsIncomeStatementMonth month) {
        this.month = month;
        return this;
    }

    /**
     * El estado de resultados de enero al mes.
     */
    public ConsolidatedStatementsIncomeStatementYearToDate getYearToDate() {
        return yearToDate;
    }

    public ConsolidatedStatementsIncomeStatement setYearToDate(ConsolidatedStatementsIncomeStatementYearToDate yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }
}
