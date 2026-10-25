// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCustomerForeign: Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCustomerForeign {
    /**
     * País de residencia fiscal, clave de 3 letras de c_Pais (USA, CAN…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Número de registro de identidad fiscal en su país (NumRegIdTrib).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * País de residencia fiscal, clave de 3 letras de c_Pais (USA, CAN…).
     * <p>
     * Obligatorio.
     */
    public String getCountry() {
        return country;
    }

    public InvoiceCreateCustomerForeign setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Número de registro de identidad fiscal en su país (NumRegIdTrib).
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateCustomerForeign setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }
}
