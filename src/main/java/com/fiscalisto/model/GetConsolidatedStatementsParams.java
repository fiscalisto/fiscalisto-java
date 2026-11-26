// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetConsolidatedStatementsParams: los campos de «Ver los estados financieros consolidados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetConsolidatedStatementsParams {
    /**
     * Los RFC que consolida, separados por coma (de 2 a 20).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rfcs")
    private String rfcs;

    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Los RFC que consolida, separados por coma (de 2 a 20).
     * <p>
     * Obligatorio.
     */
    public String getRfcs() {
        return rfcs;
    }

    public GetConsolidatedStatementsParams setRfcs(String rfcs) {
        this.rfcs = rfcs;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetConsolidatedStatementsParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetConsolidatedStatementsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
