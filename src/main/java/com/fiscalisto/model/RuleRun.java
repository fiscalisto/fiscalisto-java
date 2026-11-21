// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleRun: Una vez que la regla corrió sobre una factura u orden.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleRun {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * La regla (rul_…).
     */
    @JsonProperty("rule")
    private String rule;

    /**
     * Cuándo corre.
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * La factura u orden, en palabras.
     */
    @JsonProperty("record")
    private String record_;

    /**
     * Qué es el registro.
     * <p>
     * Valores: invoice, purchase_order.
     */
    @JsonProperty("record_type")
    private String recordType;

    /**
     * done: hizo cambios; nothing: ya estaba así; failed: no pudo (ver error).
     * <p>
     * Valores: done, nothing, failed.
     */
    @JsonProperty("outcome")
    private String outcome;

    /**
     * Lo que hizo, en palabras.
     */
    @JsonProperty("did")
    private List<String> did;

    /**
     * Por qué no pudo, o null.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public RuleRun setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RuleRun setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * La regla (rul_…).
     */
    public String getRule() {
        return rule;
    }

    public RuleRun setRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Cuándo corre.
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     */
    public String getTrigger() {
        return trigger;
    }

    public RuleRun setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * La factura u orden, en palabras.
     */
    public String getRecord() {
        return record_;
    }

    public RuleRun setRecord(String record_) {
        this.record_ = record_;
        return this;
    }

    /**
     * Qué es el registro.
     * <p>
     * Valores: invoice, purchase_order.
     */
    public String getRecordType() {
        return recordType;
    }

    public RuleRun setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * done: hizo cambios; nothing: ya estaba así; failed: no pudo (ver error).
     * <p>
     * Valores: done, nothing, failed.
     */
    public String getOutcome() {
        return outcome;
    }

    public RuleRun setOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     * Lo que hizo, en palabras.
     */
    public List<String> getDid() {
        return did;
    }

    public RuleRun setDid(List<String> did) {
        this.did = did;
        return this;
    }

    /**
     * Por qué no pudo, o null.
     */
    public String getError() {
        return error;
    }

    public RuleRun setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public RuleRun setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
