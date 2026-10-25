// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SandboxList: Una página de la lista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SandboxList {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Los objetos de esta página.
     */
    @JsonProperty("data")
    private List<Sandbox> data;

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

    public SandboxList setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Los objetos de esta página.
     */
    public List<Sandbox> getData() {
        return data;
    }

    public SandboxList setData(List<Sandbox> data) {
        this.data = data;
        return this;
    }

    /**
     * true si hay más: pida la siguiente con starting_after igual al id del último.
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public SandboxList setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * La ruta de esta lista.
     */
    public String getUrl() {
        return url;
    }

    public SandboxList setUrl(String url) {
        this.url = url;
        return this;
    }
}
