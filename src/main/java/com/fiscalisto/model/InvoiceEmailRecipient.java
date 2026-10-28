// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceEmailRecipient: InvoiceEmailRecipient.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceEmailRecipient {
    /**
     * La dirección de correo del destinatario.
     */
    @JsonProperty("address")
    private String address;

    /**
     * Estado del objeto.
     * <p>
     * Valores: sent, delayed, delivered, opened, bounced, complained.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuando el servidor del destinatario lo aceptó.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * La primera vez que se abrió (aproximado: algunos correos cargan las imágenes solos o no las cargan).
     */
    @JsonProperty("opened_at")
    private String openedAt;

    /**
     * Cuando rebotó.
     */
    @JsonProperty("bounced_at")
    private String bouncedAt;

    /**
     * Por qué rebotó, en español: «buzón no existe», «buzón lleno»…
     */
    @JsonProperty("bounce_reason")
    private String bounceReason;

    /**
     * Cuando el destinatario lo marcó como spam.
     */
    @JsonProperty("complained_at")
    private String complainedAt;

    /**
     * La dirección de correo del destinatario.
     */
    public String getAddress() {
        return address;
    }

    public InvoiceEmailRecipient setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Estado del objeto.
     * <p>
     * Valores: sent, delayed, delivered, opened, bounced, complained.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceEmailRecipient setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuando el servidor del destinatario lo aceptó.
     */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    public InvoiceEmailRecipient setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /**
     * La primera vez que se abrió (aproximado: algunos correos cargan las imágenes solos o no las cargan).
     */
    public String getOpenedAt() {
        return openedAt;
    }

    public InvoiceEmailRecipient setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    /**
     * Cuando rebotó.
     */
    public String getBouncedAt() {
        return bouncedAt;
    }

    public InvoiceEmailRecipient setBouncedAt(String bouncedAt) {
        this.bouncedAt = bouncedAt;
        return this;
    }

    /**
     * Por qué rebotó, en español: «buzón no existe», «buzón lleno»…
     */
    public String getBounceReason() {
        return bounceReason;
    }

    public InvoiceEmailRecipient setBounceReason(String bounceReason) {
        this.bounceReason = bounceReason;
        return this;
    }

    /**
     * Cuando el destinatario lo marcó como spam.
     */
    public String getComplainedAt() {
        return complainedAt;
    }

    public InvoiceEmailRecipient setComplainedAt(String complainedAt) {
        this.complainedAt = complainedAt;
        return this;
    }
}
