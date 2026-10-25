// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRetentionXmlParams: los campos de «Descargar el XML».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetRetentionXmlParams {
    /**
     * Con un UUID en vez del id, el emisor (iss_…) si la cuenta tiene varios.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Con un UUID en vez del id, el emisor (iss_…) si la cuenta tiene varios.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetRetentionXmlParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
