// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompleteProductionOrderParamsOtherCost: CompleteProductionOrderParamsOtherCost.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteProductionOrderParamsOtherCost {
    /**
     * Qué fue: gas, mano de obra…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Cuánto, en pesos sin IVA.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Qué fue: gas, mano de obra…
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CompleteProductionOrderParamsOtherCost setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Cuánto, en pesos sin IVA.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CompleteProductionOrderParamsOtherCost setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CompleteProductionOrderParamsOtherCost setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
