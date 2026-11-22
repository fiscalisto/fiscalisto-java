// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRuleParams: los campos de «Crear una regla».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRuleParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo se llama en Ajustes › Reglas. Sin él, se nombra por lo que hace.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), invoice.paid (una factura PPD queda pagada), invoice.cancelled (el SAT la cancela), invoice.approved (se aprueba en el Portal de proveedores), invoice.rejected (se rechaza en el portal), payout.submitted (se manda a firmar un pago que la incluye), payout.paid (se le paga una factura a un proveedor), payout.failed (falla o se devuelve su pago), invoice.daily (cada mañana a las 8, a cada factura con saldo, recibida o emitida, de Ingreso y no cancelada), purchase_order.daily (cada mañana a las 8, a cada orden que aún no llega toda ni está cerrada o cancelada), finding.created (aparece un hallazgo en una factura de los últimos 45 días), purchase_order.saved, .approved, .rejected, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered, bank.movement (llega un movimiento del banco: un retiro al importar el estado de cuenta, un depósito cuando Conciliación lo clasifica como préstamo, traspaso, devolución o intereses).
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, invoice.daily, purchase_order.daily, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Si: lo que tiene que cumplir. Sin condiciones, corre siempre.
     */
    @JsonProperty("conditions")
    private CreateRuleParamsConditions conditions;

    /**
     * Entonces: de 1 a 8, en este orden.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("actions")
    private List<CreateRuleParamsAction> actions;

    /**
     * Si no: de 0 a 8 acciones, las mismas de actions, que hace cuando sus condiciones no se cumplen. Solo con condiciones; [] las quita.
     */
    @JsonProperty("else_actions")
    private List<CreateRuleParamsElseAction> elseActions;

    /**
     * true: corre una sola vez por factura, orden o movimiento. Por omisión true, salvo purchase_order.saved.
     */
    @JsonProperty("once_per_record")
    private Boolean oncePerRecord;

    /**
     * Esperar y volver a revisar: si se cumple, espera estos días (1 a 90) y revisa de nuevo el registro como esté entonces; solo actúa si aún se cumple. 0 (por omisión): actúa al momento.
     */
    @JsonProperty("wait_days")
    private Long waitDays;

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
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateRuleParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo se llama en Ajustes › Reglas. Sin él, se nombra por lo que hace.
     */
    public String getName() {
        return name;
    }

    public CreateRuleParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuándo corre: invoice.received (llega una factura de un proveedor), invoice.issued (se emite una factura), invoice.paid (una factura PPD queda pagada), invoice.cancelled (el SAT la cancela), invoice.approved (se aprueba en el Portal de proveedores), invoice.rejected (se rechaza en el portal), payout.submitted (se manda a firmar un pago que la incluye), payout.paid (se le paga una factura a un proveedor), payout.failed (falla o se devuelve su pago), invoice.daily (cada mañana a las 8, a cada factura con saldo, recibida o emitida, de Ingreso y no cancelada), purchase_order.daily (cada mañana a las 8, a cada orden que aún no llega toda ni está cerrada o cancelada), finding.created (aparece un hallazgo en una factura de los últimos 45 días), purchase_order.saved, .approved, .rejected, .sent, .confirmed, .received_part, .received_all, .invoiced_all, .price_variance, .registered, bank.movement (llega un movimiento del banco: un retiro al importar el estado de cuenta, un depósito cuando Conciliación lo clasifica como préstamo, traspaso, devolución o intereses).
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.cancelled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, invoice.daily, purchase_order.daily, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered.
     * <p>
     * Obligatorio.
     */
    public String getTrigger() {
        return trigger;
    }

    public CreateRuleParams setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Si: lo que tiene que cumplir. Sin condiciones, corre siempre.
     */
    public CreateRuleParamsConditions getConditions() {
        return conditions;
    }

    public CreateRuleParams setConditions(CreateRuleParamsConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Entonces: de 1 a 8, en este orden.
     * <p>
     * Obligatorio.
     */
    public List<CreateRuleParamsAction> getActions() {
        return actions;
    }

    public CreateRuleParams setActions(List<CreateRuleParamsAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Si no: de 0 a 8 acciones, las mismas de actions, que hace cuando sus condiciones no se cumplen. Solo con condiciones; [] las quita.
     */
    public List<CreateRuleParamsElseAction> getElseActions() {
        return elseActions;
    }

    public CreateRuleParams setElseActions(List<CreateRuleParamsElseAction> elseActions) {
        this.elseActions = elseActions;
        return this;
    }

    /**
     * true: corre una sola vez por factura, orden o movimiento. Por omisión true, salvo purchase_order.saved.
     */
    public Boolean getOncePerRecord() {
        return oncePerRecord;
    }

    public CreateRuleParams setOncePerRecord(Boolean oncePerRecord) {
        this.oncePerRecord = oncePerRecord;
        return this;
    }

    /**
     * Esperar y volver a revisar: si se cumple, espera estos días (1 a 90) y revisa de nuevo el registro como esté entonces; solo actúa si aún se cumple. 0 (por omisión): actúa al momento.
     */
    public Long getWaitDays() {
        return waitDays;
    }

    public CreateRuleParams setWaitDays(Long waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    @JsonIgnore
    public CreateRuleParams setWaitDays(long waitDays) {
        return setWaitDays(Long.valueOf(waitDays));
    }

    /**
     * true: si se cumple, las reglas que siguen no corren para ese registro.
     */
    public Boolean getStopAfter() {
        return stopAfter;
    }

    public CreateRuleParams setStopAfter(Boolean stopAfter) {
        this.stopAfter = stopAfter;
        return this;
    }

    /**
     * false la deja en pausa.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public CreateRuleParams setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
