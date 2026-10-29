// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Quote: Una cotización: su cliente la ve en una liga, la acepta, pide cambios o la rechaza, y se factura.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
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
     * Su serie y folio, como lo ve el cliente (COT-12).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Cambiar una ya enviada hace una versión nueva con el mismo número; el id contesta siempre la última.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * draft, sent, viewed (el cliente abrió la liga), accepted, rejected, withdrawn (usted la retiró), expired (pasó valid_until) o invoiced.
     * <p>
     * Valores: draft, sent, viewed, accepted, rejected, withdrawn, expired, invoiced.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La liga donde el cliente la ve, descarga su PDF, la acepta, pide cambios o la rechaza; null mientras sea borrador.
     */
    @JsonProperty("url")
    private String url;

    /**
     * A quién va: tax_id null si aún no tiene sus datos fiscales; catalog_id es su cliente (cus_…) en su catálogo, o null.
     */
    @JsonProperty("customer")
    private QuoteCustomer customer;

    /**
     * La moneda.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Los conceptos, como los de una factura.
     */
    @JsonProperty("items")
    private List<QuoteItem> items;

    /**
     * El total con impuestos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Su último día de validez (AAAA-MM-DD).
     */
    @JsonProperty("valid_until")
    private String validUntil;

    /**
     * Las condiciones impresas: entrega, anticipo, garantía…
     */
    @JsonProperty("terms")
    private String terms;

    /**
     * Las notas, como las de una factura.
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Si al aceptarla se timbra la factura sola.
     */
    @JsonProperty("auto_invoice")
    private Boolean autoInvoice;

    /**
     * Si se le manda un recordatorio por correo 3 días antes de su último día mientras no responda (remind en POST /v1/quotes/{id}/send).
     */
    @JsonProperty("remind")
    private Boolean remind;

    /**
     * Cuándo se mandó el recordatorio, o null.
     */
    @JsonProperty("reminded_at")
    private String remindedAt;

    /**
     * Lo que escribió el cliente al pedir cambios o al rechazarla, la nota de usted al retirarla o marcarla rechazada, o null.
     */
    @JsonProperty("customer_comment")
    private String customerComment;

    /**
     * Cuándo se envió.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Cuándo el cliente abrió la liga por primera vez.
     */
    @JsonProperty("viewed_at")
    private String viewedAt;

    /**
     * Cuándo se aceptó, se rechazó o se retiró.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * customer (en su liga) o user (usted: POST /v1/quotes/{id}/accept, /reject o /withdraw, o desde la app).
     * <p>
     * Valores: customer, user.
     */
    @JsonProperty("decided_by")
    private String decidedBy;

    /**
     * La factura (inv_…) que se timbró de ella, o null.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Quote setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Quote setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Quote setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Quote setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su serie y folio, como lo ve el cliente (COT-12).
     */
    public String getNumber() {
        return number;
    }

    public Quote setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Cambiar una ya enviada hace una versión nueva con el mismo número; el id contesta siempre la última.
     */
    public Long getVersion() {
        return version;
    }

    public Quote setVersion(Long version) {
        this.version = version;
        return this;
    }

    @JsonIgnore
    public Quote setVersion(long version) {
        return setVersion(Long.valueOf(version));
    }

    /**
     * draft, sent, viewed (el cliente abrió la liga), accepted, rejected, withdrawn (usted la retiró), expired (pasó valid_until) o invoiced.
     * <p>
     * Valores: draft, sent, viewed, accepted, rejected, withdrawn, expired, invoiced.
     */
    public String getStatus() {
        return status;
    }

    public Quote setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La liga donde el cliente la ve, descarga su PDF, la acepta, pide cambios o la rechaza; null mientras sea borrador.
     */
    public String getUrl() {
        return url;
    }

    public Quote setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * A quién va: tax_id null si aún no tiene sus datos fiscales; catalog_id es su cliente (cus_…) en su catálogo, o null.
     */
    public QuoteCustomer getCustomer() {
        return customer;
    }

    public Quote setCustomer(QuoteCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * La moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public Quote setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Los conceptos, como los de una factura.
     */
    public List<QuoteItem> getItems() {
        return items;
    }

    public Quote setItems(List<QuoteItem> items) {
        this.items = items;
        return this;
    }

    /**
     * El total con impuestos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public Quote setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public Quote setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Su último día de validez (AAAA-MM-DD).
     */
    public String getValidUntil() {
        return validUntil;
    }

    public Quote setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Las condiciones impresas: entrega, anticipo, garantía…
     */
    public String getTerms() {
        return terms;
    }

    public Quote setTerms(String terms) {
        this.terms = terms;
        return this;
    }

    /**
     * Las notas, como las de una factura.
     */
    public String getNotes() {
        return notes;
    }

    public Quote setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Si al aceptarla se timbra la factura sola.
     */
    public Boolean getAutoInvoice() {
        return autoInvoice;
    }

    public Quote setAutoInvoice(Boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }

    /**
     * Si se le manda un recordatorio por correo 3 días antes de su último día mientras no responda (remind en POST /v1/quotes/{id}/send).
     */
    public Boolean getRemind() {
        return remind;
    }

    public Quote setRemind(Boolean remind) {
        this.remind = remind;
        return this;
    }

    /**
     * Cuándo se mandó el recordatorio, o null.
     */
    public String getRemindedAt() {
        return remindedAt;
    }

    public Quote setRemindedAt(String remindedAt) {
        this.remindedAt = remindedAt;
        return this;
    }

    /**
     * Lo que escribió el cliente al pedir cambios o al rechazarla, la nota de usted al retirarla o marcarla rechazada, o null.
     */
    public String getCustomerComment() {
        return customerComment;
    }

    public Quote setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
        return this;
    }

    /**
     * Cuándo se envió.
     */
    public String getSentAt() {
        return sentAt;
    }

    public Quote setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Cuándo el cliente abrió la liga por primera vez.
     */
    public String getViewedAt() {
        return viewedAt;
    }

    public Quote setViewedAt(String viewedAt) {
        this.viewedAt = viewedAt;
        return this;
    }

    /**
     * Cuándo se aceptó, se rechazó o se retiró.
     */
    public String getDecidedAt() {
        return decidedAt;
    }

    public Quote setDecidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    /**
     * customer (en su liga) o user (usted: POST /v1/quotes/{id}/accept, /reject o /withdraw, o desde la app).
     * <p>
     * Valores: customer, user.
     */
    public String getDecidedBy() {
        return decidedBy;
    }

    public Quote setDecidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
        return this;
    }

    /**
     * La factura (inv_…) que se timbró de ella, o null.
     */
    public String getInvoice() {
        return invoice;
    }

    public Quote setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Quote setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
