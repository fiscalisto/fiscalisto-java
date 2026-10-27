// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TaxStatusCertificateTaxSystem: TaxStatusCertificateTaxSystem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxStatusCertificateTaxSystem {
    /**
     * Clave del régimen fiscal (c_RegimenFiscal): 601, 612, 626…
     */
    @JsonProperty("code")
    private String code;

    /**
     * Nombre del régimen fiscal, como lo escribe el SAT.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Clave del régimen fiscal (c_RegimenFiscal): 601, 612, 626…
     */
    public String getCode() {
        return code;
    }

    public TaxStatusCertificateTaxSystem setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Nombre del régimen fiscal, como lo escribe el SAT.
     */
    public String getName() {
        return name;
    }

    public TaxStatusCertificateTaxSystem setName(String name) {
        this.name = name;
        return this;
    }
}
