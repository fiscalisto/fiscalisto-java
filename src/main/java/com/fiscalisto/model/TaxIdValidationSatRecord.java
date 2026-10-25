// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * TaxIdValidationSatRecord: TaxIdValidationSatRecord.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxIdValidationSatRecord {
    /**
     * El nombre o razón social, como lo tiene el SAT.
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * El código postal de su domicilio fiscal.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Sus regímenes vigentes (c_RegimenFiscal).
     */
    @JsonProperty("tax_systems")
    private List<String> taxSystems;

    /**
     * El nombre o razón social, como lo tiene el SAT.
     */
    public String getLegalName() {
        return legalName;
    }

    public TaxIdValidationSatRecord setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * El código postal de su domicilio fiscal.
     */
    public String getZip() {
        return zip;
    }

    public TaxIdValidationSatRecord setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Sus regímenes vigentes (c_RegimenFiscal).
     */
    public List<String> getTaxSystems() {
        return taxSystems;
    }

    public TaxIdValidationSatRecord setTaxSystems(List<String> taxSystems) {
        this.taxSystems = taxSystems;
        return this;
    }
}
