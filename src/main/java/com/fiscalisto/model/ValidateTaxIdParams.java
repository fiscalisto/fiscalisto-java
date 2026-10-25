// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValidateTaxIdParams: los campos de «Validar los datos fiscales de un cliente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidateTaxIdParams {
    /**
     * El RFC del cliente.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El nombre o razón social que va a poner en la factura.
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Su régimen fiscal (c_RegimenFiscal), como 601 o 612.
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * El código postal de su domicilio fiscal.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * El uso del CFDI (c_UsoCFDI), como G03.
     */
    @JsonProperty("use")
    private String use;

    /**
     * El idCIF de su constancia de situación fiscal (11 dígitos, arriba a la izquierda, junto al QR). Con él se compara todo con lo que tiene el SAT.
     */
    @JsonProperty("cif_id")
    private String cifId;

    /**
     * El RFC del cliente.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public ValidateTaxIdParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El nombre o razón social que va a poner en la factura.
     */
    public String getLegalName() {
        return legalName;
    }

    public ValidateTaxIdParams setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Su régimen fiscal (c_RegimenFiscal), como 601 o 612.
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public ValidateTaxIdParams setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * El código postal de su domicilio fiscal.
     */
    public String getZip() {
        return zip;
    }

    public ValidateTaxIdParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * El uso del CFDI (c_UsoCFDI), como G03.
     */
    public String getUse() {
        return use;
    }

    public ValidateTaxIdParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * El idCIF de su constancia de situación fiscal (11 dígitos, arriba a la izquierda, junto al QR). Con él se compara todo con lo que tiene el SAT.
     */
    public String getCifId() {
        return cifId;
    }

    public ValidateTaxIdParams setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
}
