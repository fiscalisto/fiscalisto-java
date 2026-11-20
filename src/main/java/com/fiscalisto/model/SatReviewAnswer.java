// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatReviewAnswer: SatReviewAnswer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatReviewAnswer {
    /**
     * processing, completed (se descarga), failed o expired.
     * <p>
     * Valores: processing, completed, failed, expired.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El tamaño del ZIP, ya completo.
     */
    @JsonProperty("size_bytes")
    private Long sizeBytes;

    /**
     * Por qué falló, o null.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Cuándo se pidió.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo quedó lista, o null.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Hasta cuándo se descarga, o null.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * processing, completed (se descarga), failed o expired.
     * <p>
     * Valores: processing, completed, failed, expired.
     */
    public String getStatus() {
        return status;
    }

    public SatReviewAnswer setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El tamaño del ZIP, ya completo.
     */
    public Long getSizeBytes() {
        return sizeBytes;
    }

    public SatReviewAnswer setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    @JsonIgnore
    public SatReviewAnswer setSizeBytes(long sizeBytes) {
        return setSizeBytes(Long.valueOf(sizeBytes));
    }

    /**
     * Por qué falló, o null.
     */
    public String getError() {
        return error;
    }

    public SatReviewAnswer setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Cuándo se pidió.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatReviewAnswer setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo quedó lista, o null.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public SatReviewAnswer setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Hasta cuándo se descarga, o null.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public SatReviewAnswer setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
