// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTestClockParams: los campos de «Crear un reloj de prueba».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTestClockParams {
    /**
     * Dónde empieza el reloj; si no la manda, ahora.
     */
    @JsonProperty("frozen_time")
    private String frozenTime;

    /**
     * Dónde empieza el reloj; si no la manda, ahora.
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    public CreateTestClockParams setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }
}
