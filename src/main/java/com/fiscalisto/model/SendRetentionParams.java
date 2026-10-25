// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SendRetentionParams: los campos de «Enviar por correo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendRetentionParams {
    /**
     * A quién (correos separados por comas).
     */
    @JsonProperty("to")
    private String to;

    /**
     * A quién (correos separados por comas).
     */
    public String getTo() {
        return to;
    }

    public SendRetentionParams setTo(String to) {
        this.to = to;
        return this;
    }
}
