// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RollApiKeyParams: los campos de «Cambiar una llave».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RollApiKeyParams {
    /**
     * Segundos que la llave anterior sigue funcionando (0: deja de funcionar ya; hasta 7 días). Sin mandar: 24 horas.
     */
    @JsonProperty("expires_in")
    private Long expiresIn;

    /**
     * Segundos que la llave anterior sigue funcionando (0: deja de funcionar ya; hasta 7 días). Sin mandar: 24 horas.
     */
    public Long getExpiresIn() {
        return expiresIn;
    }

    public RollApiKeyParams setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    @JsonIgnore
    public RollApiKeyParams setExpiresIn(long expiresIn) {
        return setExpiresIn(Long.valueOf(expiresIn));
    }
}
