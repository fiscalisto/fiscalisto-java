// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InflationAccounts: Cómo cuentan las cuentas en el ajuste anual por inflación, después del cambio.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InflationAccounts {
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
     * Las cuentas que cambió, con cómo cuentan ahora.
     */
    @JsonProperty("accounts")
    private List<InflationAccountsAccount> accounts;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public InflationAccounts setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public InflationAccounts setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public InflationAccounts setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las cuentas que cambió, con cómo cuentan ahora.
     */
    public List<InflationAccountsAccount> getAccounts() {
        return accounts;
    }

    public InflationAccounts setAccounts(List<InflationAccountsAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
