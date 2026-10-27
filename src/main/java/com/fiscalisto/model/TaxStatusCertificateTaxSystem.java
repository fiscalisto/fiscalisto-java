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
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     */
    @JsonProperty("code")
    private String code;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     */
    public String getCode() {
        return code;
    }

    public TaxStatusCertificateTaxSystem setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public TaxStatusCertificateTaxSystem setName(String name) {
        this.name = name;
        return this;
    }
}
