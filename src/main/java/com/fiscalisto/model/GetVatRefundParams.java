// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetVatRefundParams: los campos de «Ver el IVA a favor y preparar su devolución».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetVatRefundParams {
    /**
     * El mes del saldo a revisar (AAAA-MM). Sin él, solo los saldos.
     */
    @JsonProperty("month")
    private String month;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes del saldo a revisar (AAAA-MM). Sin él, solo los saldos.
     */
    public String getMonth() {
        return month;
    }

    public GetVatRefundParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetVatRefundParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
