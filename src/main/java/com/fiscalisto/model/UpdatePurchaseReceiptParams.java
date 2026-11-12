// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdatePurchaseReceiptParams: los campos de «Corregir un ticket de compra».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePurchaseReceiptParams {
    /**
     * El nombre de la tienda.
     */
    @JsonProperty("store_name")
    private String storeName;

    /**
     * El RFC de la tienda (el que factura).
     */
    @JsonProperty("store_tax_id")
    private String storeTaxId;

    /**
     * El día de la compra (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * El total pagado, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * efectivo, tarjeta u otro.
     * <p>
     * Valores: efectivo, tarjeta, otro.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * El folio o número de ticket.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Otros datos que pide el portal de la tienda (Web ID, sucursal, caja…), hasta 8.
     */
    @JsonProperty("fields")
    private List<UpdatePurchaseReceiptParamsField> fields;

    /**
     * La dirección del portal de facturación de la tienda (o la liga de autofactura de su QR).
     */
    @JsonProperty("portal_url")
    private String portalUrl;

    /**
     * El correo de facturación de la tienda.
     */
    @JsonProperty("store_email")
    private String storeEmail;

    /**
     * El uso del CFDI (G03, I01…). Por omisión G03 si el régimen del emisor lo permite.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Una nota para su equipo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El nombre de la tienda.
     */
    public String getStoreName() {
        return storeName;
    }

    public UpdatePurchaseReceiptParams setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * El RFC de la tienda (el que factura).
     */
    public String getStoreTaxId() {
        return storeTaxId;
    }

    public UpdatePurchaseReceiptParams setStoreTaxId(String storeTaxId) {
        this.storeTaxId = storeTaxId;
        return this;
    }

    /**
     * El día de la compra (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public UpdatePurchaseReceiptParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El total pagado, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public UpdatePurchaseReceiptParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public UpdatePurchaseReceiptParams setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * efectivo, tarjeta u otro.
     * <p>
     * Valores: efectivo, tarjeta, otro.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public UpdatePurchaseReceiptParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * El folio o número de ticket.
     */
    public String getFolio() {
        return folio;
    }

    public UpdatePurchaseReceiptParams setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Otros datos que pide el portal de la tienda (Web ID, sucursal, caja…), hasta 8.
     */
    public List<UpdatePurchaseReceiptParamsField> getFields() {
        return fields;
    }

    public UpdatePurchaseReceiptParams setFields(List<UpdatePurchaseReceiptParamsField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * La dirección del portal de facturación de la tienda (o la liga de autofactura de su QR).
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    public UpdatePurchaseReceiptParams setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }

    /**
     * El correo de facturación de la tienda.
     */
    public String getStoreEmail() {
        return storeEmail;
    }

    public UpdatePurchaseReceiptParams setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
        return this;
    }

    /**
     * El uso del CFDI (G03, I01…). Por omisión G03 si el régimen del emisor lo permite.
     */
    public String getUse() {
        return use;
    }

    public UpdatePurchaseReceiptParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Una nota para su equipo.
     */
    public String getNote() {
        return note;
    }

    public UpdatePurchaseReceiptParams setNote(String note) {
        this.note = note;
        return this;
    }
}
