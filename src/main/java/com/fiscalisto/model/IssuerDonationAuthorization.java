// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerDonationAuthorization: IssuerDonationAuthorization.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerDonationAuthorization {
    /**
     * Número del oficio de autorización, hasta 100 caracteres.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Fecha del oficio, AAAA-MM-DD; no puede ser futura.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Número del oficio de autorización, hasta 100 caracteres.
     */
    public String getNumber() {
        return number;
    }

    public IssuerDonationAuthorization setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Fecha del oficio, AAAA-MM-DD; no puede ser futura.
     */
    public String getDate() {
        return date;
    }

    public IssuerDonationAuthorization setDate(String date) {
        this.date = date;
        return this;
    }
}
