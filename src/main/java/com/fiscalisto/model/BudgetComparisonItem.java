// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BudgetComparisonItem: BudgetComparisonItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetComparisonItem {
    /**
     * El número de la cuenta en su catálogo.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Su nombre.
     */
    @JsonProperty("account_name")
    private String accountName;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su parte del estado de resultados.
     * <p>
     * Valores: revenue, cost_of_sales, operating_expenses, financing, other.
     */
    @JsonProperty("section")
    private String section;

    /**
     * El mes.
     */
    @JsonProperty("month")
    private BudgetComparisonItemMonth month;

    /**
     * De enero al mes.
     */
    @JsonProperty("year_to_date")
    private BudgetComparisonItemYearToDate yearToDate;

    /**
     * Lo presupuestado en todo el año.
     */
    @JsonProperty("annual_budget")
    private BigDecimal annualBudget;

    /**
     * El número de la cuenta en su catálogo.
     */
    public String getAccount() {
        return account;
    }

    public BudgetComparisonItem setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getAccountName() {
        return accountName;
    }

    public BudgetComparisonItem setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public BudgetComparisonItem setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su parte del estado de resultados.
     * <p>
     * Valores: revenue, cost_of_sales, operating_expenses, financing, other.
     */
    public String getSection() {
        return section;
    }

    public BudgetComparisonItem setSection(String section) {
        this.section = section;
        return this;
    }

    /**
     * El mes.
     */
    public BudgetComparisonItemMonth getMonth() {
        return month;
    }

    public BudgetComparisonItem setMonth(BudgetComparisonItemMonth month) {
        this.month = month;
        return this;
    }

    /**
     * De enero al mes.
     */
    public BudgetComparisonItemYearToDate getYearToDate() {
        return yearToDate;
    }

    public BudgetComparisonItem setYearToDate(BudgetComparisonItemYearToDate yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }

    /**
     * Lo presupuestado en todo el año.
     */
    public BigDecimal getAnnualBudget() {
        return annualBudget;
    }

    public BudgetComparisonItem setAnnualBudget(BigDecimal annualBudget) {
        this.annualBudget = annualBudget;
        return this;
    }

    @JsonIgnore
    public BudgetComparisonItem setAnnualBudget(double annualBudget) {
        return setAnnualBudget(BigDecimal.valueOf(annualBudget));
    }
}
