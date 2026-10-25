// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateComercioExteriorGood: InvoiceCreateComercioExteriorGood.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExteriorGood {
    /**
     * Número de identificación de la mercancía (NoIdentificacion): el sku de su concepto.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos. Transporte internacional.
     */
    @JsonProperty("tariff")
    private String tariff;

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * Cantidad en la unidad aduana (CantidadAduana).
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Valor unitario en dólares (ValorUnitarioAduana).
     */
    @JsonProperty("unit_value_usd")
    private BigDecimal unitValueUsd;

    /**
     * Número de identificación de la mercancía (NoIdentificacion): el sku de su concepto.
     */
    public String getId() {
        return id;
    }

    public InvoiceCreateComercioExteriorGood setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos. Transporte internacional.
     */
    public String getTariff() {
        return tariff;
    }

    public InvoiceCreateComercioExteriorGood setTariff(String tariff) {
        this.tariff = tariff;
        return this;
    }

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana.
     * <p>
     * Obligatorio.
     */
    public String getUnit() {
        return unit;
    }

    public InvoiceCreateComercioExteriorGood setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Cantidad en la unidad aduana (CantidadAduana).
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public InvoiceCreateComercioExteriorGood setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public InvoiceCreateComercioExteriorGood setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Valor unitario en dólares (ValorUnitarioAduana).
     */
    public BigDecimal getUnitValueUsd() {
        return unitValueUsd;
    }

    public InvoiceCreateComercioExteriorGood setUnitValueUsd(BigDecimal unitValueUsd) {
        this.unitValueUsd = unitValueUsd;
        return this;
    }

    public InvoiceCreateComercioExteriorGood setUnitValueUsd(double unitValueUsd) {
        return setUnitValueUsd(BigDecimal.valueOf(unitValueUsd));
    }
}
