// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CostOfSalesPurchaseReturn: CostOfSalesPurchaseReturn.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostOfSalesPurchaseReturn {
    /**
     * La cuenta: su número y nombre en el catálogo.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La cuenta: su número y nombre en el catálogo.
     */
    public String getAccount() {
        return account;
    }

    public CostOfSalesPurchaseReturn setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CostOfSalesPurchaseReturn setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CostOfSalesPurchaseReturn setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
