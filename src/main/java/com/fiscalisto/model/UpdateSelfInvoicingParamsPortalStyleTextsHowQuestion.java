// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion: UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion {
    /**
     * La pregunta de cómo dar los datos en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * La pregunta de cómo dar los datos en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * La pregunta de cómo dar los datos en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * La pregunta de cómo dar los datos en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion setEn(String en) {
        this.en = en;
        return this;
    }
}
