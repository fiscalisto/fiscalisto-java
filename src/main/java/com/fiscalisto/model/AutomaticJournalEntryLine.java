// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AutomaticJournalEntryLine: AutomaticJournalEntryLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomaticJournalEntryLine {
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
     * El cargo, en pesos.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono, en pesos.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * Su centro de costo (ccn_…), o null.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public AutomaticJournalEntryLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public AutomaticJournalEntryLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public AutomaticJournalEntryLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * El cargo, en pesos.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public AutomaticJournalEntryLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public AutomaticJournalEntryLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono, en pesos.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public AutomaticJournalEntryLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public AutomaticJournalEntryLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * Su centro de costo (ccn_…), o null.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public AutomaticJournalEntryLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
