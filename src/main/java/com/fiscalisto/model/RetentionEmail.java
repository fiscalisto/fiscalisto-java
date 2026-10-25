// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionEmail: RetentionEmail.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionEmail {
    /**
     * A quién (correos separados por comas).
     */
    @JsonProperty("to")
    private String to;

    /**
     * Cuándo se envió.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * A quién (correos separados por comas).
     */
    public String getTo() {
        return to;
    }

    public RetentionEmail setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Cuándo se envió.
     */
    public String getSentAt() {
        return sentAt;
    }

    public RetentionEmail setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }
}
