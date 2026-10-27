// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatRefresh: Una consulta al SAT de un documento del emisor: si ya terminó y dónde leerlo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRefresh {
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
     * Qué se consultó.
     * <p>
     * Valores: compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    @JsonProperty("document")
    private String document;

    /**
     * completed (ya está en url) o processing (el SAT tarda; llega a url en unos minutos).
     * <p>
     * Valores: completed, processing.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo se pidió.
     */
    @JsonProperty("refreshed_at")
    private String refreshedAt;

    /**
     * Desde cuándo se puede pedir otra vez.
     */
    @JsonProperty("next_refresh_at")
    private String nextRefreshAt;

    /**
     * Dónde leer lo que trajo.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatRefresh setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatRefresh setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatRefresh setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué se consultó.
     * <p>
     * Valores: compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    public String getDocument() {
        return document;
    }

    public SatRefresh setDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * completed (ya está en url) o processing (el SAT tarda; llega a url en unos minutos).
     * <p>
     * Valores: completed, processing.
     */
    public String getStatus() {
        return status;
    }

    public SatRefresh setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo se pidió.
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    public SatRefresh setRefreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    /**
     * Desde cuándo se puede pedir otra vez.
     */
    public String getNextRefreshAt() {
        return nextRefreshAt;
    }

    public SatRefresh setNextRefreshAt(String nextRefreshAt) {
        this.nextRefreshAt = nextRefreshAt;
        return this;
    }

    /**
     * Dónde leer lo que trajo.
     */
    public String getUrl() {
        return url;
    }

    public SatRefresh setUrl(String url) {
        this.url = url;
        return this;
    }
}
