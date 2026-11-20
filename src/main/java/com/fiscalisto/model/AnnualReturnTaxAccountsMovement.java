// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnTaxAccountsMovement: AnnualReturnTaxAccountsMovement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsMovement {
    /**
     * El día del movimiento.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El tipo de movimiento.
     * <p>
     * Valores: dividend_paid, dividend_received, capital_contribution, capital_reduction.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Lo pagado, recibido o aportado.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * De qué CUFIN sale primero.
     * <p>
     * Valores: cufin, cufin_2013.
     */
    @JsonProperty("account")
    private String account;

    /**
     * true si es a una persona física o del extranjero.
     */
    @JsonProperty("individual")
    private Boolean individual;

    /**
     * El factor con que se actualizó la cuenta al mes del movimiento (artículos 77 y 78).
     */
    @JsonProperty("factor")
    private BigDecimal factor;

    /**
     * true si algún INPC aún no se publica.
     */
    @JsonProperty("estimated")
    private Boolean estimated;

    /**
     * La utilidad distribuida: el dividendo, o la del artículo 78 en un reembolso.
     */
    @JsonProperty("distributed_profit")
    private BigDecimal distributedProfit;

    /**
     * Lo que sale de la CUFIN de 2014 en adelante.
     */
    @JsonProperty("from_cufin")
    private BigDecimal fromCufin;

    /**
     * Lo que sale de la CUFIN hasta 2013.
     */
    @JsonProperty("from_cufin_2013")
    private BigDecimal fromCufin2013;

    /**
     * Lo que no sale de la CUFIN: paga el ISR del artículo 10.
     */
    @JsonProperty("not_from_cufin")
    private BigDecimal notFromCufin;

    /**
     * El ISR del artículo 10: not_from_cufin × 1.4286 × 30%.
     */
    @JsonProperty("dividend_tax")
    private BigDecimal dividendTax;

    /**
     * El día 17 del mes siguiente, cuando se entera (artículo 10).
     */
    @JsonProperty("dividend_tax_due")
    private String dividendTaxDue;

    /**
     * El 10% a retener a una persona física (artículo 140), sobre lo de 2014 en adelante.
     */
    @JsonProperty("withholding")
    private BigDecimal withholding;

    /**
     * capital_reduction: la CUCA por acción a esa fecha.
     */
    @JsonProperty("cuca_per_share")
    private BigDecimal cucaPerShare;

    /**
     * capital_reduction: lo que sale de la CUCA.
     */
    @JsonProperty("from_cuca")
    private BigDecimal fromCuca;

    /**
     * capital_reduction: la utilidad distribuida de la fracción I.
     */
    @JsonProperty("distributed_profit_fraction_i")
    private BigDecimal distributedProfitFractionI;

    /**
     * capital_reduction: la de la fracción II, que después cuenta como aportación.
     */
    @JsonProperty("distributed_profit_fraction_ii")
    private BigDecimal distributedProfitFractionIi;

    /**
     * Los saldos después del movimiento.
     */
    @JsonProperty("balances")
    private AnnualReturnTaxAccountsMovementBalances balances;

    /**
     * El día del movimiento.
     */
    public String getDate() {
        return date;
    }

    public AnnualReturnTaxAccountsMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El tipo de movimiento.
     * <p>
     * Valores: dividend_paid, dividend_received, capital_contribution, capital_reduction.
     */
    public String getType() {
        return type;
    }

    public AnnualReturnTaxAccountsMovement setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Lo pagado, recibido o aportado.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnTaxAccountsMovement setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * De qué CUFIN sale primero.
     * <p>
     * Valores: cufin, cufin_2013.
     */
    public String getAccount() {
        return account;
    }

    public AnnualReturnTaxAccountsMovement setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * true si es a una persona física o del extranjero.
     */
    public Boolean getIndividual() {
        return individual;
    }

    public AnnualReturnTaxAccountsMovement setIndividual(Boolean individual) {
        this.individual = individual;
        return this;
    }

    /**
     * El factor con que se actualizó la cuenta al mes del movimiento (artículos 77 y 78).
     */
    public BigDecimal getFactor() {
        return factor;
    }

    public AnnualReturnTaxAccountsMovement setFactor(BigDecimal factor) {
        this.factor = factor;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setFactor(double factor) {
        return setFactor(BigDecimal.valueOf(factor));
    }

    /**
     * true si algún INPC aún no se publica.
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public AnnualReturnTaxAccountsMovement setEstimated(Boolean estimated) {
        this.estimated = estimated;
        return this;
    }

    /**
     * La utilidad distribuida: el dividendo, o la del artículo 78 en un reembolso.
     */
    public BigDecimal getDistributedProfit() {
        return distributedProfit;
    }

    public AnnualReturnTaxAccountsMovement setDistributedProfit(BigDecimal distributedProfit) {
        this.distributedProfit = distributedProfit;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setDistributedProfit(double distributedProfit) {
        return setDistributedProfit(BigDecimal.valueOf(distributedProfit));
    }

    /**
     * Lo que sale de la CUFIN de 2014 en adelante.
     */
    public BigDecimal getFromCufin() {
        return fromCufin;
    }

    public AnnualReturnTaxAccountsMovement setFromCufin(BigDecimal fromCufin) {
        this.fromCufin = fromCufin;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setFromCufin(double fromCufin) {
        return setFromCufin(BigDecimal.valueOf(fromCufin));
    }

    /**
     * Lo que sale de la CUFIN hasta 2013.
     */
    public BigDecimal getFromCufin2013() {
        return fromCufin2013;
    }

    public AnnualReturnTaxAccountsMovement setFromCufin2013(BigDecimal fromCufin2013) {
        this.fromCufin2013 = fromCufin2013;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setFromCufin2013(double fromCufin2013) {
        return setFromCufin2013(BigDecimal.valueOf(fromCufin2013));
    }

    /**
     * Lo que no sale de la CUFIN: paga el ISR del artículo 10.
     */
    public BigDecimal getNotFromCufin() {
        return notFromCufin;
    }

    public AnnualReturnTaxAccountsMovement setNotFromCufin(BigDecimal notFromCufin) {
        this.notFromCufin = notFromCufin;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setNotFromCufin(double notFromCufin) {
        return setNotFromCufin(BigDecimal.valueOf(notFromCufin));
    }

    /**
     * El ISR del artículo 10: not_from_cufin × 1.4286 × 30%.
     */
    public BigDecimal getDividendTax() {
        return dividendTax;
    }

    public AnnualReturnTaxAccountsMovement setDividendTax(BigDecimal dividendTax) {
        this.dividendTax = dividendTax;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setDividendTax(double dividendTax) {
        return setDividendTax(BigDecimal.valueOf(dividendTax));
    }

    /**
     * El día 17 del mes siguiente, cuando se entera (artículo 10).
     */
    public String getDividendTaxDue() {
        return dividendTaxDue;
    }

    public AnnualReturnTaxAccountsMovement setDividendTaxDue(String dividendTaxDue) {
        this.dividendTaxDue = dividendTaxDue;
        return this;
    }

    /**
     * El 10% a retener a una persona física (artículo 140), sobre lo de 2014 en adelante.
     */
    public BigDecimal getWithholding() {
        return withholding;
    }

    public AnnualReturnTaxAccountsMovement setWithholding(BigDecimal withholding) {
        this.withholding = withholding;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setWithholding(double withholding) {
        return setWithholding(BigDecimal.valueOf(withholding));
    }

    /**
     * capital_reduction: la CUCA por acción a esa fecha.
     */
    public BigDecimal getCucaPerShare() {
        return cucaPerShare;
    }

    public AnnualReturnTaxAccountsMovement setCucaPerShare(BigDecimal cucaPerShare) {
        this.cucaPerShare = cucaPerShare;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setCucaPerShare(double cucaPerShare) {
        return setCucaPerShare(BigDecimal.valueOf(cucaPerShare));
    }

    /**
     * capital_reduction: lo que sale de la CUCA.
     */
    public BigDecimal getFromCuca() {
        return fromCuca;
    }

    public AnnualReturnTaxAccountsMovement setFromCuca(BigDecimal fromCuca) {
        this.fromCuca = fromCuca;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setFromCuca(double fromCuca) {
        return setFromCuca(BigDecimal.valueOf(fromCuca));
    }

    /**
     * capital_reduction: la utilidad distribuida de la fracción I.
     */
    public BigDecimal getDistributedProfitFractionI() {
        return distributedProfitFractionI;
    }

    public AnnualReturnTaxAccountsMovement setDistributedProfitFractionI(BigDecimal distributedProfitFractionI) {
        this.distributedProfitFractionI = distributedProfitFractionI;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setDistributedProfitFractionI(double distributedProfitFractionI) {
        return setDistributedProfitFractionI(BigDecimal.valueOf(distributedProfitFractionI));
    }

    /**
     * capital_reduction: la de la fracción II, que después cuenta como aportación.
     */
    public BigDecimal getDistributedProfitFractionIi() {
        return distributedProfitFractionIi;
    }

    public AnnualReturnTaxAccountsMovement setDistributedProfitFractionIi(BigDecimal distributedProfitFractionIi) {
        this.distributedProfitFractionIi = distributedProfitFractionIi;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsMovement setDistributedProfitFractionIi(double distributedProfitFractionIi) {
        return setDistributedProfitFractionIi(BigDecimal.valueOf(distributedProfitFractionIi));
    }

    /**
     * Los saldos después del movimiento.
     */
    public AnnualReturnTaxAccountsMovementBalances getBalances() {
        return balances;
    }

    public AnnualReturnTaxAccountsMovement setBalances(AnnualReturnTaxAccountsMovementBalances balances) {
        this.balances = balances;
        return this;
    }
}
