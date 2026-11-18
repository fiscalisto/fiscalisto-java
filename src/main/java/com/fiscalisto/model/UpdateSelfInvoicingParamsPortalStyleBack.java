// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleBack: UpdateSelfInvoicingParamsPortalStyleBack.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleBack {
    /**
     * El texto del botón.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("label")
    private String label;

    /**
     * A dónde lleva (https).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("url")
    private String url;

    /**
     * El texto del botón.
     * <p>
     * Obligatorio.
     */
    public String getLabel() {
        return label;
    }

    public UpdateSelfInvoicingParamsPortalStyleBack setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * A dónde lleva (https).
     * <p>
     * Obligatorio.
     */
    public String getUrl() {
        return url;
    }

    public UpdateSelfInvoicingParamsPortalStyleBack setUrl(String url) {
        this.url = url;
        return this;
    }
}
