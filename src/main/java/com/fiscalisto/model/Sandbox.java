// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sandbox: Un entorno de prueba: el modo de pruebas propio de una persona, con su emisor, llaves, webhooks y eventos aparte.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sandbox {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Emisores activos en el entorno.
     */
    @JsonProperty("issuers")
    private Long issuers;

    /**
     * El emisor de pruebas del SAT con que nace (solo al crearlo).
     */
    @JsonProperty("issuer")
    private Issuer issuer;

    /**
     * Solo al crearlo.
     */
    @JsonProperty("key")
    private SandboxKey key;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Siempre true.
     */
    @JsonProperty("deleted")
    private Boolean deleted;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Sandbox setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Sandbox setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Sandbox setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Sandbox setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Emisores activos en el entorno.
     */
    public Long getIssuers() {
        return issuers;
    }

    public Sandbox setIssuers(Long issuers) {
        this.issuers = issuers;
        return this;
    }

    @JsonIgnore
    public Sandbox setIssuers(long issuers) {
        return setIssuers(Long.valueOf(issuers));
    }

    /**
     * El emisor de pruebas del SAT con que nace (solo al crearlo).
     */
    public Issuer getIssuer() {
        return issuer;
    }

    public Sandbox setIssuer(Issuer issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo al crearlo.
     */
    public SandboxKey getKey() {
        return key;
    }

    public Sandbox setKey(SandboxKey key) {
        this.key = key;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Sandbox setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Siempre true.
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public Sandbox setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
}
