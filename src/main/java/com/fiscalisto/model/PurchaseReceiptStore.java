// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PurchaseReceiptStore: La tienda: name, tax_id (su RFC), email, portal_url (su portal o la liga del QR) y on_fiscalisto (factura con Fiscalisto: method fiscalisto la timbra al momento).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseReceiptStore {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Su portal de facturación o la liga del QR, o null.
     */
    @JsonProperty("portal_url")
    private String portalUrl;

    /**
     * true si factura con Fiscalisto: method fiscalisto timbra la factura al momento.
     */
    @JsonProperty("on_fiscalisto")
    private Boolean onFiscalisto;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PurchaseReceiptStore setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public PurchaseReceiptStore setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public PurchaseReceiptStore setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Su portal de facturación o la liga del QR, o null.
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    public PurchaseReceiptStore setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }

    /**
     * true si factura con Fiscalisto: method fiscalisto timbra la factura al momento.
     */
    public Boolean getOnFiscalisto() {
        return onFiscalisto;
    }

    public PurchaseReceiptStore setOnFiscalisto(Boolean onFiscalisto) {
        this.onFiscalisto = onFiscalisto;
        return this;
    }
}
