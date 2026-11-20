// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * BudgetLine: BudgetLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetLine {
    /**
     * El número de cuenta.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El nombre de la cuenta.
     */
    @JsonProperty("account_name")
    private String accountName;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Enero a diciembre.
     */
    @JsonProperty("months")
    private List<BigDecimal> months;

    /**
     * La suma de los 12 meses.
     */
    @JsonProperty("annual")
    private BigDecimal annual;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public BudgetLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public BudgetLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public BudgetLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Enero a diciembre.
     */
    public List<BigDecimal> getMonths() {
        return months;
    }

    public BudgetLine setMonths(List<BigDecimal> months) {
        this.months = months;
        return this;
    }

    /**
     * La suma de los 12 meses.
     */
    public BigDecimal getAnnual() {
        return annual;
    }

    public BudgetLine setAnnual(BigDecimal annual) {
        this.annual = annual;
        return this;
    }

    @JsonIgnore
    public BudgetLine setAnnual(double annual) {
        return setAnnual(BigDecimal.valueOf(annual));
    }
}
