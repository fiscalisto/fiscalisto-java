// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatCatalogEntryList: Una página de la lista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatCatalogEntryList {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Los objetos de esta página.
     */
    @JsonProperty("data")
    private List<SatCatalogEntry> data;

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

    public SatCatalogEntryList setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Los objetos de esta página.
     */
    public List<SatCatalogEntry> getData() {
        return data;
    }

    public SatCatalogEntryList setData(List<SatCatalogEntry> data) {
        this.data = data;
        return this;
    }

    /**
     * true si hay más: pida la siguiente con starting_after igual al id del último.
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public SatCatalogEntryList setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * La ruta de esta lista.
     */
    public String getUrl() {
        return url;
    }

    public SatCatalogEntryList setUrl(String url) {
        this.url = url;
        return this;
    }
}
