// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SandboxKey: Solo al crearlo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SandboxKey {
    /**
     * Id de la llave.
     */
    @JsonProperty("id")
    private String id;

    /**
     * La llave fk_test_… del entorno. Solo se ve esta vez: guárdela.
     */
    @JsonProperty("secret")
    private String secret;

    /**
     * Id de la llave.
     */
    public String getId() {
        return id;
    }

    public SandboxKey setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * La llave fk_test_… del entorno. Solo se ve esta vez: guárdela.
     */
    public String getSecret() {
        return secret;
    }

    public SandboxKey setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
