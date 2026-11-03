// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBranchParams: los campos de «Crear una sucursal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBranchParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo la llama su equipo, por ejemplo «Sucursal Monterrey». Va en el PDF.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código postal (LugarExpedicion de sus CFDI): uno por sucursal, distinto del domicilio fiscal del emisor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * La dirección que va en el PDF de sus facturas.
     */
    @JsonProperty("address")
    private CreateBranchParamsAddress address;

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
    private CreateBranchParamsSeries series;

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
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateBranchParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo la llama su equipo, por ejemplo «Sucursal Monterrey». Va en el PDF.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateBranchParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código postal (LugarExpedicion de sus CFDI): uno por sucursal, distinto del domicilio fiscal del emisor.
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public CreateBranchParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * La dirección que va en el PDF de sus facturas.
     */
    public CreateBranchParamsAddress getAddress() {
        return address;
    }

    public CreateBranchParams setAddress(CreateBranchParamsAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Teléfono, para el PDF.
     */
    public String getPhone() {
        return phone;
    }

    public CreateBranchParams setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Correo, para el PDF.
     */
    public String getEmail() {
        return email;
    }

    public CreateBranchParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * La serie de cada tipo de CFDI que se timbra desde ella (invoice, credit_note, payment, transfer), hasta 25 caracteres cada una; la que no mande usa la del emisor.
     */
    public CreateBranchParamsSeries getSeries() {
        return series;
    }

    public CreateBranchParams setSeries(CreateBranchParamsSeries series) {
        this.series = series;
        return this;
    }

    /**
     * Su nombre comercial, si se presenta con otra marca: va en grande en el PDF de lo que se factura desde ella, en el correo y en la página de la factura. null toma el del emisor.
     */
    public String getTradeName() {
        return tradeName;
    }

    public CreateBranchParams setTradeName(String tradeName) {
        this.tradeName = tradeName;
        return this;
    }

    /**
     * Color del PDF de sus facturas, como #2563EB. null toma el del emisor.
     */
    public String getPdfColor() {
        return pdfColor;
    }

    public CreateBranchParams setPdfColor(String pdfColor) {
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

    public CreateBranchParams setPdfStyle(String pdfStyle) {
        this.pdfStyle = pdfStyle;
        return this;
    }
}
