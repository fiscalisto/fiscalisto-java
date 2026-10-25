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
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    @JsonProperty("error")
    private ErrorBodyError error;

    /**
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    public ErrorBodyError getError() {
        return error;
    }

    public ErrorBody setError(ErrorBodyError error) {
        this.error = error;
        return this;
    }
}
