// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VoidAttendanceMarkParams: los campos de «Quitar una marca».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoidAttendanceMarkParams {
    /**
     * Por qué se quita: queda tachada con este motivo y el empleado lo ve.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Por qué se quita: queda tachada con este motivo y el empleado lo ve.
     * <p>
     * Obligatorio.
     */
    public String getReason() {
        return reason;
    }

    public VoidAttendanceMarkParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
