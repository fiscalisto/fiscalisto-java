// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CrossChecksTaxRegimesInvoicedItem: CrossChecksTaxRegimesInvoicedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksTaxRegimesInvoicedItem {
    /**
     * El régimen (c_RegimenFiscal).
     */
    @JsonProperty("tax_regime")
    private String taxRegime;

    /**
     * Cuántos CFDI lo llevan (ingreso, egreso y pago, sin cancelados).
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * La fecha del primero (AAAA-MM-DD).
     */
    @JsonProperty("first_date")
    private String firstDate;

    /**
     * La fecha del último (AAAA-MM-DD).
     */
    @JsonProperty("last_date")
    private String lastDate;

    /**
     * Si el régimen está en su constancia; null si no se capturaron los regímenes de la constancia.
     */
    @JsonProperty("registered")
    private Boolean registered;

    /**
     * El régimen (c_RegimenFiscal).
     */
    public String getTaxRegime() {
        return taxRegime;
    }

    public CrossChecksTaxRegimesInvoicedItem setTaxRegime(String taxRegime) {
        this.taxRegime = taxRegime;
        return this;
    }

    /**
     * Cuántos CFDI lo llevan (ingreso, egreso y pago, sin cancelados).
     */
    public Long getInvoices() {
        return invoices;
    }

    public CrossChecksTaxRegimesInvoicedItem setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public CrossChecksTaxRegimesInvoicedItem setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * La fecha del primero (AAAA-MM-DD).
     */
    public String getFirstDate() {
        return firstDate;
    }

    public CrossChecksTaxRegimesInvoicedItem setFirstDate(String firstDate) {
        this.firstDate = firstDate;
        return this;
    }

    /**
     * La fecha del último (AAAA-MM-DD).
     */
    public String getLastDate() {
        return lastDate;
    }

    public CrossChecksTaxRegimesInvoicedItem setLastDate(String lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    /**
     * Si el régimen está en su constancia; null si no se capturaron los regímenes de la constancia.
     */
    public Boolean getRegistered() {
        return registered;
    }

    public CrossChecksTaxRegimesInvoicedItem setRegistered(Boolean registered) {
        this.registered = registered;
        return this;
    }
}
