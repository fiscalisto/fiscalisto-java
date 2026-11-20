// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatementsIncomeStatementYearToDateSection: ComparativeStatementsIncomeStatementYearToDateSection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsIncomeStatementYearToDateSection {
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
    private List<ComparativeStatementsIncomeStatementYearToDateSectionLine> lines;

    /**
     * El total de la sección.
     */
    @JsonProperty("total")
    private ComparativeStatementsIncomeStatementYearToDateSectionTotal total;

    /**
     * La sección.
     * <p>
     * Valores: ingresos, costos, gastos, financiamiento, otros.
     */
    public String getKey() {
        return key;
    }

    public ComparativeStatementsIncomeStatementYearToDateSection setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ComparativeStatementsIncomeStatementYearToDateSection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cada grupo de cuentas.
     */
    public List<ComparativeStatementsIncomeStatementYearToDateSectionLine> getLines() {
        return lines;
    }

    public ComparativeStatementsIncomeStatementYearToDateSection setLines(List<ComparativeStatementsIncomeStatementYearToDateSectionLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * El total de la sección.
     */
    public ComparativeStatementsIncomeStatementYearToDateSectionTotal getTotal() {
        return total;
    }

    public ComparativeStatementsIncomeStatementYearToDateSection setTotal(ComparativeStatementsIncomeStatementYearToDateSectionTotal total) {
        this.total = total;
        return this;
    }
}
