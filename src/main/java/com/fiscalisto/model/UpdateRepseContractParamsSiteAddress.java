// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRepseContractParamsSiteAddress: El centro de trabajo donde trabajan las personas que pone a disposición.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRepseContractParamsSiteAddress {
    /**
     * Calle.
     * <p>
     * Obligatorio.
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
     * Código postal, 5 dígitos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Municipio o demarcación territorial, sin abreviar.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("municipality")
    private String municipality;

    /**
     * Estado (c_Estado: NLE, CMX…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Calle.
     * <p>
     * Obligatorio.
     */
    public String getStreet() {
        return street;
    }

    public UpdateRepseContractParamsSiteAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior.
     */
    public String getExterior() {
        return exterior;
    }

    public UpdateRepseContractParamsSiteAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior.
     */
    public String getInterior() {
        return interior;
    }

    public UpdateRepseContractParamsSiteAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    public UpdateRepseContractParamsSiteAddress setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * Código postal, 5 dígitos.
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public UpdateRepseContractParamsSiteAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Municipio o demarcación territorial, sin abreviar.
     * <p>
     * Obligatorio.
     */
    public String getMunicipality() {
        return municipality;
    }

    public UpdateRepseContractParamsSiteAddress setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Estado (c_Estado: NLE, CMX…).
     * <p>
     * Obligatorio.
     */
    public String getState() {
        return state;
    }

    public UpdateRepseContractParamsSiteAddress setState(String state) {
        this.state = state;
        return this;
    }
}
