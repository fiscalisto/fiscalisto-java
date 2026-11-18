// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TicketLineLocalTax: TicketLineLocalTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketLineLocalTax {
    /**
     * true si es una retención local; false si es un traslado.
     */
    @JsonProperty("retention")
    private Boolean retention;

    /**
     * Nombre del impuesto local (ImpLocTrasladado o ImpLocRetenido), como ISH.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Tasa en por ciento (TasadeTraslado o TasadeRetencion).
     */
    @JsonProperty("rate")
    private BigDecimal rate;

    /**
     * true si es una retención local; false si es un traslado.
     */
    public Boolean getRetention() {
        return retention;
    }

    public TicketLineLocalTax setRetention(Boolean retention) {
        this.retention = retention;
        return this;
    }

    /**
     * Nombre del impuesto local (ImpLocTrasladado o ImpLocRetenido), como ISH.
     */
    public String getName() {
        return name;
    }

    public TicketLineLocalTax setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Tasa en por ciento (TasadeTraslado o TasadeRetencion).
     */
    public BigDecimal getRate() {
        return rate;
    }

    public TicketLineLocalTax setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    @JsonIgnore
    public TicketLineLocalTax setRate(double rate) {
        return setRate(BigDecimal.valueOf(rate));
    }
}
