// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * UpdateStoreConnectionParamsSettings: Lo que cambia; lo demás queda.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateStoreConnectionParamsSettings {
    /**
     * c_ClaveProdServ de lo que vende (8 dígitos).
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Tasa de IVA incluida en los precios. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * El concepto de cada ticket. Por omisión, el pedido y sus artículos («Pedido 1001: Playera (2), Gorra»).
     */
    @JsonProperty("description")
    private String description;

    /**
     * Lo que va antes del número del pedido en el folio del ticket. Por omisión SHOP- o ML-.
     */
    @JsonProperty("folio_prefix")
    private String folioPrefix;

    /**
     * c_FormaPago cuando la forma de pago del pedido no está en payment_forms. Por omisión 04 (Shopify) o 31 (Mercado Libre).
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * c_FormaPago por pasarela de Shopify (shopify_payments, paypal, manual…) o tipo de pago de Mercado Libre (credit_card, debit_card, account_money, ticket, bank_transfer).
     */
    @JsonProperty("payment_forms")
    private Map<String, String> paymentForms;

    /**
     * Mercado Libre: timbrar en cuanto se paga si el comprador dejó sus datos fiscales completos. Por omisión true.
     */
    @JsonProperty("auto_invoice")
    private Boolean autoInvoice;

    /**
     * c_ClaveProdServ de lo que vende (8 dígitos).
     */
    public String getProductKey() {
        return productKey;
    }

    public UpdateStoreConnectionParamsSettings setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public UpdateStoreConnectionParamsSettings setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA incluida en los precios. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public UpdateStoreConnectionParamsSettings setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * El concepto de cada ticket. Por omisión, el pedido y sus artículos («Pedido 1001: Playera (2), Gorra»).
     */
    public String getDescription() {
        return description;
    }

    public UpdateStoreConnectionParamsSettings setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lo que va antes del número del pedido en el folio del ticket. Por omisión SHOP- o ML-.
     */
    public String getFolioPrefix() {
        return folioPrefix;
    }

    public UpdateStoreConnectionParamsSettings setFolioPrefix(String folioPrefix) {
        this.folioPrefix = folioPrefix;
        return this;
    }

    /**
     * c_FormaPago cuando la forma de pago del pedido no está en payment_forms. Por omisión 04 (Shopify) o 31 (Mercado Libre).
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public UpdateStoreConnectionParamsSettings setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * c_FormaPago por pasarela de Shopify (shopify_payments, paypal, manual…) o tipo de pago de Mercado Libre (credit_card, debit_card, account_money, ticket, bank_transfer).
     */
    public Map<String, String> getPaymentForms() {
        return paymentForms;
    }

    public UpdateStoreConnectionParamsSettings setPaymentForms(Map<String, String> paymentForms) {
        this.paymentForms = paymentForms;
        return this;
    }

    /**
     * Mercado Libre: timbrar en cuanto se paga si el comprador dejó sus datos fiscales completos. Por omisión true.
     */
    public Boolean getAutoInvoice() {
        return autoInvoice;
    }

    public UpdateStoreConnectionParamsSettings setAutoInvoice(Boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }
}
