// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateCartaPorteGoodGuide: InvoiceCreateCartaPorteGoodGuide.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodGuide {
    /**
     * Número de guía (NumeroGuiaIdentificacion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Descripción del contenido (DescripGuiaIdentificacion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Peso en kilogramos (PesoEnKg).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("weight_kg")
    private BigDecimal weightKg;

    /**
     * Número de guía (NumeroGuiaIdentificacion).
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public InvoiceCreateCartaPorteGoodGuide setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Descripción del contenido (DescripGuiaIdentificacion).
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public InvoiceCreateCartaPorteGoodGuide setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Peso en kilogramos (PesoEnKg).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getWeightKg() {
        return weightKg;
    }

    public InvoiceCreateCartaPorteGoodGuide setWeightKg(BigDecimal weightKg) {
        this.weightKg = weightKg;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodGuide setWeightKg(double weightKg) {
        return setWeightKg(BigDecimal.valueOf(weightKg));
    }
}
