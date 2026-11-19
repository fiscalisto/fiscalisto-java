// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ProductionOrder: Una orden de producción: los componentes de la receta salen de un almacén y lo producido entra a otro a su costo real.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionOrder {
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
     * Su folio, como OP-12.
     */
    @JsonProperty("number")
    private String number;

    /**
     * draft (borrador, nada se ha movido), in_process (los componentes ya salieron), completed (lo producido ya entró) o cancelled (todo regresó).
     * <p>
     * Valores: draft, in_process, completed, cancelled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Lo que se produce (prd_…).
     */
    @JsonProperty("product")
    private String product;

    /**
     * Cuántas unidades se planearon.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Cuántas salieron de verdad, o null si no ha terminado.
     */
    @JsonProperty("quantity_made")
    private BigDecimal quantityMade;

    /**
     * El almacén de donde salen los componentes (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * El almacén al que entra lo producido (whs_…).
     */
    @JsonProperty("destination_warehouse")
    private String destinationWarehouse;

    /**
     * El lote de lo producido, o null.
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * Para cuándo (AAAA-MM-DD), o null.
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Su nota, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Lo que lleva, de la receta para quantity con su merma: quantity lo planeado, quantity_used lo que salió y value lo que costó (pesos sin IVA). tracks_stock false es un servicio: solo suma su costo.
     */
    @JsonProperty("components")
    private List<ProductionOrderComponent> components;

    /**
     * Mano de obra, gas, empaque…: se suman al costo de lo producido.
     */
    @JsonProperty("other_costs")
    private List<ProductionOrderOtherCost> otherCosts;

    /**
     * Lo que costaron los componentes que salieron, o null antes de iniciar.
     */
    @JsonProperty("materials_cost")
    private BigDecimal materialsCost;

    /**
     * (materials_cost + other_costs) ÷ quantity_made: el costo con que entró cada unidad, o null si no ha terminado.
     */
    @JsonProperty("unit_cost")
    private BigDecimal unitCost;

    /**
     * Cuándo se hizo.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo salieron los componentes, o null.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Cuándo entró lo producido, o null.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Cuándo se canceló, o null.
     */
    @JsonProperty("cancelled_at")
    private String cancelledAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ProductionOrder setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ProductionOrder setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ProductionOrder setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ProductionOrder setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su folio, como OP-12.
     */
    public String getNumber() {
        return number;
    }

    public ProductionOrder setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * draft (borrador, nada se ha movido), in_process (los componentes ya salieron), completed (lo producido ya entró) o cancelled (todo regresó).
     * <p>
     * Valores: draft, in_process, completed, cancelled.
     */
    public String getStatus() {
        return status;
    }

    public ProductionOrder setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lo que se produce (prd_…).
     */
    public String getProduct() {
        return product;
    }

    public ProductionOrder setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cuántas unidades se planearon.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public ProductionOrder setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public ProductionOrder setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Cuántas salieron de verdad, o null si no ha terminado.
     */
    public BigDecimal getQuantityMade() {
        return quantityMade;
    }

    public ProductionOrder setQuantityMade(BigDecimal quantityMade) {
        this.quantityMade = quantityMade;
        return this;
    }

    @JsonIgnore
    public ProductionOrder setQuantityMade(double quantityMade) {
        return setQuantityMade(BigDecimal.valueOf(quantityMade));
    }

    /**
     * El almacén de donde salen los componentes (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public ProductionOrder setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * El almacén al que entra lo producido (whs_…).
     */
    public String getDestinationWarehouse() {
        return destinationWarehouse;
    }

    public ProductionOrder setDestinationWarehouse(String destinationWarehouse) {
        this.destinationWarehouse = destinationWarehouse;
        return this;
    }

    /**
     * El lote de lo producido, o null.
     */
    public String getLot() {
        return lot;
    }

    public ProductionOrder setLot(String lot) {
        this.lot = lot;
        return this;
    }

    /**
     * Para cuándo (AAAA-MM-DD), o null.
     */
    public String getDueDate() {
        return dueDate;
    }

    public ProductionOrder setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Su nota, o null.
     */
    public String getNote() {
        return note;
    }

    public ProductionOrder setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Lo que lleva, de la receta para quantity con su merma: quantity lo planeado, quantity_used lo que salió y value lo que costó (pesos sin IVA). tracks_stock false es un servicio: solo suma su costo.
     */
    public List<ProductionOrderComponent> getComponents() {
        return components;
    }

    public ProductionOrder setComponents(List<ProductionOrderComponent> components) {
        this.components = components;
        return this;
    }

    /**
     * Mano de obra, gas, empaque…: se suman al costo de lo producido.
     */
    public List<ProductionOrderOtherCost> getOtherCosts() {
        return otherCosts;
    }

    public ProductionOrder setOtherCosts(List<ProductionOrderOtherCost> otherCosts) {
        this.otherCosts = otherCosts;
        return this;
    }

    /**
     * Lo que costaron los componentes que salieron, o null antes de iniciar.
     */
    public BigDecimal getMaterialsCost() {
        return materialsCost;
    }

    public ProductionOrder setMaterialsCost(BigDecimal materialsCost) {
        this.materialsCost = materialsCost;
        return this;
    }

    @JsonIgnore
    public ProductionOrder setMaterialsCost(double materialsCost) {
        return setMaterialsCost(BigDecimal.valueOf(materialsCost));
    }

    /**
     * (materials_cost + other_costs) ÷ quantity_made: el costo con que entró cada unidad, o null si no ha terminado.
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public ProductionOrder setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
        return this;
    }

    @JsonIgnore
    public ProductionOrder setUnitCost(double unitCost) {
        return setUnitCost(BigDecimal.valueOf(unitCost));
    }

    /**
     * Cuándo se hizo.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ProductionOrder setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo salieron los componentes, o null.
     */
    public String getStartedAt() {
        return startedAt;
    }

    public ProductionOrder setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Cuándo entró lo producido, o null.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public ProductionOrder setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Cuándo se canceló, o null.
     */
    public String getCancelledAt() {
        return cancelledAt;
    }

    public ProductionOrder setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }
}
