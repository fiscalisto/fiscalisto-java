// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BranchAddress: Su dirección, en el PDF de sus facturas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BranchAddress {
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
     * Colonia.
     */
    @JsonProperty("neighborhood")
    private String neighborhood;

    /**
     * Municipio o alcaldía.
     */
    @JsonProperty("city")
    private String city;

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Calle (Calle).
     */
    public String getStreet() {
        return street;
    }

    public BranchAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior (NumeroExterior).
     */
    public String getExterior() {
        return exterior;
    }

    public BranchAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior (NumeroInterior).
     */
    public String getInterior() {
        return interior;
    }

    public BranchAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    public BranchAddress setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * Municipio o alcaldía.
     */
    public String getCity() {
        return city;
    }

    public BranchAddress setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Estado (Estado): en el extranjero c_Estado para USA y CAN, o texto.
     */
    public String getState() {
        return state;
    }

    public BranchAddress setState(String state) {
        this.state = state;
        return this;
    }
}
