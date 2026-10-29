// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TicketLine: TicketLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketLine {
    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public String getProduct() {
        return product;
    }

    public TicketLine setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public TicketLine setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    public String getProductKey() {
        return productKey;
    }

    public TicketLine setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    public String getUnitKey() {
        return unitKey;
    }

    public TicketLine setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     */
    public String getIva() {
        return iva;
    }

    public TicketLine setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public TicketLine setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public TicketLine setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public TicketLine setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public TicketLine setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
