// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePriceListParamsItem: CreatePriceListParamsItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePriceListParamsItem {
    /**
     * El producto (prd_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Una presentación del producto (su id de unidad, un entero de GET /v1/products/{id}/units), por ejemplo una caja de 12; null o sin él: su propia unidad.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * Desde cuántas aplica (1 por omisión): varios renglones del mismo producto son sus escalones de mayoreo.
     */
    @JsonProperty("min_quantity")
    private BigDecimal minQuantity;

    /**
     * Su precio por unidad sin IVA. Mande este o discount_percent.
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Un descuento sobre el precio de la lista. Mande este o unit_price.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * El producto (prd_…).
     * <p>
     * Obligatorio.
     */
    public String getProduct() {
        return product;
    }

    public CreatePriceListParamsItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Una presentación del producto (su id de unidad, un entero de GET /v1/products/{id}/units), por ejemplo una caja de 12; null o sin él: su propia unidad.
     */
    public String getUnit() {
        return unit;
    }

    public CreatePriceListParamsItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Desde cuántas aplica (1 por omisión): varios renglones del mismo producto son sus escalones de mayoreo.
     */
    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public CreatePriceListParamsItem setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
        return this;
    }

    @JsonIgnore
    public CreatePriceListParamsItem setMinQuantity(double minQuantity) {
        return setMinQuantity(BigDecimal.valueOf(minQuantity));
    }

    /**
     * Su precio por unidad sin IVA. Mande este o discount_percent.
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public CreatePriceListParamsItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public CreatePriceListParamsItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Un descuento sobre el precio de la lista. Mande este o unit_price.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public CreatePriceListParamsItem setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public CreatePriceListParamsItem setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }
}
