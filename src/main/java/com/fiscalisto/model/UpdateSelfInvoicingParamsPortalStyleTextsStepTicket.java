// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsStepTicket: UpdateSelfInvoicingParamsPortalStyleTextsStepTicket.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsStepTicket {
    /**
     * El nombre del paso 1 en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El nombre del paso 1 en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El nombre del paso 1 en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsStepTicket setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El nombre del paso 1 en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsStepTicket setEn(String en) {
        this.en = en;
        return this;
    }
}
