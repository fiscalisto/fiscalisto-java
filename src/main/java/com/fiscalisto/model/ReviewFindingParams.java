// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReviewFindingParams: los campos de «Marcar un hallazgo como revisado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewFindingParams {
    /**
     * Por qué está bien (hasta 500 caracteres).
     */
    @JsonProperty("note")
    private String note;

    /**
     * Por qué está bien (hasta 500 caracteres).
     */
    public String getNote() {
        return note;
    }

    public ReviewFindingParams setNote(String note) {
        this.note = note;
        return this;
    }
}
