// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatInvoicesParams: los campos de «Listar facturas del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatInvoicesParams {
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
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El RFC de quien la emitió (recibidas) o de quien la recibió (emitidas).
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * Con fecha desde este día (AAAA-MM-DD).
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * Con fecha hasta este día (AAAA-MM-DD), incluido.
     */
    @JsonProperty("date_lte")
    private String dateLte;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public ListSatInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public ListSatInvoicesParams setDirection(String direction) {
        this.direction = direction;
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

    public ListSatInvoicesParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El RFC de quien la emitió (recibidas) o de quien la recibió (emitidas).
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public ListSatInvoicesParams setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * Con fecha desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListSatInvoicesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Con fecha hasta este día (AAAA-MM-DD), incluido.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListSatInvoicesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }
}
