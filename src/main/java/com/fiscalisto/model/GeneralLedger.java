// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * GeneralLedger: El auxiliar de cuentas (libro mayor) de un periodo de hasta 12 meses: cada cuenta con su saldo inicial, cada cargo y abono con su póliza y el saldo que deja, y su saldo final.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralLedger {
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
     * El primer mes (AAAA-MM).
     */
    @JsonProperty("from_month")
    private String fromMonth;

    /**
     * El último mes (AAAA-MM).
     */
    @JsonProperty("to_month")
    private String toMonth;

    /**
     * Cada cuenta que se movió en el periodo (o la que pidió con account): sus saldos, sus sumas y sus movimientos.
     */
    @JsonProperty("accounts")
    private List<GeneralLedgerAccount> accounts;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public GeneralLedger setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public GeneralLedger setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public GeneralLedger setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El primer mes (AAAA-MM).
     */
    public String getFromMonth() {
        return fromMonth;
    }

    public GeneralLedger setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    /**
     * El último mes (AAAA-MM).
     */
    public String getToMonth() {
        return toMonth;
    }

    public GeneralLedger setToMonth(String toMonth) {
        this.toMonth = toMonth;
        return this;
    }

    /**
     * Cada cuenta que se movió en el periodo (o la que pidió con account): sus saldos, sus sumas y sus movimientos.
     */
    public List<GeneralLedgerAccount> getAccounts() {
        return accounts;
    }

    public GeneralLedger setAccounts(List<GeneralLedgerAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
