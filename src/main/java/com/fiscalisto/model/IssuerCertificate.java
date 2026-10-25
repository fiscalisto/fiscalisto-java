// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerCertificate: IssuerCertificate.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerCertificate {
    /**
     * Número de serie (NoCertificado).
     */
    @JsonProperty("serial_number")
    private String serialNumber;

    /**
     * Cuándo vence.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Número de serie (NoCertificado).
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public IssuerCertificate setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Cuándo vence.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public IssuerCertificate setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
