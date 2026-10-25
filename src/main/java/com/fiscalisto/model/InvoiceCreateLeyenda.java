// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateLeyenda: InvoiceCreateLeyenda.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateLeyenda {
    /**
     * Texto de la leyenda (textoLeyenda).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("text")
    private String text;

    /**
     * Disposición fiscal (disposicionFiscal), por ejemplo LISR.
     */
    @JsonProperty("disposition")
    private String disposition;

    /**
     * Norma o artículo (norma).
     */
    @JsonProperty("norm")
    private String norm;

    /**
     * Texto de la leyenda (textoLeyenda).
     * <p>
     * Obligatorio.
     */
    public String getText() {
        return text;
    }

    public InvoiceCreateLeyenda setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Disposición fiscal (disposicionFiscal), por ejemplo LISR.
     */
    public String getDisposition() {
        return disposition;
    }

    public InvoiceCreateLeyenda setDisposition(String disposition) {
        this.disposition = disposition;
        return this;
    }

    /**
     * Norma o artículo (norma).
     */
    public String getNorm() {
        return norm;
    }

    public InvoiceCreateLeyenda setNorm(String norm) {
        this.norm = norm;
        return this;
    }
}
