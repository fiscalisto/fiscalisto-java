// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateBankTransactionsParams: los campos de «Mandar depósitos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBankTransactionsParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La cuenta (CLABE o número; se guardan sus últimos 4 dígitos).
     */
    @JsonProperty("account")
    private String account;

    /**
     * Los depósitos, hasta 1,000 por solicitud.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("transactions")
    private List<CreateBankTransactionsParamsTransaction> transactions;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateBankTransactionsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La cuenta (CLABE o número; se guardan sus últimos 4 dígitos).
     */
    public String getAccount() {
        return account;
    }

    public CreateBankTransactionsParams setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Los depósitos, hasta 1,000 por solicitud.
     * <p>
     * Obligatorio.
     */
    public List<CreateBankTransactionsParamsTransaction> getTransactions() {
        return transactions;
    }

    public CreateBankTransactionsParams setTransactions(List<CreateBankTransactionsParamsTransaction> transactions) {
        this.transactions = transactions;
        return this;
    }
}
