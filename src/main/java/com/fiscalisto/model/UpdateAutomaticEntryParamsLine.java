// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateAutomaticEntryParamsLine: UpdateAutomaticEntryParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAutomaticEntryParamsLine {
    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts), por ejemplo 205-06.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El cargo.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * Su centro de costo (ccn_…, GET /v1/cost_centers), opcional: los resultados por centro de costo y los presupuestos lo leen.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Un renglón en otra moneda: su clave ISO 4217 (USD, EUR…). Con ella van foreign_amount y exchange_rate, y debit o credit es su producto en pesos.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El importe del renglón en su moneda.
     */
    @JsonProperty("foreign_amount")
    private BigDecimal foreignAmount;

    /**
     * El tipo de cambio del renglón: pesos por una unidad de su moneda.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * El CFDI que documenta este renglón, aparte del de la póliza: así una póliza lleva varios.
     */
    @JsonProperty("cfdi_uuid")
    private String cfdiUuid;

    /**
     * El RFC de quien emitió o recibió el CFDI del renglón.
     */
    @JsonProperty("cfdi_tax_id")
    private String cfdiTaxId;

    /**
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts), por ejemplo 205-06.
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public UpdateAutomaticEntryParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El cargo.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public UpdateAutomaticEntryParamsLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public UpdateAutomaticEntryParamsLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public UpdateAutomaticEntryParamsLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public UpdateAutomaticEntryParamsLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * Su centro de costo (ccn_…, GET /v1/cost_centers), opcional: los resultados por centro de costo y los presupuestos lo leen.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateAutomaticEntryParamsLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Un renglón en otra moneda: su clave ISO 4217 (USD, EUR…). Con ella van foreign_amount y exchange_rate, y debit o credit es su producto en pesos.
     */
    public String getCurrency() {
        return currency;
    }

    public UpdateAutomaticEntryParamsLine setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El importe del renglón en su moneda.
     */
    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    public UpdateAutomaticEntryParamsLine setForeignAmount(BigDecimal foreignAmount) {
        this.foreignAmount = foreignAmount;
        return this;
    }

    @JsonIgnore
    public UpdateAutomaticEntryParamsLine setForeignAmount(double foreignAmount) {
        return setForeignAmount(BigDecimal.valueOf(foreignAmount));
    }

    /**
     * El tipo de cambio del renglón: pesos por una unidad de su moneda.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public UpdateAutomaticEntryParamsLine setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public UpdateAutomaticEntryParamsLine setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * El CFDI que documenta este renglón, aparte del de la póliza: así una póliza lleva varios.
     */
    public String getCfdiUuid() {
        return cfdiUuid;
    }

    public UpdateAutomaticEntryParamsLine setCfdiUuid(String cfdiUuid) {
        this.cfdiUuid = cfdiUuid;
        return this;
    }

    /**
     * El RFC de quien emitió o recibió el CFDI del renglón.
     */
    public String getCfdiTaxId() {
        return cfdiTaxId;
    }

    public UpdateAutomaticEntryParamsLine setCfdiTaxId(String cfdiTaxId) {
        this.cfdiTaxId = cfdiTaxId;
        return this;
    }
}
