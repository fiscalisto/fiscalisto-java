// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateCashForecastParamsStartingBalance: UpdateCashForecastParamsStartingBalance.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCashForecastParamsStartingBalance {
    /**
     * Lo que tiene en el banco, en pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día de ese saldo (AAAA-MM-DD); hoy si no se indica.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo que tiene en el banco, en pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public UpdateCashForecastParamsStartingBalance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public UpdateCashForecastParamsStartingBalance setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día de ese saldo (AAAA-MM-DD); hoy si no se indica.
     */
    public String getDate() {
        return date;
    }

    public UpdateCashForecastParamsStartingBalance setDate(String date) {
        this.date = date;
        return this;
    }
}
