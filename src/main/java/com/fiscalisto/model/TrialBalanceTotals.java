// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TrialBalanceTotals: Cargos y abonos del mes: siempre iguales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrialBalanceTotals {
    /**
     * Todos los cargos del mes.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * Todos los abonos del mes.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * Todos los cargos del mes.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public TrialBalanceTotals setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public TrialBalanceTotals setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * Todos los abonos del mes.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public TrialBalanceTotals setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public TrialBalanceTotals setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }
}
