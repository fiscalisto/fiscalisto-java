// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation: CompensacionSaldosAFavor: solo con el 004.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation {
    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Año (Ejercicio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private BigDecimal year;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * Año (Ejercicio).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getYear() {
        return year;
    }

    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setYear(BigDecimal year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setYear(double year) {
        return setYear(BigDecimal.valueOf(year));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateOtherPaymentBalanceCompensation setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
