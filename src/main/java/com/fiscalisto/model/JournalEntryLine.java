// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * JournalEntryLine: JournalEntryLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JournalEntryLine {
    /**
     * El número de cuenta.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El nombre de la cuenta.
     */
    @JsonProperty("account_name")
    private String accountName;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * El cargo, en pesos.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono, en pesos.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public JournalEntryLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public JournalEntryLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public JournalEntryLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * El cargo, en pesos.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public JournalEntryLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    public JournalEntryLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono, en pesos.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public JournalEntryLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    public JournalEntryLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
