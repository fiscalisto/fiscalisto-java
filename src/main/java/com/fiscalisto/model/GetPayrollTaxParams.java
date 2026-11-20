// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPayrollTaxParams: los campos de «Impuesto sobre nómina del mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPayrollTaxParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes: 2026-11.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetPayrollTaxParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes: 2026-11.
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetPayrollTaxParams setMonth(String month) {
        this.month = month;
        return this;
    }
}
