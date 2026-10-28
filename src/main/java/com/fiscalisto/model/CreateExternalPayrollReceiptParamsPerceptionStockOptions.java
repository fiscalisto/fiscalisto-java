// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExternalPayrollReceiptParamsPerceptionStockOptions: AccionesOTitulos: solo con la percepción 045.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsPerceptionStockOptions {
    /**
     * Valor de mercado (ValorMercado).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("market_value")
    private BigDecimal marketValue;

    /**
     * Precio al otorgarse (PrecioAlOtorgarse).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("grant_price")
    private BigDecimal grantPrice;

    /**
     * Valor de mercado (ValorMercado).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public CreateExternalPayrollReceiptParamsPerceptionStockOptions setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsPerceptionStockOptions setMarketValue(double marketValue) {
        return setMarketValue(BigDecimal.valueOf(marketValue));
    }

    /**
     * Precio al otorgarse (PrecioAlOtorgarse).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGrantPrice() {
        return grantPrice;
    }

    public CreateExternalPayrollReceiptParamsPerceptionStockOptions setGrantPrice(BigDecimal grantPrice) {
        this.grantPrice = grantPrice;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsPerceptionStockOptions setGrantPrice(double grantPrice) {
        return setGrantPrice(BigDecimal.valueOf(grantPrice));
    }
}
