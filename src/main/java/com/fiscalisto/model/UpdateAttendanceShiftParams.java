// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateAttendanceShiftParams: los campos de «Cambiar un turno».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAttendanceShiftParams {
    /**
     * Su nombre, como «Nocturno».
     */
    @JsonProperty("name")
    private String name;

    /**
     * Sus tramos: uno, o dos o tres para un turno partido (el tiempo entre tramos no es jornada). Un tramo puede pasar de la medianoche (22:00 a 06:00).
     */
    @JsonProperty("segments")
    private List<UpdateAttendanceShiftParamsSegment> segments;

    /**
     * Minutos de descanso dentro de un turno de un tramo. Por omisión 0.
     */
    @JsonProperty("break_minutes")
    private Long breakMinutes;

    /**
     * El descanso cuenta como jornada: el trabajador no puede salir del lugar (LFT art. 64).
     */
    @JsonProperty("break_paid")
    private Boolean breakPaid;

    /**
     * Su color en el calendario. Por omisión teal.
     * <p>
     * Valores: teal, blue, violet, amber, rose, slate.
     */
    @JsonProperty("color")
    private String color;

    /**
     * true lo archiva: ya no se puede poner en días ni roles nuevos; los días que ya lo tienen lo conservan.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Su nombre, como «Nocturno».
     */
    public String getName() {
        return name;
    }

    public UpdateAttendanceShiftParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sus tramos: uno, o dos o tres para un turno partido (el tiempo entre tramos no es jornada). Un tramo puede pasar de la medianoche (22:00 a 06:00).
     */
    public List<UpdateAttendanceShiftParamsSegment> getSegments() {
        return segments;
    }

    public UpdateAttendanceShiftParams setSegments(List<UpdateAttendanceShiftParamsSegment> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * Minutos de descanso dentro de un turno de un tramo. Por omisión 0.
     */
    public Long getBreakMinutes() {
        return breakMinutes;
    }

    public UpdateAttendanceShiftParams setBreakMinutes(Long breakMinutes) {
        this.breakMinutes = breakMinutes;
        return this;
    }

    @JsonIgnore
    public UpdateAttendanceShiftParams setBreakMinutes(long breakMinutes) {
        return setBreakMinutes(Long.valueOf(breakMinutes));
    }

    /**
     * El descanso cuenta como jornada: el trabajador no puede salir del lugar (LFT art. 64).
     */
    public Boolean getBreakPaid() {
        return breakPaid;
    }

    public UpdateAttendanceShiftParams setBreakPaid(Boolean breakPaid) {
        this.breakPaid = breakPaid;
        return this;
    }

    /**
     * Su color en el calendario. Por omisión teal.
     * <p>
     * Valores: teal, blue, violet, amber, rose, slate.
     */
    public String getColor() {
        return color;
    }

    public UpdateAttendanceShiftParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * true lo archiva: ya no se puede poner en días ni roles nuevos; los días que ya lo tienen lo conservan.
     */
    public Boolean getArchived() {
        return archived;
    }

    public UpdateAttendanceShiftParams setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
