// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListStockMovementsParams: los campos de «Listar movimientos (kárdex)».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListStockMovementsParams {
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
     * Solo los de este producto (prd_…).
     */
    @JsonProperty("product")
    private String product;

    /**
     * Solo los de este almacén (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * Solo los de este tipo.
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, initial, cost, reversal.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Desde este día (AAAA-MM-DD) u hora (AAAA-MM-DDTHH:MM:SS) de la Ciudad de México.
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * Hasta este día (completo) u hora de la Ciudad de México.
     */
    @JsonProperty("date_lte")
    private String dateLte;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListStockMovementsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListStockMovementsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListStockMovementsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListStockMovementsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los de este producto (prd_…).
     */
    public String getProduct() {
        return product;
    }

    public ListStockMovementsParams setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Solo los de este almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public ListStockMovementsParams setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Solo los de este tipo.
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, initial, cost, reversal.
     */
    public String getType() {
        return type;
    }

    public ListStockMovementsParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Desde este día (AAAA-MM-DD) u hora (AAAA-MM-DDTHH:MM:SS) de la Ciudad de México.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListStockMovementsParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Hasta este día (completo) u hora de la Ciudad de México.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListStockMovementsParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }
}
