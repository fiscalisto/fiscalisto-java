// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleAction: RuleAction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleAction {
    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: tag, cost_center, category, stage, close, ask_approval, notify, lote, hold_payment, email_supplier, review_findings, extra_signature.
     */
    @JsonProperty("type")
    private String type;

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags).
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * category: la categoría de gasto (facturas recibidas).
     */
    @JsonProperty("category")
    private String category;

    /**
     * tag: se quita si la orden deja de cumplir.
     */
    @JsonProperty("remove_when_unmet")
    private Boolean removeWhenUnmet;

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * stage: la etapa.
     */
    @JsonProperty("stage")
    private Long stage;

    /**
     * notify: a quién (mem_…).
     */
    @JsonProperty("members")
    private List<String> members;

    /**
     * notify: lo que dice el aviso. hold_payment: por qué se retiene.
     */
    @JsonProperty("note")
    private String note;

    /**
     * email_supplier: el tema de los correos del proveedor a los que va.
     * <p>
     * Valores: ordenes, pagos, facturas, complementos, documentos, precios.
     */
    @JsonProperty("topic")
    private String topic;

    /**
     * email_supplier: el asunto.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * email_supplier: el mensaje.
     */
    @JsonProperty("message")
    private String message;

    /**
     * email_supplier en los disparadores de pagos: payout, un correo por pago y proveedor; invoice, uno por factura.
     * <p>
     * Valores: payout, invoice.
     */
    @JsonProperty("per")
    private String per;

    /**
     * email_supplier: las columnas de cada tabla del mensaje; null: las de siempre.
     */
    @JsonProperty("columns")
    private RuleActionColumns columns;

    /**
     * email_supplier: personas del equipo con copia (mem_…).
     */
    @JsonProperty("cc")
    private List<String> cc;

    /**
     * review_findings: los hallazgos que da por revisados (sus códigos).
     */
    @JsonProperty("findings")
    private List<String> findings;

    /**
     * extra_signature: cuántas firmas más pide (1 a 3).
     */
    @JsonProperty("signatures")
    private Long signatures;

    /**
     * extra_signature: por qué, para quien firma.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * lote: el nombre del lote; null: «Lote del jueves 27 nov».
     */
    @JsonProperty("lote_name")
    private String loteName;

    /**
     * lote: el día que paga (siguiente día de la semana, a los días, o el del contrarecibo).
     * <p>
     * Valores: monday, tuesday, wednesday, thursday, friday, in_days, due.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * lote con pay_on in_days: cuántos días.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: tag, cost_center, category, stage, close, ask_approval, notify, lote, hold_payment, email_supplier, review_findings, extra_signature.
     */
    public String getType() {
        return type;
    }

    public RuleAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags).
     */
    public String getTag() {
        return tag;
    }

    public RuleAction setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * category: la categoría de gasto (facturas recibidas).
     */
    public String getCategory() {
        return category;
    }

    public RuleAction setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * tag: se quita si la orden deja de cumplir.
     */
    public Boolean getRemoveWhenUnmet() {
        return removeWhenUnmet;
    }

    public RuleAction setRemoveWhenUnmet(Boolean removeWhenUnmet) {
        this.removeWhenUnmet = removeWhenUnmet;
        return this;
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public RuleAction setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * stage: la etapa.
     */
    public Long getStage() {
        return stage;
    }

    public RuleAction setStage(Long stage) {
        this.stage = stage;
        return this;
    }

    @JsonIgnore
    public RuleAction setStage(long stage) {
        return setStage(Long.valueOf(stage));
    }

    /**
     * notify: a quién (mem_…).
     */
    public List<String> getMembers() {
        return members;
    }

    public RuleAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * notify: lo que dice el aviso. hold_payment: por qué se retiene.
     */
    public String getNote() {
        return note;
    }

    public RuleAction setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * email_supplier: el tema de los correos del proveedor a los que va.
     * <p>
     * Valores: ordenes, pagos, facturas, complementos, documentos, precios.
     */
    public String getTopic() {
        return topic;
    }

    public RuleAction setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * email_supplier: el asunto.
     */
    public String getSubject() {
        return subject;
    }

    public RuleAction setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * email_supplier: el mensaje.
     */
    public String getMessage() {
        return message;
    }

    public RuleAction setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * email_supplier en los disparadores de pagos: payout, un correo por pago y proveedor; invoice, uno por factura.
     * <p>
     * Valores: payout, invoice.
     */
    public String getPer() {
        return per;
    }

    public RuleAction setPer(String per) {
        this.per = per;
        return this;
    }

    /**
     * email_supplier: las columnas de cada tabla del mensaje; null: las de siempre.
     */
    public RuleActionColumns getColumns() {
        return columns;
    }

    public RuleAction setColumns(RuleActionColumns columns) {
        this.columns = columns;
        return this;
    }

    /**
     * email_supplier: personas del equipo con copia (mem_…).
     */
    public List<String> getCc() {
        return cc;
    }

    public RuleAction setCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    /**
     * review_findings: los hallazgos que da por revisados (sus códigos).
     */
    public List<String> getFindings() {
        return findings;
    }

    public RuleAction setFindings(List<String> findings) {
        this.findings = findings;
        return this;
    }

    /**
     * extra_signature: cuántas firmas más pide (1 a 3).
     */
    public Long getSignatures() {
        return signatures;
    }

    public RuleAction setSignatures(Long signatures) {
        this.signatures = signatures;
        return this;
    }

    @JsonIgnore
    public RuleAction setSignatures(long signatures) {
        return setSignatures(Long.valueOf(signatures));
    }

    /**
     * extra_signature: por qué, para quien firma.
     */
    public String getReason() {
        return reason;
    }

    public RuleAction setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * lote: el nombre del lote; null: «Lote del jueves 27 nov».
     */
    public String getLoteName() {
        return loteName;
    }

    public RuleAction setLoteName(String loteName) {
        this.loteName = loteName;
        return this;
    }

    /**
     * lote: el día que paga (siguiente día de la semana, a los días, o el del contrarecibo).
     * <p>
     * Valores: monday, tuesday, wednesday, thursday, friday, in_days, due.
     */
    public String getPayOn() {
        return payOn;
    }

    public RuleAction setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * lote con pay_on in_days: cuántos días.
     */
    public Long getDays() {
        return days;
    }

    public RuleAction setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public RuleAction setDays(long days) {
        return setDays(Long.valueOf(days));
    }
}
