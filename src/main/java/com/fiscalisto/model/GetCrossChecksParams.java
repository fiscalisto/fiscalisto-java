// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCrossChecksParams: los campos de «Cruzar lo declarado con lo facturado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCrossChecksParams {
    /**
     * El ejercicio. Por omisión, el actual.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio. Por omisión, el actual.
     */
    public Long getYear() {
        return year;
    }

    public GetCrossChecksParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public GetCrossChecksParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCrossChecksParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
