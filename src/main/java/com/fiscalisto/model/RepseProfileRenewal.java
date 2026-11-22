// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RepseProfileRenewal: RepseProfileRenewal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseProfileRenewal {
    /**
     * Primer día para pedir la renovación (tres meses antes del vencimiento).
     */
    @JsonProperty("opens_on")
    private String opensOn;

    /**
     * Último día de vigencia del registro: tres años desde que se otorgó (LFT art. 15).
     */
    @JsonProperty("last_day")
    private String lastDay;

    /**
     * Primer día para pedir la renovación (tres meses antes del vencimiento).
     */
    public String getOpensOn() {
        return opensOn;
    }

    public RepseProfileRenewal setOpensOn(String opensOn) {
        this.opensOn = opensOn;
        return this;
    }

    /**
     * Último día de vigencia del registro: tres años desde que se otorgó (LFT art. 15).
     */
    public String getLastDay() {
        return lastDay;
    }

    public RepseProfileRenewal setLastDay(String lastDay) {
        this.lastDay = lastDay;
        return this;
    }
}
