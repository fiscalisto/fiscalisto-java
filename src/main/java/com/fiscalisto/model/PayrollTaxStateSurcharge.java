// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollTaxStateSurcharge: PayrollTaxStateSurcharge.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollTaxStateSurcharge {
    /**
     * La sobretasa.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La sobretasa.
     */
    public String getLabel() {
        return label;
    }

    public PayrollTaxStateSurcharge setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollTaxStateSurcharge setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollTaxStateSurcharge setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
