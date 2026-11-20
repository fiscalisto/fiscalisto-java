// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ConsolidationEliminationLine: ConsolidationEliminationLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidationEliminationLine {
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
     * El cargo.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public ConsolidationEliminationLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public ConsolidationEliminationLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * El cargo.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public ConsolidationEliminationLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public ConsolidationEliminationLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public ConsolidationEliminationLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public ConsolidationEliminationLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
