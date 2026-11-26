// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetIepsCustomersFileParams: los campos de «Descargar los clientes con IEPS desglosado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetIepsCustomersFileParams {
    /**
     * El año (AAAA), de 2015 al actual.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private String year;

    /**
     * El trimestre (1 a 4).
     * <p>
     * Valores: 1, 2, 3, 4.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quarter")
    private String quarter;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El año (AAAA), de 2015 al actual.
     * <p>
     * Obligatorio.
     */
    public String getYear() {
        return year;
    }

    public GetIepsCustomersFileParams setYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * El trimestre (1 a 4).
     * <p>
     * Valores: 1, 2, 3, 4.
     * <p>
     * Obligatorio.
     */
    public String getQuarter() {
        return quarter;
    }

    public GetIepsCustomersFileParams setQuarter(String quarter) {
        this.quarter = quarter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetIepsCustomersFileParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
