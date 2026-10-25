// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateStoreConnectionParams: los campos de «Cambiar cómo se vuelven tickets sus pedidos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateStoreConnectionParams {
    /**
     * Lo que cambia; lo demás queda.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("settings")
    private UpdateStoreConnectionParamsSettings settings;

    /**
     * Lo que cambia; lo demás queda.
     * <p>
     * Obligatorio.
     */
    public UpdateStoreConnectionParamsSettings getSettings() {
        return settings;
    }

    public UpdateStoreConnectionParams setSettings(UpdateStoreConnectionParamsSettings settings) {
        this.settings = settings;
        return this;
    }
}
