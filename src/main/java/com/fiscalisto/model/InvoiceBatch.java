// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceBatch: Un lote de hasta 1,000 facturas timbradas en segundo plano.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceBatch {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre del lote, para usted.
     */
    @JsonProperty("name")
    private String name;

    /**
     * processing: timbrando. completed: ya no queda ninguna por timbrar.
     * <p>
     * Valores: processing, completed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántas facturas tiene el lote.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Cuántas se timbraron.
     */
    @JsonProperty("stamped")
    private Long stamped;

    /**
     * Cuántas no se timbraron (quedan con su motivo).
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Cuántas siguen en proceso.
     */
    @JsonProperty("processing")
    private Long processing;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo terminó.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Cada factura del lote (no viene en listas ni en eventos).
     */
    @JsonProperty("invoices")
    private List<InvoiceBatchInvoice> invoices;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public InvoiceBatch setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public InvoiceBatch setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public InvoiceBatch setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public InvoiceBatch setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre del lote, para usted.
     */
    public String getName() {
        return name;
    }

    public InvoiceBatch setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * processing: timbrando. completed: ya no queda ninguna por timbrar.
     * <p>
     * Valores: processing, completed.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceBatch setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántas facturas tiene el lote.
     */
    public Long getTotal() {
        return total;
    }

    public InvoiceBatch setTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public InvoiceBatch setTotal(long total) {
        return setTotal(Long.valueOf(total));
    }

    /**
     * Cuántas se timbraron.
     */
    public Long getStamped() {
        return stamped;
    }

    public InvoiceBatch setStamped(Long stamped) {
        this.stamped = stamped;
        return this;
    }

    @JsonIgnore
    public InvoiceBatch setStamped(long stamped) {
        return setStamped(Long.valueOf(stamped));
    }

    /**
     * Cuántas no se timbraron (quedan con su motivo).
     */
    public Long getFailed() {
        return failed;
    }

    public InvoiceBatch setFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    @JsonIgnore
    public InvoiceBatch setFailed(long failed) {
        return setFailed(Long.valueOf(failed));
    }

    /**
     * Cuántas siguen en proceso.
     */
    public Long getProcessing() {
        return processing;
    }

    public InvoiceBatch setProcessing(Long processing) {
        this.processing = processing;
        return this;
    }

    @JsonIgnore
    public InvoiceBatch setProcessing(long processing) {
        return setProcessing(Long.valueOf(processing));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public InvoiceBatch setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo terminó.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public InvoiceBatch setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Cada factura del lote (no viene en listas ni en eventos).
     */
    public List<InvoiceBatchInvoice> getInvoices() {
        return invoices;
    }

    public InvoiceBatch setInvoices(List<InvoiceBatchInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }
}
