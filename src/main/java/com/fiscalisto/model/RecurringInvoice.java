// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * RecurringInvoice: Una factura que el emisor timbra solo, cada mes, semana o día.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurringInvoice {
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
     * Para reconocerla.
     */
    @JsonProperty("name")
    private String name;

    /**
     * active (timbra en cada fecha) o paused.
     * <p>
     * Valores: active, paused.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cada cuánto: frequency (monthly, weekly o daily), interval, day_of_month (con monthly; "last" es el último del mes), y la hora (hour, en time_zone) en que se timbra.
     */
    @JsonProperty("schedule")
    private RecurringInvoiceSchedule schedule;

    /**
     * La fecha (AAAA-MM-DD) de la siguiente factura.
     */
    @JsonProperty("next_invoice_on")
    private String nextInvoiceOn;

    /**
     * La fecha del último periodo que timbró, o null si aún no timbra ninguna.
     */
    @JsonProperty("last_invoiced_on")
    private String lastInvoicedOn;

    /**
     * La última factura (inv_…) que timbró, o null.
     */
    @JsonProperty("last_invoice")
    private String lastInvoice;

    /**
     * Por qué no se pudo timbrar la última vez (sin timbres, el cliente borrado, el SAT la rechazó…), o null. Se vuelve a intentar a la siguiente hora del día siguiente; también llega recurring_invoice.failed.
     */
    @JsonProperty("last_error")
    private RecurringInvoiceLastError lastError;

    /**
     * Si cada factura se manda al correo del cliente.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Si quedaron periodos sin timbrar: all los timbra todos, latest solo el más reciente.
     * <p>
     * Valores: all, latest.
     */
    @JsonProperty("catch_up")
    private String catchUp;

    /**
     * A quién se factura.
     */
    @JsonProperty("customer")
    private RecurringInvoiceCustomer customer;

    /**
     * La moneda de la factura.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Los conceptos, con description tal como se guardó ({mes}, {año}… se llenan en cada factura).
     */
    @JsonProperty("items")
    private List<RecurringInvoiceItem> items;

    /**
     * El total de cada factura con los precios de hoy.
     */
    @JsonProperty("total")
    private BigDecimal total;

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

    public RecurringInvoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public RecurringInvoice setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RecurringInvoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public RecurringInvoice setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Para reconocerla.
     */
    public String getName() {
        return name;
    }

    public RecurringInvoice setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * active (timbra en cada fecha) o paused.
     * <p>
     * Valores: active, paused.
     */
    public String getStatus() {
        return status;
    }

    public RecurringInvoice setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cada cuánto: frequency (monthly, weekly o daily), interval, day_of_month (con monthly; "last" es el último del mes), y la hora (hour, en time_zone) en que se timbra.
     */
    public RecurringInvoiceSchedule getSchedule() {
        return schedule;
    }

    public RecurringInvoice setSchedule(RecurringInvoiceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * La fecha (AAAA-MM-DD) de la siguiente factura.
     */
    public String getNextInvoiceOn() {
        return nextInvoiceOn;
    }

    public RecurringInvoice setNextInvoiceOn(String nextInvoiceOn) {
        this.nextInvoiceOn = nextInvoiceOn;
        return this;
    }

    /**
     * La fecha del último periodo que timbró, o null si aún no timbra ninguna.
     */
    public String getLastInvoicedOn() {
        return lastInvoicedOn;
    }

    public RecurringInvoice setLastInvoicedOn(String lastInvoicedOn) {
        this.lastInvoicedOn = lastInvoicedOn;
        return this;
    }

    /**
     * La última factura (inv_…) que timbró, o null.
     */
    public String getLastInvoice() {
        return lastInvoice;
    }

    public RecurringInvoice setLastInvoice(String lastInvoice) {
        this.lastInvoice = lastInvoice;
        return this;
    }

    /**
     * Por qué no se pudo timbrar la última vez (sin timbres, el cliente borrado, el SAT la rechazó…), o null. Se vuelve a intentar a la siguiente hora del día siguiente; también llega recurring_invoice.failed.
     */
    public RecurringInvoiceLastError getLastError() {
        return lastError;
    }

    public RecurringInvoice setLastError(RecurringInvoiceLastError lastError) {
        this.lastError = lastError;
        return this;
    }

    /**
     * Si cada factura se manda al correo del cliente.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public RecurringInvoice setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Si quedaron periodos sin timbrar: all los timbra todos, latest solo el más reciente.
     * <p>
     * Valores: all, latest.
     */
    public String getCatchUp() {
        return catchUp;
    }

    public RecurringInvoice setCatchUp(String catchUp) {
        this.catchUp = catchUp;
        return this;
    }

    /**
     * A quién se factura.
     */
    public RecurringInvoiceCustomer getCustomer() {
        return customer;
    }

    public RecurringInvoice setCustomer(RecurringInvoiceCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * La moneda de la factura.
     */
    public String getCurrency() {
        return currency;
    }

    public RecurringInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Los conceptos, con description tal como se guardó ({mes}, {año}… se llenan en cada factura).
     */
    public List<RecurringInvoiceItem> getItems() {
        return items;
    }

    public RecurringInvoice setItems(List<RecurringInvoiceItem> items) {
        this.items = items;
        return this;
    }

    /**
     * El total de cada factura con los precios de hoy.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public RecurringInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public RecurringInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public RecurringInvoice setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
