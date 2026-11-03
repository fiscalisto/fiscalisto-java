// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateBranchParams: los campos de «Actualizar una sucursal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateBranchParams {
    /**
     * Cómo la llama su equipo, por ejemplo «Sucursal Monterrey». Va en el PDF.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código postal (LugarExpedicion de sus CFDI). Varias sucursales pueden compartirlo, y también el del domicilio fiscal del emisor.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * La dirección que va en el PDF de sus facturas.
     */
    @JsonProperty("address")
    private UpdateBranchParamsAddress address;

    /**
     * Teléfono, para el PDF.
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * Correo, para el PDF.
     */
    @JsonProperty("email")
    private String email;

    /**
     * La serie de cada tipo de CFDI que se timbra desde ella (invoice, credit_note, payment, transfer), hasta 25 caracteres cada una; la que no mande usa la del emisor.
     */
    @JsonProperty("series")
    private UpdateBranchParamsSeries series;

    /**
     * Su nombre comercial, si se presenta con otra marca: va en grande en el PDF de lo que se factura desde ella, en el correo y en la página de la factura. null toma el del emisor.
     */
    @JsonProperty("trade_name")
    private String tradeName;

    /**
     * Color del PDF de sus facturas, como #2563EB. null toma el del emisor.
     */
    @JsonProperty("pdf_color")
    private String pdfColor;

    /**
     * Estilo del PDF de sus facturas: clasico, moderno, compacto o minimalista. null toma el del emisor.
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    @JsonProperty("pdf_style")
    private String pdfStyle;

    /**
     * true la archiva: ya no se puede facturar desde ella, y sus facturas la siguen nombrando. false la restaura.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Cómo la llama su equipo, por ejemplo «Sucursal Monterrey». Va en el PDF.
     */
    public String getName() {
        return name;
    }

    public UpdateBranchParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código postal (LugarExpedicion de sus CFDI). Varias sucursales pueden compartirlo, y también el del domicilio fiscal del emisor.
     */
    public String getZip() {
        return zip;
    }

    public UpdateBranchParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * La dirección que va en el PDF de sus facturas.
     */
    public UpdateBranchParamsAddress getAddress() {
        return address;
    }

    public UpdateBranchParams setAddress(UpdateBranchParamsAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Teléfono, para el PDF.
     */
    public String getPhone() {
        return phone;
    }

    public UpdateBranchParams setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Correo, para el PDF.
     */
    public String getEmail() {
        return email;
    }

    public UpdateBranchParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * La serie de cada tipo de CFDI que se timbra desde ella (invoice, credit_note, payment, transfer), hasta 25 caracteres cada una; la que no mande usa la del emisor.
     */
    public UpdateBranchParamsSeries getSeries() {
        return series;
    }

    public UpdateBranchParams setSeries(UpdateBranchParamsSeries series) {
        this.series = series;
        return this;
    }

    /**
     * Su nombre comercial, si se presenta con otra marca: va en grande en el PDF de lo que se factura desde ella, en el correo y en la página de la factura. null toma el del emisor.
     */
    public String getTradeName() {
        return tradeName;
    }

    public UpdateBranchParams setTradeName(String tradeName) {
        this.tradeName = tradeName;
        return this;
    }

    /**
     * Color del PDF de sus facturas, como #2563EB. null toma el del emisor.
     */
    public String getPdfColor() {
        return pdfColor;
    }

    public UpdateBranchParams setPdfColor(String pdfColor) {
        this.pdfColor = pdfColor;
        return this;
    }

    /**
     * Estilo del PDF de sus facturas: clasico, moderno, compacto o minimalista. null toma el del emisor.
     * <p>
     * Valores: clasico, moderno, compacto, minimalista.
     */
    public String getPdfStyle() {
        return pdfStyle;
    }

    public UpdateBranchParams setPdfStyle(String pdfStyle) {
        this.pdfStyle = pdfStyle;
        return this;
    }

    /**
     * true la archiva: ya no se puede facturar desde ella, y sus facturas la siguen nombrando. false la restaura.
     */
    public Boolean getArchived() {
        return archived;
    }

    public UpdateBranchParams setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
