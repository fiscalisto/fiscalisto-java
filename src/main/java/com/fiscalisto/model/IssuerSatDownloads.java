// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerSatDownloads: Si puede pedirle al SAT sus facturas (POST /v1/sat_downloads): available es true en pruebas, y en producción mientras su e.firma guardada esté vigente (efirma_expires_at); un RFC de su empresa (type own) usa la que la empresa guardó en la app. En pruebas, efirma_expires_at muestra la del mismo RFC en producción, o la que mande en pruebas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerSatDownloads {
    /**
     * true si puede pedir descargas al SAT ahora: siempre en pruebas; en producción con su e.firma guardada y vigente (la de la app, en un RFC de su empresa).
     */
    @JsonProperty("available")
    private Boolean available;

    /**
     * Cuándo vence la e.firma guardada para las descargas, o null si no hay una. En pruebas, la que mandó en pruebas o, si no, la que guarda en producción para el mismo RFC.
     */
    @JsonProperty("efirma_expires_at")
    private String efirmaExpiresAt;

    /**
     * true si puede pedir descargas al SAT ahora: siempre en pruebas; en producción con su e.firma guardada y vigente (la de la app, en un RFC de su empresa).
     */
    public Boolean getAvailable() {
        return available;
    }

    public IssuerSatDownloads setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Cuándo vence la e.firma guardada para las descargas, o null si no hay una. En pruebas, la que mandó en pruebas o, si no, la que guarda en producción para el mismo RFC.
     */
    public String getEfirmaExpiresAt() {
        return efirmaExpiresAt;
    }

    public IssuerSatDownloads setEfirmaExpiresAt(String efirmaExpiresAt) {
        this.efirmaExpiresAt = efirmaExpiresAt;
        return this;
    }
}
