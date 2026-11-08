// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSalesOrdersParams: los campos de «Listar pedidos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSalesOrdersParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, confirmed, partially_delivered, delivered, invoiced, paid, closed, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Solo los de este RFC.
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSalesOrdersParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSalesOrdersParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSalesOrdersParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSalesOrdersParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, confirmed, partially_delivered, delivered, invoiced, paid, closed, canceled.
     */
    public String getStatus() {
        return status;
    }

    public ListSalesOrdersParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Solo los de este RFC.
     */
    public String getCustomer() {
        return customer;
    }

    public ListSalesOrdersParams setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
}
