// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateTaxDeterminationParams: los campos de «Registrar la determinación de impuestos de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTaxDeterminationParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El pago provisional de ISR del mes en pesos (0 si no hay). Por lo general, suggested_isr.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("isr")
    private BigDecimal isr;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateTaxDeterminationParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El pago provisional de ISR del mes en pesos (0 si no hay). Por lo general, suggested_isr.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getIsr() {
        return isr;
    }

    public CreateTaxDeterminationParams setIsr(BigDecimal isr) {
        this.isr = isr;
        return this;
    }

    @JsonIgnore
    public CreateTaxDeterminationParams setIsr(double isr) {
        return setIsr(BigDecimal.valueOf(isr));
    }
}
