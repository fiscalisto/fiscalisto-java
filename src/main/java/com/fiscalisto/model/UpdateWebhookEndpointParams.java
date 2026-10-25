// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateWebhookEndpointParams: los campos de «Actualizar un webhook».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateWebhookEndpointParams {
    /**
     * Dirección https de su servidor que recibe los avisos.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). Ver la lista en Webhooks.
     */
    @JsonProperty("events")
    private List<String> events;

    /**
     * Para qué es, para usted (no se manda en los eventos).
     */
    @JsonProperty("description")
    private String description;

    /**
     * true para apagarlo sin borrarlo.
     */
    @JsonProperty("disabled")
    private Boolean disabled;

    /**
     * La versión de la API en que llegan sus eventos (por ejemplo 2026-10-24); null o sin mandar: la de la cuenta. Así actualiza un endpoint a la vez.
     */
    @JsonProperty("api_version")
    private String apiVersion;

    /**
     * Dirección https de su servidor que recibe los avisos.
     */
    public String getUrl() {
        return url;
    }

    public UpdateWebhookEndpointParams setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). Ver la lista en Webhooks.
     */
    public List<String> getEvents() {
        return events;
    }

    public UpdateWebhookEndpointParams setEvents(List<String> events) {
        this.events = events;
        return this;
    }

    /**
     * Para qué es, para usted (no se manda en los eventos).
     */
    public String getDescription() {
        return description;
    }

    public UpdateWebhookEndpointParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * true para apagarlo sin borrarlo.
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public UpdateWebhookEndpointParams setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * La versión de la API en que llegan sus eventos (por ejemplo 2026-10-24); null o sin mandar: la de la cuenta. Así actualiza un endpoint a la vez.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public UpdateWebhookEndpointParams setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
}
