// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComparativeStatementsIncomeStatement: El estado de resultados comparativo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatement {
    /**
     * Del mes contra el mes comparado.
     */
    @JsonProperty("month")
    private ComparativeStatementsIncomeStatementMonth month;

    /**
     * De enero al mes contra enero al mes comparado.
     */
    @JsonProperty("year_to_date")
    private ComparativeStatementsIncomeStatementYearToDate yearToDate;

    /**
     * Del mes contra el mes comparado.
     */
    public ComparativeStatementsIncomeStatementMonth getMonth() {
        return month;
    }

    public ComparativeStatementsIncomeStatement setMonth(ComparativeStatementsIncomeStatementMonth month) {
        this.month = month;
        return this;
    }

    /**
     * De enero al mes contra enero al mes comparado.
     */
    public ComparativeStatementsIncomeStatementYearToDate getYearToDate() {
        return yearToDate;
    }

    public ComparativeStatementsIncomeStatement setYearToDate(ComparativeStatementsIncomeStatementYearToDate yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }
}
