// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateConsolidationEliminationParamsLine: CreateConsolidationEliminationParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateConsolidationEliminationParamsLine {
    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

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
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public CreateConsolidationEliminationParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El cargo.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public CreateConsolidationEliminationParamsLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public CreateConsolidationEliminationParamsLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public CreateConsolidationEliminationParamsLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public CreateConsolidationEliminationParamsLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
