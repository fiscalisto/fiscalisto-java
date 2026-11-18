// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionReplaced: Solo al timbrar con `replaces`: la constancia que corrige y si se canceló (motivo 01). Si no, `error` dice por qué y se cancela con POST /v1/sat_retentions/{id}/cancel.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionReplaced {
    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * true si la sustituida ya quedó cancelada. false no es definitivo: vea substitutes.cancellation.
     */
    @JsonProperty("canceled")
    private Boolean canceled;

    /**
     * Por qué no se pudo cancelar la anterior; `null` si se canceló.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public RetentionReplaced setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * true si la sustituida ya quedó cancelada. false no es definitivo: vea substitutes.cancellation.
     */
    public Boolean getCanceled() {
        return canceled;
    }

    public RetentionReplaced setCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * Por qué no se pudo cancelar la anterior; `null` si se canceló.
     */
    public String getError() {
        return error;
    }

    public RetentionReplaced setError(String error) {
        this.error = error;
        return this;
    }
}
