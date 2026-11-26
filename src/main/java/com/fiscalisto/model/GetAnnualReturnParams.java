// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAnnualReturnParams: los campos de «Calcular la declaración anual de una persona moral».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAnnualReturnParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El último mes, de 1 a 12, para estimar el año en curso. Por omisión 12 en un año pasado y el mes actual en el año en curso.
     */
    @JsonProperty("through_month")
    private Long throughMonth;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetAnnualReturnParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El último mes, de 1 a 12, para estimar el año en curso. Por omisión 12 en un año pasado y el mes actual en el año en curso.
     */
    public Long getThroughMonth() {
        return throughMonth;
    }

    public GetAnnualReturnParams setThroughMonth(Long throughMonth) {
        this.throughMonth = throughMonth;
        return this;
    }

    @JsonIgnore
    public GetAnnualReturnParams setThroughMonth(long throughMonth) {
        return setThroughMonth(Long.valueOf(throughMonth));
    }
}
