// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateRuleParams: los campos de «Cambiar una regla».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRuleParams {
    /**
     * Cómo se llama en Ajustes › Reglas. Sin él, se nombra por lo que hace.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), purchase_order.saved, .approved, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered.
     * <p>
     * Valores: invoice.received, invoice.issued, purchase_order.saved, purchase_order.approved, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Si: lo que tiene que cumplir. Sin condiciones, corre siempre.
     */
    @JsonProperty("conditions")
    private UpdateRuleParamsConditions conditions;

    /**
     * Entonces: de 1 a 8, en este orden.
     */
    @JsonProperty("actions")
    private List<UpdateRuleParamsAction> actions;

    /**
     * true: corre una sola vez por factura u orden. Por omisión true, salvo purchase_order.saved.
     */
    @JsonProperty("once_per_record")
    private Boolean oncePerRecord;

    /**
     * true: si se cumple, las reglas que siguen no corren para ese registro.
     */
    @JsonProperty("stop_after")
    private Boolean stopAfter;

    /**
     * false la deja en pausa.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Cómo se llama en Ajustes › Reglas. Sin él, se nombra por lo que hace.
     */
    public String getName() {
        return name;
    }

    public UpdateRuleParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), purchase_order.saved, .approved, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered.
     * <p>
     * Valores: invoice.received, invoice.issued, purchase_order.saved, purchase_order.approved, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     */
    public String getTrigger() {
        return trigger;
    }

    public UpdateRuleParams setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Si: lo que tiene que cumplir. Sin condiciones, corre siempre.
     */
    public UpdateRuleParamsConditions getConditions() {
        return conditions;
    }

    public UpdateRuleParams setConditions(UpdateRuleParamsConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Entonces: de 1 a 8, en este orden.
     */
    public List<UpdateRuleParamsAction> getActions() {
        return actions;
    }

    public UpdateRuleParams setActions(List<UpdateRuleParamsAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * true: corre una sola vez por factura u orden. Por omisión true, salvo purchase_order.saved.
     */
    public Boolean getOncePerRecord() {
        return oncePerRecord;
    }

    public UpdateRuleParams setOncePerRecord(Boolean oncePerRecord) {
        this.oncePerRecord = oncePerRecord;
        return this;
    }

    /**
     * true: si se cumple, las reglas que siguen no corren para ese registro.
     */
    public Boolean getStopAfter() {
        return stopAfter;
    }

    public UpdateRuleParams setStopAfter(Boolean stopAfter) {
        this.stopAfter = stopAfter;
        return this;
    }

    /**
     * false la deja en pausa.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateRuleParams setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
