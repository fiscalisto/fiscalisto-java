// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * VatRefundBalanceCreditedInItem: VatRefundBalanceCreditedInItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundBalanceCreditedInItem {
    /**
     * El mes en que se acreditó esa parte (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Lo acreditado ese mes.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El mes en que se acreditó esa parte (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public VatRefundBalanceCreditedInItem setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Lo acreditado ese mes.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public VatRefundBalanceCreditedInItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public VatRefundBalanceCreditedInItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
