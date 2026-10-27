// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * StockLevel: Lo que hay de un producto en un almacén, y lo que vale.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockLevel {
    /**
     * Su id (stl_…): el producto en ese almacén. Sirve como starting_after.
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El producto (prd_…).
     */
    @JsonProperty("product")
    private String product;

    /**
     * El almacén (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * Lo que hay, en la unidad del producto (todos sus lotes).
     */
    @JsonProperty("on_hand")
    private BigDecimal onHand;

    /**
     * Lo apartado por cotizaciones aceptadas que no se han facturado.
     */
    @JsonProperty("reserved")
    private BigDecimal reserved;

    /**
     * on_hand menos reserved: lo que se puede vender.
     */
    @JsonProperty("available")
    private BigDecimal available;

    /**
     * Lo que valen esas existencias a su costo, en pesos sin IVA.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * value / on_hand: el costo por unidad, o null sin existencias.
     */
    @JsonProperty("average_cost")
    private BigDecimal averageCost;

    /**
     * Su id (stl_…): el producto en ese almacén. Sirve como starting_after.
     */
    public String getId() {
        return id;
    }

    public StockLevel setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public StockLevel setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StockLevel setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El producto (prd_…).
     */
    public String getProduct() {
        return product;
    }

    public StockLevel setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * El almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public StockLevel setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Lo que hay, en la unidad del producto (todos sus lotes).
     */
    public BigDecimal getOnHand() {
        return onHand;
    }

    public StockLevel setOnHand(BigDecimal onHand) {
        this.onHand = onHand;
        return this;
    }

    @JsonIgnore
    public StockLevel setOnHand(double onHand) {
        return setOnHand(BigDecimal.valueOf(onHand));
    }

    /**
     * Lo apartado por cotizaciones aceptadas que no se han facturado.
     */
    public BigDecimal getReserved() {
        return reserved;
    }

    public StockLevel setReserved(BigDecimal reserved) {
        this.reserved = reserved;
        return this;
    }

    @JsonIgnore
    public StockLevel setReserved(double reserved) {
        return setReserved(BigDecimal.valueOf(reserved));
    }

    /**
     * on_hand menos reserved: lo que se puede vender.
     */
    public BigDecimal getAvailable() {
        return available;
    }

    public StockLevel setAvailable(BigDecimal available) {
        this.available = available;
        return this;
    }

    @JsonIgnore
    public StockLevel setAvailable(double available) {
        return setAvailable(BigDecimal.valueOf(available));
    }

    /**
     * Lo que valen esas existencias a su costo, en pesos sin IVA.
     */
    public BigDecimal getValue() {
        return value;
    }

    public StockLevel setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public StockLevel setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * value / on_hand: el costo por unidad, o null sin existencias.
     */
    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public StockLevel setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
        return this;
    }

    @JsonIgnore
    public StockLevel setAverageCost(double averageCost) {
        return setAverageCost(BigDecimal.valueOf(averageCost));
    }
}
