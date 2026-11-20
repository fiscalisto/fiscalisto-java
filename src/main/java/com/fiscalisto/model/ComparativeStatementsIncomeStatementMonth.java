// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatementsIncomeStatementMonth: Del mes contra el mes comparado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementMonth {
    /**
     * Cada sección del estado de resultados. Costos y gastos en positivo: un aumento es más gasto.
     */
    @JsonProperty("sections")
    private List<ComparativeStatementsIncomeStatementMonthSection> sections;

    /**
     * La utilidad antes de impuestos.
     */
    @JsonProperty("income_before_taxes")
    private ComparativeStatementsIncomeStatementMonthIncomeBeforeTaxes incomeBeforeTaxes;

    /**
     * Cada sección del estado de resultados. Costos y gastos en positivo: un aumento es más gasto.
     */
    public List<ComparativeStatementsIncomeStatementMonthSection> getSections() {
        return sections;
    }

    public ComparativeStatementsIncomeStatementMonth setSections(List<ComparativeStatementsIncomeStatementMonthSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * La utilidad antes de impuestos.
     */
    public ComparativeStatementsIncomeStatementMonthIncomeBeforeTaxes getIncomeBeforeTaxes() {
        return incomeBeforeTaxes;
    }

    public ComparativeStatementsIncomeStatementMonth setIncomeBeforeTaxes(ComparativeStatementsIncomeStatementMonthIncomeBeforeTaxes incomeBeforeTaxes) {
        this.incomeBeforeTaxes = incomeBeforeTaxes;
        return this;
    }
}
