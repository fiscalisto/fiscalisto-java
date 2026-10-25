// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListInvoicesParams: los campos de «Listar facturas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListInvoicesParams {
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
     * valid, pending, canceled, rejected o processing.
     * <p>
     * Valores: valid, pending, canceled, rejected, processing.
     */
    @JsonProperty("status")
    private String status;

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * RFC del cliente.
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Creadas desde, en ISO 8601. Un día solo (2026-10-01) cuenta desde su inicio en hora de la Ciudad de México.
     */
    @JsonProperty("created_gte")
    private String createdGte;

    /**
     * Creadas hasta, en ISO 8601. Un día solo (2026-10-31) incluye el día completo en hora de la Ciudad de México.
     */
    @JsonProperty("created_lte")
    private String createdLte;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public ListInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * valid, pending, canceled, rejected o processing.
     * <p>
     * Valores: valid, pending, canceled, rejected, processing.
     */
    public String getStatus() {
        return status;
    }

    public ListInvoicesParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public ListInvoicesParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * RFC del cliente.
     */
    public String getCustomer() {
        return customer;
    }

    public ListInvoicesParams setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Creadas desde, en ISO 8601. Un día solo (2026-10-01) cuenta desde su inicio en hora de la Ciudad de México.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListInvoicesParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creadas hasta, en ISO 8601. Un día solo (2026-10-31) incluye el día completo en hora de la Ciudad de México.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListInvoicesParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }
}
