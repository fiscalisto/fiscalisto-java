// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ConsolidatedStatementsIncomeStatementMonth: El estado de resultados del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsIncomeStatementMonth {
    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    @JsonProperty("sections")
    private List<ConsolidatedStatementsIncomeStatementMonthSection> sections;

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos del mes.
     */
    @JsonProperty("net_income")
    private BigDecimal netIncome;

    /**
     * Ingresos, costos, gastos, financiamiento y otros, cada uno con su total.
     */
    public List<ConsolidatedStatementsIncomeStatementMonthSection> getSections() {
        return sections;
    }

    public ConsolidatedStatementsIncomeStatementMonth setSections(List<ConsolidatedStatementsIncomeStatementMonthSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * La utilidad (o pérdida, negativa) antes de impuestos del mes.
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public ConsolidatedStatementsIncomeStatementMonth setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsIncomeStatementMonth setNetIncome(double netIncome) {
        return setNetIncome(BigDecimal.valueOf(netIncome));
    }
}
