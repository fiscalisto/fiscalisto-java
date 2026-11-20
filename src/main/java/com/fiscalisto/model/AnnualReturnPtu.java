// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnPtu: La base de la PTU.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnPtu {
    /**
     * La renta gravable (artículo 9, cuarto párrafo).
     */
    @JsonProperty("taxable_base")
    private BigDecimal taxableBase;

    /**
     * El 10% para los trabajadores.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La renta gravable (artículo 9, cuarto párrafo).
     */
    public BigDecimal getTaxableBase() {
        return taxableBase;
    }

    public AnnualReturnPtu setTaxableBase(BigDecimal taxableBase) {
        this.taxableBase = taxableBase;
        return this;
    }

    @JsonIgnore
    public AnnualReturnPtu setTaxableBase(double taxableBase) {
        return setTaxableBase(BigDecimal.valueOf(taxableBase));
    }

    /**
     * El 10% para los trabajadores.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnPtu setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnPtu setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
