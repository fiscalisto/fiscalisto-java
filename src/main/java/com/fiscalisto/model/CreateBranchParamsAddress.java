// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBranchParamsAddress: La dirección que va en el PDF de sus facturas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBranchParamsAddress {
    /**
     * Calle.
     */
    @JsonProperty("street")
    private String street;

    /**
     * Número exterior.
     */
    @JsonProperty("exterior")
    private String exterior;

    /**
     * Número interior.
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
     * Estado; por omisión, el de su código postal.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Calle.
     */
    public String getStreet() {
        return street;
    }

    public CreateBranchParamsAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior.
     */
    public String getExterior() {
        return exterior;
    }

    public CreateBranchParamsAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior.
     */
    public String getInterior() {
        return interior;
    }

    public CreateBranchParamsAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    public CreateBranchParamsAddress setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * Municipio o alcaldía.
     */
    public String getCity() {
        return city;
    }

    public CreateBranchParamsAddress setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Estado; por omisión, el de su código postal.
     */
    public String getState() {
        return state;
    }

    public CreateBranchParamsAddress setState(String state) {
        this.state = state;
        return this;
    }
}
