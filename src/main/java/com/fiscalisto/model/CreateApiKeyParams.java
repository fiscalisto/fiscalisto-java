// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * CreateApiKeyParams: los campos de «Crear una llave».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateApiKeyParams {
    /**
     * Para qué es, para usted (por ejemplo, el nombre de su cliente).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Qué puede hacer la llave en cada recurso: `read` o `write` (escritura incluye lectura). Un recurso que no está es sin acceso. Cada uno, como mucho lo que tiene la llave que la crea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permissions")
    private Map<String, String> permissions;

    /**
     * Los emisores con que trabaja (sus id). Vacío o sin mandar: todos los del modo; si la llave que la crea está limitada a algunos emisores, sin mandar son esos mismos y la nueva solo puede tener algunos de ellos.
     */
    @JsonProperty("issuers")
    private List<String> issuers;

    /**
     * Solo funciona desde estas IP o rangos CIDR (203.0.113.7, 203.0.113.0/24, 2001:db8::/32). Vacío: desde cualquiera; si la llave que la crea tiene IP, sin mandar son esas mismas y la nueva solo puede tener direcciones dentro de ellas.
     */
    @JsonProperty("allowed_ips")
    private List<String> allowedIps;

    /**
     * Horas hasta que deja de funcionar (1 hora a 3 años); null: no vence. Sin mandar: vence cuando vence la llave que la crea, o nunca. No puede pasar del vencimiento de la llave que la crea.
     */
    @JsonProperty("lifetime_hours")
    private Long lifetimeHours;

    /**
     * En vez de lifetime_hours: el momento en que deja de funcionar (ISO 8601), entre 1 hora y 3 años después.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Para qué es, para usted (por ejemplo, el nombre de su cliente).
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateApiKeyParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Qué puede hacer la llave en cada recurso: `read` o `write` (escritura incluye lectura). Un recurso que no está es sin acceso. Cada uno, como mucho lo que tiene la llave que la crea.
     * <p>
     * Obligatorio.
     */
    public Map<String, String> getPermissions() {
        return permissions;
    }

    public CreateApiKeyParams setPermissions(Map<String, String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Los emisores con que trabaja (sus id). Vacío o sin mandar: todos los del modo; si la llave que la crea está limitada a algunos emisores, sin mandar son esos mismos y la nueva solo puede tener algunos de ellos.
     */
    public List<String> getIssuers() {
        return issuers;
    }

    public CreateApiKeyParams setIssuers(List<String> issuers) {
        this.issuers = issuers;
        return this;
    }

    /**
     * Solo funciona desde estas IP o rangos CIDR (203.0.113.7, 203.0.113.0/24, 2001:db8::/32). Vacío: desde cualquiera; si la llave que la crea tiene IP, sin mandar son esas mismas y la nueva solo puede tener direcciones dentro de ellas.
     */
    public List<String> getAllowedIps() {
        return allowedIps;
    }

    public CreateApiKeyParams setAllowedIps(List<String> allowedIps) {
        this.allowedIps = allowedIps;
        return this;
    }

    /**
     * Horas hasta que deja de funcionar (1 hora a 3 años); null: no vence. Sin mandar: vence cuando vence la llave que la crea, o nunca. No puede pasar del vencimiento de la llave que la crea.
     */
    public Long getLifetimeHours() {
        return lifetimeHours;
    }

    public CreateApiKeyParams setLifetimeHours(Long lifetimeHours) {
        this.lifetimeHours = lifetimeHours;
        return this;
    }

    @JsonIgnore
    public CreateApiKeyParams setLifetimeHours(long lifetimeHours) {
        return setLifetimeHours(Long.valueOf(lifetimeHours));
    }

    /**
     * En vez de lifetime_hours: el momento en que deja de funcionar (ISO 8601), entre 1 hora y 3 años después.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public CreateApiKeyParams setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
