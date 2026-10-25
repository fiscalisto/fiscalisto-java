// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RecurringInvoiceLastError: RecurringInvoiceLastError.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurringInvoiceLastError {
    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public RecurringInvoiceLastError setMessage(String message) {
        this.message = message;
        return this;
    }
}
