// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * WebhookEndpoint: Una dirección de su servidor que recibe eventos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookEndpoint {
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
     * El entorno de prueba (sbx_…) al que pertenece, o null si es de la cuenta. Vea /v1/sandboxes.
     */
    @JsonProperty("sandbox")
    private String sandbox;

    /**
     * Dirección https de su servidor que recibe los avisos.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Para qué es, para usted.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). Ver la lista en Webhooks.
     */
    @JsonProperty("events")
    private List<String> events;

    /**
     * enabled: entregando. failing: sus entregas fallan (se apaga tras 5 días así). disabled: apagado.
     * <p>
     * Valores: enabled, failing, disabled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Por qué se apagó (sus entregas fallaron 5 días seguidos, o usted lo apagó).
     */
    @JsonProperty("disabled_reason")
    private String disabledReason;

    /**
     * Desde cuándo fallan las entregas, o null.
     */
    @JsonProperty("failing_since")
    private String failingSince;

    /**
     * Hasta cuándo el secreto anterior también firma (después de cambiarlo), o null.
     */
    @JsonProperty("previous_secret_expires_at")
    private String previousSecretExpiresAt;

    /**
     * La versión de la API de sus eventos; null: la de la cuenta.
     */
    @JsonProperty("api_version")
    private String apiVersion;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Secreto de firma (whsec_…). Solo viene al crearlo o al cambiarlo: guárdelo para verificar las firmas.
     */
    @JsonProperty("secret")
    private String secret;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public WebhookEndpoint setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public WebhookEndpoint setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public WebhookEndpoint setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El entorno de prueba (sbx_…) al que pertenece, o null si es de la cuenta. Vea /v1/sandboxes.
     */
    public String getSandbox() {
        return sandbox;
    }

    public WebhookEndpoint setSandbox(String sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    /**
     * Dirección https de su servidor que recibe los avisos.
     */
    public String getUrl() {
        return url;
    }

    public WebhookEndpoint setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Para qué es, para usted.
     */
    public String getDescription() {
        return description;
    }

    public WebhookEndpoint setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). Ver la lista en Webhooks.
     */
    public List<String> getEvents() {
        return events;
    }

    public WebhookEndpoint setEvents(List<String> events) {
        this.events = events;
        return this;
    }

    /**
     * enabled: entregando. failing: sus entregas fallan (se apaga tras 5 días así). disabled: apagado.
     * <p>
     * Valores: enabled, failing, disabled.
     */
    public String getStatus() {
        return status;
    }

    public WebhookEndpoint setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Por qué se apagó (sus entregas fallaron 5 días seguidos, o usted lo apagó).
     */
    public String getDisabledReason() {
        return disabledReason;
    }

    public WebhookEndpoint setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /**
     * Desde cuándo fallan las entregas, o null.
     */
    public String getFailingSince() {
        return failingSince;
    }

    public WebhookEndpoint setFailingSince(String failingSince) {
        this.failingSince = failingSince;
        return this;
    }

    /**
     * Hasta cuándo el secreto anterior también firma (después de cambiarlo), o null.
     */
    public String getPreviousSecretExpiresAt() {
        return previousSecretExpiresAt;
    }

    public WebhookEndpoint setPreviousSecretExpiresAt(String previousSecretExpiresAt) {
        this.previousSecretExpiresAt = previousSecretExpiresAt;
        return this;
    }

    /**
     * La versión de la API de sus eventos; null: la de la cuenta.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public WebhookEndpoint setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public WebhookEndpoint setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Secreto de firma (whsec_…). Solo viene al crearlo o al cambiarlo: guárdelo para verificar las firmas.
     */
    public String getSecret() {
        return secret;
    }

    public WebhookEndpoint setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
