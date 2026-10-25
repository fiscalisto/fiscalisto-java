// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateComercioExteriorIssuerAddress: Domicilio del emisor (Emisor Domicilio): calle y números; lo demás sale de su código postal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExteriorIssuerAddress {
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
     * Código postal del emisor (CodigoPostal).
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

    public InvoiceCreateComercioExteriorIssuerAddress setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Número exterior (NumeroExterior).
     */
    public String getExterior() {
        return exterior;
    }

    public InvoiceCreateComercioExteriorIssuerAddress setExterior(String exterior) {
        this.exterior = exterior;
        return this;
    }

    /**
     * Número interior (NumeroInterior).
     */
    public String getInterior() {
        return interior;
    }

    public InvoiceCreateComercioExteriorIssuerAddress setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    /**
     * Código postal del emisor (CodigoPostal).
     */
    public String getZip() {
        return zip;
    }

    public InvoiceCreateComercioExteriorIssuerAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
