// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos con el NICO, vigente en c_FraccionArancelaria (búsquela en `GET /v1/sat_catalogs/customs_tariffs`); una que no lo esté se rechaza antes de timbrar.
     */
    @JsonProperty("tariff")
    private String tariff;

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana; 99 en un servicio. Con `tariff` puede omitirse: va la UMT de la fracción en el catálogo del SAT (otra la rechaza el SAT con CCE161).
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
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos con el NICO, vigente en c_FraccionArancelaria (búsquela en `GET /v1/sat_catalogs/customs_tariffs`); una que no lo esté se rechaza antes de timbrar.
     */
    public String getTariff() {
        return tariff;
    }

    public InvoiceCreateComercioExteriorGood setTariff(String tariff) {
        this.tariff = tariff;
        return this;
    }

    /**
     * Unidad aduana (UnidadAduana), c_UnidadAduana; 99 en un servicio. Con `tariff` puede omitirse: va la UMT de la fracción en el catálogo del SAT (otra la rechaza el SAT con CCE161).
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

    @JsonIgnore
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

    @JsonIgnore
    public InvoiceCreateComercioExteriorGood setUnitValueUsd(double unitValueUsd) {
        return setUnitValueUsd(BigDecimal.valueOf(unitValueUsd));
    }
}
