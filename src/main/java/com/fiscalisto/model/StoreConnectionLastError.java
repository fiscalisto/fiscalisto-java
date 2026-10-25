// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StoreConnectionLastError: StoreConnectionLastError.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreConnectionLastError {
    /**
     * Qué pasó.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Cuándo.
     */
    @JsonProperty("at")
    private String at;

    /**
     * Qué pasó.
     */
    public String getMessage() {
        return message;
    }

    public StoreConnectionLastError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Cuándo.
     */
    public String getAt() {
        return at;
    }

    public StoreConnectionLastError setAt(String at) {
        this.at = at;
        return this;
    }
}
