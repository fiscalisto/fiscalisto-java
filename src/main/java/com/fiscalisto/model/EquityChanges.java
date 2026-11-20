// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * EquityChanges: El estado de cambios en el capital contable (NIF B-4) de enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquityChanges {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Cada cuenta de capital con saldo o movimiento.
     */
    @JsonProperty("accounts")
    private List<EquityChangesAccount> accounts;

    /**
     * El resultado del ejercicio, de enero al mes.
     */
    @JsonProperty("net_income")
    private BigDecimal netIncome;

    /**
     * El capital contable al 1 de enero.
     */
    @JsonProperty("beginning")
    private BigDecimal beginning;

    /**
     * Los movimientos de capital de enero al mes.
     */
    @JsonProperty("movements")
    private BigDecimal movements;

    /**
     * El capital contable al cierre: beginning + movements + net_income, igual al del balance general más el resultado del ejercicio.
     */
    @JsonProperty("ending")
    private BigDecimal ending;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EquityChanges setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EquityChanges setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public EquityChanges setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public EquityChanges setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Cada cuenta de capital con saldo o movimiento.
     */
    public List<EquityChangesAccount> getAccounts() {
        return accounts;
    }

    public EquityChanges setAccounts(List<EquityChangesAccount> accounts) {
        this.accounts = accounts;
        return this;
    }

    /**
     * El resultado del ejercicio, de enero al mes.
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public EquityChanges setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    @JsonIgnore
    public EquityChanges setNetIncome(double netIncome) {
        return setNetIncome(BigDecimal.valueOf(netIncome));
    }

    /**
     * El capital contable al 1 de enero.
     */
    public BigDecimal getBeginning() {
        return beginning;
    }

    public EquityChanges setBeginning(BigDecimal beginning) {
        this.beginning = beginning;
        return this;
    }

    @JsonIgnore
    public EquityChanges setBeginning(double beginning) {
        return setBeginning(BigDecimal.valueOf(beginning));
    }

    /**
     * Los movimientos de capital de enero al mes.
     */
    public BigDecimal getMovements() {
        return movements;
    }

    public EquityChanges setMovements(BigDecimal movements) {
        this.movements = movements;
        return this;
    }

    @JsonIgnore
    public EquityChanges setMovements(double movements) {
        return setMovements(BigDecimal.valueOf(movements));
    }

    /**
     * El capital contable al cierre: beginning + movements + net_income, igual al del balance general más el resultado del ejercicio.
     */
    public BigDecimal getEnding() {
        return ending;
    }

    public EquityChanges setEnding(BigDecimal ending) {
        this.ending = ending;
        return this;
    }

    @JsonIgnore
    public EquityChanges setEnding(double ending) {
        return setEnding(BigDecimal.valueOf(ending));
    }
}
