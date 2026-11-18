// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice: UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice {
    /**
     * El nombre del paso 3 en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El nombre del paso 3 en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El nombre del paso 3 en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El nombre del paso 3 en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice setEn(String en) {
        this.en = en;
        return this;
    }
}
