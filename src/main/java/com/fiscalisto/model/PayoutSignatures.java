// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayoutSignatures: required: cuántas firmas pide (null mientras es borrador); given: cuántas personas ya firmaron. La API nunca firma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutSignatures {
    /**
     * Cuántas firmas pide, o null mientras es borrador.
     */
    @JsonProperty("required")
    private Long required;

    /**
     * Cuántas personas ya lo firmaron en la app.
     */
    @JsonProperty("given")
    private Long given;

    /**
     * Cuántas firmas pide, o null mientras es borrador.
     */
    public Long getRequired() {
        return required;
    }

    public PayoutSignatures setRequired(Long required) {
        this.required = required;
        return this;
    }

    @JsonIgnore
    public PayoutSignatures setRequired(long required) {
        return setRequired(Long.valueOf(required));
    }

    /**
     * Cuántas personas ya lo firmaron en la app.
     */
    public Long getGiven() {
        return given;
    }

    public PayoutSignatures setGiven(Long given) {
        this.given = given;
        return this;
    }

    @JsonIgnore
    public PayoutSignatures setGiven(long given) {
        return setGiven(Long.valueOf(given));
    }
}
