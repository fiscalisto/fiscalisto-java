// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * TrialBalance: La balanza de comprobación de un mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrialBalance {
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
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Cuántas pólizas tuvo el mes.
     */
    @JsonProperty("journal_entries")
    private Long journalEntries;

    /**
     * Cada cuenta con movimiento o saldo: saldo inicial, cargos, abonos y saldo final.
     */
    @JsonProperty("accounts")
    private List<TrialBalanceAccount> accounts;

    /**
     * Cargos y abonos del mes: siempre iguales.
     */
    @JsonProperty("totals")
    private TrialBalanceTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TrialBalance setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TrialBalance setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public TrialBalance setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public TrialBalance setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Cuántas pólizas tuvo el mes.
     */
    public Long getJournalEntries() {
        return journalEntries;
    }

    public TrialBalance setJournalEntries(Long journalEntries) {
        this.journalEntries = journalEntries;
        return this;
    }

    public TrialBalance setJournalEntries(long journalEntries) {
        return setJournalEntries(Long.valueOf(journalEntries));
    }

    /**
     * Cada cuenta con movimiento o saldo: saldo inicial, cargos, abonos y saldo final.
     */
    public List<TrialBalanceAccount> getAccounts() {
        return accounts;
    }

    public TrialBalance setAccounts(List<TrialBalanceAccount> accounts) {
        this.accounts = accounts;
        return this;
    }

    /**
     * Cargos y abonos del mes: siempre iguales.
     */
    public TrialBalanceTotals getTotals() {
        return totals;
    }

    public TrialBalance setTotals(TrialBalanceTotals totals) {
        this.totals = totals;
        return this;
    }
}
