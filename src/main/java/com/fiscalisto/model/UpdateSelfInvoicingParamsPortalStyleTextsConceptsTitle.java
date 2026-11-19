// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle: UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle {
    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`) en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`) en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`) en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`) en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle setEn(String en) {
        this.en = en;
        return this;
    }
}
