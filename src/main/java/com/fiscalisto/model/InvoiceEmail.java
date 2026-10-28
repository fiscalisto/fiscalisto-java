// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
     * Lo que pasó con el último envío: el peor de sus destinatarios (bounced o complained pesan más que opened o delivered). sent hasta que el servidor del cliente conteste.
     * <p>
     * Valores: sent, delayed, delivered, opened, bounced, complained.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cada dirección del envío (para y copia), con su entrega.
     */
    @JsonProperty("recipients")
    private List<InvoiceEmailRecipient> recipients;

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

    /**
     * Lo que pasó con el último envío: el peor de sus destinatarios (bounced o complained pesan más que opened o delivered). sent hasta que el servidor del cliente conteste.
     * <p>
     * Valores: sent, delayed, delivered, opened, bounced, complained.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceEmail setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cada dirección del envío (para y copia), con su entrega.
     */
    public List<InvoiceEmailRecipient> getRecipients() {
        return recipients;
    }

    public InvoiceEmail setRecipients(List<InvoiceEmailRecipient> recipients) {
        this.recipients = recipients;
        return this;
    }
}
