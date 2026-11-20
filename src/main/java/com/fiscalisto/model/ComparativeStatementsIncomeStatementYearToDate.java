// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatementsIncomeStatementYearToDate: De enero al mes contra enero al mes comparado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementYearToDate {
    /**
     * Cada sección del estado de resultados. Costos y gastos en positivo: un aumento es más gasto.
     */
    @JsonProperty("sections")
    private List<ComparativeStatementsIncomeStatementYearToDateSection> sections;

    /**
     * La utilidad antes de impuestos.
     */
    @JsonProperty("income_before_taxes")
    private ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes incomeBeforeTaxes;

    /**
     * Cada sección del estado de resultados. Costos y gastos en positivo: un aumento es más gasto.
     */
    public List<ComparativeStatementsIncomeStatementYearToDateSection> getSections() {
        return sections;
    }

    public ComparativeStatementsIncomeStatementYearToDate setSections(List<ComparativeStatementsIncomeStatementYearToDateSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * La utilidad antes de impuestos.
     */
    public ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes getIncomeBeforeTaxes() {
        return incomeBeforeTaxes;
    }

    public ComparativeStatementsIncomeStatementYearToDate setIncomeBeforeTaxes(ComparativeStatementsIncomeStatementYearToDateIncomeBeforeTaxes incomeBeforeTaxes) {
        this.incomeBeforeTaxes = incomeBeforeTaxes;
        return this;
    }
}
