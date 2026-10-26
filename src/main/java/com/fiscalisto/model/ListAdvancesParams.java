// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListAdvancesParams: los campos de «Listar anticipos sin aplicar».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAdvancesParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * RFC del cliente o su id (cus_…).
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListAdvancesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * RFC del cliente o su id (cus_…).
     */
    public String getCustomer() {
        return customer;
    }

    public ListAdvancesParams setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
}
