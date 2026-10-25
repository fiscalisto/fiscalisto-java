// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * StoreConnectionSettings: Cómo se vuelve ticket cada pedido.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreConnectionSettings {
    /**
     * c_ClaveProdServ de lo que vende, o null.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * c_ClaveUnidad, o null (la de la clave del producto).
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Tasa de IVA incluida en los precios.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * El concepto fijo de cada ticket, o null (el pedido y sus artículos).
     */
    @JsonProperty("description")
    private String description;

    /**
     * Lo que va antes del número del pedido en el folio.
     */
    @JsonProperty("folio_prefix")
    private String folioPrefix;

    /**
     * c_FormaPago cuando la del pedido no está en payment_forms, o null.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * c_FormaPago por pasarela o tipo de pago.
     */
    @JsonProperty("payment_forms")
    private Map<String, String> paymentForms;

    /**
     * Mercado Libre: si se timbra al momento con los datos fiscales del comprador; null en Shopify.
     */
    @JsonProperty("auto_invoice")
    private Boolean autoInvoice;

    /**
     * c_ClaveProdServ de lo que vende, o null.
     */
    public String getProductKey() {
        return productKey;
    }

    public StoreConnectionSettings setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * c_ClaveUnidad, o null (la de la clave del producto).
     */
    public String getUnitKey() {
        return unitKey;
    }

    public StoreConnectionSettings setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA incluida en los precios.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public StoreConnectionSettings setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * El concepto fijo de cada ticket, o null (el pedido y sus artículos).
     */
    public String getDescription() {
        return description;
    }

    public StoreConnectionSettings setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lo que va antes del número del pedido en el folio.
     */
    public String getFolioPrefix() {
        return folioPrefix;
    }

    public StoreConnectionSettings setFolioPrefix(String folioPrefix) {
        this.folioPrefix = folioPrefix;
        return this;
    }

    /**
     * c_FormaPago cuando la del pedido no está en payment_forms, o null.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public StoreConnectionSettings setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * c_FormaPago por pasarela o tipo de pago.
     */
    public Map<String, String> getPaymentForms() {
        return paymentForms;
    }

    public StoreConnectionSettings setPaymentForms(Map<String, String> paymentForms) {
        this.paymentForms = paymentForms;
        return this;
    }

    /**
     * Mercado Libre: si se timbra al momento con los datos fiscales del comprador; null en Shopify.
     */
    public Boolean getAutoInvoice() {
        return autoInvoice;
    }

    public StoreConnectionSettings setAutoInvoice(Boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }
}
