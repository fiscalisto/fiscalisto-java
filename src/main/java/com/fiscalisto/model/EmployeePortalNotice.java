// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmployeePortalNotice: EmployeePortalNotice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeePortalNotice {
    /**
     * receipt: recibo nuevo; receipt_canceled: se canceló uno; vacation_approved / vacation_rejected: la respuesta a sus vacaciones; sign_reminder: tiene un recibo por firmar; survey: tiene una encuesta de clima laboral por contestar; review: tiene evaluaciones de desempeño por hacer.
     * <p>
     * Valores: receipt, receipt_canceled, vacation_approved, vacation_rejected, sign_reminder, survey, review.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Cómo le llegó: push (a su celular), email (a su correo), off (usted o el empleado apagó ese aviso), none (no tiene avisos ni correo), skipped (ya no aplicaba: lo firmó, se canceló o se lo mandamos con el recibo), stale (no salió en 7 días); null mientras está por salir (por ejemplo, de noche).
     * <p>
     * Valores: push, email, off, none, skipped, stale.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Cuándo se generó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo salió.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * receipt: recibo nuevo; receipt_canceled: se canceló uno; vacation_approved / vacation_rejected: la respuesta a sus vacaciones; sign_reminder: tiene un recibo por firmar; survey: tiene una encuesta de clima laboral por contestar; review: tiene evaluaciones de desempeño por hacer.
     * <p>
     * Valores: receipt, receipt_canceled, vacation_approved, vacation_rejected, sign_reminder, survey, review.
     */
    public String getKind() {
        return kind;
    }

    public EmployeePortalNotice setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Cómo le llegó: push (a su celular), email (a su correo), off (usted o el empleado apagó ese aviso), none (no tiene avisos ni correo), skipped (ya no aplicaba: lo firmó, se canceló o se lo mandamos con el recibo), stale (no salió en 7 días); null mientras está por salir (por ejemplo, de noche).
     * <p>
     * Valores: push, email, off, none, skipped, stale.
     */
    public String getChannel() {
        return channel;
    }

    public EmployeePortalNotice setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Cuándo se generó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public EmployeePortalNotice setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo salió.
     */
    public String getSentAt() {
        return sentAt;
    }

    public EmployeePortalNotice setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }
}
