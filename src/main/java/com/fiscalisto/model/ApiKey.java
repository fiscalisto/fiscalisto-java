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
 * ApiKey: Una llave secreta de la API, con permisos por recurso.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiKey {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El principio de la llave (fk_live_AbC…), para reconocerla. El secreto completo solo viene en secret.
     */
    @JsonProperty("redacted")
    private String redacted;

    /**
     * read o write en cada recurso; uno que no está es sin acceso.
     */
    @JsonProperty("permissions")
    private Map<String, String> permissions;

    /**
     * Los emisores con que trabaja; vacío: todos los del modo.
     */
    @JsonProperty("issuers")
    private List<String> issuers;

    /**
     * Solo funciona desde estas IP o rangos; vacío: desde cualquiera.
     */
    @JsonProperty("allowed_ips")
    private List<String> allowedIps;

    /**
     * La duración que se le dio al crearla, en horas (la nueva al cambiarla dura lo mismo); null: no vence.
     */
    @JsonProperty("lifetime_hours")
    private Long lifetimeHours;

    /**
     * Cuándo deja de funcionar (su duración, o el plazo de una llave que se cambió); null: no vence.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Su última solicitud (al minuto), o null.
     */
    @JsonProperty("last_used_at")
    private String lastUsedAt;

    /**
     * Ya se cambió por otra (POST /v1/api_keys/{id}/roll): funciona solo hasta expires_at.
     */
    @JsonProperty("rolled")
    private Boolean rolled;

    /**
     * El entorno de prueba (sbx_…) en que funciona, o null.
     */
    @JsonProperty("sandbox")
    private StringOr<Sandbox> sandbox;

    /**
     * La llave completa (fk_live_… o fk_test_…): solo en la respuesta que la crea o la cambia. Guárdela; no se vuelve a mostrar.
     */
    @JsonProperty("secret")
    private String secret;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ApiKey setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ApiKey setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ApiKey setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ApiKey setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El principio de la llave (fk_live_AbC…), para reconocerla. El secreto completo solo viene en secret.
     */
    public String getRedacted() {
        return redacted;
    }

    public ApiKey setRedacted(String redacted) {
        this.redacted = redacted;
        return this;
    }

    /**
     * read o write en cada recurso; uno que no está es sin acceso.
     */
    public Map<String, String> getPermissions() {
        return permissions;
    }

    public ApiKey setPermissions(Map<String, String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Los emisores con que trabaja; vacío: todos los del modo.
     */
    public List<String> getIssuers() {
        return issuers;
    }

    public ApiKey setIssuers(List<String> issuers) {
        this.issuers = issuers;
        return this;
    }

    /**
     * Solo funciona desde estas IP o rangos; vacío: desde cualquiera.
     */
    public List<String> getAllowedIps() {
        return allowedIps;
    }

    public ApiKey setAllowedIps(List<String> allowedIps) {
        this.allowedIps = allowedIps;
        return this;
    }

    /**
     * La duración que se le dio al crearla, en horas (la nueva al cambiarla dura lo mismo); null: no vence.
     */
    public Long getLifetimeHours() {
        return lifetimeHours;
    }

    public ApiKey setLifetimeHours(Long lifetimeHours) {
        this.lifetimeHours = lifetimeHours;
        return this;
    }

    @JsonIgnore
    public ApiKey setLifetimeHours(long lifetimeHours) {
        return setLifetimeHours(Long.valueOf(lifetimeHours));
    }

    /**
     * Cuándo deja de funcionar (su duración, o el plazo de una llave que se cambió); null: no vence.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public ApiKey setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ApiKey setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Su última solicitud (al minuto), o null.
     */
    public String getLastUsedAt() {
        return lastUsedAt;
    }

    public ApiKey setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    /**
     * Ya se cambió por otra (POST /v1/api_keys/{id}/roll): funciona solo hasta expires_at.
     */
    public Boolean getRolled() {
        return rolled;
    }

    public ApiKey setRolled(Boolean rolled) {
        this.rolled = rolled;
        return this;
    }

    /**
     * El entorno de prueba (sbx_…) en que funciona, o null.
     */
    public StringOr<Sandbox> getSandbox() {
        return sandbox;
    }

    public ApiKey setSandbox(StringOr<Sandbox> sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ApiKey setSandbox(String id) {
        return setSandbox(StringOr.<Sandbox>id(id));
    }

    @JsonIgnore
    public ApiKey setSandbox(Sandbox sandbox) {
        return setSandbox(StringOr.of(sandbox));
    }

    /**
     * La llave completa (fk_live_… o fk_test_…): solo en la respuesta que la crea o la cambia. Guárdela; no se vuelve a mostrar.
     */
    public String getSecret() {
        return secret;
    }

    public ApiKey setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
