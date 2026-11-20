// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * OrderRulesParams: los campos de «Ordenar las reglas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRulesParams {
    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Las reglas (rul_…), de la primera a la última.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rules")
    private List<String> rules;

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public OrderRulesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las reglas (rul_…), de la primera a la última.
     * <p>
     * Obligatorio.
     */
    public List<String> getRules() {
        return rules;
    }

    public OrderRulesParams setRules(List<String> rules) {
        this.rules = rules;
        return this;
    }
}
