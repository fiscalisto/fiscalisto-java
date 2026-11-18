// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateTicketParamsLocalTax: CreateTicketParamsLocalTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTicketParamsLocalTax {
    /**
     * `false`: un traslado local que se suma (el ISH). `true`: una retención local que el cliente resta (el cedular); la factura global, a público en general, no la lleva.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("retention")
    private Boolean retention;

    /**
     * Su nombre en el CFDI (ImpLocTrasladado o ImpLocRetenido), como «ISH».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * La tasa en porcentaje: 3.5 es 3.5%.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rate")
    private BigDecimal rate;

    /**
     * `false`: un traslado local que se suma (el ISH). `true`: una retención local que el cliente resta (el cedular); la factura global, a público en general, no la lleva.
     * <p>
     * Obligatorio.
     */
    public Boolean getRetention() {
        return retention;
    }

    public CreateTicketParamsLocalTax setRetention(Boolean retention) {
        this.retention = retention;
        return this;
    }

    /**
     * Su nombre en el CFDI (ImpLocTrasladado o ImpLocRetenido), como «ISH».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateTicketParamsLocalTax setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * La tasa en porcentaje: 3.5 es 3.5%.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getRate() {
        return rate;
    }

    public CreateTicketParamsLocalTax setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLocalTax setRate(double rate) {
        return setRate(BigDecimal.valueOf(rate));
    }
}
