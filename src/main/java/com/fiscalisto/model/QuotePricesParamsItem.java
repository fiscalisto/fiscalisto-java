// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * QuotePricesParamsItem: QuotePricesParamsItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotePricesParamsItem {
    /**
     * El producto (prd_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * El producto (prd_…).
     * <p>
     * Obligatorio.
     */
    public String getProduct() {
        return product;
    }

    public QuotePricesParamsItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public QuotePricesParamsItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public QuotePricesParamsItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    public String getUnit() {
        return unit;
    }

    public QuotePricesParamsItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
}
