// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResendEventParams: los campos de «Reenviar un evento».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResendEventParams {
    /**
     * El webhook (whe_…) al que mandarlo otra vez. Sin mandar: a todos los webhooks encendidos que escuchan ese tipo de evento.
     */
    @JsonProperty("endpoint")
    private String endpoint;

    /**
     * El webhook (whe_…) al que mandarlo otra vez. Sin mandar: a todos los webhooks encendidos que escuchan ese tipo de evento.
     */
    public String getEndpoint() {
        return endpoint;
    }

    public ResendEventParams setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
}
