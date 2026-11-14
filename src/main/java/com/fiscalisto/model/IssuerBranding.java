// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerBranding: Cómo se ven los documentos de un emisor: nombre comercial, estilo y color del PDF, y logo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerBranding {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Su nombre comercial: va en grande en el PDF, el correo y la página de la factura; null: la razón social.
     */
    @JsonProperty("trade_name")
    private String tradeName;

    /**
     * Estilo del PDF: clasico, moderno, compacto o minimalista; null: clasico.
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    @JsonProperty("pdf_style")
    private String pdfStyle;

    /**
     * Color del PDF (#RRGGBB); null: el de Fiscalisto (#5B48EE).
     */
    @JsonProperty("pdf_color")
    private String pdfColor;

    /**
     * Dirección pública del logo; null si no tiene.
     */
    @JsonProperty("logo_url")
    private String logoUrl;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public IssuerBranding setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public IssuerBranding setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public IssuerBranding setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Su nombre comercial: va en grande en el PDF, el correo y la página de la factura; null: la razón social.
     */
    public String getTradeName() {
        return tradeName;
    }

    public IssuerBranding setTradeName(String tradeName) {
        this.tradeName = tradeName;
        return this;
    }

    /**
     * Estilo del PDF: clasico, moderno, compacto o minimalista; null: clasico.
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    public String getPdfStyle() {
        return pdfStyle;
    }

    public IssuerBranding setPdfStyle(String pdfStyle) {
        this.pdfStyle = pdfStyle;
        return this;
    }

    /**
     * Color del PDF (#RRGGBB); null: el de Fiscalisto (#5B48EE).
     */
    public String getPdfColor() {
        return pdfColor;
    }

    public IssuerBranding setPdfColor(String pdfColor) {
        this.pdfColor = pdfColor;
        return this;
    }

    /**
     * Dirección pública del logo; null si no tiene.
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public IssuerBranding setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
}
