// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ChartTemplate: Un catálogo por giro: las cuentas que usa un negocio de ese tipo además de las que la app ya lleva.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartTemplate {
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
     * El nombre del giro.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Para qué negocio es.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Las cuentas del giro.
     */
    @JsonProperty("accounts")
    private List<ChartTemplateAccount> accounts;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ChartTemplate setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ChartTemplate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El nombre del giro.
     */
    public String getName() {
        return name;
    }

    public ChartTemplate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Para qué negocio es.
     */
    public String getDescription() {
        return description;
    }

    public ChartTemplate setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Las cuentas del giro.
     */
    public List<ChartTemplateAccount> getAccounts() {
        return accounts;
    }

    public ChartTemplate setAccounts(List<ChartTemplateAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
