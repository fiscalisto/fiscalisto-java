// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAttendanceShiftParamsSegment: CreateAttendanceShiftParamsSegment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAttendanceShiftParamsSegment {
    /**
     * Entrada del tramo, HH:MM.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Salida del tramo, HH:MM. Antes de la entrada: termina al día siguiente.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Entrada del tramo, HH:MM.
     * <p>
     * Obligatorio.
     */
    public String getStart() {
        return start;
    }

    public CreateAttendanceShiftParamsSegment setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Salida del tramo, HH:MM. Antes de la entrada: termina al día siguiente.
     * <p>
     * Obligatorio.
     */
    public String getEnd() {
        return end;
    }

    public CreateAttendanceShiftParamsSegment setEnd(String end) {
        this.end = end;
        return this;
    }
}
