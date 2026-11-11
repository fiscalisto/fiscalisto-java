// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalSupplierDocuments: Su alta: complete cuando todo lo obligatorio está aprobado y vigente, y cuántos documentos faltan, esperan revisión, vencieron o están por vencer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalSupplierDocuments {
    /**
     * true cuando todo lo obligatorio de su alta está aprobado y vigente.
     */
    @JsonProperty("complete")
    private Boolean complete;

    /**
     * Cuántos documentos obligatorios no ha subido.
     */
    @JsonProperty("missing")
    private Long missing;

    /**
     * Cuántos esperan revisión.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * Cuántos vencieron.
     */
    @JsonProperty("expired")
    private Long expired;

    /**
     * Cuántos vencen en los próximos 7 días.
     */
    @JsonProperty("expiring")
    private Long expiring;

    /**
     * true cuando todo lo obligatorio de su alta está aprobado y vigente.
     */
    public Boolean getComplete() {
        return complete;
    }

    public PortalSupplierDocuments setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Cuántos documentos obligatorios no ha subido.
     */
    public Long getMissing() {
        return missing;
    }

    public PortalSupplierDocuments setMissing(Long missing) {
        this.missing = missing;
        return this;
    }

    @JsonIgnore
    public PortalSupplierDocuments setMissing(long missing) {
        return setMissing(Long.valueOf(missing));
    }

    /**
     * Cuántos esperan revisión.
     */
    public Long getPending() {
        return pending;
    }

    public PortalSupplierDocuments setPending(Long pending) {
        this.pending = pending;
        return this;
    }

    @JsonIgnore
    public PortalSupplierDocuments setPending(long pending) {
        return setPending(Long.valueOf(pending));
    }

    /**
     * Cuántos vencieron.
     */
    public Long getExpired() {
        return expired;
    }

    public PortalSupplierDocuments setExpired(Long expired) {
        this.expired = expired;
        return this;
    }

    @JsonIgnore
    public PortalSupplierDocuments setExpired(long expired) {
        return setExpired(Long.valueOf(expired));
    }

    /**
     * Cuántos vencen en los próximos 7 días.
     */
    public Long getExpiring() {
        return expiring;
    }

    public PortalSupplierDocuments setExpiring(Long expiring) {
        this.expiring = expiring;
        return this;
    }

    @JsonIgnore
    public PortalSupplierDocuments setExpiring(long expiring) {
        return setExpiring(Long.valueOf(expiring));
    }
}
