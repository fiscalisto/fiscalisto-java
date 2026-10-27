// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListWarehouseStockParams: los campos de «Ver las existencias de un almacén».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListWarehouseStockParams {
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
     * true para incluir los productos con track_stock que están en 0.
     */
    @JsonProperty("include_empty")
    private Boolean includeEmpty;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListWarehouseStockParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListWarehouseStockParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListWarehouseStockParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * true para incluir los productos con track_stock que están en 0.
     */
    public Boolean getIncludeEmpty() {
        return includeEmpty;
    }

    public ListWarehouseStockParams setIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
        return this;
    }
}
