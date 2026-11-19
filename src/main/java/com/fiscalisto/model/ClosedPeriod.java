// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClosedPeriod: Hasta qué mes está cerrada la contabilidad del emisor: lo capturado (pólizas a mano y de banco, bajas de activos, saldos iniciales) con fecha en un mes cerrado no se registra, corrige ni borra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClosedPeriod {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El último mes cerrado (AAAA-MM), con todos los anteriores; null si ninguno está cerrado.
     */
    @JsonProperty("closed_through")
    private String closedThrough;

    /**
     * Cuándo se cerró, o null.
     */
    @JsonProperty("closed_at")
    private String closedAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ClosedPeriod setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ClosedPeriod setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ClosedPeriod setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El último mes cerrado (AAAA-MM), con todos los anteriores; null si ninguno está cerrado.
     */
    public String getClosedThrough() {
        return closedThrough;
    }

    public ClosedPeriod setClosedThrough(String closedThrough) {
        this.closedThrough = closedThrough;
        return this;
    }

    /**
     * Cuándo se cerró, o null.
     */
    public String getClosedAt() {
        return closedAt;
    }

    public ClosedPeriod setClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }
}
