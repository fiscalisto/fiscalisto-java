// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * SatRefresh: Una consulta al SAT de las declaraciones o de un documento del emisor (opinión de cumplimiento, constancia o buzón): se contesta al aceptarla (status processing) y termina sola; sat_refresh.completed o sat_refresh.failed dicen cómo.
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
     * El id de la consulta (srf_…): GET /v1/sat_refreshes/{id} dice cómo va.
     */
    @JsonProperty("id")
    private String id;

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
     * Qué se consultó: declarations, compliance_opinion, tax_status_certificate o sat_mailbox.
     * <p>
     * Valores: declarations, compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    @JsonProperty("document")
    private String document;

    /**
     * processing (el SAT se está consultando), completed (lo que trajo está en url) o failed (el SAT no contestó: motivo en error, el timbre regresó).
     * <p>
     * Valores: processing, completed, failed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Lo que trajo, con status completed: en declarations cuántas listó y bajó; en los demás, dónde leer el documento. null mientras sigue o si falló.
     */
    @JsonProperty("result")
    private JsonNode result;

    /**
     * Con status failed: lo que dijo el SAT. null en los demás.
     */
    @JsonProperty("error")
    private String error;

    /**
     * true cuando se usó su timbre (el SAT contestó). En pruebas siempre false: no se usan timbres.
     */
    @JsonProperty("charged")
    private Boolean charged;

    /**
     * true mientras sigue: su timbre está apartado (GET /v1/balance ya no lo cuenta) y regresa si el SAT no contesta.
     */
    @JsonProperty("timbre_held")
    private Boolean timbreHeld;

    /**
     * Cuándo se pidió.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo terminó (completed o failed). null mientras sigue.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Cuándo se pidió (igual que created_at).
     */
    @JsonProperty("refreshed_at")
    private String refreshedAt;

    /**
     * Desde cuándo se puede pedir otra vez para el mismo emisor (10 minutos después).
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
     * El id de la consulta (srf_…): GET /v1/sat_refreshes/{id} dice cómo va.
     */
    public String getId() {
        return id;
    }

    public SatRefresh setId(String id) {
        this.id = id;
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
     * Qué se consultó: declarations, compliance_opinion, tax_status_certificate o sat_mailbox.
     * <p>
     * Valores: declarations, compliance_opinion, tax_status_certificate, sat_mailbox.
     */
    public String getDocument() {
        return document;
    }

    public SatRefresh setDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * processing (el SAT se está consultando), completed (lo que trajo está en url) o failed (el SAT no contestó: motivo en error, el timbre regresó).
     * <p>
     * Valores: processing, completed, failed.
     */
    public String getStatus() {
        return status;
    }

    public SatRefresh setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lo que trajo, con status completed: en declarations cuántas listó y bajó; en los demás, dónde leer el documento. null mientras sigue o si falló.
     */
    public JsonNode getResult() {
        return result;
    }

    public SatRefresh setResult(JsonNode result) {
        this.result = result;
        return this;
    }

    /**
     * Con status failed: lo que dijo el SAT. null en los demás.
     */
    public String getError() {
        return error;
    }

    public SatRefresh setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * true cuando se usó su timbre (el SAT contestó). En pruebas siempre false: no se usan timbres.
     */
    public Boolean getCharged() {
        return charged;
    }

    public SatRefresh setCharged(Boolean charged) {
        this.charged = charged;
        return this;
    }

    /**
     * true mientras sigue: su timbre está apartado (GET /v1/balance ya no lo cuenta) y regresa si el SAT no contesta.
     */
    public Boolean getTimbreHeld() {
        return timbreHeld;
    }

    public SatRefresh setTimbreHeld(Boolean timbreHeld) {
        this.timbreHeld = timbreHeld;
        return this;
    }

    /**
     * Cuándo se pidió.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatRefresh setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo terminó (completed o failed). null mientras sigue.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public SatRefresh setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Cuándo se pidió (igual que created_at).
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    public SatRefresh setRefreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    /**
     * Desde cuándo se puede pedir otra vez para el mismo emisor (10 minutos después).
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
