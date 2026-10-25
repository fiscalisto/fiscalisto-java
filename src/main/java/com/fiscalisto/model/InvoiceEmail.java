// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceEmail: InvoiceEmail.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceEmail {
    /**
     * A quién (correos separados por comas).
     */
    @JsonProperty("to")
    private String to;

    /**
     * Con copia (correos separados por comas).
     */
    @JsonProperty("cc")
    private String cc;

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

    public InvoiceEmail setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Con copia (correos separados por comas).
     */
    public String getCc() {
        return cc;
    }

    public InvoiceEmail setCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * Cuándo se envió.
     */
    public String getSentAt() {
        return sentAt;
    }

    public InvoiceEmail setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }
}
