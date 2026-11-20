// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EntryTemplateLine: EntryTemplateLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryTemplateLine {
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
     * Si el renglón es cargo (debit) o abono (credit).
     * <p>
     * Valores: debit, credit.
     */
    @JsonProperty("side")
    private String side;

    /**
     * El porcentaje del total que lleva, o null.
     */
    @JsonProperty("percentage")
    private BigDecimal percentage;

    /**
     * Su importe fijo, o null.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

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

    public EntryTemplateLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre de la cuenta.
     */
    public String getAccountName() {
        return accountName;
    }

    public EntryTemplateLine setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Si el renglón es cargo (debit) o abono (credit).
     * <p>
     * Valores: debit, credit.
     */
    public String getSide() {
        return side;
    }

    public EntryTemplateLine setSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * El porcentaje del total que lleva, o null.
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    public EntryTemplateLine setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    @JsonIgnore
    public EntryTemplateLine setPercentage(double percentage) {
        return setPercentage(BigDecimal.valueOf(percentage));
    }

    /**
     * Su importe fijo, o null.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public EntryTemplateLine setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public EntryTemplateLine setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Su centro de costo (ccn_…), o null.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public EntryTemplateLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
