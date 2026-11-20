// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ConsolidatedStatementsBalanceSheet: El balance general consolidado al cierre del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsBalanceSheet {
    /**
     * El activo: su total y sus grupos.
     */
    @JsonProperty("assets")
    private ConsolidatedStatementsBalanceSheetAssets assets;

    /**
     * El pasivo: su total y sus grupos.
     */
    @JsonProperty("liabilities")
    private ConsolidatedStatementsBalanceSheetLiabilities liabilities;

    /**
     * El capital contable sin el resultado del ejercicio: su total y sus grupos.
     */
    @JsonProperty("equity")
    private ConsolidatedStatementsBalanceSheetEquity equity;

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
    public ConsolidatedStatementsBalanceSheetAssets getAssets() {
        return assets;
    }

    public ConsolidatedStatementsBalanceSheet setAssets(ConsolidatedStatementsBalanceSheetAssets assets) {
        this.assets = assets;
        return this;
    }

    /**
     * El pasivo: su total y sus grupos.
     */
    public ConsolidatedStatementsBalanceSheetLiabilities getLiabilities() {
        return liabilities;
    }

    public ConsolidatedStatementsBalanceSheet setLiabilities(ConsolidatedStatementsBalanceSheetLiabilities liabilities) {
        this.liabilities = liabilities;
        return this;
    }

    /**
     * El capital contable sin el resultado del ejercicio: su total y sus grupos.
     */
    public ConsolidatedStatementsBalanceSheetEquity getEquity() {
        return equity;
    }

    public ConsolidatedStatementsBalanceSheet setEquity(ConsolidatedStatementsBalanceSheetEquity equity) {
        this.equity = equity;
        return this;
    }

    /**
     * El resultado del ejercicio hasta el mes, parte del capital.
     */
    public BigDecimal getNetIncomeYearToDate() {
        return netIncomeYearToDate;
    }

    public ConsolidatedStatementsBalanceSheet setNetIncomeYearToDate(BigDecimal netIncomeYearToDate) {
        this.netIncomeYearToDate = netIncomeYearToDate;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsBalanceSheet setNetIncomeYearToDate(double netIncomeYearToDate) {
        return setNetIncomeYearToDate(BigDecimal.valueOf(netIncomeYearToDate));
    }

    /**
     * Pasivo más capital más el resultado del ejercicio.
     */
    public BigDecimal getLiabilitiesAndEquity() {
        return liabilitiesAndEquity;
    }

    public ConsolidatedStatementsBalanceSheet setLiabilitiesAndEquity(BigDecimal liabilitiesAndEquity) {
        this.liabilitiesAndEquity = liabilitiesAndEquity;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsBalanceSheet setLiabilitiesAndEquity(double liabilitiesAndEquity) {
        return setLiabilitiesAndEquity(BigDecimal.valueOf(liabilitiesAndEquity));
    }

    /**
     * Activo menos pasivo y capital: 0 cuando los libros cuadran.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public ConsolidatedStatementsBalanceSheet setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsBalanceSheet setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }
}
