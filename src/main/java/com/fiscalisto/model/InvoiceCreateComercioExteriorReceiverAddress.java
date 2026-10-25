// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateComercioExteriorReceiverAddress: Domicilio del receptor en el extranjero (Receptor Domicilio).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExteriorReceiverAddress {
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
     * Estado (Estado), c_Estado para USA y CAN.
     */
    @JsonProperty("state")
    private String state;

    /**
     * País (Pais), c_Pais.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Código postal en su país (CodigoPostal).
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

    public InvoiceCreateComercioExteriorReceiverAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior (NumeroExterior).
     */
    public String getExterior() {
        return exterior;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior (NumeroInterior).
     */
    public String getInterior() {
        return interior;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia (Colonia), en el extranjero como texto.
     */
    public String getColony() {
        return colony;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setColony(String colony) {
        this.colony = colony;
        return this;
    }

    /**
     * Localidad (Localidad), en el extranjero como texto.
     */
    public String getLocality() {
        return locality;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Municipio (Municipio), en el extranjero como texto.
     */
    public String getMunicipality() {
        return municipality;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Estado (Estado), c_Estado para USA y CAN.
     */
    public String getState() {
        return state;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * País (Pais), c_Pais.
     * <p>
     * Obligatorio.
     */
    public String getCountry() {
        return country;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Código postal en su país (CodigoPostal).
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public InvoiceCreateComercioExteriorReceiverAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
