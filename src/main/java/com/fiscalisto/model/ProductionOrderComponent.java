// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * ProductionOrderComponent: ProductionOrderComponent.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionOrderComponent {
    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    @JsonProperty("product")
    private StringOr<Product> product;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Lo que de verdad salió de ese componente, o null antes de iniciar la orden.
     */
    @JsonProperty("quantity_used")
    private BigDecimal quantityUsed;

    /**
     * true si lleva existencias; false es un servicio, que solo suma su costo.
     */
    @JsonProperty("tracks_stock")
    private Boolean tracksStock;

    /**
     * Lo que vale el componente usado (cantidad por costo), o null si no tiene costo.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public StringOr<Product> getProduct() {
        return product;
    }

    public ProductionOrderComponent setProduct(StringOr<Product> product) {
        this.product = product;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ProductionOrderComponent setProduct(String id) {
        return setProduct(StringOr.<Product>id(id));
    }

    @JsonIgnore
    public ProductionOrderComponent setProduct(Product product) {
        return setProduct(StringOr.of(product));
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public ProductionOrderComponent setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public ProductionOrderComponent setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Lo que de verdad salió de ese componente, o null antes de iniciar la orden.
     */
    public BigDecimal getQuantityUsed() {
        return quantityUsed;
    }

    public ProductionOrderComponent setQuantityUsed(BigDecimal quantityUsed) {
        this.quantityUsed = quantityUsed;
        return this;
    }

    @JsonIgnore
    public ProductionOrderComponent setQuantityUsed(double quantityUsed) {
        return setQuantityUsed(BigDecimal.valueOf(quantityUsed));
    }

    /**
     * true si lleva existencias; false es un servicio, que solo suma su costo.
     */
    public Boolean getTracksStock() {
        return tracksStock;
    }

    public ProductionOrderComponent setTracksStock(Boolean tracksStock) {
        this.tracksStock = tracksStock;
        return this;
    }

    /**
     * Lo que vale el componente usado (cantidad por costo), o null si no tiene costo.
     */
    public BigDecimal getValue() {
        return value;
    }

    public ProductionOrderComponent setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public ProductionOrderComponent setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }
}
