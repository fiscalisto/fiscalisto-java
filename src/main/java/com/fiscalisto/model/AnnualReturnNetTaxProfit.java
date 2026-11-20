// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnNetTaxProfit: La utilidad fiscal neta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnNetTaxProfit {
    /**
     * Las partidas no deducibles que restan.
     */
    @JsonProperty("non_deductibles")
    private BigDecimal nonDeductibles;

    /**
     * dividend_tax_credited entre 0.4286, que resta de la utilidad fiscal neta (artículo 10, fracción II).
     */
    @JsonProperty("dividend_tax_reduction")
    private BigDecimal dividendTaxReduction;

    /**
     * La utilidad fiscal neta del ejercicio (artículo 77); negativa, disminuye la CUFIN.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Las partidas no deducibles que restan.
     */
    public BigDecimal getNonDeductibles() {
        return nonDeductibles;
    }

    public AnnualReturnNetTaxProfit setNonDeductibles(BigDecimal nonDeductibles) {
        this.nonDeductibles = nonDeductibles;
        return this;
    }

    @JsonIgnore
    public AnnualReturnNetTaxProfit setNonDeductibles(double nonDeductibles) {
        return setNonDeductibles(BigDecimal.valueOf(nonDeductibles));
    }

    /**
     * dividend_tax_credited entre 0.4286, que resta de la utilidad fiscal neta (artículo 10, fracción II).
     */
    public BigDecimal getDividendTaxReduction() {
        return dividendTaxReduction;
    }

    public AnnualReturnNetTaxProfit setDividendTaxReduction(BigDecimal dividendTaxReduction) {
        this.dividendTaxReduction = dividendTaxReduction;
        return this;
    }

    @JsonIgnore
    public AnnualReturnNetTaxProfit setDividendTaxReduction(double dividendTaxReduction) {
        return setDividendTaxReduction(BigDecimal.valueOf(dividendTaxReduction));
    }

    /**
     * La utilidad fiscal neta del ejercicio (artículo 77); negativa, disminuye la CUFIN.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnNetTaxProfit setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnNetTaxProfit setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
