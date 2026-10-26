// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RollWebhookSecretParams: los campos de «Cambiar el secreto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RollWebhookSecretParams {
    /**
     * Segundos que el secreto anterior sigue firmando, de 0 (deja de firmar ya: úselo si se filtró) a 86400. Por omisión 86400 (24 horas).
     */
    @JsonProperty("previous_secret_expires_in")
    private Long previousSecretExpiresIn;

    /**
     * Segundos que el secreto anterior sigue firmando, de 0 (deja de firmar ya: úselo si se filtró) a 86400. Por omisión 86400 (24 horas).
     */
    public Long getPreviousSecretExpiresIn() {
        return previousSecretExpiresIn;
    }

    public RollWebhookSecretParams setPreviousSecretExpiresIn(Long previousSecretExpiresIn) {
        this.previousSecretExpiresIn = previousSecretExpiresIn;
        return this;
    }

    @JsonIgnore
    public RollWebhookSecretParams setPreviousSecretExpiresIn(long previousSecretExpiresIn) {
        return setPreviousSecretExpiresIn(Long.valueOf(previousSecretExpiresIn));
    }
}
