// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateComercioExteriorOwner: InvoiceCreateComercioExteriorOwner.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExteriorOwner {
    /**
     * Número de registro tributario del propietario (NumRegIdTrib).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * País de residencia del propietario (ResidenciaFiscal), c_Pais.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Número de registro tributario del propietario (NumRegIdTrib).
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateComercioExteriorOwner setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * País de residencia del propietario (ResidenciaFiscal), c_Pais.
     * <p>
     * Obligatorio.
     */
    public String getCountry() {
        return country;
    }

    public InvoiceCreateComercioExteriorOwner setCountry(String country) {
        this.country = country;
        return this;
    }
}
