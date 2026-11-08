// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpensePersonLink: El enlace de una persona: ahí ve solo sus comprobaciones y sube sus facturas desde el teléfono, sin cuenta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpensePersonLink {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * La persona (exp_…).
     */
    @JsonProperty("person")
    private String person;

    /**
     * Su enlace, o null si está apagado.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpensePersonLink setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * La persona (exp_…).
     */
    public String getPerson() {
        return person;
    }

    public ExpensePersonLink setPerson(String person) {
        this.person = person;
        return this;
    }

    /**
     * Su enlace, o null si está apagado.
     */
    public String getUrl() {
        return url;
    }

    public ExpensePersonLink setUrl(String url) {
        this.url = url;
        return this;
    }
}
