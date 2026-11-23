// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AttendanceRotation: Un rol de turnos: turnos y descansos que se repiten en un ciclo (4×4, semana y semana).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceRotation {
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
     * El ciclo en orden: cada día un turno (ats_…) o null para descanso.
     */
    @JsonProperty("days")
    private List<String> days;

    /**
     * Minutos a la semana en promedio en el ciclo.
     */
    @JsonProperty("week_minutes")
    private Long weekMinutes;

    /**
     * Si pasan más de seis días de trabajo seguidos sin descanso (LFT art. 69), lo dice; si no, null.
     */
    @JsonProperty("warning")
    private String warning;

    /**
     * true: archivado, ya no se le pone a nadie más.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public AttendanceRotation setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceRotation setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceRotation setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public AttendanceRotation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El ciclo en orden: cada día un turno (ats_…) o null para descanso.
     */
    public List<String> getDays() {
        return days;
    }

    public AttendanceRotation setDays(List<String> days) {
        this.days = days;
        return this;
    }

    /**
     * Minutos a la semana en promedio en el ciclo.
     */
    public Long getWeekMinutes() {
        return weekMinutes;
    }

    public AttendanceRotation setWeekMinutes(Long weekMinutes) {
        this.weekMinutes = weekMinutes;
        return this;
    }

    @JsonIgnore
    public AttendanceRotation setWeekMinutes(long weekMinutes) {
        return setWeekMinutes(Long.valueOf(weekMinutes));
    }

    /**
     * Si pasan más de seis días de trabajo seguidos sin descanso (LFT art. 69), lo dice; si no, null.
     */
    public String getWarning() {
        return warning;
    }

    public AttendanceRotation setWarning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * true: archivado, ya no se le pone a nadie más.
     */
    public Boolean getArchived() {
        return archived;
    }

    public AttendanceRotation setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
