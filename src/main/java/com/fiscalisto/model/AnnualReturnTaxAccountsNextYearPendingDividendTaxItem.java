// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnTaxAccountsNextYearPendingDividendTaxItem: AnnualReturnTaxAccountsNextYearPendingDividendTaxItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsNextYearPendingDividendTaxItem {
    /**
     * El año en que se pagó.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Lo que falta acreditar.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El año en que se pagó.
     */
    public Long getYear() {
        return year;
    }

    public AnnualReturnTaxAccountsNextYearPendingDividendTaxItem setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsNextYearPendingDividendTaxItem setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Lo que falta acreditar.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnTaxAccountsNextYearPendingDividendTaxItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsNextYearPendingDividendTaxItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
