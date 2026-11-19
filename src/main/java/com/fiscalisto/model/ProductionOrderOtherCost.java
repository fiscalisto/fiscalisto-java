// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ProductionOrderOtherCost: ProductionOrderOtherCost.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionOrderOtherCost {
    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public ProductionOrderOtherCost setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public ProductionOrderOtherCost setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public ProductionOrderOtherCost setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
