// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatDownload: Una solicitud al SAT de las facturas emitidas o recibidas de un emisor en un periodo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDownload {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor cuyas facturas se piden.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * received (las que le hicieron) o issued (las que emitió).
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Desde qué día (incluido).
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta qué día (incluido).
     */
    @JsonProperty("to")
    private String to;

    /**
     * El tipo de comprobante pedido, o null si todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El RFC de la contraparte pedido, o null.
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * El folio fiscal pedido, o null.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * processing (el SAT la está preparando: de minutos a horas), completed (las facturas ya están en GET /v1/sat_invoices) o failed (el motivo en error).
     * <p>
     * Valores: processing, completed, failed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántas facturas nuevas trajo (las que ya tenía no cuentan). null mientras no termine.
     */
    @JsonProperty("new_invoices")
    private Long newInvoices;

    /**
     * Por qué falló, como lo dijo el SAT. null si no falló.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Cuándo se pidió.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo terminó, o null.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SatDownload setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatDownload setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatDownload setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor cuyas facturas se piden.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatDownload setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * received (las que le hicieron) o issued (las que emitió).
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public SatDownload setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Desde qué día (incluido).
     */
    public String getFrom() {
        return from;
    }

    public SatDownload setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta qué día (incluido).
     */
    public String getTo() {
        return to;
    }

    public SatDownload setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * El tipo de comprobante pedido, o null si todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public SatDownload setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El RFC de la contraparte pedido, o null.
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public SatDownload setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * El folio fiscal pedido, o null.
     */
    public String getUuid() {
        return uuid;
    }

    public SatDownload setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * processing (el SAT la está preparando: de minutos a horas), completed (las facturas ya están en GET /v1/sat_invoices) o failed (el motivo en error).
     * <p>
     * Valores: processing, completed, failed.
     */
    public String getStatus() {
        return status;
    }

    public SatDownload setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántas facturas nuevas trajo (las que ya tenía no cuentan). null mientras no termine.
     */
    public Long getNewInvoices() {
        return newInvoices;
    }

    public SatDownload setNewInvoices(Long newInvoices) {
        this.newInvoices = newInvoices;
        return this;
    }

    @JsonIgnore
    public SatDownload setNewInvoices(long newInvoices) {
        return setNewInvoices(Long.valueOf(newInvoices));
    }

    /**
     * Por qué falló, como lo dijo el SAT. null si no falló.
     */
    public String getError() {
        return error;
    }

    public SatDownload setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Cuándo se pidió.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatDownload setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo terminó, o null.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public SatDownload setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
}
