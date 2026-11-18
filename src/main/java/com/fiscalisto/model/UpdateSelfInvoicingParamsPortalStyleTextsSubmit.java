// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsSubmit: UpdateSelfInvoicingParamsPortalStyleTextsSubmit.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsSubmit {
    /**
     * El botón para facturar en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El botón para facturar en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El botón para facturar en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSubmit setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El botón para facturar en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSubmit setEn(String en) {
        this.en = en;
        return this;
    }
}
