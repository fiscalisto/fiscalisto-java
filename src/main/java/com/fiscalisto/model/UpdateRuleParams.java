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
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), invoice.paid (una factura PPD queda pagada), invoice.cancelled (el SAT la cancela), invoice.approved (se aprueba en el Portal de proveedores), invoice.rejected (se rechaza en el portal), payout.submitted (se manda a firmar un pago que la incluye), payout.paid (se le paga una factura a un proveedor), payout.failed (falla o se devuelve su pago), finding.created (aparece un hallazgo en una factura de los últimos 45 días), purchase_order.saved, .approved, .rejected, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered, bank.movement (llega un movimiento del banco: un retiro al importar el estado de cuenta, un depósito cuando Conciliación lo clasifica como préstamo, traspaso, devolución o intereses).
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
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
     * true: corre una sola vez por factura, orden o movimiento. Por omisión true, salvo purchase_order.saved.
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
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), invoice.paid (una factura PPD queda pagada), invoice.cancelled (el SAT la cancela), invoice.approved (se aprueba en el Portal de proveedores), invoice.rejected (se rechaza en el portal), payout.submitted (se manda a firmar un pago que la incluye), payout.paid (se le paga una factura a un proveedor), payout.failed (falla o se devuelve su pago), finding.created (aparece un hallazgo en una factura de los últimos 45 días), purchase_order.saved, .approved, .rejected, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered, bank.movement (llega un movimiento del banco: un retiro al importar el estado de cuenta, un depósito cuando Conciliación lo clasifica como préstamo, traspaso, devolución o intereses).
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
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
     * true: corre una sola vez por factura, orden o movimiento. Por omisión true, salvo purchase_order.saved.
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
