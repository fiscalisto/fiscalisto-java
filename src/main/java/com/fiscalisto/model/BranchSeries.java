// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BranchSeries: La serie de cada tipo de CFDI que se timbra desde ella; null usa la del emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BranchSeries {
    /**
     * Serie de sus facturas (tipo I); null, la del emisor.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Serie de sus notas de crédito (tipo E); null, la del emisor.
     */
    @JsonProperty("credit_note")
    private String creditNote;

    /**
     * Serie de sus complementos de pago (tipo P); null, la del emisor.
     */
    @JsonProperty("payment")
    private String payment;

    /**
     * Serie de sus traslados (tipo T); null, la del emisor.
     */
    @JsonProperty("transfer")
    private String transfer;

    /**
     * Serie de sus facturas (tipo I); null, la del emisor.
     */
    public String getInvoice() {
        return invoice;
    }

    public BranchSeries setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Serie de sus notas de crédito (tipo E); null, la del emisor.
     */
    public String getCreditNote() {
        return creditNote;
    }

    public BranchSeries setCreditNote(String creditNote) {
        this.creditNote = creditNote;
        return this;
    }

    /**
     * Serie de sus complementos de pago (tipo P); null, la del emisor.
     */
    public String getPayment() {
        return payment;
    }

    public BranchSeries setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Serie de sus traslados (tipo T); null, la del emisor.
     */
    public String getTransfer() {
        return transfer;
    }

    public BranchSeries setTransfer(String transfer) {
        this.transfer = transfer;
        return this;
    }
}
