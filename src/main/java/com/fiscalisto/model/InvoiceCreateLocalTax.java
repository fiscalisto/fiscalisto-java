// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateLocalTax: InvoiceCreateLocalTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateLocalTax {
    /**
     * true si es una retención local; false si es un traslado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("retention")
    private Boolean retention;

    /**
     * Nombre del impuesto local (ImpLocTrasladado o ImpLocRetenido), como ISH.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Tasa en por ciento (TasadeTraslado o TasadeRetencion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rate")
    private BigDecimal rate;

    /**
     * Importe del impuesto local.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true si es una retención local; false si es un traslado.
     * <p>
     * Obligatorio.
     */
    public Boolean getRetention() {
        return retention;
    }

    public InvoiceCreateLocalTax setRetention(Boolean retention) {
        this.retention = retention;
        return this;
    }

    /**
     * Nombre del impuesto local (ImpLocTrasladado o ImpLocRetenido), como ISH.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateLocalTax setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Tasa en por ciento (TasadeTraslado o TasadeRetencion).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getRate() {
        return rate;
    }

    public InvoiceCreateLocalTax setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateLocalTax setRate(double rate) {
        return setRate(BigDecimal.valueOf(rate));
    }

    /**
     * Importe del impuesto local.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InvoiceCreateLocalTax setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateLocalTax setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
