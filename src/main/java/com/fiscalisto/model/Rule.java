// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Rule: Una regla de la empresa: cuando pasa algo (trigger), si se cumplen sus condiciones, hace sus acciones. Las mismas de Ajustes › Reglas en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule {
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
    private StringOr<Issuer> issuer;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuándo corre.
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.canceled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, invoice.daily, purchase_order.daily, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered, sat.listed, sat.opinion, sat.buzon, sat.certificate.
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Si: lo que tiene que cumplir la factura u orden. Sin condiciones, corre siempre.
     */
    @JsonProperty("conditions")
    private RuleConditions conditions;

    /**
     * Entonces: lo que hace, en este orden.
     */
    @JsonProperty("actions")
    private List<RuleAction> actions;

    /**
     * Si no: lo que hace cuando sus condiciones no se cumplen ([]: nada).
     */
    @JsonProperty("else_actions")
    private List<RuleElseAction> elseActions;

    /**
     * true: corre una sola vez por factura u orden.
     */
    @JsonProperty("once_per_record")
    private Boolean oncePerRecord;

    /**
     * Esperar y volver a revisar: los días que espera antes de actuar, revisando de nuevo el registro (0: actúa al momento).
     */
    @JsonProperty("wait_days")
    private Long waitDays;

    /**
     * Si sigue así: pasos días después de que actuó (recordatorios, escalar); si sus condiciones ya no se cumplen, los que siguen no corren ([]: ninguno).
     */
    @JsonProperty("follow_ups")
    private List<RuleFollowUp> followUps;

    /**
     * true: si se cumple, las reglas que siguen no corren para ese registro.
     */
    @JsonProperty("stop_after")
    private Boolean stopAfter;

    /**
     * false: en pausa.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Su lugar en el orden en que corren (1 primero).
     */
    @JsonProperty("position")
    private Long position;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Rule setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Rule setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Rule setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Rule setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Rule setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Rule setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Rule setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuándo corre.
     * <p>
     * Valores: invoice.received, invoice.issued, invoice.paid, invoice.canceled, invoice.approved, invoice.rejected, finding.created, payout.submitted, payout.paid, payout.failed, invoice.daily, purchase_order.daily, bank.movement, purchase_order.saved, purchase_order.approved, purchase_order.rejected, purchase_order.sent, purchase_order.confirmed, purchase_order.received_part, purchase_order.received_all, purchase_order.invoiced_all, purchase_order.price_variance, purchase_order.registered, sat.listed, sat.opinion, sat.buzon, sat.certificate.
     */
    public String getTrigger() {
        return trigger;
    }

    public Rule setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Si: lo que tiene que cumplir la factura u orden. Sin condiciones, corre siempre.
     */
    public RuleConditions getConditions() {
        return conditions;
    }

    public Rule setConditions(RuleConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Entonces: lo que hace, en este orden.
     */
    public List<RuleAction> getActions() {
        return actions;
    }

    public Rule setActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Si no: lo que hace cuando sus condiciones no se cumplen ([]: nada).
     */
    public List<RuleElseAction> getElseActions() {
        return elseActions;
    }

    public Rule setElseActions(List<RuleElseAction> elseActions) {
        this.elseActions = elseActions;
        return this;
    }

    /**
     * true: corre una sola vez por factura u orden.
     */
    public Boolean getOncePerRecord() {
        return oncePerRecord;
    }

    public Rule setOncePerRecord(Boolean oncePerRecord) {
        this.oncePerRecord = oncePerRecord;
        return this;
    }

    /**
     * Esperar y volver a revisar: los días que espera antes de actuar, revisando de nuevo el registro (0: actúa al momento).
     */
    public Long getWaitDays() {
        return waitDays;
    }

    public Rule setWaitDays(Long waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    @JsonIgnore
    public Rule setWaitDays(long waitDays) {
        return setWaitDays(Long.valueOf(waitDays));
    }

    /**
     * Si sigue así: pasos días después de que actuó (recordatorios, escalar); si sus condiciones ya no se cumplen, los que siguen no corren ([]: ninguno).
     */
    public List<RuleFollowUp> getFollowUps() {
        return followUps;
    }

    public Rule setFollowUps(List<RuleFollowUp> followUps) {
        this.followUps = followUps;
        return this;
    }

    /**
     * true: si se cumple, las reglas que siguen no corren para ese registro.
     */
    public Boolean getStopAfter() {
        return stopAfter;
    }

    public Rule setStopAfter(Boolean stopAfter) {
        this.stopAfter = stopAfter;
        return this;
    }

    /**
     * false: en pausa.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public Rule setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Su lugar en el orden en que corren (1 primero).
     */
    public Long getPosition() {
        return position;
    }

    public Rule setPosition(Long position) {
        this.position = position;
        return this;
    }

    @JsonIgnore
    public Rule setPosition(long position) {
        return setPosition(Long.valueOf(position));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Rule setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public Rule setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
