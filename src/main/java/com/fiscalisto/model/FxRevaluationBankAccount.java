// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FxRevaluationBankAccount: FxRevaluationBankAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FxRevaluationBankAccount {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El saldo de su último estado de cuenta del mes, en su moneda, o null si no hay.
     */
    @JsonProperty("statement_balance")
    private BigDecimal statementBalance;

    /**
     * La fecha de ese saldo, o null.
     */
    @JsonProperty("statement_date")
    private String statementDate;

    /**
     * Los pesos que la cuenta lleva en los libros al cierre, sin la póliza de revaluación.
     */
    @JsonProperty("book_balance")
    private BigDecimal bookBalance;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FxRevaluationBankAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public FxRevaluationBankAccount setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El saldo de su último estado de cuenta del mes, en su moneda, o null si no hay.
     */
    public BigDecimal getStatementBalance() {
        return statementBalance;
    }

    public FxRevaluationBankAccount setStatementBalance(BigDecimal statementBalance) {
        this.statementBalance = statementBalance;
        return this;
    }

    @JsonIgnore
    public FxRevaluationBankAccount setStatementBalance(double statementBalance) {
        return setStatementBalance(BigDecimal.valueOf(statementBalance));
    }

    /**
     * La fecha de ese saldo, o null.
     */
    public String getStatementDate() {
        return statementDate;
    }

    public FxRevaluationBankAccount setStatementDate(String statementDate) {
        this.statementDate = statementDate;
        return this;
    }

    /**
     * Los pesos que la cuenta lleva en los libros al cierre, sin la póliza de revaluación.
     */
    public BigDecimal getBookBalance() {
        return bookBalance;
    }

    public FxRevaluationBankAccount setBookBalance(BigDecimal bookBalance) {
        this.bookBalance = bookBalance;
        return this;
    }

    @JsonIgnore
    public FxRevaluationBankAccount setBookBalance(double bookBalance) {
        return setBookBalance(BigDecimal.valueOf(bookBalance));
    }
}
