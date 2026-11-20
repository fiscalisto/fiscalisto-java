// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem: SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem {
    /**
     * Año (Ejercicio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Año (Ejercicio).
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
