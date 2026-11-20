// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ConsolidatedStatements: Los estados financieros consolidados de varios RFC de un mes: sus balanzas sumadas cuenta por cuenta menos las eliminaciones del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatements {
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
     * Los RFC que consolida.
     */
    @JsonProperty("rfcs")
    private List<String> rfcs;

    /**
     * El estado de resultados consolidado: del mes y de enero al mes.
     */
    @JsonProperty("income_statement")
    private ConsolidatedStatementsIncomeStatement incomeStatement;

    /**
     * El balance general consolidado al cierre del mes.
     */
    @JsonProperty("balance_sheet")
    private ConsolidatedStatementsBalanceSheet balanceSheet;

    /**
     * La hoja de consolidación: cada cuenta en cada RFC, lo eliminado y el consolidado.
     */
    @JsonProperty("worksheet")
    private List<ConsolidatedStatementsWorksheetItem> worksheet;

    /**
     * Las eliminaciones del mes que se aplicaron.
     */
    @JsonProperty("eliminations")
    private List<ConsolidationElimination> eliminations;

    /**
     * Lo que los RFC se facturaron entre ellos en el año: lo que normalmente se elimina.
     */
    @JsonProperty("intercompany")
    private List<ConsolidatedStatementsIntercompanyItem> intercompany;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ConsolidatedStatements setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ConsolidatedStatements setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ConsolidatedStatements setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public ConsolidatedStatements setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Los RFC que consolida.
     */
    public List<String> getRfcs() {
        return rfcs;
    }

    public ConsolidatedStatements setRfcs(List<String> rfcs) {
        this.rfcs = rfcs;
        return this;
    }

    /**
     * El estado de resultados consolidado: del mes y de enero al mes.
     */
    public ConsolidatedStatementsIncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    public ConsolidatedStatements setIncomeStatement(ConsolidatedStatementsIncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
        return this;
    }

    /**
     * El balance general consolidado al cierre del mes.
     */
    public ConsolidatedStatementsBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public ConsolidatedStatements setBalanceSheet(ConsolidatedStatementsBalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
        return this;
    }

    /**
     * La hoja de consolidación: cada cuenta en cada RFC, lo eliminado y el consolidado.
     */
    public List<ConsolidatedStatementsWorksheetItem> getWorksheet() {
        return worksheet;
    }

    public ConsolidatedStatements setWorksheet(List<ConsolidatedStatementsWorksheetItem> worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    /**
     * Las eliminaciones del mes que se aplicaron.
     */
    public List<ConsolidationElimination> getEliminations() {
        return eliminations;
    }

    public ConsolidatedStatements setEliminations(List<ConsolidationElimination> eliminations) {
        this.eliminations = eliminations;
        return this;
    }

    /**
     * Lo que los RFC se facturaron entre ellos en el año: lo que normalmente se elimina.
     */
    public List<ConsolidatedStatementsIntercompanyItem> getIntercompany() {
        return intercompany;
    }

    public ConsolidatedStatements setIntercompany(List<ConsolidatedStatementsIntercompanyItem> intercompany) {
        this.intercompany = intercompany;
        return this;
    }
}
