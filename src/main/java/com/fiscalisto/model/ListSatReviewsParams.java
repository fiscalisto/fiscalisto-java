// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatReviewsParams: los campos de «Listar revisiones del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatReviewsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de este estado: open, answered, concluded, assessed, in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatReviewsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de este estado: open, answered, concluded, assessed, in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    public String getStatus() {
        return status;
    }

    public ListSatReviewsParams setStatus(String status) {
        this.status = status;
        return this;
    }
}
