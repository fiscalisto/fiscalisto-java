// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLedgerBankAccountParams: los campos de «Cambiar la moneda de una cuenta de banco».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateLedgerBankAccountParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La moneda de la cuenta (ISO 4217: MXN, USD…). Una en otra moneda se revalúa con las revaluaciones cambiarias.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Su nombre en el catálogo.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateLedgerBankAccountParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La moneda de la cuenta (ISO 4217: MXN, USD…). Una en otra moneda se revalúa con las revaluaciones cambiarias.
     * <p>
     * Obligatorio.
     */
    public String getCurrency() {
        return currency;
    }

    public UpdateLedgerBankAccountParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Su nombre en el catálogo.
     */
    public String getName() {
        return name;
    }

    public UpdateLedgerBankAccountParams setName(String name) {
        this.name = name;
        return this;
    }
}
