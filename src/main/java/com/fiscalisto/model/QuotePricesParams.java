// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * QuotePricesParams: los campos de «Ver los precios de un cliente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotePricesParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El cliente (cus_…) o su RFC.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Conceptos (Conceptos), al menos uno.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("items")
    private List<QuotePricesParamsItem> items;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public QuotePricesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El cliente (cus_…) o su RFC.
     * <p>
     * Obligatorio.
     */
    public String getCustomer() {
        return customer;
    }

    public QuotePricesParams setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     * <p>
     * Obligatorio.
     */
    public List<QuotePricesParamsItem> getItems() {
        return items;
    }

    public QuotePricesParams setItems(List<QuotePricesParamsItem> items) {
        this.items = items;
        return this;
    }
}
