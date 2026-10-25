// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Account: La cuenta API de la llave que hizo la solicitud.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * El nombre de la cuenta API.
     */
    @JsonProperty("name")
    private String name;

    /**
     * La versión de la API de la cuenta (la de sus solicitudes sin Fiscalisto-Version). Ver Versiones.
     */
    @JsonProperty("api_version")
    private String apiVersion;

    /**
     * La versión más reciente de la API.
     */
    @JsonProperty("latest_api_version")
    private String latestApiVersion;

    /**
     * La llave con que se hizo la solicitud: id, nombre y emisores a los que se limita.
     */
    @JsonProperty("key")
    private AccountKey key;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Account setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Account setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El nombre de la cuenta API.
     */
    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * La versión de la API de la cuenta (la de sus solicitudes sin Fiscalisto-Version). Ver Versiones.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public Account setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * La versión más reciente de la API.
     */
    public String getLatestApiVersion() {
        return latestApiVersion;
    }

    public Account setLatestApiVersion(String latestApiVersion) {
        this.latestApiVersion = latestApiVersion;
        return this;
    }

    /**
     * La llave con que se hizo la solicitud: id, nombre y emisores a los que se limita.
     */
    public AccountKey getKey() {
        return key;
    }

    public Account setKey(AccountKey key) {
        this.key = key;
        return this;
    }
}
