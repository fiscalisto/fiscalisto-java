// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListManualEntriesParams: los campos de «Listar las pólizas capturadas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListManualEntriesParams {
    /**
     * Cuántas por página, de 1 a 1,000. Por omisión 100.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * La última (mje_…) de la página anterior.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * Desde este día (AAAA-MM-DD).
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta este día (AAAA-MM-DD).
     */
    @JsonProperty("to")
    private String to;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuántas por página, de 1 a 1,000. Por omisión 100.
     */
    public Long getLimit() {
        return limit;
    }

    public ListManualEntriesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListManualEntriesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * La última (mje_…) de la página anterior.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListManualEntriesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Desde este día (AAAA-MM-DD).
     */
    public String getFrom() {
        return from;
    }

    public ListManualEntriesParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta este día (AAAA-MM-DD).
     */
    public String getTo() {
        return to;
    }

    public ListManualEntriesParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListManualEntriesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
