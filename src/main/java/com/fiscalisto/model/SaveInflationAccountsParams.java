// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SaveInflationAccountsParams: los campos de «Cambiar cómo cuenta una cuenta en el ajuste por inflación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveInflationAccountsParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Las cuentas que cambia.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("accounts")
    private List<SaveInflationAccountsParamsAccount> accounts;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SaveInflationAccountsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las cuentas que cambia.
     * <p>
     * Obligatorio.
     */
    public List<SaveInflationAccountsParamsAccount> getAccounts() {
        return accounts;
    }

    public SaveInflationAccountsParams setAccounts(List<SaveInflationAccountsParamsAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
