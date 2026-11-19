// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle: UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle {
    /**
     * La opción de un solo concepto («Un solo concepto») en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * La opción de un solo concepto («Un solo concepto») en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * La opción de un solo concepto («Un solo concepto») en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * La opción de un solo concepto («Un solo concepto») en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle setEn(String en) {
        this.en = en;
        return this;
    }
}
