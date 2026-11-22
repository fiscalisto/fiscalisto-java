// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SuaComparisonTotals: Totales (Totales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuaComparisonTotals {
    /**
     * Las cuotas al IMSS del mes según el SUA; 0 si algún renglón no se pudo leer.
     */
    @JsonProperty("sua")
    private BigDecimal sua;

    /**
     * Las calculadas por Fiscalisto.
     */
    @JsonProperty("calculated")
    private BigDecimal calculated;

    /**
     * Las cuotas al IMSS del mes según el SUA; 0 si algún renglón no se pudo leer.
     */
    public BigDecimal getSua() {
        return sua;
    }

    public SuaComparisonTotals setSua(BigDecimal sua) {
        this.sua = sua;
        return this;
    }

    @JsonIgnore
    public SuaComparisonTotals setSua(double sua) {
        return setSua(BigDecimal.valueOf(sua));
    }

    /**
     * Las calculadas por Fiscalisto.
     */
    public BigDecimal getCalculated() {
        return calculated;
    }

    public SuaComparisonTotals setCalculated(BigDecimal calculated) {
        this.calculated = calculated;
        return this;
    }

    @JsonIgnore
    public SuaComparisonTotals setCalculated(double calculated) {
        return setCalculated(BigDecimal.valueOf(calculated));
    }
}
