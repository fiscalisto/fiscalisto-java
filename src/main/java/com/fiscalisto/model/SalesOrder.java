// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SalesOrder: Un pedido de venta: lo que su cliente pidió, cómo se entrega (remisiones) y cómo se factura y se cobra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrder {
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
     * Su serie y folio (PED-12).
     */
    @JsonProperty("number")
    private String number;

    /**
     * draft (borrador), confirmed, partially_delivered, delivered (todo entregado), invoiced (todo facturado), paid (sus facturas pagadas), closed (se dio por terminado) o canceled. Cambia solo, con lo que pasa.
     * <p>
     * Valores: draft, confirmed, partially_delivered, delivered, invoiced, paid, closed, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La etapa del negocio en que va («Por empacar», «En ruta»…), o null. Se elige en la app.
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * La liga donde su cliente ve el pedido, lo confirma, firma cada entrega y abre sus facturas. null mientras sea borrador o no se haya mandado.
     */
    @JsonProperty("url")
    private String url;

    /**
     * El cliente: su RFC, nombre, correo y su id en su catálogo.
     */
    @JsonProperty("customer")
    private SalesOrderCustomer customer;

    /**
     * El número de orden de compra de su cliente, o null.
     */
    @JsonProperty("customer_po")
    private String customerPo;

    /**
     * La cotización (quo_…) de donde salió, o null.
     */
    @JsonProperty("quote")
    private String quote;

    /**
     * La moneda.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Los conceptos: id (para entregar o facturar una parte), lo pedido, lo entregado, lo facturado y lo que ya no se entregará (canceled). goods es true cuando sale del almacén.
     */
    @JsonProperty("items")
    private List<SalesOrderItem> items;

    /**
     * El subtotal, sin impuestos.
     */
    @JsonProperty("subtotal")
    private BigDecimal subtotal;

    /**
     * El total con impuestos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La suma de sus facturas timbradas (sin las canceladas).
     */
    @JsonProperty("invoiced_total")
    private BigDecimal invoicedTotal;

    /**
     * Lo que ya se pagó de esas facturas.
     */
    @JsonProperty("paid_total")
    private BigDecimal paidTotal;

    /**
     * La entrega estimada (AAAA-MM-DD), o null.
     */
    @JsonProperty("expected_on")
    private String expectedOn;

    /**
     * Días de crédito: cada factura vence esos días después de su fecha.
     */
    @JsonProperty("payment_days")
    private Long paymentDays;

    /**
     * delivered: cada factura lleva lo ya entregado; ordered: se factura lo pedido, entregado o no.
     * <p>
     * Valores: delivered, ordered.
     */
    @JsonProperty("invoice_policy")
    private String invoicePolicy;

    /**
     * Dónde se entrega, o null.
     */
    @JsonProperty("ship_to")
    private String shipTo;

    /**
     * Las condiciones impresas en el pedido, o null.
     */
    @JsonProperty("terms")
    private String terms;

    /**
     * Las notas, como las de una factura.
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * La nota interna (su cliente no la ve), o null.
     */
    @JsonProperty("internal_note")
    private String internalNote;

    /**
     * Sus entregas, cada una con su remisión.
     */
    @JsonProperty("deliveries")
    private List<SalesOrderDelivery> deliveries;

    /**
     * Sus facturas timbradas (inv_…), con lo que falta por pagar de cada una (balance).
     */
    @JsonProperty("invoices")
    private List<SalesOrderInvoice> invoices;

    /**
     * Cuándo su cliente lo confirmó en su liga, o null.
     */
    @JsonProperty("customer_confirmed_at")
    private String customerConfirmedAt;

    /**
     * Cuándo se mandó, o null.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Cuándo su cliente abrió la liga por primera vez, o null.
     */
    @JsonProperty("viewed_at")
    private String viewedAt;

    /**
     * Cuándo se confirmó, o null.
     */
    @JsonProperty("confirmed_at")
    private String confirmedAt;

    /**
     * Cuándo quedó todo entregado, o null.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Cuándo quedó todo facturado, o null.
     */
    @JsonProperty("invoiced_at")
    private String invoicedAt;

    /**
     * Cuándo quedaron pagadas sus facturas, o null.
     */
    @JsonProperty("paid_at")
    private String paidAt;

    /**
     * Cuándo se cerró, o null.
     */
    @JsonProperty("closed_at")
    private String closedAt;

    /**
     * Cuándo se canceló, o null.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * Por qué se canceló, o null.
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

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

    public SalesOrder setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SalesOrder setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SalesOrder setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public SalesOrder setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su serie y folio (PED-12).
     */
    public String getNumber() {
        return number;
    }

    public SalesOrder setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * draft (borrador), confirmed, partially_delivered, delivered (todo entregado), invoiced (todo facturado), paid (sus facturas pagadas), closed (se dio por terminado) o canceled. Cambia solo, con lo que pasa.
     * <p>
     * Valores: draft, confirmed, partially_delivered, delivered, invoiced, paid, closed, canceled.
     */
    public String getStatus() {
        return status;
    }

    public SalesOrder setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La etapa del negocio en que va («Por empacar», «En ruta»…), o null. Se elige en la app.
     */
    public String getStage() {
        return stage;
    }

    public SalesOrder setStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * La liga donde su cliente ve el pedido, lo confirma, firma cada entrega y abre sus facturas. null mientras sea borrador o no se haya mandado.
     */
    public String getUrl() {
        return url;
    }

    public SalesOrder setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * El cliente: su RFC, nombre, correo y su id en su catálogo.
     */
    public SalesOrderCustomer getCustomer() {
        return customer;
    }

    public SalesOrder setCustomer(SalesOrderCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * El número de orden de compra de su cliente, o null.
     */
    public String getCustomerPo() {
        return customerPo;
    }

    public SalesOrder setCustomerPo(String customerPo) {
        this.customerPo = customerPo;
        return this;
    }

    /**
     * La cotización (quo_…) de donde salió, o null.
     */
    public String getQuote() {
        return quote;
    }

    public SalesOrder setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * La moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public SalesOrder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Los conceptos: id (para entregar o facturar una parte), lo pedido, lo entregado, lo facturado y lo que ya no se entregará (canceled). goods es true cuando sale del almacén.
     */
    public List<SalesOrderItem> getItems() {
        return items;
    }

    public SalesOrder setItems(List<SalesOrderItem> items) {
        this.items = items;
        return this;
    }

    /**
     * El subtotal, sin impuestos.
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public SalesOrder setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    @JsonIgnore
    public SalesOrder setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * El total con impuestos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SalesOrder setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SalesOrder setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La suma de sus facturas timbradas (sin las canceladas).
     */
    public BigDecimal getInvoicedTotal() {
        return invoicedTotal;
    }

    public SalesOrder setInvoicedTotal(BigDecimal invoicedTotal) {
        this.invoicedTotal = invoicedTotal;
        return this;
    }

    @JsonIgnore
    public SalesOrder setInvoicedTotal(double invoicedTotal) {
        return setInvoicedTotal(BigDecimal.valueOf(invoicedTotal));
    }

    /**
     * Lo que ya se pagó de esas facturas.
     */
    public BigDecimal getPaidTotal() {
        return paidTotal;
    }

    public SalesOrder setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
        return this;
    }

    @JsonIgnore
    public SalesOrder setPaidTotal(double paidTotal) {
        return setPaidTotal(BigDecimal.valueOf(paidTotal));
    }

    /**
     * La entrega estimada (AAAA-MM-DD), o null.
     */
    public String getExpectedOn() {
        return expectedOn;
    }

    public SalesOrder setExpectedOn(String expectedOn) {
        this.expectedOn = expectedOn;
        return this;
    }

    /**
     * Días de crédito: cada factura vence esos días después de su fecha.
     */
    public Long getPaymentDays() {
        return paymentDays;
    }

    public SalesOrder setPaymentDays(Long paymentDays) {
        this.paymentDays = paymentDays;
        return this;
    }

    @JsonIgnore
    public SalesOrder setPaymentDays(long paymentDays) {
        return setPaymentDays(Long.valueOf(paymentDays));
    }

    /**
     * delivered: cada factura lleva lo ya entregado; ordered: se factura lo pedido, entregado o no.
     * <p>
     * Valores: delivered, ordered.
     */
    public String getInvoicePolicy() {
        return invoicePolicy;
    }

    public SalesOrder setInvoicePolicy(String invoicePolicy) {
        this.invoicePolicy = invoicePolicy;
        return this;
    }

    /**
     * Dónde se entrega, o null.
     */
    public String getShipTo() {
        return shipTo;
    }

    public SalesOrder setShipTo(String shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Las condiciones impresas en el pedido, o null.
     */
    public String getTerms() {
        return terms;
    }

    public SalesOrder setTerms(String terms) {
        this.terms = terms;
        return this;
    }

    /**
     * Las notas, como las de una factura.
     */
    public String getNotes() {
        return notes;
    }

    public SalesOrder setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * La nota interna (su cliente no la ve), o null.
     */
    public String getInternalNote() {
        return internalNote;
    }

    public SalesOrder setInternalNote(String internalNote) {
        this.internalNote = internalNote;
        return this;
    }

    /**
     * Sus entregas, cada una con su remisión.
     */
    public List<SalesOrderDelivery> getDeliveries() {
        return deliveries;
    }

    public SalesOrder setDeliveries(List<SalesOrderDelivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     * Sus facturas timbradas (inv_…), con lo que falta por pagar de cada una (balance).
     */
    public List<SalesOrderInvoice> getInvoices() {
        return invoices;
    }

    public SalesOrder setInvoices(List<SalesOrderInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }

    /**
     * Cuándo su cliente lo confirmó en su liga, o null.
     */
    public String getCustomerConfirmedAt() {
        return customerConfirmedAt;
    }

    public SalesOrder setCustomerConfirmedAt(String customerConfirmedAt) {
        this.customerConfirmedAt = customerConfirmedAt;
        return this;
    }

    /**
     * Cuándo se mandó, o null.
     */
    public String getSentAt() {
        return sentAt;
    }

    public SalesOrder setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Cuándo su cliente abrió la liga por primera vez, o null.
     */
    public String getViewedAt() {
        return viewedAt;
    }

    public SalesOrder setViewedAt(String viewedAt) {
        this.viewedAt = viewedAt;
        return this;
    }

    /**
     * Cuándo se confirmó, o null.
     */
    public String getConfirmedAt() {
        return confirmedAt;
    }

    public SalesOrder setConfirmedAt(String confirmedAt) {
        this.confirmedAt = confirmedAt;
        return this;
    }

    /**
     * Cuándo quedó todo entregado, o null.
     */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    public SalesOrder setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /**
     * Cuándo quedó todo facturado, o null.
     */
    public String getInvoicedAt() {
        return invoicedAt;
    }

    public SalesOrder setInvoicedAt(String invoicedAt) {
        this.invoicedAt = invoicedAt;
        return this;
    }

    /**
     * Cuándo quedaron pagadas sus facturas, o null.
     */
    public String getPaidAt() {
        return paidAt;
    }

    public SalesOrder setPaidAt(String paidAt) {
        this.paidAt = paidAt;
        return this;
    }

    /**
     * Cuándo se cerró, o null.
     */
    public String getClosedAt() {
        return closedAt;
    }

    public SalesOrder setClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Cuándo se canceló, o null.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public SalesOrder setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }

    /**
     * Por qué se canceló, o null.
     */
    public String getCancelReason() {
        return cancelReason;
    }

    public SalesOrder setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SalesOrder setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
