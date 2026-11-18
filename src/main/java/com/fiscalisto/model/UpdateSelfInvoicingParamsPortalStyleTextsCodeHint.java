// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsCodeHint: UpdateSelfInvoicingParamsPortalStyleTextsCodeHint.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsCodeHint {
    /**
     * Dónde viene el código (en español es `code_hint`) en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * Dónde viene el código (en español es `code_hint`) en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsCodeHint setEn(String en) {
        this.en = en;
        return this;
    }
}
