// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PriceQuoteItem: PriceQuoteItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceQuoteItem {
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
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Su precio del catálogo, por unidad y sin IVA, antes de su lista.
     */
    @JsonProperty("catalog_price")
    private BigDecimal catalogPrice;

    /**
     * El descuento del cliente (el suyo, o el de su grupo) sobre ese precio; va como Descuento en el CFDI.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * La lista (prl_…) de donde sale el precio, o null si es el del catálogo.
     */
    @JsonProperty("price_list")
    private String priceList;

    /**
     * El siguiente escalón de mayoreo: desde qué cantidad y a qué precio. null si no hay.
     */
    @JsonProperty("next_step")
    private PriceQuoteItemNextStep nextStep;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public String getProduct() {
        return product;
    }

    public PriceQuoteItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public PriceQuoteItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     */
    public String getUnit() {
        return unit;
    }

    public PriceQuoteItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public PriceQuoteItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Su precio del catálogo, por unidad y sin IVA, antes de su lista.
     */
    public BigDecimal getCatalogPrice() {
        return catalogPrice;
    }

    public PriceQuoteItem setCatalogPrice(BigDecimal catalogPrice) {
        this.catalogPrice = catalogPrice;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItem setCatalogPrice(double catalogPrice) {
        return setCatalogPrice(BigDecimal.valueOf(catalogPrice));
    }

    /**
     * El descuento del cliente (el suyo, o el de su grupo) sobre ese precio; va como Descuento en el CFDI.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public PriceQuoteItem setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public PriceQuoteItem setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }

    /**
     * La lista (prl_…) de donde sale el precio, o null si es el del catálogo.
     */
    public String getPriceList() {
        return priceList;
    }

    public PriceQuoteItem setPriceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * El siguiente escalón de mayoreo: desde qué cantidad y a qué precio. null si no hay.
     */
    public PriceQuoteItemNextStep getNextStep() {
        return nextStep;
    }

    public PriceQuoteItem setNextStep(PriceQuoteItemNextStep nextStep) {
        this.nextStep = nextStep;
        return this;
    }
}
