// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsMessage: UpdateSelfInvoicingParamsPortalStyleTextsMessage.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsMessage {
    /**
     * El mensaje bajo el título (en español es `portal_message`) en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El mensaje bajo el título (en español es `portal_message`) en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsMessage setEn(String en) {
        this.en = en;
        return this;
    }
}
