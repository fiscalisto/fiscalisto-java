// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateTicketParams: los campos de «Registrar un ticket».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTicketParams {
    /**
     * El emisor (iss_…) que vendió. Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El folio de la venta en su sistema, único por emisor: letras, números, - _ / y punto. Registrar el mismo folio con el mismo total responde el ticket que ya existe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Lo que se cobró, impuestos incluidos y sin propina.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Propina: no va en la factura. El cliente puede escribir el total con ella o sin ella.
     */
    @JsonProperty("tip")
    private BigDecimal tip;

    /**
     * c_FormaPago de la venta: 01 efectivo, 04 tarjeta de crédito…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Cuándo se vendió: ISO 8601 (2026-10-02T13:45:00-06:00) o la hora de la Ciudad de México sin zona. Por omisión, ahora.
     */
    @JsonProperty("sold_at")
    private String soldAt;

    /**
     * Un producto (prd_…) de su catálogo: el concepto de la factura.
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
     * Tasa de IVA incluida en el total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * El emisor (iss_…) que vendió. Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateTicketParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El folio de la venta en su sistema, único por emisor: letras, números, - _ / y punto. Registrar el mismo folio con el mismo total responde el ticket que ya existe.
     * <p>
     * Obligatorio.
     */
    public String getFolio() {
        return folio;
    }

    public CreateTicketParams setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Lo que se cobró, impuestos incluidos y sin propina.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreateTicketParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public CreateTicketParams setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Propina: no va en la factura. El cliente puede escribir el total con ella o sin ella.
     */
    public BigDecimal getTip() {
        return tip;
    }

    public CreateTicketParams setTip(BigDecimal tip) {
        this.tip = tip;
        return this;
    }

    public CreateTicketParams setTip(double tip) {
        return setTip(BigDecimal.valueOf(tip));
    }

    /**
     * c_FormaPago de la venta: 01 efectivo, 04 tarjeta de crédito…
     * <p>
     * Obligatorio.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CreateTicketParams setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Cuándo se vendió: ISO 8601 (2026-10-02T13:45:00-06:00) o la hora de la Ciudad de México sin zona. Por omisión, ahora.
     */
    public String getSoldAt() {
        return soldAt;
    }

    public CreateTicketParams setSoldAt(String soldAt) {
        this.soldAt = soldAt;
        return this;
    }

    /**
     * Un producto (prd_…) de su catálogo: el concepto de la factura.
     */
    public String getProduct() {
        return product;
    }

    public CreateTicketParams setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * El concepto. Con `product`, reemplaza su descripción; sin él, va con `product_key`.
     */
    public String getDescription() {
        return description;
    }

    public CreateTicketParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * c_ClaveProdServ (8 dígitos), si no usa `product`.
     */
    public String getProductKey() {
        return productKey;
    }

    public CreateTicketParams setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public CreateTicketParams setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA incluida en el total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public CreateTicketParams setIva(String iva) {
        this.iva = iva;
        return this;
    }
}
