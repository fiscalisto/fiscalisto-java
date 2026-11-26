// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetSatAnnualPreloadParams: los campos de «Ver la precarga de la anual de una persona física».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSatAnnualPreloadParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio, como 2025. Por omisión, el anterior (el que se declara).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetSatAnnualPreloadParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio, como 2025. Por omisión, el anterior (el que se declara).
     */
    public Long getYear() {
        return year;
    }

    public GetSatAnnualPreloadParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public GetSatAnnualPreloadParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }
}
