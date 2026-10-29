// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateTicketParamsLine: CreateTicketParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTicketParamsLine {
    /**
     * Un producto (prd_…) de su catálogo: sus claves, IVA e impuestos locales.
     */
    @JsonProperty("product")
    private String product;

    /**
     * El concepto. Con `product`, reemplaza su descripción; sin él, va con `product_key`.
     */
    @JsonProperty("description")
    private String description;

    /**
     * c_ClaveProdServ (8 dígitos), si no usa `product`.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Tasa de IVA incluida en su total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * Unidades (noches, piezas). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Lo que se cobró por este concepto, impuestos incluidos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Un producto (prd_…) de su catálogo: sus claves, IVA e impuestos locales.
     */
    public String getProduct() {
        return product;
    }

    public CreateTicketParamsLine setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * El concepto. Con `product`, reemplaza su descripción; sin él, va con `product_key`.
     */
    public String getDescription() {
        return description;
    }

    public CreateTicketParamsLine setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * c_ClaveProdServ (8 dígitos), si no usa `product`.
     */
    public String getProductKey() {
        return productKey;
    }

    public CreateTicketParamsLine setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public CreateTicketParamsLine setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA incluida en su total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public CreateTicketParamsLine setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * Unidades (noches, piezas). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public CreateTicketParamsLine setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLine setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Lo que se cobró por este concepto, impuestos incluidos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreateTicketParamsLine setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLine setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
