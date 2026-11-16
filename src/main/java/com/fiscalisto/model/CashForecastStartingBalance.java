// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastStartingBalance: CashForecastStartingBalance.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastStartingBalance {
    /**
     * Lo que tenía en el banco, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día de ese saldo.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo que tenía en el banco, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CashForecastStartingBalance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CashForecastStartingBalance setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día de ese saldo.
     */
    public String getDate() {
        return date;
    }

    public CashForecastStartingBalance setDate(String date) {
        this.date = date;
        return this;
    }
}
