// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorBody: Todos los errores tienen esta forma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorBody {
    /**
     * El error: type, code, message (en el idioma pedido), param (el campo a corregir), doc_url y request_id.
     */
    @JsonProperty("error")
    private ErrorBodyError error;

    /**
     * El error: type, code, message (en el idioma pedido), param (el campo a corregir), doc_url y request_id.
     */
    public ErrorBodyError getError() {
        return error;
    }

    public ErrorBody setError(ErrorBodyError error) {
        this.error = error;
        return this;
    }
}
