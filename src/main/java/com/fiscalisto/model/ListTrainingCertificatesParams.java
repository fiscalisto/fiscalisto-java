// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListTrainingCertificatesParams: los campos de «Constancias para el aviso a la STPS».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListTrainingCertificatesParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Desde (AAAA-MM-DD), por la fecha de fin del curso.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("to")
    private String to;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListTrainingCertificatesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Desde (AAAA-MM-DD), por la fecha de fin del curso.
     * <p>
     * Obligatorio.
     */
    public String getFrom() {
        return from;
    }

    public ListTrainingCertificatesParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getTo() {
        return to;
    }

    public ListTrainingCertificatesParams setTo(String to) {
        this.to = to;
        return this;
    }
}
