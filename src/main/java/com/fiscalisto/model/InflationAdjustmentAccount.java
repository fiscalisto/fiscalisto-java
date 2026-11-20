// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InflationAdjustmentAccount: InflationAdjustmentAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InflationAdjustmentAccount {
    /**
     * El número de la cuenta.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * credit (crédito, art. 45 de la LISR), debt (deuda, art. 46) o none.
     * <p>
     * Valores: credit, debt, none.
     */
    @JsonProperty("treatment")
    private String treatment;

    /**
     * true si se cambió del de su código agrupador (POST /v1/accounting/inflation_accounts).
     */
    @JsonProperty("changed")
    private Boolean changed;

    /**
     * Por qué cuenta así, con el artículo de la ley.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El saldo al último día de cada mes, positivo como crédito o como deuda (en none, el saldo contable).
     */
    @JsonProperty("month_end_balances")
    private List<BigDecimal> monthEndBalances;

    /**
     * La suma de los saldos entre los meses (0 en none).
     */
    @JsonProperty("average_balance")
    private BigDecimal averageBalance;

    /**
     * El número de la cuenta.
     */
    public String getAccount() {
        return account;
    }

    public InflationAdjustmentAccount setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public InflationAdjustmentAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public InflationAdjustmentAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * credit (crédito, art. 45 de la LISR), debt (deuda, art. 46) o none.
     * <p>
     * Valores: credit, debt, none.
     */
    public String getTreatment() {
        return treatment;
    }

    public InflationAdjustmentAccount setTreatment(String treatment) {
        this.treatment = treatment;
        return this;
    }

    /**
     * true si se cambió del de su código agrupador (POST /v1/accounting/inflation_accounts).
     */
    public Boolean getChanged() {
        return changed;
    }

    public InflationAdjustmentAccount setChanged(Boolean changed) {
        this.changed = changed;
        return this;
    }

    /**
     * Por qué cuenta así, con el artículo de la ley.
     */
    public String getReason() {
        return reason;
    }

    public InflationAdjustmentAccount setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * El saldo al último día de cada mes, positivo como crédito o como deuda (en none, el saldo contable).
     */
    public List<BigDecimal> getMonthEndBalances() {
        return monthEndBalances;
    }

    public InflationAdjustmentAccount setMonthEndBalances(List<BigDecimal> monthEndBalances) {
        this.monthEndBalances = monthEndBalances;
        return this;
    }

    /**
     * La suma de los saldos entre los meses (0 en none).
     */
    public BigDecimal getAverageBalance() {
        return averageBalance;
    }

    public InflationAdjustmentAccount setAverageBalance(BigDecimal averageBalance) {
        this.averageBalance = averageBalance;
        return this;
    }

    @JsonIgnore
    public InflationAdjustmentAccount setAverageBalance(double averageBalance) {
        return setAverageBalance(BigDecimal.valueOf(averageBalance));
    }
}
