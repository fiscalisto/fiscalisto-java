// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RepseContractSiteAddress: El centro de trabajo donde trabajan las personas que pone a disposición.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseContractSiteAddress {
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
     * Código postal.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Municipio o demarcación territorial.
     */
    @JsonProperty("municipality")
    private String municipality;

    /**
     * Estado (c_Estado).
     */
    @JsonProperty("state")
    private String state;

    /**
     * Calle.
     */
    public String getStreet() {
        return street;
    }

    public RepseContractSiteAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior.
     */
    public String getExterior() {
        return exterior;
    }

    public RepseContractSiteAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior.
     */
    public String getInterior() {
        return interior;
    }

    public RepseContractSiteAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    public RepseContractSiteAddress setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * Código postal.
     */
    public String getZip() {
        return zip;
    }

    public RepseContractSiteAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Municipio o demarcación territorial.
     */
    public String getMunicipality() {
        return municipality;
    }

    public RepseContractSiteAddress setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Estado (c_Estado).
     */
    public String getState() {
        return state;
    }

    public RepseContractSiteAddress setState(String state) {
        this.state = state;
        return this;
    }
}
