// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deleted: Confirmación de que se borró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deleted {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Siempre true.
     */
    @JsonProperty("deleted")
    private Boolean deleted;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Deleted setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Deleted setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Siempre true.
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public Deleted setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
}
