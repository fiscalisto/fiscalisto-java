// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ManualJournalEntryLine: ManualJournalEntryLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManualJournalEntryLine {
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
     * Su moneda (ISO 4217) si es en otra, o null si es en pesos.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Su importe en esa moneda, o null.
     */
    @JsonProperty("foreign_amount")
    private BigDecimal foreignAmount;

    /**
     * Su tipo de cambio, o null.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * El UUID del CFDI de este renglón, o null.
     */
    @JsonProperty("cfdi_uuid")
    private String cfdiUuid;

    /**
     * El RFC de la otra parte de ese CFDI, o null.
     */
    @JsonProperty("cfdi_tax_id")
    private String cfdiTaxId;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public ManualJournalEntryLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public ManualJournalEntryLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public ManualJournalEntryLine setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * El cargo, en pesos.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public ManualJournalEntryLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public ManualJournalEntryLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono, en pesos.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public ManualJournalEntryLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public ManualJournalEntryLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * Su centro de costo (ccn_…), o null.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public ManualJournalEntryLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Su moneda (ISO 4217) si es en otra, o null si es en pesos.
     */
    public String getCurrency() {
        return currency;
    }

    public ManualJournalEntryLine setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Su importe en esa moneda, o null.
     */
    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    public ManualJournalEntryLine setForeignAmount(BigDecimal foreignAmount) {
        this.foreignAmount = foreignAmount;
        return this;
    }

    @JsonIgnore
    public ManualJournalEntryLine setForeignAmount(double foreignAmount) {
        return setForeignAmount(BigDecimal.valueOf(foreignAmount));
    }

    /**
     * Su tipo de cambio, o null.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public ManualJournalEntryLine setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public ManualJournalEntryLine setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * El UUID del CFDI de este renglón, o null.
     */
    public String getCfdiUuid() {
        return cfdiUuid;
    }

    public ManualJournalEntryLine setCfdiUuid(String cfdiUuid) {
        this.cfdiUuid = cfdiUuid;
        return this;
    }

    /**
     * El RFC de la otra parte de ese CFDI, o null.
     */
    public String getCfdiTaxId() {
        return cfdiTaxId;
    }

    public ManualJournalEntryLine setCfdiTaxId(String cfdiTaxId) {
        this.cfdiTaxId = cfdiTaxId;
        return this;
    }
}
