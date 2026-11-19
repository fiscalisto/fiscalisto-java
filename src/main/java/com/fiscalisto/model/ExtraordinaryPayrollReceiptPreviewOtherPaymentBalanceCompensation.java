// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation: Compensación del saldo a favor (CompensacionSaldosAFavor), con el 004.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation {
    /**
     * Saldo a favor (SaldoAFavor).
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Año del saldo a favor (Año).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Remanente del saldo a favor (RemanenteSalFav).
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * Saldo a favor (SaldoAFavor).
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * Año del saldo a favor (Año).
     */
    public Long getYear() {
        return year;
    }

    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Remanente del saldo a favor (RemanenteSalFav).
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewOtherPaymentBalanceCompensation setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
