// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListStockAdjustmentsParams: los campos de «Listar ajustes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListStockAdjustmentsParams {
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
     * Solo los de este almacén (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * applied, pending, rejected o reversed.
     * <p>
     * Valores: applied, pending, rejected, reversed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListStockAdjustmentsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListStockAdjustmentsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListStockAdjustmentsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListStockAdjustmentsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los de este almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public ListStockAdjustmentsParams setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * applied, pending, rejected o reversed.
     * <p>
     * Valores: applied, pending, rejected, reversed.
     */
    public String getStatus() {
        return status;
    }

    public ListStockAdjustmentsParams setStatus(String status) {
        this.status = status;
        return this;
    }
}
