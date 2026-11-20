// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RejectVacationRequestParams: los campos de «Rechazar una solicitud de vacaciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RejectVacationRequestParams {
    /**
     * Por qué no se aprueba: el empleado lo ve en su enlace.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Por qué no se aprueba: el empleado lo ve en su enlace.
     * <p>
     * Obligatorio.
     */
    public String getNote() {
        return note;
    }

    public RejectVacationRequestParams setNote(String note) {
        this.note = note;
        return this;
    }
}
