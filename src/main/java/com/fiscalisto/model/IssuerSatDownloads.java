// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerSatDownloads: Si puede pedirle al SAT sus facturas (POST /v1/sat_downloads): available es true en pruebas, y en producción mientras su e.firma guardada esté vigente (efirma_expires_at).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerSatDownloads {
    /**
     * true si puede pedir descargas al SAT ahora: siempre en pruebas; en producción con su e.firma guardada y vigente.
     */
    @JsonProperty("available")
    private Boolean available;

    /**
     * Cuándo vence la e.firma guardada para las descargas, o null si no hay una.
     */
    @JsonProperty("efirma_expires_at")
    private String efirmaExpiresAt;

    /**
     * true si puede pedir descargas al SAT ahora: siempre en pruebas; en producción con su e.firma guardada y vigente.
     */
    public Boolean getAvailable() {
        return available;
    }

    public IssuerSatDownloads setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Cuándo vence la e.firma guardada para las descargas, o null si no hay una.
     */
    public String getEfirmaExpiresAt() {
        return efirmaExpiresAt;
    }

    public IssuerSatDownloads setEfirmaExpiresAt(String efirmaExpiresAt) {
        this.efirmaExpiresAt = efirmaExpiresAt;
        return this;
    }
}
