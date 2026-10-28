// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions: Acciones o títulos (AccionesOTitulos), con la percepción 045.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions {
    /**
     * market_value.
     */
    @JsonProperty("market_value")
    private BigDecimal marketValue;

    /**
     * grant_price.
     */
    @JsonProperty("grant_price")
    private BigDecimal grantPrice;

    /**
     * market_value.
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions setMarketValue(double marketValue) {
        return setMarketValue(BigDecimal.valueOf(marketValue));
    }

    /**
     * grant_price.
     */
    public BigDecimal getGrantPrice() {
        return grantPrice;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions setGrantPrice(BigDecimal grantPrice) {
        this.grantPrice = grantPrice;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollPerceptionStockOptions setGrantPrice(double grantPrice) {
        return setGrantPrice(BigDecimal.valueOf(grantPrice));
    }
}
