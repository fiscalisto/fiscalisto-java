// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RejectQuoteParams: los campos de «Marcar rechazada».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RejectQuoteParams {
    /**
     * Por qué (queda en customer_comment; el cliente no la ve).
     */
    @JsonProperty("note")
    private String note;

    /**
     * Por qué (queda en customer_comment; el cliente no la ve).
     */
    public String getNote() {
        return note;
    }

    public RejectQuoteParams setNote(String note) {
        this.note = note;
        return this;
    }
}
