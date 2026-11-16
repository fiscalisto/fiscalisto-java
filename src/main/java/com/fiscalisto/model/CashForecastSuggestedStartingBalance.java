// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastSuggestedStartingBalance: CashForecastSuggestedStartingBalance.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastSuggestedStartingBalance {
    /**
     * La suma de los saldos, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día del estado de cuenta más reciente.
     */
    @JsonProperty("date")
    private String date;

    /**
     * La suma de los saldos, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CashForecastSuggestedStartingBalance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CashForecastSuggestedStartingBalance setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día del estado de cuenta más reciente.
     */
    public String getDate() {
        return date;
    }

    public CashForecastSuggestedStartingBalance setDate(String date) {
        this.date = date;
        return this;
    }
}
