// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRepseContractParamsClientAddress: Domicilio fiscal del cliente.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRepseContractParamsClientAddress {
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

    public CreateRepseContractParamsClientAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior.
     */
    public String getExterior() {
        return exterior;
    }

    public CreateRepseContractParamsClientAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior.
     */
    public String getInterior() {
        return interior;
    }

    public CreateRepseContractParamsClientAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Colonia.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    public CreateRepseContractParamsClientAddress setNeighborhood(String neighborhood) {
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

    public CreateRepseContractParamsClientAddress setZip(String zip) {
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

    public CreateRepseContractParamsClientAddress setMunicipality(String municipality) {
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

    public CreateRepseContractParamsClientAddress setState(String state) {
        this.state = state;
        return this;
    }
}
