// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatements: El estado de resultados y el balance general de un mes junto a los del mes anterior o del mismo mes del año anterior, con la variación y su porcentaje.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatements {
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
     * El mes con que se compara (AAAA-MM).
     */
    @JsonProperty("compared_to")
    private String comparedTo;

    /**
     * El estado de resultados comparativo.
     */
    @JsonProperty("income_statement")
    private ComparativeStatementsIncomeStatement incomeStatement;

    /**
     * El balance general al cierre de cada mes.
     */
    @JsonProperty("balance_sheet")
    private List<ComparativeStatementsBalanceSheetItem> balanceSheet;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ComparativeStatements setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ComparativeStatements setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ComparativeStatements setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public ComparativeStatements setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El mes con que se compara (AAAA-MM).
     */
    public String getComparedTo() {
        return comparedTo;
    }

    public ComparativeStatements setComparedTo(String comparedTo) {
        this.comparedTo = comparedTo;
        return this;
    }

    /**
     * El estado de resultados comparativo.
     */
    public ComparativeStatementsIncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    public ComparativeStatements setIncomeStatement(ComparativeStatementsIncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
        return this;
    }

    /**
     * El balance general al cierre de cada mes.
     */
    public List<ComparativeStatementsBalanceSheetItem> getBalanceSheet() {
        return balanceSheet;
    }

    public ComparativeStatements setBalanceSheet(List<ComparativeStatementsBalanceSheetItem> balanceSheet) {
        this.balanceSheet = balanceSheet;
        return this;
    }
}
