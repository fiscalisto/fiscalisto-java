// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateStockAdjustmentParamsLine: CreateStockAdjustmentParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStockAdjustmentParamsLine {
    /**
     * El producto (prd_…), con track_stock: true.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Cuánto entra (positivo) o sale (negativo), en la unidad del producto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Lo que costó cada unidad que entra, en pesos sin IVA; sin él, el costo promedio de hoy.
     */
    @JsonProperty("unit_cost")
    private BigDecimal unitCost;

    /**
     * El lote o número de serie, si el producto los lleva.
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * La caducidad de un lote nuevo (AAAA-MM-DD).
     */
    @JsonProperty("expires_on")
    private String expiresOn;

    /**
     * El producto (prd_…), con track_stock: true.
     * <p>
     * Obligatorio.
     */
    public String getProduct() {
        return product;
    }

    public CreateStockAdjustmentParamsLine setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cuánto entra (positivo) o sale (negativo), en la unidad del producto.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public CreateStockAdjustmentParamsLine setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public CreateStockAdjustmentParamsLine setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Lo que costó cada unidad que entra, en pesos sin IVA; sin él, el costo promedio de hoy.
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public CreateStockAdjustmentParamsLine setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
        return this;
    }

    @JsonIgnore
    public CreateStockAdjustmentParamsLine setUnitCost(double unitCost) {
        return setUnitCost(BigDecimal.valueOf(unitCost));
    }

    /**
     * El lote o número de serie, si el producto los lleva.
     */
    public String getLot() {
        return lot;
    }

    public CreateStockAdjustmentParamsLine setLot(String lot) {
        this.lot = lot;
        return this;
    }

    /**
     * La caducidad de un lote nuevo (AAAA-MM-DD).
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    public CreateStockAdjustmentParamsLine setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }
}
