// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FinancialStatementsIncomeStatement: El estado de resultados del mes (month) y del año hasta ese mes (year_to_date). Cada sección suma en positivo lo que aumenta la utilidad (ingresos) y en negativo lo que la reduce (costos y gastos).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatement {
    /**
     * El estado de resultados del mes.
     */
    @JsonProperty("month")
    private FinancialStatementsIncomeStatementMonth month;

    /**
     * El estado de resultados de enero al mes.
     */
    @JsonProperty("year_to_date")
    private FinancialStatementsIncomeStatementYearToDate yearToDate;

    /**
     * El estado de resultados del mes.
     */
    public FinancialStatementsIncomeStatementMonth getMonth() {
        return month;
    }

    public FinancialStatementsIncomeStatement setMonth(FinancialStatementsIncomeStatementMonth month) {
        this.month = month;
        return this;
    }

    /**
     * El estado de resultados de enero al mes.
     */
    public FinancialStatementsIncomeStatementYearToDate getYearToDate() {
        return yearToDate;
    }

    public FinancialStatementsIncomeStatement setYearToDate(FinancialStatementsIncomeStatementYearToDate yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }
}
