// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * FinancialStatementsIncomeStatementYearToDateSection: FinancialStatementsIncomeStatementYearToDateSection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatementYearToDateSection {
    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Valores: ingresos, costos, gastos, financiamiento, otros.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Su monto por el primer nivel del código agrupador.
     */
    @JsonProperty("groups")
    private List<FinancialStatementsIncomeStatementYearToDateSectionGroup> groups;

    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Valores: ingresos, costos, gastos, financiamiento, otros.
     */
    public String getKey() {
        return key;
    }

    public FinancialStatementsIncomeStatementYearToDateSection setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FinancialStatementsIncomeStatementYearToDateSection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public FinancialStatementsIncomeStatementYearToDateSection setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsIncomeStatementYearToDateSection setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Su monto por el primer nivel del código agrupador.
     */
    public List<FinancialStatementsIncomeStatementYearToDateSectionGroup> getGroups() {
        return groups;
    }

    public FinancialStatementsIncomeStatementYearToDateSection setGroups(List<FinancialStatementsIncomeStatementYearToDateSectionGroup> groups) {
        this.groups = groups;
        return this;
    }
}
