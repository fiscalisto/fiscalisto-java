// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateProductionOrderParams: los campos de «Crear una orden de producción».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateProductionOrderParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Lo que va a producir (prd_…): un producto con receta (su hoja de costo en Compras › Costos y márgenes).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Cuántas unidades, en la unidad del producto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El almacén de donde salen los componentes (whs_…). Por omisión, el de la Matriz.
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * El almacén al que entra lo producido (whs_…). Por omisión, warehouse.
     */
    @JsonProperty("destination_warehouse")
    private String destinationWarehouse;

    /**
     * Para cuándo (AAAA-MM-DD).
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateProductionOrderParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Lo que va a producir (prd_…): un producto con receta (su hoja de costo en Compras › Costos y márgenes).
     * <p>
     * Obligatorio.
     */
    public String getProduct() {
        return product;
    }

    public CreateProductionOrderParams setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cuántas unidades, en la unidad del producto.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public CreateProductionOrderParams setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public CreateProductionOrderParams setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * El almacén de donde salen los componentes (whs_…). Por omisión, el de la Matriz.
     */
    public String getWarehouse() {
        return warehouse;
    }

    public CreateProductionOrderParams setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * El almacén al que entra lo producido (whs_…). Por omisión, warehouse.
     */
    public String getDestinationWarehouse() {
        return destinationWarehouse;
    }

    public CreateProductionOrderParams setDestinationWarehouse(String destinationWarehouse) {
        this.destinationWarehouse = destinationWarehouse;
        return this;
    }

    /**
     * Para cuándo (AAAA-MM-DD).
     */
    public String getDueDate() {
        return dueDate;
    }

    public CreateProductionOrderParams setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public CreateProductionOrderParams setNote(String note) {
        this.note = note;
        return this;
    }
}
