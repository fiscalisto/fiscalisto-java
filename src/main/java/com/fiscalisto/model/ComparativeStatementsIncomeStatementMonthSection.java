// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatementsIncomeStatementMonthSection: ComparativeStatementsIncomeStatementMonthSection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementMonthSection {
    /**
     * La sección.
     * <p>
     * Valores: ingresos, costos, gastos, financiamiento, otros.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cada grupo de cuentas.
     */
    @JsonProperty("lines")
    private List<ComparativeStatementsIncomeStatementMonthSectionLine> lines;

    /**
     * El total de la sección.
     */
    @JsonProperty("total")
    private ComparativeStatementsIncomeStatementMonthSectionTotal total;

    /**
     * La sección.
     * <p>
     * Valores: ingresos, costos, gastos, financiamiento, otros.
     */
    public String getKey() {
        return key;
    }

    public ComparativeStatementsIncomeStatementMonthSection setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ComparativeStatementsIncomeStatementMonthSection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cada grupo de cuentas.
     */
    public List<ComparativeStatementsIncomeStatementMonthSectionLine> getLines() {
        return lines;
    }

    public ComparativeStatementsIncomeStatementMonthSection setLines(List<ComparativeStatementsIncomeStatementMonthSectionLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * El total de la sección.
     */
    public ComparativeStatementsIncomeStatementMonthSectionTotal getTotal() {
        return total;
    }

    public ComparativeStatementsIncomeStatementMonthSection setTotal(ComparativeStatementsIncomeStatementMonthSectionTotal total) {
        this.total = total;
        return this;
    }
}
