// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RecoverWebhookEndpointParams: los campos de «Recuperar eventos fallidos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecoverWebhookEndpointParams {
    /**
     * Desde cuándo (ISO 8601, de los últimos 30 días): por ejemplo, cuando empezó a fallar su servidor (failing_since del webhook).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("since")
    private String since;

    /**
     * Desde cuándo (ISO 8601, de los últimos 30 días): por ejemplo, cuando empezó a fallar su servidor (failing_since del webhook).
     * <p>
     * Obligatorio.
     */
    public String getSince() {
        return since;
    }

    public RecoverWebhookEndpointParams setSince(String since) {
        this.since = since;
        return this;
    }
}
