// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SetOpeningBalancesParamsLine: SetOpeningBalancesParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetOpeningBalancesParamsLine {
    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts), por ejemplo 205-06.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Su saldo deudor.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * Su saldo acreedor.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts), por ejemplo 205-06.
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public SetOpeningBalancesParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Su saldo deudor.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public SetOpeningBalancesParamsLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public SetOpeningBalancesParamsLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * Su saldo acreedor.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public SetOpeningBalancesParamsLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public SetOpeningBalancesParamsLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
