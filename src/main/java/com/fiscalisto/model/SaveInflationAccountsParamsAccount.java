// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SaveInflationAccountsParamsAccount: SaveInflationAccountsParamsAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveInflationAccountsParamsAccount {
    /**
     * El número de la cuenta en el catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * credit (crédito, art. 45), debt (deuda, art. 46) o none. null regresa al de su código agrupador.
     * <p>
     * Valores: credit, debt, none.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("treatment")
    private String treatment;

    /**
     * El número de la cuenta en el catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public SaveInflationAccountsParamsAccount setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * credit (crédito, art. 45), debt (deuda, art. 46) o none. null regresa al de su código agrupador.
     * <p>
     * Valores: credit, debt, none.
     * <p>
     * Obligatorio.
     */
    public String getTreatment() {
        return treatment;
    }

    public SaveInflationAccountsParamsAccount setTreatment(String treatment) {
        this.treatment = treatment;
        return this;
    }
}
