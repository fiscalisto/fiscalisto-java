// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * FinancialStatementsIncomeStatementMonth: El estado de resultados del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatementMonth {
    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    @JsonProperty("sections")
    private List<FinancialStatementsIncomeStatementMonthSection> sections;

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos del mes.
     */
    @JsonProperty("net_income")
    private BigDecimal netIncome;

    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    public List<FinancialStatementsIncomeStatementMonthSection> getSections() {
        return sections;
    }

    public FinancialStatementsIncomeStatementMonth setSections(List<FinancialStatementsIncomeStatementMonthSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos del mes.
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public FinancialStatementsIncomeStatementMonth setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsIncomeStatementMonth setNetIncome(double netIncome) {
        return setNetIncome(BigDecimal.valueOf(netIncome));
    }
}
