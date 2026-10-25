// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateItemThirdParty: A cuenta de terceros (ACuentaTerceros): RFC, nombre, régimen y código postal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateItemThirdParty {
    /**
     * RFC de a cuenta de quién (RfcACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre (NombreACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Régimen fiscal (RegimenFiscalACuentaTerceros), c_RegimenFiscal.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * Código postal de su domicilio fiscal (DomicilioFiscalACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * RFC de a cuenta de quién (RfcACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateItemThirdParty setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre (NombreACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateItemThirdParty setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscalACuentaTerceros), c_RegimenFiscal.
     * <p>
     * Obligatorio.
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public InvoiceCreateItemThirdParty setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal de su domicilio fiscal (DomicilioFiscalACuentaTerceros).
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public InvoiceCreateItemThirdParty setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
