// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PausePayoutsParams: los campos de «Pausar todos los pagos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PausePayoutsParams {
    /**
     * La empresa (iss_…); sin él, la de la llave.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Por qué se pausan los pagos; lo ve el equipo y llega en el aviso.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * La empresa (iss_…); sin él, la de la llave.
     */
    public String getIssuer() {
        return issuer;
    }

    public PausePayoutsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Por qué se pausan los pagos; lo ve el equipo y llega en el aviso.
     * <p>
     * Obligatorio.
     */
    public String getReason() {
        return reason;
    }

    public PausePayoutsParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
