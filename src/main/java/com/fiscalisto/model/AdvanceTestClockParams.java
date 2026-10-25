// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdvanceTestClockParams: los campos de «Adelantar el reloj de prueba».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvanceTestClockParams {
    /**
     * A dónde adelantarlo: después de la hora actual del reloj. Lo que toca en el camino se hace día por día.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("frozen_time")
    private String frozenTime;

    /**
     * A dónde adelantarlo: después de la hora actual del reloj. Lo que toca en el camino se hace día por día.
     * <p>
     * Obligatorio.
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    public AdvanceTestClockParams setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }
}
