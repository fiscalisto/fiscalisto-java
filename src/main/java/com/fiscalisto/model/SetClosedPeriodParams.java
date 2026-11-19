// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetClosedPeriodParams: los campos de «Cerrar o reabrir meses de la contabilidad».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetClosedPeriodParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El último mes cerrado (AAAA-MM); los anteriores quedan cerrados también. null reabre todos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("closed_through")
    private String closedThrough;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SetClosedPeriodParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El último mes cerrado (AAAA-MM); los anteriores quedan cerrados también. null reabre todos.
     * <p>
     * Obligatorio.
     */
    public String getClosedThrough() {
        return closedThrough;
    }

    public SetClosedPeriodParams setClosedThrough(String closedThrough) {
        this.closedThrough = closedThrough;
        return this;
    }
}
