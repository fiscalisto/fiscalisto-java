// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * StockAdjustmentLine: StockAdjustmentLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAdjustmentLine {
    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El costo por unidad que se dio al ajuste, en pesos sin IVA, o null (el costo promedio).
     */
    @JsonProperty("unit_cost")
    private BigDecimal unitCost;

    /**
     * Lote del medicamento (LoteMedicamento).
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public String getProduct() {
        return product;
    }

    public StockAdjustmentLine setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public StockAdjustmentLine setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public StockAdjustmentLine setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * El costo por unidad que se dio al ajuste, en pesos sin IVA, o null (el costo promedio).
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public StockAdjustmentLine setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
        return this;
    }

    @JsonIgnore
    public StockAdjustmentLine setUnitCost(double unitCost) {
        return setUnitCost(BigDecimal.valueOf(unitCost));
    }

    /**
     * Lote del medicamento (LoteMedicamento).
     */
    public String getLot() {
        return lot;
    }

    public StockAdjustmentLine setLot(String lot) {
        this.lot = lot;
        return this;
    }
}
