// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsTitle: UpdateSelfInvoicingParamsPortalStyleTextsTitle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsTitle {
    /**
     * El título (en español es `portal_title`) en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El título (en español es `portal_title`) en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsTitle setEn(String en) {
        this.en = en;
        return this;
    }
}
