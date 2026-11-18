// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsFindButton: UpdateSelfInvoicingParamsPortalStyleTextsFindButton.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsFindButton {
    /**
     * El botón para buscar el ticket en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El botón para buscar el ticket en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El botón para buscar el ticket en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsFindButton setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El botón para buscar el ticket en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsFindButton setEn(String en) {
        this.en = en;
        return this;
    }
}
