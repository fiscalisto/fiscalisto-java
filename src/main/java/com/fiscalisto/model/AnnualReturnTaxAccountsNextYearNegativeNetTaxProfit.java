// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit: AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit {
    /**
     * Lo que falta disminuir.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * AAAA-MM de su última actualización.
     */
    @JsonProperty("updated_to")
    private String updatedTo;

    /**
     * Lo que falta disminuir.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * AAAA-MM de su última actualización.
     */
    public String getUpdatedTo() {
        return updatedTo;
    }

    public AnnualReturnTaxAccountsNextYearNegativeNetTaxProfit setUpdatedTo(String updatedTo) {
        this.updatedTo = updatedTo;
        return this;
    }
}
