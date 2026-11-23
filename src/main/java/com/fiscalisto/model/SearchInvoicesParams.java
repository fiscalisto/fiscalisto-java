// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchInvoicesParams: los campos de «Buscar facturas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchInvoicesParams {
    /**
     * La búsqueda, por ejemplo customer:'URE180429TM6' AND total&gt;1000 AND created&gt;'2026-11-01'.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La búsqueda, por ejemplo customer:'URE180429TM6' AND total&gt;1000 AND created&gt;'2026-11-01'.
     * <p>
     * Obligatorio.
     */
    public String getQuery() {
        return query;
    }

    public SearchInvoicesParams setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public SearchInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public SearchInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public SearchInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public SearchInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
