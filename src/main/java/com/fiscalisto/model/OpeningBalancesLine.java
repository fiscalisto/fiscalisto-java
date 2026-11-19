// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * OpeningBalancesLine: OpeningBalancesLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningBalancesLine {
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

    public OpeningBalancesLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public OpeningBalancesLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * El cargo, en pesos.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public OpeningBalancesLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public OpeningBalancesLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono, en pesos.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public OpeningBalancesLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public OpeningBalancesLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
