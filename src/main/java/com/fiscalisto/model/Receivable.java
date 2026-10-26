// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Receivable: Lo que un cliente le debe a un emisor en una moneda, de sus facturas abiertas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Receivable {
    /**
     * El RFC y la moneda (RFC:MXN): para starting_after.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El cliente que debe.
     */
    @JsonProperty("customer")
    private ReceivableCustomer customer;

    /**
     * La moneda de esas facturas.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Lo que debe en total, en esa moneda.
     */
    @JsonProperty("amount_due")
    private BigDecimal amountDue;

    /**
     * Cuántas facturas tiene abiertas.
     */
    @JsonProperty("open_invoices")
    private Long openInvoices;

    /**
     * La fecha (AAAA-MM-DD) de su factura abierta más antigua.
     */
    @JsonProperty("oldest_invoice_date")
    private String oldestInvoiceDate;

    /**
     * El RFC y la moneda (RFC:MXN): para starting_after.
     */
    public String getId() {
        return id;
    }

    public Receivable setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Receivable setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Receivable setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public Receivable setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El cliente que debe.
     */
    public ReceivableCustomer getCustomer() {
        return customer;
    }

    public Receivable setCustomer(ReceivableCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * La moneda de esas facturas.
     */
    public String getCurrency() {
        return currency;
    }

    public Receivable setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Lo que debe en total, en esa moneda.
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public Receivable setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    @JsonIgnore
    public Receivable setAmountDue(double amountDue) {
        return setAmountDue(BigDecimal.valueOf(amountDue));
    }

    /**
     * Cuántas facturas tiene abiertas.
     */
    public Long getOpenInvoices() {
        return openInvoices;
    }

    public Receivable setOpenInvoices(Long openInvoices) {
        this.openInvoices = openInvoices;
        return this;
    }

    @JsonIgnore
    public Receivable setOpenInvoices(long openInvoices) {
        return setOpenInvoices(Long.valueOf(openInvoices));
    }

    /**
     * La fecha (AAAA-MM-DD) de su factura abierta más antigua.
     */
    public String getOldestInvoiceDate() {
        return oldestInvoiceDate;
    }

    public Receivable setOldestInvoiceDate(String oldestInvoiceDate) {
        this.oldestInvoiceDate = oldestInvoiceDate;
        return this;
    }
}
