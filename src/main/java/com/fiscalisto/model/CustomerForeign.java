// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerForeign: CustomerForeign.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerForeign {
    /**
     * País de residencia fiscal, clave de 3 letras de c_Pais (USA, CAN…).
     */
    @JsonProperty("country")
    private String country;

    /**
     * Número de registro de identidad fiscal en su país (NumRegIdTrib).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * País de residencia fiscal, clave de 3 letras de c_Pais (USA, CAN…).
     */
    public String getCountry() {
        return country;
    }

    public CustomerForeign setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Número de registro de identidad fiscal en su país (NumRegIdTrib).
     */
    public String getTaxId() {
        return taxId;
    }

    public CustomerForeign setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }
}
