// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PriceQuoteItemNextStep: PriceQuoteItemNextStep.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceQuoteItemNextStep {
    /**
     * Desde cuántas unidades (de su presentación) vale este precio: un escalón de mayoreo. 1 por omisión.
     */
    @JsonProperty("min_quantity")
    private BigDecimal minQuantity;

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Desde cuántas unidades (de su presentación) vale este precio: un escalón de mayoreo. 1 por omisión.
     */
    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public PriceQuoteItemNextStep setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItemNextStep setMinQuantity(double minQuantity) {
        return setMinQuantity(BigDecimal.valueOf(minQuantity));
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public PriceQuoteItemNextStep setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItemNextStep setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }
}
