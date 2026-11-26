// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParamsComercioExteriorRecipientAddress: Domicilio del destinatario (Domicilio).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsComercioExteriorRecipientAddress {
    /**
     * Calle (Calle).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("street")
    private String street;

    /**
     * Número exterior (NumeroExterior).
     */
    @JsonProperty("exterior")
    private String exterior;

    /**
     * Número interior (NumeroInterior).
     */
    @JsonProperty("interior")
    private String interior;

    /**
     * Colonia (Colonia), en el extranjero como texto.
     */
    @JsonProperty("colony")
    private String colony;

    /**
     * Localidad (Localidad), en el extranjero como texto.
     */
    @JsonProperty("locality")
    private String locality;

    /**
     * Municipio (Municipio), en el extranjero como texto.
     */
    @JsonProperty("municipality")
    private String municipality;

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    @JsonProperty("state")
    private String state;

    /**
     * País (Pais), c_Pais. Por omisión MEX.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Código postal (CodigoPostal). En México se deducen de él estado, municipio y localidad.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Calle (Calle).
     * <p>
     * Obligatorio.
     */
    public String getStreet() {
        return street;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior (NumeroExterior).
     */
    public String getExterior() {
        return exterior;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior (NumeroInterior).
     */
    public String getInterior() {
        return interior;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia (Colonia), en el extranjero como texto.
     */
    public String getColony() {
        return colony;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setColony(String colony) {
        this.colony = colony;
        return this;
    }

    /**
     * Localidad (Localidad), en el extranjero como texto.
     */
    public String getLocality() {
        return locality;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Municipio (Municipio), en el extranjero como texto.
     */
    public String getMunicipality() {
        return municipality;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    public String getState() {
        return state;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * País (Pais), c_Pais. Por omisión MEX.
     * <p>
     * Obligatorio.
     */
    public String getCountry() {
        return country;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Código postal (CodigoPostal). En México se deducen de él estado, municipio y localidad.
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public UpdateInvoiceParamsComercioExteriorRecipientAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
