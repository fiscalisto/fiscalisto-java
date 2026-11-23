// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateAttendanceShiftParams: los campos de «Crear un turno».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAttendanceShiftParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su nombre, como «Nocturno».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Sus tramos: uno, o dos o tres para un turno partido (el tiempo entre tramos no es jornada). Un tramo puede pasar de la medianoche (22:00 a 06:00).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("segments")
    private List<CreateAttendanceShiftParamsSegment> segments;

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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateAttendanceShiftParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su nombre, como «Nocturno».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateAttendanceShiftParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sus tramos: uno, o dos o tres para un turno partido (el tiempo entre tramos no es jornada). Un tramo puede pasar de la medianoche (22:00 a 06:00).
     * <p>
     * Obligatorio.
     */
    public List<CreateAttendanceShiftParamsSegment> getSegments() {
        return segments;
    }

    public CreateAttendanceShiftParams setSegments(List<CreateAttendanceShiftParamsSegment> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * Minutos de descanso dentro de un turno de un tramo. Por omisión 0.
     */
    public Long getBreakMinutes() {
        return breakMinutes;
    }

    public CreateAttendanceShiftParams setBreakMinutes(Long breakMinutes) {
        this.breakMinutes = breakMinutes;
        return this;
    }

    @JsonIgnore
    public CreateAttendanceShiftParams setBreakMinutes(long breakMinutes) {
        return setBreakMinutes(Long.valueOf(breakMinutes));
    }

    /**
     * El descanso cuenta como jornada: el trabajador no puede salir del lugar (LFT art. 64).
     */
    public Boolean getBreakPaid() {
        return breakPaid;
    }

    public CreateAttendanceShiftParams setBreakPaid(Boolean breakPaid) {
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

    public CreateAttendanceShiftParams setColor(String color) {
        this.color = color;
        return this;
    }
}
