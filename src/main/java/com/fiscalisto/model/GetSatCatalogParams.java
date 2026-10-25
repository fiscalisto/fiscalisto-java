// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetSatCatalogParams: los campos de «Consultar un catálogo del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSatCatalogParams {
    /**
     * Qué buscar: palabras («consultoría») o una clave.
     */
    @JsonProperty("q")
    private String q;

    /**
     * Hasta cuántos, de 1 a 100 (búsquedas). Por omisión 20.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * Qué buscar: palabras («consultoría») o una clave.
     */
    public String getQ() {
        return q;
    }

    public GetSatCatalogParams setQ(String q) {
        this.q = q;
        return this;
    }

    /**
     * Hasta cuántos, de 1 a 100 (búsquedas). Por omisión 20.
     */
    public Long getLimit() {
        return limit;
    }

    public GetSatCatalogParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public GetSatCatalogParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }
}
