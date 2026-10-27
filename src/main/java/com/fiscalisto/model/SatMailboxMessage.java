// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatMailboxMessage: Un aviso del buzón tributario del SAT del emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatMailboxMessage {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su asunto.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * Su texto, resumido, o null.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * mailbox (el buzón del portal) o email (un aviso que el SAT mandó por correo).
     * <p>
     * Valores: mailbox, email.
     */
    @JsonProperty("source")
    private String source;

    /**
     * true si no se ha leído en el SAT.
     */
    @JsonProperty("unread")
    private Boolean unread;

    /**
     * urgent (un requerimiento, un plazo), attention o informational.
     * <p>
     * Valores: urgent, attention, informational.
     */
    @JsonProperty("urgency")
    private String urgency;

    /**
     * Qué es: requerimiento, carta invitación, informativo…
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * true si pide hacer algo.
     */
    @JsonProperty("action_required")
    private Boolean actionRequired;

    /**
     * Cuándo llegó, como lo dice el SAT.
     */
    @JsonProperty("received_at")
    private String receivedAt;

    /**
     * Cuándo lo trajo Fiscalisto.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SatMailboxMessage setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatMailboxMessage setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatMailboxMessage setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatMailboxMessage setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su asunto.
     */
    public String getSubject() {
        return subject;
    }

    public SatMailboxMessage setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Su texto, resumido, o null.
     */
    public String getSummary() {
        return summary;
    }

    public SatMailboxMessage setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * mailbox (el buzón del portal) o email (un aviso que el SAT mandó por correo).
     * <p>
     * Valores: mailbox, email.
     */
    public String getSource() {
        return source;
    }

    public SatMailboxMessage setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * true si no se ha leído en el SAT.
     */
    public Boolean getUnread() {
        return unread;
    }

    public SatMailboxMessage setUnread(Boolean unread) {
        this.unread = unread;
        return this;
    }

    /**
     * urgent (un requerimiento, un plazo), attention o informational.
     * <p>
     * Valores: urgent, attention, informational.
     */
    public String getUrgency() {
        return urgency;
    }

    public SatMailboxMessage setUrgency(String urgency) {
        this.urgency = urgency;
        return this;
    }

    /**
     * Qué es: requerimiento, carta invitación, informativo…
     */
    public String getKind() {
        return kind;
    }

    public SatMailboxMessage setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * true si pide hacer algo.
     */
    public Boolean getActionRequired() {
        return actionRequired;
    }

    public SatMailboxMessage setActionRequired(Boolean actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }

    /**
     * Cuándo llegó, como lo dice el SAT.
     */
    public String getReceivedAt() {
        return receivedAt;
    }

    public SatMailboxMessage setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Cuándo lo trajo Fiscalisto.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatMailboxMessage setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
