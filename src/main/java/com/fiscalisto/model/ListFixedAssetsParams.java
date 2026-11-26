// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListFixedAssetsParams: los campos de «Listar los activos fijos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListFixedAssetsParams {
    /**
     * El mes (AAAA-MM) a cuyo cierre van las cifras. Por omisión, el actual.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM) a cuyo cierre van las cifras. Por omisión, el actual.
     */
    public String getMonth() {
        return month;
    }

    public ListFixedAssetsParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListFixedAssetsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
