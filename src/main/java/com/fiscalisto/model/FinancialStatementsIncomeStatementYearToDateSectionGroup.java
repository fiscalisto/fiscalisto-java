// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * FinancialStatementsIncomeStatementYearToDateSectionGroup: FinancialStatementsIncomeStatementYearToDateSectionGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatementYearToDateSectionGroup {
    /**
     * El primer nivel del código agrupador (401, 601…).
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Las cuentas del grupo con su monto.
     */
    @JsonProperty("accounts")
    private List<FinancialStatementsIncomeStatementYearToDateSectionGroupAccount> accounts;

    /**
     * El primer nivel del código agrupador (401, 601…).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public FinancialStatementsIncomeStatementYearToDateSectionGroup setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FinancialStatementsIncomeStatementYearToDateSectionGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public FinancialStatementsIncomeStatementYearToDateSectionGroup setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsIncomeStatementYearToDateSectionGroup setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Las cuentas del grupo con su monto.
     */
    public List<FinancialStatementsIncomeStatementYearToDateSectionGroupAccount> getAccounts() {
        return accounts;
    }

    public FinancialStatementsIncomeStatementYearToDateSectionGroup setAccounts(List<FinancialStatementsIncomeStatementYearToDateSectionGroupAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
