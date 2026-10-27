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
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private CreateBranchParamsSeries series;

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
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public CreateBranchParamsSeries getSeries() {
        return series;
    }

    public CreateBranchParams setSeries(CreateBranchParamsSeries series) {
        this.series = series;
        return this;
    }
}
