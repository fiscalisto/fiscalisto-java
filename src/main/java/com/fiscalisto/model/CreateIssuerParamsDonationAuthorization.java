// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIssuerParamsDonationAuthorization: CreateIssuerParamsDonationAuthorization.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateIssuerParamsDonationAuthorization {
    /**
     * Número del oficio de autorización, hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Fecha del oficio, AAAA-MM-DD; no puede ser futura.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Número del oficio de autorización, hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public CreateIssuerParamsDonationAuthorization setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Fecha del oficio, AAAA-MM-DD; no puede ser futura.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateIssuerParamsDonationAuthorization setDate(String date) {
        this.date = date;
        return this;
    }
}
