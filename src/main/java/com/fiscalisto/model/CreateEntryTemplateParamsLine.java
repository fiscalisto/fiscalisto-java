// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateEntryTemplateParamsLine: CreateEntryTemplateParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateEntryTemplateParamsLine {
    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Si el renglón es cargo (debit) o abono (credit).
     * <p>
     * Valores: debit, credit.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("side")
    private String side;

    /**
     * El porcentaje del total que lleva (86.2069 es 86.2069%). Los de un lado suman hasta 100.
     */
    @JsonProperty("percentage")
    private BigDecimal percentage;

    /**
     * Un importe fijo, cuando no depende del total. Sin percentage ni amount, el renglón sale en 0 para escribirlo cada vez.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Su centro de costo (ccn_…, GET /v1/cost_centers), opcional.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public CreateEntryTemplateParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Si el renglón es cargo (debit) o abono (credit).
     * <p>
     * Valores: debit, credit.
     * <p>
     * Obligatorio.
     */
    public String getSide() {
        return side;
    }

    public CreateEntryTemplateParamsLine setSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * El porcentaje del total que lleva (86.2069 es 86.2069%). Los de un lado suman hasta 100.
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    public CreateEntryTemplateParamsLine setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    @JsonIgnore
    public CreateEntryTemplateParamsLine setPercentage(double percentage) {
        return setPercentage(BigDecimal.valueOf(percentage));
    }

    /**
     * Un importe fijo, cuando no depende del total. Sin percentage ni amount, el renglón sale en 0 para escribirlo cada vez.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateEntryTemplateParamsLine setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateEntryTemplateParamsLine setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Su centro de costo (ccn_…, GET /v1/cost_centers), opcional.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public CreateEntryTemplateParamsLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
