// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleTest: Lo que la regla haría con una factura u orden (sin cambiar nada).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleTest {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * La factura u orden, en palabras.
     */
    @JsonProperty("record")
    private String record_;

    /**
     * El folio fiscal, para una factura.
     */
    @JsonProperty("invoice_uuid")
    private String invoiceUuid;

    /**
     * La orden de compra.
     */
    @JsonProperty("purchase_order")
    private Long purchaseOrder;

    /**
     * Si se cumplen sus condiciones.
     */
    @JsonProperty("matches")
    private Boolean matches;

    /**
     * Ya corrió sobre este registro y no lo hará de nuevo.
     */
    @JsonProperty("already_ran")
    private Boolean alreadyRan;

    /**
     * Cada condición con lo que tiene el registro.
     */
    @JsonProperty("conditions")
    private List<RuleTestCondition> conditions;

    /**
     * Lo que haría, en palabras (nada cambia).
     */
    @JsonProperty("would_do")
    private List<String> wouldDo;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RuleTest setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * La factura u orden, en palabras.
     */
    public String getRecord() {
        return record_;
    }

    public RuleTest setRecord(String record_) {
        this.record_ = record_;
        return this;
    }

    /**
     * El folio fiscal, para una factura.
     */
    public String getInvoiceUuid() {
        return invoiceUuid;
    }

    public RuleTest setInvoiceUuid(String invoiceUuid) {
        this.invoiceUuid = invoiceUuid;
        return this;
    }

    /**
     * La orden de compra.
     */
    public Long getPurchaseOrder() {
        return purchaseOrder;
    }

    public RuleTest setPurchaseOrder(Long purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
        return this;
    }

    @JsonIgnore
    public RuleTest setPurchaseOrder(long purchaseOrder) {
        return setPurchaseOrder(Long.valueOf(purchaseOrder));
    }

    /**
     * Si se cumplen sus condiciones.
     */
    public Boolean getMatches() {
        return matches;
    }

    public RuleTest setMatches(Boolean matches) {
        this.matches = matches;
        return this;
    }

    /**
     * Ya corrió sobre este registro y no lo hará de nuevo.
     */
    public Boolean getAlreadyRan() {
        return alreadyRan;
    }

    public RuleTest setAlreadyRan(Boolean alreadyRan) {
        this.alreadyRan = alreadyRan;
        return this;
    }

    /**
     * Cada condición con lo que tiene el registro.
     */
    public List<RuleTestCondition> getConditions() {
        return conditions;
    }

    public RuleTest setConditions(List<RuleTestCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Lo que haría, en palabras (nada cambia).
     */
    public List<String> getWouldDo() {
        return wouldDo;
    }

    public RuleTest setWouldDo(List<String> wouldDo) {
        this.wouldDo = wouldDo;
        return this;
    }
}
