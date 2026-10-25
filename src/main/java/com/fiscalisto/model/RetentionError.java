// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionError: RetentionError.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionError {
    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Código del SAT o del PAC (CFDI40xxx).
     */
    @JsonProperty("sat_code")
    private String satCode;

    /**
     * El texto original del PAC.
     */
    @JsonProperty("raw")
    private String raw;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public RetentionError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Código del SAT o del PAC (CFDI40xxx).
     */
    public String getSatCode() {
        return satCode;
    }

    public RetentionError setSatCode(String satCode) {
        this.satCode = satCode;
        return this;
    }

    /**
     * El texto original del PAC.
     */
    public String getRaw() {
        return raw;
    }

    public RetentionError setRaw(String raw) {
        this.raw = raw;
        return this;
    }
}
