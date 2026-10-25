// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AccountKey: La llave con que se hizo la solicitud: id, nombre y emisores a los que se limita.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountKey {
    /**
     * Id de la llave.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Nombre de la llave.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Emisores a los que se limita la llave; null si puede usar todos.
     */
    @JsonProperty("issuers")
    private List<String> issuers;

    /**
     * true si la llave solo consulta (key_read_only en lo demás).
     */
    @JsonProperty("read_only")
    private Boolean readOnly;

    /**
     * Cuándo deja de funcionar: la vigencia elegida al crearla, o el fin del traslape al cambiarla. null si no vence.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * El entorno de prueba (sbx_…) de la llave: solo ve sus emisores, webhooks y eventos. null si es de la cuenta.
     */
    @JsonProperty("sandbox")
    private String sandbox;

    /**
     * Id de la llave.
     */
    public String getId() {
        return id;
    }

    public AccountKey setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Nombre de la llave.
     */
    public String getName() {
        return name;
    }

    public AccountKey setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Emisores a los que se limita la llave; null si puede usar todos.
     */
    public List<String> getIssuers() {
        return issuers;
    }

    public AccountKey setIssuers(List<String> issuers) {
        this.issuers = issuers;
        return this;
    }

    /**
     * true si la llave solo consulta (key_read_only en lo demás).
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public AccountKey setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Cuándo deja de funcionar: la vigencia elegida al crearla, o el fin del traslape al cambiarla. null si no vence.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public AccountKey setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * El entorno de prueba (sbx_…) de la llave: solo ve sus emisores, webhooks y eventos. null si es de la cuenta.
     */
    public String getSandbox() {
        return sandbox;
    }

    public AccountKey setSandbox(String sandbox) {
        this.sandbox = sandbox;
        return this;
    }
}
