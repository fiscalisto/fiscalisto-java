// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateClimateComplaintParams: los campos de «Atender una queja del buzón».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimateComplaintParams {
    /**
     * nueva, en_atencion o atendida.
     * <p>
     * Valores: nueva, en_atencion, atendida.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Qué se hizo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * nueva, en_atencion o atendida.
     * <p>
     * Valores: nueva, en_atencion, atendida.
     */
    public String getStatus() {
        return status;
    }

    public UpdateClimateComplaintParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Qué se hizo.
     */
    public String getNote() {
        return note;
    }

    public UpdateClimateComplaintParams setNote(String note) {
        this.note = note;
        return this;
    }
}
