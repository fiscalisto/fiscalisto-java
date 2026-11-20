// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AnnualReturnTaxAccountsNextYear: Lo que pasa al año siguiente además de los saldos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsNextYear {
    /**
     * El ISR del artículo 10 que se acredita en los años siguientes (fracción I).
     */
    @JsonProperty("pending_dividend_tax")
    private List<AnnualReturnTaxAccountsNextYearPendingDividendTaxItem> pendingDividendTax;

    /**
     * Una utilidad fiscal neta negativa que la CUFIN no alcanzó (artículo 77, quinto párrafo).
     */
    @JsonProperty("negative_net_tax_profit")
    private AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit negativeNetTaxProfit;

    /**
     * El ISR del artículo 10 que se acredita en los años siguientes (fracción I).
     */
    public List<AnnualReturnTaxAccountsNextYearPendingDividendTaxItem> getPendingDividendTax() {
        return pendingDividendTax;
    }

    public AnnualReturnTaxAccountsNextYear setPendingDividendTax(List<AnnualReturnTaxAccountsNextYearPendingDividendTaxItem> pendingDividendTax) {
        this.pendingDividendTax = pendingDividendTax;
        return this;
    }

    /**
     * Una utilidad fiscal neta negativa que la CUFIN no alcanzó (artículo 77, quinto párrafo).
     */
    public AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit getNegativeNetTaxProfit() {
        return negativeNetTaxProfit;
    }

    public AnnualReturnTaxAccountsNextYear setNegativeNetTaxProfit(AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit negativeNetTaxProfit) {
        this.negativeNetTaxProfit = negativeNetTaxProfit;
        return this;
    }
}
