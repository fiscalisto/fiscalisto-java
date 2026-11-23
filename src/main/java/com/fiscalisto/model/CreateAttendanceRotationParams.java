// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateAttendanceRotationParams: los campos de «Crear un rol de turnos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAttendanceRotationParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su nombre, como «4×4».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El ciclo en orden, de 1 a 56 días: cada uno un turno (ats_…) o null para descanso. Al terminar vuelve a empezar.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("days")
    private List<String> days;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateAttendanceRotationParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su nombre, como «4×4».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateAttendanceRotationParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El ciclo en orden, de 1 a 56 días: cada uno un turno (ats_…) o null para descanso. Al terminar vuelve a empezar.
     * <p>
     * Obligatorio.
     */
    public List<String> getDays() {
        return days;
    }

    public CreateAttendanceRotationParams setDays(List<String> days) {
        this.days = days;
        return this;
    }
}
