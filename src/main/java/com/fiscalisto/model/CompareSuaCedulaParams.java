// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompareSuaCedulaParams: los campos de «Comparar las cuotas de un mes con el SUA».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompareSuaCedulaParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La cédula de determinación de cuotas del mes (la mensual, del IMSS) en PDF como la imprimió el SUA, en base64; hasta 10 MB.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("file")
    private String file;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CompareSuaCedulaParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La cédula de determinación de cuotas del mes (la mensual, del IMSS) en PDF como la imprimió el SUA, en base64; hasta 10 MB.
     * <p>
     * Obligatorio.
     */
    public String getFile() {
        return file;
    }

    public CompareSuaCedulaParams setFile(String file) {
        this.file = file;
        return this;
    }
}
