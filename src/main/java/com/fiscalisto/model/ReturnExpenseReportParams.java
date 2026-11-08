// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReturnExpenseReportParams: los campos de «Devolver para corregir».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnExpenseReportParams {
    /**
     * Qué debe corregir: se le manda a la persona.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Qué debe corregir: se le manda a la persona.
     * <p>
     * Obligatorio.
     */
    public String getNote() {
        return note;
    }

    public ReturnExpenseReportParams setNote(String note) {
        this.note = note;
        return this;
    }
}
