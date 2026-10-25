// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListTicketsParams: los campos de «Listar tickets».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListTicketsParams {
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
     * pending, invoiced, global o cancelled.
     * <p>
     * Valores: pending, invoiced, global, cancelled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Vendidos desde (ISO 8601 o AAAA-MM-DD).
     */
    @JsonProperty("sold_at_gte")
    private String soldAtGte;

    /**
     * Vendidos hasta (ISO 8601 o AAAA-MM-DD, el día completo).
     */
    @JsonProperty("sold_at_lte")
    private String soldAtLte;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListTicketsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public ListTicketsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListTicketsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListTicketsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * pending, invoiced, global o cancelled.
     * <p>
     * Valores: pending, invoiced, global, cancelled.
     */
    public String getStatus() {
        return status;
    }

    public ListTicketsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Vendidos desde (ISO 8601 o AAAA-MM-DD).
     */
    public String getSoldAtGte() {
        return soldAtGte;
    }

    public ListTicketsParams setSoldAtGte(String soldAtGte) {
        this.soldAtGte = soldAtGte;
        return this;
    }

    /**
     * Vendidos hasta (ISO 8601 o AAAA-MM-DD, el día completo).
     */
    public String getSoldAtLte() {
        return soldAtLte;
    }

    public ListTicketsParams setSoldAtLte(String soldAtLte) {
        this.soldAtLte = soldAtLte;
        return this;
    }
}
