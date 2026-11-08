// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApproveExpenseReportParams: los campos de «Aprobar una comprobación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApproveExpenseReportParams {
    /**
     * Una nota para la persona.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Una nota para la persona.
     */
    public String getNote() {
        return note;
    }

    public ApproveExpenseReportParams setNote(String note) {
        this.note = note;
        return this;
    }
}
