// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;
import java.util.Map;

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
     * Una llave con permisos por recurso: read (consulta) o write (consulta y cambia) en cada recurso (invoices, customers, payouts…, uno por sección de la referencia); uno que no aparece no tiene acceso (key_resource_denied). null si tiene todos los permisos.
     */
    @JsonProperty("permissions")
    private Map<String, String> permissions;

    /**
     * Las IP o rangos (CIDR, IPv4 o IPv6) desde los que funciona la llave; desde otra responde ip_not_allowed. null si funciona desde cualquiera.
     */
    @JsonProperty("allowed_ips")
    private List<String> allowedIps;

    /**
     * Cuándo deja de funcionar: la vigencia elegida al crearla, o el fin del traslape al cambiarla. null si no vence.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * El entorno de prueba (sbx_…) de la llave: solo ve sus emisores, webhooks y eventos. null si es de la cuenta.
     */
    @JsonProperty("sandbox")
    private StringOr<Sandbox> sandbox;

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
     * Una llave con permisos por recurso: read (consulta) o write (consulta y cambia) en cada recurso (invoices, customers, payouts…, uno por sección de la referencia); uno que no aparece no tiene acceso (key_resource_denied). null si tiene todos los permisos.
     */
    public Map<String, String> getPermissions() {
        return permissions;
    }

    public AccountKey setPermissions(Map<String, String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Las IP o rangos (CIDR, IPv4 o IPv6) desde los que funciona la llave; desde otra responde ip_not_allowed. null si funciona desde cualquiera.
     */
    public List<String> getAllowedIps() {
        return allowedIps;
    }

    public AccountKey setAllowedIps(List<String> allowedIps) {
        this.allowedIps = allowedIps;
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
    public StringOr<Sandbox> getSandbox() {
        return sandbox;
    }

    public AccountKey setSandbox(StringOr<Sandbox> sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public AccountKey setSandbox(String id) {
        return setSandbox(StringOr.<Sandbox>id(id));
    }

    @JsonIgnore
    public AccountKey setSandbox(Sandbox sandbox) {
        return setSandbox(StringOr.of(sandbox));
    }
}
