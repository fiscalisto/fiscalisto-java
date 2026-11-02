// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreatePurchaseReceiptParams: los campos de «Guardar un ticket de compra».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePurchaseReceiptParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La foto (JPG, PNG o WebP) o el PDF, en base64; hasta 8 MB.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("file")
    private String file;

    /**
     * image/jpeg, image/png, image/webp o application/pdf.
     * <p>
     * Valores: image/jpeg, image/png, image/webp, application/pdf.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("file_type")
    private String fileType;

    /**
     * Lo que dice el código QR del ticket, si ya lo leyó (suele ser la liga del portal).
     */
    @JsonProperty("qr_text")
    private String qrText;

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
    private List<CreatePurchaseReceiptParamsField> fields;

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
     * El uso de la factura (G03, I01…). Por omisión G03 si el régimen del emisor lo permite.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Una nota para su equipo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePurchaseReceiptParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La foto (JPG, PNG o WebP) o el PDF, en base64; hasta 8 MB.
     * <p>
     * Obligatorio.
     */
    public String getFile() {
        return file;
    }

    public CreatePurchaseReceiptParams setFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * image/jpeg, image/png, image/webp o application/pdf.
     * <p>
     * Valores: image/jpeg, image/png, image/webp, application/pdf.
     * <p>
     * Obligatorio.
     */
    public String getFileType() {
        return fileType;
    }

    public CreatePurchaseReceiptParams setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Lo que dice el código QR del ticket, si ya lo leyó (suele ser la liga del portal).
     */
    public String getQrText() {
        return qrText;
    }

    public CreatePurchaseReceiptParams setQrText(String qrText) {
        this.qrText = qrText;
        return this;
    }

    /**
     * El nombre de la tienda.
     */
    public String getStoreName() {
        return storeName;
    }

    public CreatePurchaseReceiptParams setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * El RFC de la tienda (el que factura).
     */
    public String getStoreTaxId() {
        return storeTaxId;
    }

    public CreatePurchaseReceiptParams setStoreTaxId(String storeTaxId) {
        this.storeTaxId = storeTaxId;
        return this;
    }

    /**
     * El día de la compra (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CreatePurchaseReceiptParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El total pagado, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreatePurchaseReceiptParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CreatePurchaseReceiptParams setTotal(double total) {
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

    public CreatePurchaseReceiptParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * El folio o número de ticket.
     */
    public String getFolio() {
        return folio;
    }

    public CreatePurchaseReceiptParams setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Otros datos que pide el portal de la tienda (Web ID, sucursal, caja…), hasta 8.
     */
    public List<CreatePurchaseReceiptParamsField> getFields() {
        return fields;
    }

    public CreatePurchaseReceiptParams setFields(List<CreatePurchaseReceiptParamsField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * La dirección del portal de facturación de la tienda (o la liga de autofactura de su QR).
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    public CreatePurchaseReceiptParams setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }

    /**
     * El correo de facturación de la tienda.
     */
    public String getStoreEmail() {
        return storeEmail;
    }

    public CreatePurchaseReceiptParams setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
        return this;
    }

    /**
     * El uso de la factura (G03, I01…). Por omisión G03 si el régimen del emisor lo permite.
     */
    public String getUse() {
        return use;
    }

    public CreatePurchaseReceiptParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Una nota para su equipo.
     */
    public String getNote() {
        return note;
    }

    public CreatePurchaseReceiptParams setNote(String note) {
        this.note = note;
        return this;
    }
}
