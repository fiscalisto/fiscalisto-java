// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FinancialStatementsBalanceSheet: El balance general al cierre del mes, agrupado por el primer nivel del código agrupador. difference es activo menos pasivo y capital: 0 cuando los libros cuadran.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsBalanceSheet {
    /**
     * El activo: su total y sus grupos.
     */
    @JsonProperty("assets")
    private FinancialStatementsBalanceSheetAssets assets;

    /**
     * El pasivo: su total y sus grupos.
     */
    @JsonProperty("liabilities")
    private FinancialStatementsBalanceSheetLiabilities liabilities;

    /**
     * El capital contable sin el resultado del ejercicio: su total y sus grupos.
     */
    @JsonProperty("equity")
    private FinancialStatementsBalanceSheetEquity equity;

    /**
     * El resultado del ejercicio hasta el mes, parte del capital.
     */
    @JsonProperty("net_income_year_to_date")
    private BigDecimal netIncomeYearToDate;

    /**
     * Pasivo más capital más el resultado del ejercicio.
     */
    @JsonProperty("liabilities_and_equity")
    private BigDecimal liabilitiesAndEquity;

    /**
     * Activo menos pasivo y capital: 0 cuando los libros cuadran.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * El activo: su total y sus grupos.
     */
    public FinancialStatementsBalanceSheetAssets getAssets() {
        return assets;
    }

    public FinancialStatementsBalanceSheet setAssets(FinancialStatementsBalanceSheetAssets assets) {
        this.assets = assets;
        return this;
    }

    /**
     * El pasivo: su total y sus grupos.
     */
    public FinancialStatementsBalanceSheetLiabilities getLiabilities() {
        return liabilities;
    }

    public FinancialStatementsBalanceSheet setLiabilities(FinancialStatementsBalanceSheetLiabilities liabilities) {
        this.liabilities = liabilities;
        return this;
    }

    /**
     * El capital contable sin el resultado del ejercicio: su total y sus grupos.
     */
    public FinancialStatementsBalanceSheetEquity getEquity() {
        return equity;
    }

    public FinancialStatementsBalanceSheet setEquity(FinancialStatementsBalanceSheetEquity equity) {
        this.equity = equity;
        return this;
    }

    /**
     * El resultado del ejercicio hasta el mes, parte del capital.
     */
    public BigDecimal getNetIncomeYearToDate() {
        return netIncomeYearToDate;
    }

    public FinancialStatementsBalanceSheet setNetIncomeYearToDate(BigDecimal netIncomeYearToDate) {
        this.netIncomeYearToDate = netIncomeYearToDate;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsBalanceSheet setNetIncomeYearToDate(double netIncomeYearToDate) {
        return setNetIncomeYearToDate(BigDecimal.valueOf(netIncomeYearToDate));
    }

    /**
     * Pasivo más capital más el resultado del ejercicio.
     */
    public BigDecimal getLiabilitiesAndEquity() {
        return liabilitiesAndEquity;
    }

    public FinancialStatementsBalanceSheet setLiabilitiesAndEquity(BigDecimal liabilitiesAndEquity) {
        this.liabilitiesAndEquity = liabilitiesAndEquity;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsBalanceSheet setLiabilitiesAndEquity(double liabilitiesAndEquity) {
        return setLiabilitiesAndEquity(BigDecimal.valueOf(liabilitiesAndEquity));
    }

    /**
     * Activo menos pasivo y capital: 0 cuando los libros cuadran.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public FinancialStatementsBalanceSheet setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsBalanceSheet setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }
}
