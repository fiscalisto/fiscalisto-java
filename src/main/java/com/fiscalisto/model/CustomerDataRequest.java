// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerDataRequest: Una liga para que un cliente dé sus datos fiscales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDataRequest {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * El emisor que le va a facturar.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * open (la liga espera), completed (el cliente mandó sus datos), expired (venció) o canceled.
     * <p>
     * Valores: open, completed, expired, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La liga para su cliente, en fiscalisto.com. null cuando ya no está abierta.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Su id para este cliente o pedido.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * Lo que el cliente ve arriba del formulario.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Cuándo deja de servir la liga.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Lo que mandó el cliente (el último envío: puede corregirlo en las 24 horas siguientes). null mientras no conteste.
     */
    @JsonProperty("submission")
    private CustomerDataRequestSubmission submission;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public CustomerDataRequest setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CustomerDataRequest setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CustomerDataRequest setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor que le va a facturar.
     */
    public String getIssuer() {
        return issuer;
    }

    public CustomerDataRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * open (la liga espera), completed (el cliente mandó sus datos), expired (venció) o canceled.
     * <p>
     * Valores: open, completed, expired, canceled.
     */
    public String getStatus() {
        return status;
    }

    public CustomerDataRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La liga para su cliente, en fiscalisto.com. null cuando ya no está abierta.
     */
    public String getUrl() {
        return url;
    }

    public CustomerDataRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Su id para este cliente o pedido.
     */
    public String getReference() {
        return reference;
    }

    public CustomerDataRequest setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Lo que el cliente ve arriba del formulario.
     */
    public String getDescription() {
        return description;
    }

    public CustomerDataRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Cuándo deja de servir la liga.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public CustomerDataRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public CustomerDataRequest setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Lo que mandó el cliente (el último envío: puede corregirlo en las 24 horas siguientes). null mientras no conteste.
     */
    public CustomerDataRequestSubmission getSubmission() {
        return submission;
    }

    public CustomerDataRequest setSubmission(CustomerDataRequestSubmission submission) {
        this.submission = submission;
        return this;
    }
}
