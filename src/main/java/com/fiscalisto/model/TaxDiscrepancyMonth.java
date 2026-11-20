// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TaxDiscrepancyMonth: TaxDiscrepancyMonth.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDiscrepancyMonth {
    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Sus gastos con CFDI a su nombre.
     */
    @JsonProperty("spending")
    private BigDecimal spending;

    /**
     * Los depósitos en sus cuentas.
     */
    @JsonProperty("deposits")
    private BigDecimal deposits;

    /**
     * Los traspasos entre sus cuentas.
     */
    @JsonProperty("own_transfers")
    private BigDecimal ownTransfers;

    /**
     * Los préstamos que clasificó.
     */
    @JsonProperty("loans")
    private BigDecimal loans;

    /**
     * Los ingresos declarados del mes.
     */
    @JsonProperty("declared_income")
    private BigDecimal declaredIncome;

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public TaxDiscrepancyMonth setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Sus gastos con CFDI a su nombre.
     */
    public BigDecimal getSpending() {
        return spending;
    }

    public TaxDiscrepancyMonth setSpending(BigDecimal spending) {
        this.spending = spending;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancyMonth setSpending(double spending) {
        return setSpending(BigDecimal.valueOf(spending));
    }

    /**
     * Los depósitos en sus cuentas.
     */
    public BigDecimal getDeposits() {
        return deposits;
    }

    public TaxDiscrepancyMonth setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancyMonth setDeposits(double deposits) {
        return setDeposits(BigDecimal.valueOf(deposits));
    }

    /**
     * Los traspasos entre sus cuentas.
     */
    public BigDecimal getOwnTransfers() {
        return ownTransfers;
    }

    public TaxDiscrepancyMonth setOwnTransfers(BigDecimal ownTransfers) {
        this.ownTransfers = ownTransfers;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancyMonth setOwnTransfers(double ownTransfers) {
        return setOwnTransfers(BigDecimal.valueOf(ownTransfers));
    }

    /**
     * Los préstamos que clasificó.
     */
    public BigDecimal getLoans() {
        return loans;
    }

    public TaxDiscrepancyMonth setLoans(BigDecimal loans) {
        this.loans = loans;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancyMonth setLoans(double loans) {
        return setLoans(BigDecimal.valueOf(loans));
    }

    /**
     * Los ingresos declarados del mes.
     */
    public BigDecimal getDeclaredIncome() {
        return declaredIncome;
    }

    public TaxDiscrepancyMonth setDeclaredIncome(BigDecimal declaredIncome) {
        this.declaredIncome = declaredIncome;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancyMonth setDeclaredIncome(double declaredIncome) {
        return setDeclaredIncome(BigDecimal.valueOf(declaredIncome));
    }
}
