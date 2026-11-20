// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FinancialRatiosRatio: FinancialRatiosRatio.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialRatiosRatio {
    /**
     * La razón.
     * <p>
     * Valores: liquidez, prueba_acida, endeudamiento, apalancamiento, margen_bruto, margen_operacion, margen_neto, rendimiento_capital, rendimiento_activo, dias_cobro, dias_pago, dias_inventario.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su valor (null cuando no hay con qué dividir).
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Veces, porcentaje o días.
     * <p>
     * Valores: times, percent, days.
     */
    @JsonProperty("unit")
    private String unit;

    /**
     * Cómo se calcula.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La razón.
     * <p>
     * Valores: liquidez, prueba_acida, endeudamiento, apalancamiento, margen_bruto, margen_operacion, margen_neto, rendimiento_capital, rendimiento_activo, dias_cobro, dias_pago, dias_inventario.
     */
    public String getKey() {
        return key;
    }

    public FinancialRatiosRatio setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public FinancialRatiosRatio setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su valor (null cuando no hay con qué dividir).
     */
    public BigDecimal getValue() {
        return value;
    }

    public FinancialRatiosRatio setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public FinancialRatiosRatio setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Veces, porcentaje o días.
     * <p>
     * Valores: times, percent, days.
     */
    public String getUnit() {
        return unit;
    }

    public FinancialRatiosRatio setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Cómo se calcula.
     */
    public String getDescription() {
        return description;
    }

    public FinancialRatiosRatio setDescription(String description) {
        this.description = description;
        return this;
    }
}
