// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashFlowFinancingLine: CashFlowFinancingLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowFinancingLine {
    /**
     * El código agrupador del SAT (su primer nivel, o 202.01 a 202.12).
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su nombre en el código agrupador.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo que su cambio sumó al efectivo (positivo) o le quitó (negativo).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El código agrupador del SAT (su primer nivel, o 202.01 a 202.12).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public CashFlowFinancingLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su nombre en el código agrupador.
     */
    public String getName() {
        return name;
    }

    public CashFlowFinancingLine setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo que su cambio sumó al efectivo (positivo) o le quitó (negativo).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CashFlowFinancingLine setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CashFlowFinancingLine setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
