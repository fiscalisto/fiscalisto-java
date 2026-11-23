// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayableInvoiceCreditNotesSubtractedItem: PayableInvoiceCreditNotesSubtractedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayableInvoiceCreditNotesSubtractedItem {
    /**
     * Folio fiscal de la nota de crédito.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Serie y folio de la nota.
     */
    @JsonProperty("series_folio")
    private String seriesFolio;

    /**
     * Su fecha (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo que descuenta, en la moneda de la factura.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Folio fiscal de la nota de crédito.
     */
    public String getUuid() {
        return uuid;
    }

    public PayableInvoiceCreditNotesSubtractedItem setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Serie y folio de la nota.
     */
    public String getSeriesFolio() {
        return seriesFolio;
    }

    public PayableInvoiceCreditNotesSubtractedItem setSeriesFolio(String seriesFolio) {
        this.seriesFolio = seriesFolio;
        return this;
    }

    /**
     * Su fecha (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public PayableInvoiceCreditNotesSubtractedItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Lo que descuenta, en la moneda de la factura.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayableInvoiceCreditNotesSubtractedItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayableInvoiceCreditNotesSubtractedItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
