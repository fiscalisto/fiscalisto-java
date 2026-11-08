// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CustomerPaymentBehaviorLastPayment: CustomerPaymentBehaviorLastPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehaviorLastPayment {
    /**
     * El día (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo pagado ese día, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CustomerPaymentBehaviorLastPayment setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Lo pagado ese día, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CustomerPaymentBehaviorLastPayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorLastPayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
