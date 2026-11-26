// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceDraft: Solo en un borrador (status draft).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceDraft {
    /**
     * Cuándo cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Alguien del equipo lo mandó a aprobar en Fiscalisto: no se timbra por la API hasta que un administrador lo apruebe. Cambiarlo retira la solicitud.
     */
    @JsonProperty("awaiting_approval")
    private Boolean awaitingApproval;

    /**
     * Se está timbrando en este momento (desde la API o desde Fiscalisto).
     */
    @JsonProperty("stamping")
    private Boolean stamping;

    /**
     * Programado en Fiscalisto («Programar timbrado») para timbrarse solo a esa hora; null si no.
     */
    @JsonProperty("scheduled_at")
    private String scheduledAt;

    /**
     * Al timbrarlo se manda por correo a customer.email.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Copias del correo al timbrarlo.
     */
    @JsonProperty("email_cc")
    private String emailCc;

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public InvoiceDraft setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Alguien del equipo lo mandó a aprobar en Fiscalisto: no se timbra por la API hasta que un administrador lo apruebe. Cambiarlo retira la solicitud.
     */
    public Boolean getAwaitingApproval() {
        return awaitingApproval;
    }

    public InvoiceDraft setAwaitingApproval(Boolean awaitingApproval) {
        this.awaitingApproval = awaitingApproval;
        return this;
    }

    /**
     * Se está timbrando en este momento (desde la API o desde Fiscalisto).
     */
    public Boolean getStamping() {
        return stamping;
    }

    public InvoiceDraft setStamping(Boolean stamping) {
        this.stamping = stamping;
        return this;
    }

    /**
     * Programado en Fiscalisto («Programar timbrado») para timbrarse solo a esa hora; null si no.
     */
    public String getScheduledAt() {
        return scheduledAt;
    }

    public InvoiceDraft setScheduledAt(String scheduledAt) {
        this.scheduledAt = scheduledAt;
        return this;
    }

    /**
     * Al timbrarlo se manda por correo a customer.email.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public InvoiceDraft setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Copias del correo al timbrarlo.
     */
    public String getEmailCc() {
        return emailCc;
    }

    public InvoiceDraft setEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }
}
