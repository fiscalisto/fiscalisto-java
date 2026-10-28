// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation: Compensación del saldo a favor (CompensacionSaldosAFavor), con el 004.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation {
    /**
     * balance.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Saldo insoluto después de este pago (ImpSaldoInsoluto).
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * balance.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * Año (Ejercicio).
     */
    public Long getYear() {
        return year;
    }

    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Saldo insoluto después de este pago (ImpSaldoInsoluto).
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollOtherPaymentBalanceCompensation setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
