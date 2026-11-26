package com.fiscalisto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Una página de una lista: {@link #getData()} y {@link #hasMore()}. Pida la siguiente con
 * {@link #next()}, o recorra todo con {@link #autoPagingIterable()} (o el método …AutoPaging del
 * recurso).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Page<T> {
    @JsonProperty("object")
    private String object;

    @JsonProperty("data")
    private List<T> data;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonProperty("url")
    private String url;

    @JsonIgnore
    private Function<String, Page<T>> fetch;

    /** Asked with ending_before: the next page is the newer one, and each is read oldest first. */
    @JsonIgnore
    private boolean forward;

    public List<T> getData() {
        return data == null ? List.of() : data;
    }

    public boolean hasMore() {
        return hasMore;
    }

    public String getUrl() {
        return url;
    }

    void setFetch(Function<String, Page<T>> fetch, boolean forward) {
        this.fetch = fetch;
        this.forward = forward;
    }

    /** La página siguiente (con ending_before, la de los más recientes), o null cuando no hay más. */
    public Page<T> next() {
        List<T> items = getData();
        if (!hasMore || items.isEmpty() || fetch == null) return null;
        JsonNode id = ApiClient.MAPPER.valueToTree(items.get(forward ? 0 : items.size() - 1)).get("id");
        return fetch.apply(id == null ? null : id.asText());
    }

    /** Todos los objetos, página por página, según se recorren. */
    public Iterable<T> autoPagingIterable() {
        return () -> new Iterator<T>() {
            private Page<T> page = Page.this;
            private int index = 0;

            @Override
            public boolean hasNext() {
                while (page != null && index >= page.getData().size()) {
                    page = page.next();
                    index = 0;
                }
                return page != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                List<T> items = page.getData();
                return items.get(page.forward ? items.size() - 1 - index++ : index++);
            }
        };
    }
}
