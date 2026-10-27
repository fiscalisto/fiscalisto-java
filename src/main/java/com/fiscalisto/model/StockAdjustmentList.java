// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * StockAdjustmentList: Una página de la lista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAdjustmentList {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Los objetos de esta página.
     */
    @JsonProperty("data")
    private List<StockAdjustment> data;

    /**
     * true si hay más: pida la siguiente con starting_after igual al id del último.
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    /**
     * La ruta de esta lista.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StockAdjustmentList setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Los objetos de esta página.
     */
    public List<StockAdjustment> getData() {
        return data;
    }

    public StockAdjustmentList setData(List<StockAdjustment> data) {
        this.data = data;
        return this;
    }

    /**
     * true si hay más: pida la siguiente con starting_after igual al id del último.
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public StockAdjustmentList setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * La ruta de esta lista.
     */
    public String getUrl() {
        return url;
    }

    public StockAdjustmentList setUrl(String url) {
        this.url = url;
        return this;
    }
}
