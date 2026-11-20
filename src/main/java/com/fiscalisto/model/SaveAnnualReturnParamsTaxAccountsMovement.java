// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveAnnualReturnParamsTaxAccountsMovement: SaveAnnualReturnParamsTaxAccountsMovement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsTaxAccountsMovement {
    /**
     * El día en que se pagó o se recibió, en este año.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * dividend_paid (dividendo pagado), dividend_received (de otra persona moral mexicana, suma a la CUFIN), capital_contribution (aportación, suma a la CUCA) o capital_reduction (reembolso o reducción de capital, artículo 78).
     * <p>
     * Valores: dividend_paid, dividend_received, capital_contribution, capital_reduction.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Un dividendo o reembolso: de qué CUFIN sale primero (por omisión cufin, la de 2014 en adelante).
     * <p>
     * Valores: cufin, cufin_2013.
     */
    @JsonProperty("account")
    private String account;

    /**
     * true si se paga a una persona física o a un residente en el extranjero: se le retiene el 10% (artículo 140).
     */
    @JsonProperty("individual")
    private Boolean individual;

    /**
     * capital_reduction: las acciones que se reembolsan.
     */
    @JsonProperty("shares")
    private BigDecimal shares;

    /**
     * capital_reduction: el total de acciones a esa fecha.
     */
    @JsonProperty("total_shares")
    private BigDecimal totalShares;

    /**
     * capital_reduction: el capital contable del estado de posición financiera aprobado, actualizado (artículo 78, fracción II).
     */
    @JsonProperty("equity")
    private BigDecimal equity;

    /**
     * El día en que se pagó o se recibió, en este año.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * dividend_paid (dividendo pagado), dividend_received (de otra persona moral mexicana, suma a la CUFIN), capital_contribution (aportación, suma a la CUCA) o capital_reduction (reembolso o reducción de capital, artículo 78).
     * <p>
     * Valores: dividend_paid, dividend_received, capital_contribution, capital_reduction.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsMovement setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Un dividendo o reembolso: de qué CUFIN sale primero (por omisión cufin, la de 2014 en adelante).
     * <p>
     * Valores: cufin, cufin_2013.
     */
    public String getAccount() {
        return account;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * true si se paga a una persona física o a un residente en el extranjero: se le retiene el 10% (artículo 140).
     */
    public Boolean getIndividual() {
        return individual;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setIndividual(Boolean individual) {
        this.individual = individual;
        return this;
    }

    /**
     * capital_reduction: las acciones que se reembolsan.
     */
    public BigDecimal getShares() {
        return shares;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setShares(BigDecimal shares) {
        this.shares = shares;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsMovement setShares(double shares) {
        return setShares(BigDecimal.valueOf(shares));
    }

    /**
     * capital_reduction: el total de acciones a esa fecha.
     */
    public BigDecimal getTotalShares() {
        return totalShares;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setTotalShares(BigDecimal totalShares) {
        this.totalShares = totalShares;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsMovement setTotalShares(double totalShares) {
        return setTotalShares(BigDecimal.valueOf(totalShares));
    }

    /**
     * capital_reduction: el capital contable del estado de posición financiera aprobado, actualizado (artículo 78, fracción II).
     */
    public BigDecimal getEquity() {
        return equity;
    }

    public SaveAnnualReturnParamsTaxAccountsMovement setEquity(BigDecimal equity) {
        this.equity = equity;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsMovement setEquity(double equity) {
        return setEquity(BigDecimal.valueOf(equity));
    }
}
