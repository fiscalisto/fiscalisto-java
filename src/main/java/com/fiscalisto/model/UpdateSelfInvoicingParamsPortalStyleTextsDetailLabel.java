// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsDetailLabel: UpdateSelfInvoicingParamsPortalStyleTextsDetailLabel.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsDetailLabel {
    /**
     * La casilla del detalle de los conceptos («Incluir el detalle en la descripción…»; ver `invoice_concepts.line_detail`) en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * La casilla del detalle de los conceptos («Incluir el detalle en la descripción…»; ver `invoice_concepts.line_detail`) en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * La casilla del detalle de los conceptos («Incluir el detalle en la descripción…»; ver `invoice_concepts.line_detail`) en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsDetailLabel setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * La casilla del detalle de los conceptos («Incluir el detalle en la descripción…»; ver `invoice_concepts.line_detail`) en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsDetailLabel setEn(String en) {
        this.en = en;
        return this;
    }
}
