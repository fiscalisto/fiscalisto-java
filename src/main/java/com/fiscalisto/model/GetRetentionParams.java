// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRetentionParams: los campos de «Ver una constancia».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetRetentionParams {
    /**
     * Con un UUID en vez del id, el emisor (iss_…) si la cuenta tiene varios.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true para preguntar su estado al SAT ahora (cancelaciones en espera).
     */
    @JsonProperty("refresh")
    private Boolean refresh;

    /**
     * Con un UUID en vez del id, el emisor (iss_…) si la cuenta tiene varios.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetRetentionParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true para preguntar su estado al SAT ahora (cancelaciones en espera).
     */
    public Boolean getRefresh() {
        return refresh;
    }

    public GetRetentionParams setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
}
