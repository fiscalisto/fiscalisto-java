// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateAttendanceRotationParams: los campos de «Cambiar un rol de turnos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAttendanceRotationParams {
    /**
     * Su nombre, como «4×4».
     */
    @JsonProperty("name")
    private String name;

    /**
     * El ciclo en orden, de 1 a 56 días: cada uno un turno (ats_…) o null para descanso. Al terminar vuelve a empezar.
     */
    @JsonProperty("days")
    private List<String> days;

    /**
     * true lo archiva: quien lo tiene lo sigue usando; ya no se le puede poner a nadie más.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Su nombre, como «4×4».
     */
    public String getName() {
        return name;
    }

    public UpdateAttendanceRotationParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El ciclo en orden, de 1 a 56 días: cada uno un turno (ats_…) o null para descanso. Al terminar vuelve a empezar.
     */
    public List<String> getDays() {
        return days;
    }

    public UpdateAttendanceRotationParams setDays(List<String> days) {
        this.days = days;
        return this;
    }

    /**
     * true lo archiva: quien lo tiene lo sigue usando; ya no se le puede poner a nadie más.
     */
    public Boolean getArchived() {
        return archived;
    }

    public UpdateAttendanceRotationParams setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
