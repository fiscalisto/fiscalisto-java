// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalStyleBack: PortalStyleBack.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalStyleBack {
    /**
     * El texto del botón.
     */
    @JsonProperty("label")
    private String label;

    /**
     * A dónde lleva (https).
     */
    @JsonProperty("url")
    private String url;

    /**
     * El texto del botón.
     */
    public String getLabel() {
        return label;
    }

    public PortalStyleBack setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * A dónde lleva (https).
     */
    public String getUrl() {
        return url;
    }

    public PortalStyleBack setUrl(String url) {
        this.url = url;
        return this;
    }
}
