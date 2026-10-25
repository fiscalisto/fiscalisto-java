// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAccountParams: los campos de «Cambiar la versión de la API».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAccountParams {
    /**
     * La versión de la API de la cuenta: la que reciben sus solicitudes sin Fiscalisto-Version y sus webhooks sin api_version propio. Pruebe antes la nueva con el encabezado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("api_version")
    private String apiVersion;

    /**
     * La versión de la API de la cuenta: la que reciben sus solicitudes sin Fiscalisto-Version y sus webhooks sin api_version propio. Pruebe antes la nueva con el encabezado.
     * <p>
     * Obligatorio.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public UpdateAccountParams setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
}
