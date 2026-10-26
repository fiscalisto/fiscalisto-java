// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * FinancialStatementsIncomeStatementYearToDate: El estado de resultados de enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatementYearToDate {
    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    @JsonProperty("sections")
    private List<FinancialStatementsIncomeStatementYearToDateSection> sections;

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos de enero al mes.
     */
    @JsonProperty("net_income")
    private BigDecimal netIncome;

    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    public List<FinancialStatementsIncomeStatementYearToDateSection> getSections() {
        return sections;
    }

    public FinancialStatementsIncomeStatementYearToDate setSections(List<FinancialStatementsIncomeStatementYearToDateSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos de enero al mes.
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public FinancialStatementsIncomeStatementYearToDate setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsIncomeStatementYearToDate setNetIncome(double netIncome) {
        return setNetIncome(BigDecimal.valueOf(netIncome));
    }
}
