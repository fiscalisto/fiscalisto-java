// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceShift: Un turno de Asistencia › Turnos: a qué hora se entra y se sale, en uno a tres tramos, y su jornada por ley.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceShift {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su color en el calendario.
     * <p>
     * Valores: teal, blue, violet, amber, rose, slate.
     */
    @JsonProperty("color")
    private String color;

    /**
     * Sus tramos: uno, o dos o tres en un turno partido.
     */
    @JsonProperty("segments")
    private List<AttendanceShiftSegment> segments;

    /**
     * Minutos de descanso dentro del turno.
     */
    @JsonProperty("break_minutes")
    private Long breakMinutes;

    /**
     * true: el descanso cuenta como jornada (LFT art. 64).
     */
    @JsonProperty("break_paid")
    private Boolean breakPaid;

    /**
     * Minutos de jornada del turno.
     */
    @JsonProperty("minutes")
    private Long minutes;

    /**
     * La jornada por ley (LFT art. 60): diurna (entre 6:00 y 20:00), nocturna (entre 20:00 y 6:00) o mixta (con menos de 3 h 30 min de noche; con más es nocturna). Su máximo es de 8 h, 7 h y 7 h 30 min (art. 61).
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    @JsonProperty("jornada")
    private String jornada;

    /**
     * true: termina al día siguiente.
     */
    @JsonProperty("overnight")
    private Boolean overnight;

    /**
     * Lo que dice la ley de este turno: pasa de la jornada del art. 61, o le falta la media hora de descanso del art. 63.
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * true: archivado, ya no se pone en días ni roles nuevos.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public AttendanceShift setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceShift setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceShift setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public AttendanceShift setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su color en el calendario.
     * <p>
     * Valores: teal, blue, violet, amber, rose, slate.
     */
    public String getColor() {
        return color;
    }

    public AttendanceShift setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Sus tramos: uno, o dos o tres en un turno partido.
     */
    public List<AttendanceShiftSegment> getSegments() {
        return segments;
    }

    public AttendanceShift setSegments(List<AttendanceShiftSegment> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * Minutos de descanso dentro del turno.
     */
    public Long getBreakMinutes() {
        return breakMinutes;
    }

    public AttendanceShift setBreakMinutes(Long breakMinutes) {
        this.breakMinutes = breakMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceShift setBreakMinutes(long breakMinutes) {
        return setBreakMinutes(Long.valueOf(breakMinutes));
    }

    /**
     * true: el descanso cuenta como jornada (LFT art. 64).
     */
    public Boolean getBreakPaid() {
        return breakPaid;
    }

    public AttendanceShift setBreakPaid(Boolean breakPaid) {
        this.breakPaid = breakPaid;
        return this;
    }

    /**
     * Minutos de jornada del turno.
     */
    public Long getMinutes() {
        return minutes;
    }

    public AttendanceShift setMinutes(Long minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonIgnore
    public AttendanceShift setMinutes(long minutes) {
        return setMinutes(Long.valueOf(minutes));
    }

    /**
     * La jornada por ley (LFT art. 60): diurna (entre 6:00 y 20:00), nocturna (entre 20:00 y 6:00) o mixta (con menos de 3 h 30 min de noche; con más es nocturna). Su máximo es de 8 h, 7 h y 7 h 30 min (art. 61).
     * <p>
     * Valores: diurna, nocturna, mixta.
     */
    public String getJornada() {
        return jornada;
    }

    public AttendanceShift setJornada(String jornada) {
        this.jornada = jornada;
        return this;
    }

    /**
     * true: termina al día siguiente.
     */
    public Boolean getOvernight() {
        return overnight;
    }

    public AttendanceShift setOvernight(Boolean overnight) {
        this.overnight = overnight;
        return this;
    }

    /**
     * Lo que dice la ley de este turno: pasa de la jornada del art. 61, o le falta la media hora de descanso del art. 63.
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public AttendanceShift setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * true: archivado, ya no se pone en días ni roles nuevos.
     */
    public Boolean getArchived() {
        return archived;
    }

    public AttendanceShift setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
