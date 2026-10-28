// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PayrollBatch: Una nómina completa (hasta 1,000 recibos) timbrada en segundo plano.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBatch {
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
     * fiscalisto: Fiscalisto calculó cada recibo (receipts); external: se timbraron los importes de su sistema (external_receipts).
     * <p>
     * Valores: fiscalisto, external.
     */
    @JsonProperty("calculation")
    private String calculation;

    /**
     * processing: timbrando. completed: ya no queda ningún recibo por timbrar.
     * <p>
     * Valores: processing, completed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántos recibos tiene el lote.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Cuántos recibos se timbraron.
     */
    @JsonProperty("stamped")
    private Long stamped;

    /**
     * Cuántos no se timbraron (cada uno con su error).
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Cuántos faltan por timbrar.
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
     * El recibo de cada empleado, en el orden en que los mandó (no viene en listas).
     */
    @JsonProperty("receipts")
    private List<PayrollBatchReceipt> receipts;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PayrollBatch setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollBatch setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollBatch setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollBatch setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre del lote, para usted.
     */
    public String getName() {
        return name;
    }

    public PayrollBatch setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * fiscalisto: Fiscalisto calculó cada recibo (receipts); external: se timbraron los importes de su sistema (external_receipts).
     * <p>
     * Valores: fiscalisto, external.
     */
    public String getCalculation() {
        return calculation;
    }

    public PayrollBatch setCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * processing: timbrando. completed: ya no queda ningún recibo por timbrar.
     * <p>
     * Valores: processing, completed.
     */
    public String getStatus() {
        return status;
    }

    public PayrollBatch setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántos recibos tiene el lote.
     */
    public Long getTotal() {
        return total;
    }

    public PayrollBatch setTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollBatch setTotal(long total) {
        return setTotal(Long.valueOf(total));
    }

    /**
     * Cuántos recibos se timbraron.
     */
    public Long getStamped() {
        return stamped;
    }

    public PayrollBatch setStamped(Long stamped) {
        this.stamped = stamped;
        return this;
    }

    @JsonIgnore
    public PayrollBatch setStamped(long stamped) {
        return setStamped(Long.valueOf(stamped));
    }

    /**
     * Cuántos no se timbraron (cada uno con su error).
     */
    public Long getFailed() {
        return failed;
    }

    public PayrollBatch setFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    @JsonIgnore
    public PayrollBatch setFailed(long failed) {
        return setFailed(Long.valueOf(failed));
    }

    /**
     * Cuántos faltan por timbrar.
     */
    public Long getProcessing() {
        return processing;
    }

    public PayrollBatch setProcessing(Long processing) {
        this.processing = processing;
        return this;
    }

    @JsonIgnore
    public PayrollBatch setProcessing(long processing) {
        return setProcessing(Long.valueOf(processing));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PayrollBatch setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo terminó.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public PayrollBatch setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * El recibo de cada empleado, en el orden en que los mandó (no viene en listas).
     */
    public List<PayrollBatchReceipt> getReceipts() {
        return receipts;
    }

    public PayrollBatch setReceipts(List<PayrollBatchReceipt> receipts) {
        this.receipts = receipts;
        return this;
    }
}
