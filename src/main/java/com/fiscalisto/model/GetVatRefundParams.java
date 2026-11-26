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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetVatRefundParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
