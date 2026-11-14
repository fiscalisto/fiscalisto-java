// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Permission: Algo que una persona puede hacer en la empresa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission {
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
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su grupo, como en Ajustes › Roles.
     */
    @JsonProperty("group")
    private String group;

    /**
     * Delicado (equipo, credenciales, seguridad, plan): darlo o quitarlo se hace en la app.
     */
    @JsonProperty("sensitive")
    private Boolean sensitive;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Permission setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Permission setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su grupo, como en Ajustes › Roles.
     */
    public String getGroup() {
        return group;
    }

    public Permission setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Delicado (equipo, credenciales, seguridad, plan): darlo o quitarlo se hace en la app.
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public Permission setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
}
