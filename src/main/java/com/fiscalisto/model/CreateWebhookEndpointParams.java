// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateWebhookEndpointParams: los campos de «Crear un webhook».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateWebhookEndpointParams {
    /**
     * Dirección https de su servidor que recibe los avisos.
     * <p>
     * Obligatorio.
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
     * Dirección https de su servidor que recibe los avisos.
     * <p>
     * Obligatorio.
     */
    public String getUrl() {
        return url;
    }

    public CreateWebhookEndpointParams setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). Ver la lista en Webhooks.
     */
    public List<String> getEvents() {
        return events;
    }

    public CreateWebhookEndpointParams setEvents(List<String> events) {
        this.events = events;
        return this;
    }

    /**
     * Para qué es, para usted (no se manda en los eventos).
     */
    public String getDescription() {
        return description;
    }

    public CreateWebhookEndpointParams setDescription(String description) {
        this.description = description;
        return this;
    }
}
