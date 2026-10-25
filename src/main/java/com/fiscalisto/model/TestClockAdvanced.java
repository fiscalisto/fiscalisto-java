// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestClockAdvanced: Al adelantarlo: lo que se hizo en el camino.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestClockAdvanced {
    /**
     * Facturas recurrentes timbradas en el camino.
     */
    @JsonProperty("recurring_invoices")
    private Long recurringInvoices;

    /**
     * Cotizaciones que vencieron en el camino.
     */
    @JsonProperty("quotes_expired")
    private Long quotesExpired;

    /**
     * Facturas globales de tickets timbradas en el camino.
     */
    @JsonProperty("global_invoices")
    private Long globalInvoices;

    /**
     * Facturas recurrentes timbradas en el camino.
     */
    public Long getRecurringInvoices() {
        return recurringInvoices;
    }

    public TestClockAdvanced setRecurringInvoices(Long recurringInvoices) {
        this.recurringInvoices = recurringInvoices;
        return this;
    }

    public TestClockAdvanced setRecurringInvoices(long recurringInvoices) {
        return setRecurringInvoices(Long.valueOf(recurringInvoices));
    }

    /**
     * Cotizaciones que vencieron en el camino.
     */
    public Long getQuotesExpired() {
        return quotesExpired;
    }

    public TestClockAdvanced setQuotesExpired(Long quotesExpired) {
        this.quotesExpired = quotesExpired;
        return this;
    }

    public TestClockAdvanced setQuotesExpired(long quotesExpired) {
        return setQuotesExpired(Long.valueOf(quotesExpired));
    }

    /**
     * Facturas globales de tickets timbradas en el camino.
     */
    public Long getGlobalInvoices() {
        return globalInvoices;
    }

    public TestClockAdvanced setGlobalInvoices(Long globalInvoices) {
        this.globalInvoices = globalInvoices;
        return this;
    }

    public TestClockAdvanced setGlobalInvoices(long globalInvoices) {
        return setGlobalInvoices(Long.valueOf(globalInvoices));
    }
}
