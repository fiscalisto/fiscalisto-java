// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollPerceptionStockOptions: Acciones o títulos (AccionesOTitulos), con la percepción 045.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollPerceptionStockOptions {
    /**
     * Valor de mercado (ValorMercado).
     */
    @JsonProperty("market_value")
    private BigDecimal marketValue;

    /**
     * Precio al otorgarse (PrecioAlOtorgarse).
     */
    @JsonProperty("grant_price")
    private BigDecimal grantPrice;

    /**
     * Valor de mercado (ValorMercado).
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public InvoicePayrollPerceptionStockOptions setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerceptionStockOptions setMarketValue(double marketValue) {
        return setMarketValue(BigDecimal.valueOf(marketValue));
    }

    /**
     * Precio al otorgarse (PrecioAlOtorgarse).
     */
    public BigDecimal getGrantPrice() {
        return grantPrice;
    }

    public InvoicePayrollPerceptionStockOptions setGrantPrice(BigDecimal grantPrice) {
        this.grantPrice = grantPrice;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerceptionStockOptions setGrantPrice(double grantPrice) {
        return setGrantPrice(BigDecimal.valueOf(grantPrice));
    }
}
