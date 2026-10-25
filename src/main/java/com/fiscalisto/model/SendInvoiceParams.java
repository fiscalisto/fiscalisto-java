// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SendInvoiceParams: los campos de «Enviar por correo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendInvoiceParams {
    /**
     * A quién (correos separados por comas).
     */
    @JsonProperty("to")
    private String to;

    /**
     * Con copia (correos separados por comas).
     */
    @JsonProperty("cc")
    private String cc;

    /**
     * A quién (correos separados por comas).
     */
    public String getTo() {
        return to;
    }

    public SendInvoiceParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Con copia (correos separados por comas).
     */
    public String getCc() {
        return cc;
    }

    public SendInvoiceParams setCc(String cc) {
        this.cc = cc;
        return this;
    }
}
