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
     * Su código postal (LugarExpedicion de sus CFDI): uno por sucursal, distinto del domicilio fiscal del emisor.
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
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private UpdateBranchParamsSeries series;

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
     * Su código postal (LugarExpedicion de sus CFDI): uno por sucursal, distinto del domicilio fiscal del emisor.
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
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public UpdateBranchParamsSeries getSeries() {
        return series;
    }

    public UpdateBranchParams setSeries(UpdateBranchParamsSeries series) {
        this.series = series;
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
