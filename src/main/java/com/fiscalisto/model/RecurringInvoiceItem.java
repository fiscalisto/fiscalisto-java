// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * RecurringInvoiceItem: RecurringInvoiceItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurringInvoiceItem {
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
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Descripción del concepto (Descripcion), hasta 1,000 caracteres.
     */
    public String getDescription() {
        return description;
    }

    public RecurringInvoiceItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    public String getProductKey() {
        return productKey;
    }

    public RecurringInvoiceItem setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public RecurringInvoiceItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public RecurringInvoiceItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    public String getUnitKey() {
        return unitKey;
    }

    public RecurringInvoiceItem setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public RecurringInvoiceItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public RecurringInvoiceItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }
}
