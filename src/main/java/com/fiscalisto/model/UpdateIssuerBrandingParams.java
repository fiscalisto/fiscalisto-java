// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateIssuerBrandingParams: los campos de «Cambiar el diseño del PDF».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateIssuerBrandingParams {
    /**
     * Su nombre comercial, si se presenta con otra marca: va en grande en el PDF, en el correo y en la página de la factura. null: la razón social.
     */
    @JsonProperty("trade_name")
    private String tradeName;

    /**
     * Estilo del PDF: clasico (por omisión), moderno (encabezado y total con color, renglones alternados), compacto (letra chica, márgenes cortos) o minimalista (sin rellenos, el color solo en el total).
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    @JsonProperty("pdf_style")
    private String pdfStyle;

    /**
     * Color del PDF, como #2563EB. null: el de Fiscalisto (#5B48EE).
     */
    @JsonProperty("pdf_color")
    private String pdfColor;

    /**
     * Su nombre comercial, si se presenta con otra marca: va en grande en el PDF, en el correo y en la página de la factura. null: la razón social.
     */
    public String getTradeName() {
        return tradeName;
    }

    public UpdateIssuerBrandingParams setTradeName(String tradeName) {
        this.tradeName = tradeName;
        return this;
    }

    /**
     * Estilo del PDF: clasico (por omisión), moderno (encabezado y total con color, renglones alternados), compacto (letra chica, márgenes cortos) o minimalista (sin rellenos, el color solo en el total).
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    public String getPdfStyle() {
        return pdfStyle;
    }

    public UpdateIssuerBrandingParams setPdfStyle(String pdfStyle) {
        this.pdfStyle = pdfStyle;
        return this;
    }

    /**
     * Color del PDF, como #2563EB. null: el de Fiscalisto (#5B48EE).
     */
    public String getPdfColor() {
        return pdfColor;
    }

    public UpdateIssuerBrandingParams setPdfColor(String pdfColor) {
        this.pdfColor = pdfColor;
        return this;
    }
}
