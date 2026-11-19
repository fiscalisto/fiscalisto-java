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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListFixedAssetsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
