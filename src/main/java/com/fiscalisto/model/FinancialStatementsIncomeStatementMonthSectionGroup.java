// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * FinancialStatementsIncomeStatementMonthSectionGroup: FinancialStatementsIncomeStatementMonthSectionGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsIncomeStatementMonthSectionGroup {
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
    private List<FinancialStatementsIncomeStatementMonthSectionGroupAccount> accounts;

    /**
     * El primer nivel del código agrupador (401, 601…).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public FinancialStatementsIncomeStatementMonthSectionGroup setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FinancialStatementsIncomeStatementMonthSectionGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public FinancialStatementsIncomeStatementMonthSectionGroup setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsIncomeStatementMonthSectionGroup setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Las cuentas del grupo con su monto.
     */
    public List<FinancialStatementsIncomeStatementMonthSectionGroupAccount> getAccounts() {
        return accounts;
    }

    public FinancialStatementsIncomeStatementMonthSectionGroup setAccounts(List<FinancialStatementsIncomeStatementMonthSectionGroupAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
