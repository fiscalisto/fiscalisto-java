// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized: UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized {
    /**
     * La opción de conceptos desglosados («Desglosados») en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * La opción de conceptos desglosados («Desglosados») en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * La opción de conceptos desglosados («Desglosados») en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * La opción de conceptos desglosados («Desglosados») en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized setEn(String en) {
        this.en = en;
        return this;
    }
}
