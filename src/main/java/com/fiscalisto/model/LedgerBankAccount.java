// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LedgerBankAccount: Una cuenta de banco que la contabilidad lleva aparte: su propia subcuenta de Bancos, con la moneda en que se revalúa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LedgerBankAccount {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Los últimos 4 dígitos de la cuenta, como los muestra su estado de cuenta.
     */
    @JsonProperty("last4")
    private String last4;

    /**
     * Su nombre en el catálogo.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su número de cuenta en el catálogo (código agrupador 102.01).
     */
    @JsonProperty("account")
    private String account;

    /**
     * Su moneda (MXN, USD…).
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public LedgerBankAccount setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public LedgerBankAccount setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public LedgerBankAccount setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Los últimos 4 dígitos de la cuenta, como los muestra su estado de cuenta.
     */
    public String getLast4() {
        return last4;
    }

    public LedgerBankAccount setLast4(String last4) {
        this.last4 = last4;
        return this;
    }

    /**
     * Su nombre en el catálogo.
     */
    public String getName() {
        return name;
    }

    public LedgerBankAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su número de cuenta en el catálogo (código agrupador 102.01).
     */
    public String getAccount() {
        return account;
    }

    public LedgerBankAccount setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Su moneda (MXN, USD…).
     */
    public String getCurrency() {
        return currency;
    }

    public LedgerBankAccount setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
