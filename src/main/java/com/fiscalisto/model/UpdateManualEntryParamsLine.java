// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateManualEntryParamsLine: UpdateManualEntryParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateManualEntryParamsLine {
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
     * El número de la cuenta en su catálogo (GET /v1/accounting/accounts), por ejemplo 205-06.
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public UpdateManualEntryParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El cargo.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public UpdateManualEntryParamsLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public UpdateManualEntryParamsLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public UpdateManualEntryParamsLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public UpdateManualEntryParamsLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * Su centro de costo (ccn_…, GET /v1/cost_centers), opcional: los resultados por centro de costo y los presupuestos lo leen.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateManualEntryParamsLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
