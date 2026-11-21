// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPayrollOrgChartParams: los campos de «Organigrama».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPayrollOrgChartParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Un día pasado (YYYY-MM-DD): el organigrama como estaba al cierre de ese día, con los jefes, departamentos y sucursales que tenían (se guardan desde el 21 de noviembre de 2026).
     */
    @JsonProperty("as_of")
    private String asOf;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetPayrollOrgChartParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Un día pasado (YYYY-MM-DD): el organigrama como estaba al cierre de ese día, con los jefes, departamentos y sucursales que tenían (se guardan desde el 21 de noviembre de 2026).
     */
    public String getAsOf() {
        return asOf;
    }

    public GetPayrollOrgChartParams setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
}
