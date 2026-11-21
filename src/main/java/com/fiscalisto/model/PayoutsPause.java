// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayoutsPause: «Pausar todos los pagos» de la empresa: mientras está en pausa no sale ninguna transferencia (ni firmadas, ni reintentos, ni recurrentes). Se reanuda solo en la app, con las firmas de Quién firma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutsPause {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true mientras los pagos están en pausa.
     */
    @JsonProperty("paused")
    private Boolean paused;

    /**
     * Desde cuándo están en pausa, o null.
     */
    @JsonProperty("paused_at")
    private String pausedAt;

    /**
     * Por qué se pausaron, o null.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * true si los pausó una llave de la API (no una persona en la app).
     */
    @JsonProperty("paused_by_api")
    private Boolean pausedByApi;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayoutsPause setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayoutsPause setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PayoutsPause setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true mientras los pagos están en pausa.
     */
    public Boolean getPaused() {
        return paused;
    }

    public PayoutsPause setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    /**
     * Desde cuándo están en pausa, o null.
     */
    public String getPausedAt() {
        return pausedAt;
    }

    public PayoutsPause setPausedAt(String pausedAt) {
        this.pausedAt = pausedAt;
        return this;
    }

    /**
     * Por qué se pausaron, o null.
     */
    public String getReason() {
        return reason;
    }

    public PayoutsPause setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * true si los pausó una llave de la API (no una persona en la app).
     */
    public Boolean getPausedByApi() {
        return pausedByApi;
    }

    public PayoutsPause setPausedByApi(Boolean pausedByApi) {
        this.pausedByApi = pausedByApi;
        return this;
    }
}
