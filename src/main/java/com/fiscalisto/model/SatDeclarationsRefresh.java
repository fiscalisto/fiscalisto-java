// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatDeclarationsRefresh: Lo que trajo una consulta de las declaraciones del emisor en el SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationsRefresh {
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
     * El emisor consultado.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * completed (ya bajó todo) o processing (queda algo por bajar: sigue solo en la siguiente hora, sin otro timbre).
     * <p>
     * Valores: completed, processing.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántas declaraciones listó el SAT en los años consultados.
     */
    @JsonProperty("found")
    private Long found;

    /**
     * Cuántos archivos bajó en esta consulta.
     */
    @JsonProperty("downloaded")
    private Long downloaded;

    /**
     * Cuántas declaraciones quedan con archivos por bajar.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * Si una parte del SAT falló (por ejemplo, la anual), lo que dijo; lo demás sí se trajo. null si todo salió.
     */
    @JsonProperty("warning")
    private String warning;

    /**
     * Cuándo se consultó.
     */
    @JsonProperty("refreshed_at")
    private String refreshedAt;

    /**
     * Desde cuándo se puede volver a consultar este emisor (10 minutos después).
     */
    @JsonProperty("next_refresh_at")
    private String nextRefreshAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatDeclarationsRefresh setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatDeclarationsRefresh setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor consultado.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatDeclarationsRefresh setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * completed (ya bajó todo) o processing (queda algo por bajar: sigue solo en la siguiente hora, sin otro timbre).
     * <p>
     * Valores: completed, processing.
     */
    public String getStatus() {
        return status;
    }

    public SatDeclarationsRefresh setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántas declaraciones listó el SAT en los años consultados.
     */
    public Long getFound() {
        return found;
    }

    public SatDeclarationsRefresh setFound(Long found) {
        this.found = found;
        return this;
    }

    @JsonIgnore
    public SatDeclarationsRefresh setFound(long found) {
        return setFound(Long.valueOf(found));
    }

    /**
     * Cuántos archivos bajó en esta consulta.
     */
    public Long getDownloaded() {
        return downloaded;
    }

    public SatDeclarationsRefresh setDownloaded(Long downloaded) {
        this.downloaded = downloaded;
        return this;
    }

    @JsonIgnore
    public SatDeclarationsRefresh setDownloaded(long downloaded) {
        return setDownloaded(Long.valueOf(downloaded));
    }

    /**
     * Cuántas declaraciones quedan con archivos por bajar.
     */
    public Long getPending() {
        return pending;
    }

    public SatDeclarationsRefresh setPending(Long pending) {
        this.pending = pending;
        return this;
    }

    @JsonIgnore
    public SatDeclarationsRefresh setPending(long pending) {
        return setPending(Long.valueOf(pending));
    }

    /**
     * Si una parte del SAT falló (por ejemplo, la anual), lo que dijo; lo demás sí se trajo. null si todo salió.
     */
    public String getWarning() {
        return warning;
    }

    public SatDeclarationsRefresh setWarning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * Cuándo se consultó.
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    public SatDeclarationsRefresh setRefreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    /**
     * Desde cuándo se puede volver a consultar este emisor (10 minutos después).
     */
    public String getNextRefreshAt() {
        return nextRefreshAt;
    }

    public SatDeclarationsRefresh setNextRefreshAt(String nextRefreshAt) {
        this.nextRefreshAt = nextRefreshAt;
        return this;
    }
}
