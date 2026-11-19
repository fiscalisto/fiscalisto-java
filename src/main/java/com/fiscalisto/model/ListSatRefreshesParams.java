// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatRefreshesParams: los campos de «Listar consultas al SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatRefreshesParams {
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
     * Solo las de un emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de un documento.
     * <p>
     * Valores: declarations, compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    @JsonProperty("document")
    private String document;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatRefreshesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatRefreshesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatRefreshesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo las de un emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatRefreshesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de un documento.
     * <p>
     * Valores: declarations, compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    public String getDocument() {
        return document;
    }

    public ListSatRefreshesParams setDocument(String document) {
        this.document = document;
        return this;
    }
}
