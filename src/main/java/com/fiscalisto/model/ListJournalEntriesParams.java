// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListJournalEntriesParams: los campos de «Listar las pólizas de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListJournalEntriesParams {
    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Cuántas por página, de 1 a 1,000. Por omisión 100.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id de la última póliza de la página anterior.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public ListJournalEntriesParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Cuántas por página, de 1 a 1,000. Por omisión 100.
     */
    public Long getLimit() {
        return limit;
    }

    public ListJournalEntriesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListJournalEntriesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id de la última póliza de la página anterior.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListJournalEntriesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListJournalEntriesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
