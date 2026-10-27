// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * StockMovement: Una entrada o salida de existencias (el kárdex): una venta, una compra, un ajuste, un traspaso…
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockMovement {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

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
     * sale (una factura), purchase (una compra), customer_return, supplier_return, adjustment, count (conteo físico), transfer_out, transfer_in, initial, cost (un ajuste de costo) o reversal (deshace otro, como una factura cancelada).
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, initial, cost, reversal.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cuánto entró (positivo) o salió (negativo).
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El costo por unidad con que entró o salió, en pesos sin IVA.
     */
    @JsonProperty("unit_cost")
    private BigDecimal unitCost;

    /**
     * quantity × unit_cost: lo que cambió el valor del inventario.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * El lote o número de serie, o null.
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * Lo que lo causó: type invoice (id es el UUID del CFDI), adjustment (adj_…), receipt, transfer, count o ticket.
     */
    @JsonProperty("source")
    private StockMovementSource source;

    /**
     * El motivo de un ajuste, o null.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Cuándo pasó, hora de la Ciudad de México (la Fecha del CFDI en una venta).
     */
    @JsonProperty("date")
    private String date;

    /**
     * true si un movimiento posterior lo deshizo.
     */
    @JsonProperty("reversed")
    private Boolean reversed;

    /**
     * Cuándo se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public StockMovement setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public StockMovement setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StockMovement setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public StockMovement setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El producto (prd_…).
     */
    public String getProduct() {
        return product;
    }

    public StockMovement setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * El almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public StockMovement setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * sale (una factura), purchase (una compra), customer_return, supplier_return, adjustment, count (conteo físico), transfer_out, transfer_in, initial, cost (un ajuste de costo) o reversal (deshace otro, como una factura cancelada).
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, initial, cost, reversal.
     */
    public String getType() {
        return type;
    }

    public StockMovement setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Cuánto entró (positivo) o salió (negativo).
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public StockMovement setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public StockMovement setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * El costo por unidad con que entró o salió, en pesos sin IVA.
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public StockMovement setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
        return this;
    }

    @JsonIgnore
    public StockMovement setUnitCost(double unitCost) {
        return setUnitCost(BigDecimal.valueOf(unitCost));
    }

    /**
     * quantity × unit_cost: lo que cambió el valor del inventario.
     */
    public BigDecimal getValue() {
        return value;
    }

    public StockMovement setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public StockMovement setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * El lote o número de serie, o null.
     */
    public String getLot() {
        return lot;
    }

    public StockMovement setLot(String lot) {
        this.lot = lot;
        return this;
    }

    /**
     * Lo que lo causó: type invoice (id es el UUID del CFDI), adjustment (adj_…), receipt, transfer, count o ticket.
     */
    public StockMovementSource getSource() {
        return source;
    }

    public StockMovement setSource(StockMovementSource source) {
        this.source = source;
        return this;
    }

    /**
     * El motivo de un ajuste, o null.
     */
    public String getReason() {
        return reason;
    }

    public StockMovement setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Cuándo pasó, hora de la Ciudad de México (la Fecha del CFDI en una venta).
     */
    public String getDate() {
        return date;
    }

    public StockMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * true si un movimiento posterior lo deshizo.
     */
    public Boolean getReversed() {
        return reversed;
    }

    public StockMovement setReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * Cuándo se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public StockMovement setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
