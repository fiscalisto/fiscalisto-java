// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetInflationAdjustmentParams: los campos de «Calcular el ajuste anual por inflación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetInflationAdjustmentParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El primer mes del ejercicio, de 1 a 12. Por omisión 1; otro si la empresa empezó en el año.
     */
    @JsonProperty("from_month")
    private Long fromMonth;

    /**
     * El último mes, de 1 a 12. Por omisión 12 en un año pasado y el mes actual en el año en curso.
     */
    @JsonProperty("through_month")
    private Long throughMonth;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetInflationAdjustmentParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El primer mes del ejercicio, de 1 a 12. Por omisión 1; otro si la empresa empezó en el año.
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public GetInflationAdjustmentParams setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    @JsonIgnore
    public GetInflationAdjustmentParams setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }

    /**
     * El último mes, de 1 a 12. Por omisión 12 en un año pasado y el mes actual en el año en curso.
     */
    public Long getThroughMonth() {
        return throughMonth;
    }

    public GetInflationAdjustmentParams setThroughMonth(Long throughMonth) {
        this.throughMonth = throughMonth;
        return this;
    }

    @JsonIgnore
    public GetInflationAdjustmentParams setThroughMonth(long throughMonth) {
        return setThroughMonth(Long.valueOf(throughMonth));
    }
}
