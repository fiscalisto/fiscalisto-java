// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PriceListItem: PriceListItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListItem {
    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    @JsonProperty("unit")
    private String unit;

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
     * Porcentaje que baja el precio de la lista para este producto, en vez de un precio fijo.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public String getProduct() {
        return product;
    }

    public PriceListItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    public String getUnit() {
        return unit;
    }

    public PriceListItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Desde cuántas unidades (de su presentación) vale este precio: un escalón de mayoreo. 1 por omisión.
     */
    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public PriceListItem setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
        return this;
    }

    @JsonIgnore
    public PriceListItem setMinQuantity(double minQuantity) {
        return setMinQuantity(BigDecimal.valueOf(minQuantity));
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public PriceListItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public PriceListItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Porcentaje que baja el precio de la lista para este producto, en vez de un precio fijo.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public PriceListItem setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public PriceListItem setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }
}
