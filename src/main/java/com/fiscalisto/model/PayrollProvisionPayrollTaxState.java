// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollProvisionPayrollTaxState: PayrollProvisionPayrollTaxState.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollProvisionPayrollTaxState {
    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    @JsonProperty("state")
    private String state;

    /**
     * Base del impuesto retenido (BaseRet).
     */
    @JsonProperty("base")
    private BigDecimal base;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    public String getState() {
        return state;
    }

    public PayrollProvisionPayrollTaxState setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Base del impuesto retenido (BaseRet).
     */
    public BigDecimal getBase() {
        return base;
    }

    public PayrollProvisionPayrollTaxState setBase(BigDecimal base) {
        this.base = base;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPayrollTaxState setBase(double base) {
        return setBase(BigDecimal.valueOf(base));
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollProvisionPayrollTaxState setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPayrollTaxState setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
