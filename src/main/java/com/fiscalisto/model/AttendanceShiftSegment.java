// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceShiftSegment: AttendanceShiftSegment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceShiftSegment {
    /**
     * Entrada del tramo, HH:MM.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Salida del tramo, HH:MM (antes de la entrada: al día siguiente).
     */
    @JsonProperty("end")
    private String end;

    /**
     * Entrada del tramo, HH:MM.
     */
    public String getStart() {
        return start;
    }

    public AttendanceShiftSegment setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Salida del tramo, HH:MM (antes de la entrada: al día siguiente).
     */
    public String getEnd() {
        return end;
    }

    public AttendanceShiftSegment setEnd(String end) {
        this.end = end;
        return this;
    }
}
