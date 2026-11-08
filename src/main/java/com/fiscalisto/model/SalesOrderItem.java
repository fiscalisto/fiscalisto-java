// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SalesOrderItem: SalesOrderItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrderItem {
    /**
     * El id del concepto en el pedido: con él entrega o factura una parte (line).
     */
    @JsonProperty("id")
    private Long id;

    /**
     * Descripción del concepto (Descripcion), hasta 1,000 caracteres.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * La unidad, como la ve el cliente.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * El descuento del concepto, en dinero.
     */
    @JsonProperty("discount")
    private BigDecimal discount;

    /**
     * El importe del concepto, sin impuestos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true si sale del almacén con cada entrega; false si es un servicio (solo se factura).
     */
    @JsonProperty("goods")
    private Boolean goods;

    /**
     * Cuánto ya se entregó.
     */
    @JsonProperty("delivered")
    private BigDecimal delivered;

    /**
     * Cuánto ya se facturó.
     */
    @JsonProperty("invoiced")
    private BigDecimal invoiced;

    /**
     * Cuánto ya no se entregará (POST /v1/sales_orders/{id}/cancel_remaining).
     */
    @JsonProperty("canceled")
    private BigDecimal canceled;

    /**
     * El id del concepto en el pedido: con él entrega o factura una parte (line).
     */
    public Long getId() {
        return id;
    }

    public SalesOrderItem setId(Long id) {
        this.id = id;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setId(long id) {
        return setId(Long.valueOf(id));
    }

    /**
     * Descripción del concepto (Descripcion), hasta 1,000 caracteres.
     */
    public String getDescription() {
        return description;
    }

    public SalesOrderItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    public String getProductKey() {
        return productKey;
    }

    public SalesOrderItem setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public SalesOrderItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * La unidad, como la ve el cliente.
     */
    public String getUnit() {
        return unit;
    }

    public SalesOrderItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public SalesOrderItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * El descuento del concepto, en dinero.
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public SalesOrderItem setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * El importe del concepto, sin impuestos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SalesOrderItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true si sale del almacén con cada entrega; false si es un servicio (solo se factura).
     */
    public Boolean getGoods() {
        return goods;
    }

    public SalesOrderItem setGoods(Boolean goods) {
        this.goods = goods;
        return this;
    }

    /**
     * Cuánto ya se entregó.
     */
    public BigDecimal getDelivered() {
        return delivered;
    }

    public SalesOrderItem setDelivered(BigDecimal delivered) {
        this.delivered = delivered;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setDelivered(double delivered) {
        return setDelivered(BigDecimal.valueOf(delivered));
    }

    /**
     * Cuánto ya se facturó.
     */
    public BigDecimal getInvoiced() {
        return invoiced;
    }

    public SalesOrderItem setInvoiced(BigDecimal invoiced) {
        this.invoiced = invoiced;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setInvoiced(double invoiced) {
        return setInvoiced(BigDecimal.valueOf(invoiced));
    }

    /**
     * Cuánto ya no se entregará (POST /v1/sales_orders/{id}/cancel_remaining).
     */
    public BigDecimal getCanceled() {
        return canceled;
    }

    public SalesOrderItem setCanceled(BigDecimal canceled) {
        this.canceled = canceled;
        return this;
    }

    @JsonIgnore
    public SalesOrderItem setCanceled(double canceled) {
        return setCanceled(BigDecimal.valueOf(canceled));
    }
}
