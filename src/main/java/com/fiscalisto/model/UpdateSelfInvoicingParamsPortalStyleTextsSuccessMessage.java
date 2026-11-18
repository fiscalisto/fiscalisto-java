// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage: UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage {
    /**
     * El mensaje al terminar en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El mensaje al terminar en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El mensaje al terminar en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El mensaje al terminar en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage setEn(String en) {
        this.en = en;
        return this;
    }
}
