// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FinancialStatements: El estado de resultados y el balance general de un mes, leídos de su balanza.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatements {
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
     * El estado de resultados del mes (month) y del año hasta ese mes (year_to_date). Cada sección suma en positivo lo que aumenta la utilidad (ingresos) y en negativo lo que la reduce (costos y gastos).
     */
    @JsonProperty("income_statement")
    private FinancialStatementsIncomeStatement incomeStatement;

    /**
     * El balance general al cierre del mes, agrupado por el primer nivel del código agrupador. difference es activo menos pasivo y capital: 0 cuando los libros cuadran.
     */
    @JsonProperty("balance_sheet")
    private FinancialStatementsBalanceSheet balanceSheet;

    /**
     * Cuántas pólizas tuvo el mes.
     */
    @JsonProperty("journal_entries")
    private Long journalEntries;

    /**
     * Desde qué fecha cuentan los saldos iniciales capturados en la app; null si no hay.
     */
    @JsonProperty("opening_balances_date")
    private String openingBalancesDate;

    /**
     * Pagos que se refieren a facturas que no están en Fiscalisto y no se registraron.
     */
    @JsonProperty("missing_invoices")
    private Long missingInvoices;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public FinancialStatements setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public FinancialStatements setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public FinancialStatements setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public FinancialStatements setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El estado de resultados del mes (month) y del año hasta ese mes (year_to_date). Cada sección suma en positivo lo que aumenta la utilidad (ingresos) y en negativo lo que la reduce (costos y gastos).
     */
    public FinancialStatementsIncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    public FinancialStatements setIncomeStatement(FinancialStatementsIncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
        return this;
    }

    /**
     * El balance general al cierre del mes, agrupado por el primer nivel del código agrupador. difference es activo menos pasivo y capital: 0 cuando los libros cuadran.
     */
    public FinancialStatementsBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public FinancialStatements setBalanceSheet(FinancialStatementsBalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
        return this;
    }

    /**
     * Cuántas pólizas tuvo el mes.
     */
    public Long getJournalEntries() {
        return journalEntries;
    }

    public FinancialStatements setJournalEntries(Long journalEntries) {
        this.journalEntries = journalEntries;
        return this;
    }

    @JsonIgnore
    public FinancialStatements setJournalEntries(long journalEntries) {
        return setJournalEntries(Long.valueOf(journalEntries));
    }

    /**
     * Desde qué fecha cuentan los saldos iniciales capturados en la app; null si no hay.
     */
    public String getOpeningBalancesDate() {
        return openingBalancesDate;
    }

    public FinancialStatements setOpeningBalancesDate(String openingBalancesDate) {
        this.openingBalancesDate = openingBalancesDate;
        return this;
    }

    /**
     * Pagos que se refieren a facturas que no están en Fiscalisto y no se registraron.
     */
    public Long getMissingInvoices() {
        return missingInvoices;
    }

    public FinancialStatements setMissingInvoices(Long missingInvoices) {
        this.missingInvoices = missingInvoices;
        return this;
    }

    @JsonIgnore
    public FinancialStatements setMissingInvoices(long missingInvoices) {
        return setMissingInvoices(Long.valueOf(missingInvoices));
    }
}
