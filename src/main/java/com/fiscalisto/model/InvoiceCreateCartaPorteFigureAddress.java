// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteFigureAddress: Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteFigureAddress {
    /**
     * Calle (Calle).
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
     * Código postal (CodigoPostal). En México se deducen de él estado, municipio y localidad.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * País (Pais), c_Pais. Por omisión MEX.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Municipio (Municipio), en el extranjero como texto.
     */
    @JsonProperty("municipality")
    private String municipality;

    /**
     * Localidad (Localidad), en el extranjero como texto.
     */
    @JsonProperty("locality")
    private String locality;

    /**
     * Colonia (Colonia), en el extranjero como texto.
     */
    @JsonProperty("colony")
    private String colony;

    /**
     * Calle (Calle).
     */
    public String getStreet() {
        return street;
    }

    public InvoiceCreateCartaPorteFigureAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior (NumeroExterior).
     */
    public String getExterior() {
        return exterior;
    }

    public InvoiceCreateCartaPorteFigureAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior (NumeroInterior).
     */
    public String getInterior() {
        return interior;
    }

    public InvoiceCreateCartaPorteFigureAddress setInterior(String interior) {
        this.interior = interior;
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

    public InvoiceCreateCartaPorteFigureAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * País (Pais), c_Pais. Por omisión MEX.
     */
    public String getCountry() {
        return country;
    }

    public InvoiceCreateCartaPorteFigureAddress setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    public String getState() {
        return state;
    }

    public InvoiceCreateCartaPorteFigureAddress setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Municipio (Municipio), en el extranjero como texto.
     */
    public String getMunicipality() {
        return municipality;
    }

    public InvoiceCreateCartaPorteFigureAddress setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Localidad (Localidad), en el extranjero como texto.
     */
    public String getLocality() {
        return locality;
    }

    public InvoiceCreateCartaPorteFigureAddress setLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Colonia (Colonia), en el extranjero como texto.
     */
    public String getColony() {
        return colony;
    }

    public InvoiceCreateCartaPorteFigureAddress setColony(String colony) {
        this.colony = colony;
        return this;
    }
}
