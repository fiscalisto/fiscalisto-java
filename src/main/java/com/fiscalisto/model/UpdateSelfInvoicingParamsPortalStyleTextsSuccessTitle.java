// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle: UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle {
    /**
     * El título al terminar en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El título al terminar en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El título al terminar en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El título al terminar en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle setEn(String en) {
        this.en = en;
        return this;
    }
}
