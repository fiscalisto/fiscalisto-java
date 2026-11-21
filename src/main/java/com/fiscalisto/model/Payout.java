// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Payout: Un pago a proveedores con Fintoc: una o varias transferencias SPEI que salen juntas en su día, después de las firmas que la empresa pide. La API lo prepara; solo se firma en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payout {
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
     * El emisor (iss_…) que paga.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su número en la empresa (Pago 12), como en la app.
     */
    @JsonProperty("number")
    private Long number;

    /**
     * draft (borrador: falta que alguien lo firme en la app), pending_approval (faltan firmas), approved (firmado: sale en su día), sending, paid (llegaron todas), partially_paid (llegaron algunas), failed (no llegó ninguna) o canceled.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El nombre del lote («Fletes»), o null: la app lo llama por su día.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El día en que sale (AAAA-MM-DD, hora de la Ciudad de México).
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * En un pago programado con facturas en otra moneda, cómo toma el tipo de cambio: official (el oficial; si al salir se movió más de la tolerancia de Configurar pagos, se detiene hasta firmarlo de nuevo) o fixed (sale al tipo de cambio con que se firmó). null en pesos o si sale hoy.
     * <p>
     * Valores: official, fixed.
     */
    @JsonProperty("exchange_rate")
    private String exchangeRate;

    /**
     * La suma de sus transferencias, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Siempre MXN: las transferencias SPEI son en pesos.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * La nota para quien lo revisa, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * De dónde salió: app, api, assistant (un asistente como ChatGPT o Claude), rule (una regla que paga sola) o recurring (un pago recurrente).
     * <p>
     * Valores: app, api, assistant, rule, recurring.
     */
    @JsonProperty("source")
    private String source;

    /**
     * El pago recurrente (pym_…) que lo hizo, o null.
     */
    @JsonProperty("payout_mandate")
    private String payoutMandate;

    /**
     * required: cuántas firmas pide (null mientras es borrador); given: cuántas personas ya firmaron. La API nunca firma.
     */
    @JsonProperty("signatures")
    private PayoutSignatures signatures;

    /**
     * Dónde lo revisa y lo firma alguien del equipo, en la app.
     */
    @JsonProperty("app_url")
    private String appUrl;

    /**
     * Sus transferencias, una por proveedor y cuenta.
     */
    @JsonProperty("transfers")
    private List<PayoutTransfer> transfers;

    /**
     * Por qué se canceló, o null.
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

    /**
     * true si lo preparó la API.
     */
    @JsonProperty("created_by_api")
    private Boolean createdByApi;

    /**
     * Cuándo se preparó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo tuvo todas sus firmas, o null.
     */
    @JsonProperty("approved_at")
    private String approvedAt;

    /**
     * Cuándo empezaron a salir sus transferencias, o null.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Cuándo terminó (todas llegaron o se resolvieron), o null.
     */
    @JsonProperty("settled_at")
    private String settledAt;

    /**
     * Cuándo se canceló, o null.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Payout setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Payout setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Payout setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…) que paga.
     */
    public String getIssuer() {
        return issuer;
    }

    public Payout setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su número en la empresa (Pago 12), como en la app.
     */
    public Long getNumber() {
        return number;
    }

    public Payout setNumber(Long number) {
        this.number = number;
        return this;
    }

    @JsonIgnore
    public Payout setNumber(long number) {
        return setNumber(Long.valueOf(number));
    }

    /**
     * draft (borrador: falta que alguien lo firme en la app), pending_approval (faltan firmas), approved (firmado: sale en su día), sending, paid (llegaron todas), partially_paid (llegaron algunas), failed (no llegó ninguna) o canceled.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    public String getStatus() {
        return status;
    }

    public Payout setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El nombre del lote («Fletes»), o null: la app lo llama por su día.
     */
    public String getName() {
        return name;
    }

    public Payout setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El día en que sale (AAAA-MM-DD, hora de la Ciudad de México).
     */
    public String getPayOn() {
        return payOn;
    }

    public Payout setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * En un pago programado con facturas en otra moneda, cómo toma el tipo de cambio: official (el oficial; si al salir se movió más de la tolerancia de Configurar pagos, se detiene hasta firmarlo de nuevo) o fixed (sale al tipo de cambio con que se firmó). null en pesos o si sale hoy.
     * <p>
     * Valores: official, fixed.
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    public Payout setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * La suma de sus transferencias, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public Payout setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public Payout setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Siempre MXN: las transferencias SPEI son en pesos.
     */
    public String getCurrency() {
        return currency;
    }

    public Payout setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * La nota para quien lo revisa, o null.
     */
    public String getNote() {
        return note;
    }

    public Payout setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * De dónde salió: app, api, assistant (un asistente como ChatGPT o Claude), rule (una regla que paga sola) o recurring (un pago recurrente).
     * <p>
     * Valores: app, api, assistant, rule, recurring.
     */
    public String getSource() {
        return source;
    }

    public Payout setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El pago recurrente (pym_…) que lo hizo, o null.
     */
    public String getPayoutMandate() {
        return payoutMandate;
    }

    public Payout setPayoutMandate(String payoutMandate) {
        this.payoutMandate = payoutMandate;
        return this;
    }

    /**
     * required: cuántas firmas pide (null mientras es borrador); given: cuántas personas ya firmaron. La API nunca firma.
     */
    public PayoutSignatures getSignatures() {
        return signatures;
    }

    public Payout setSignatures(PayoutSignatures signatures) {
        this.signatures = signatures;
        return this;
    }

    /**
     * Dónde lo revisa y lo firma alguien del equipo, en la app.
     */
    public String getAppUrl() {
        return appUrl;
    }

    public Payout setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }

    /**
     * Sus transferencias, una por proveedor y cuenta.
     */
    public List<PayoutTransfer> getTransfers() {
        return transfers;
    }

    public Payout setTransfers(List<PayoutTransfer> transfers) {
        this.transfers = transfers;
        return this;
    }

    /**
     * Por qué se canceló, o null.
     */
    public String getCancelReason() {
        return cancelReason;
    }

    public Payout setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * true si lo preparó la API.
     */
    public Boolean getCreatedByApi() {
        return createdByApi;
    }

    public Payout setCreatedByApi(Boolean createdByApi) {
        this.createdByApi = createdByApi;
        return this;
    }

    /**
     * Cuándo se preparó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Payout setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo tuvo todas sus firmas, o null.
     */
    public String getApprovedAt() {
        return approvedAt;
    }

    public Payout setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    /**
     * Cuándo empezaron a salir sus transferencias, o null.
     */
    public String getSentAt() {
        return sentAt;
    }

    public Payout setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Cuándo terminó (todas llegaron o se resolvieron), o null.
     */
    public String getSettledAt() {
        return settledAt;
    }

    public Payout setSettledAt(String settledAt) {
        this.settledAt = settledAt;
        return this;
    }

    /**
     * Cuándo se canceló, o null.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public Payout setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }
}
