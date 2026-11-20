// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NetToGrossPeriod: El periodo con que se calculó (el actual de la periodicidad).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetToGrossPeriod {
    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     */
    public String getStart() {
        return start;
    }

    public NetToGrossPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     */
    public String getEnd() {
        return end;
    }

    public NetToGrossPeriod setEnd(String end) {
        this.end = end;
        return this;
    }
}
