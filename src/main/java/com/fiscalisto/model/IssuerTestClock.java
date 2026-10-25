// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerTestClock: IssuerTestClock.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerTestClock {
    /**
     * La hora del reloj.
     */
    @JsonProperty("frozen_time")
    private String frozenTime;

    /**
     * La hora del reloj.
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    public IssuerTestClock setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }
}
