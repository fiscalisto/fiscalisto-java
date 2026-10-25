// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Ticket: Una venta que su comprador puede facturar él mismo en el portal del emisor (autofactura).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * El emisor que vendió.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El folio de la venta en su sistema.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Lo que su comprador escribe en el portal junto con el total: el folio y 4 caracteres al azar (A123-K7QX). Imprímalo en el ticket o mándelo con la compra.
     */
    @JsonProperty("code")
    private String code;

    /**
     * pending (se puede facturar), invoiced (su comprador lo facturó: la factura en invoice), global (entró en la factura global del periodo) o cancelled.
     * <p>
     * Valores: pending, invoiced, global, cancelled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La página del portal con el código ya escrito: el comprador pone el total y sus datos. Puede incrustarla con fiscalisto.js. null si ya no está pendiente.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Lo que se cobró, impuestos incluidos y sin propina.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La propina (no va en la factura).
     */
    @JsonProperty("tip")
    private BigDecimal tip;

    /**
     * c_FormaPago de la venta.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * El concepto de la factura.
     */
    @JsonProperty("description")
    private String description;

    /**
     * c_ClaveProdServ del concepto.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Cuándo se vendió.
     */
    @JsonProperty("sold_at")
    private String soldAt;

    /**
     * El último día (AAAA-MM-DD) en que el comprador puede facturarlo; después entra en la factura global.
     */
    @JsonProperty("invoiceable_until")
    private String invoiceableUntil;

    /**
     * La factura (inv_…) que hizo su comprador, o null.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * La factura global (inv_…) en que entró, o null.
     */
    @JsonProperty("global_invoice")
    private String globalInvoice;

    /**
     * A quién se facturó, o null.
     */
    @JsonProperty("customer")
    private TicketCustomer customer;

    /**
     * Cuándo se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Ticket setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Ticket setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Ticket setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor que vendió.
     */
    public String getIssuer() {
        return issuer;
    }

    public Ticket setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El folio de la venta en su sistema.
     */
    public String getFolio() {
        return folio;
    }

    public Ticket setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Lo que su comprador escribe en el portal junto con el total: el folio y 4 caracteres al azar (A123-K7QX). Imprímalo en el ticket o mándelo con la compra.
     */
    public String getCode() {
        return code;
    }

    public Ticket setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * pending (se puede facturar), invoiced (su comprador lo facturó: la factura en invoice), global (entró en la factura global del periodo) o cancelled.
     * <p>
     * Valores: pending, invoiced, global, cancelled.
     */
    public String getStatus() {
        return status;
    }

    public Ticket setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La página del portal con el código ya escrito: el comprador pone el total y sus datos. Puede incrustarla con fiscalisto.js. null si ya no está pendiente.
     */
    public String getUrl() {
        return url;
    }

    public Ticket setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Lo que se cobró, impuestos incluidos y sin propina.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public Ticket setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public Ticket setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La propina (no va en la factura).
     */
    public BigDecimal getTip() {
        return tip;
    }

    public Ticket setTip(BigDecimal tip) {
        this.tip = tip;
        return this;
    }

    public Ticket setTip(double tip) {
        return setTip(BigDecimal.valueOf(tip));
    }

    /**
     * c_FormaPago de la venta.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public Ticket setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * El concepto de la factura.
     */
    public String getDescription() {
        return description;
    }

    public Ticket setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * c_ClaveProdServ del concepto.
     */
    public String getProductKey() {
        return productKey;
    }

    public Ticket setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Cuándo se vendió.
     */
    public String getSoldAt() {
        return soldAt;
    }

    public Ticket setSoldAt(String soldAt) {
        this.soldAt = soldAt;
        return this;
    }

    /**
     * El último día (AAAA-MM-DD) en que el comprador puede facturarlo; después entra en la factura global.
     */
    public String getInvoiceableUntil() {
        return invoiceableUntil;
    }

    public Ticket setInvoiceableUntil(String invoiceableUntil) {
        this.invoiceableUntil = invoiceableUntil;
        return this;
    }

    /**
     * La factura (inv_…) que hizo su comprador, o null.
     */
    public String getInvoice() {
        return invoice;
    }

    public Ticket setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * La factura global (inv_…) en que entró, o null.
     */
    public String getGlobalInvoice() {
        return globalInvoice;
    }

    public Ticket setGlobalInvoice(String globalInvoice) {
        this.globalInvoice = globalInvoice;
        return this;
    }

    /**
     * A quién se facturó, o null.
     */
    public TicketCustomer getCustomer() {
        return customer;
    }

    public Ticket setCustomer(TicketCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Cuándo se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Ticket setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
