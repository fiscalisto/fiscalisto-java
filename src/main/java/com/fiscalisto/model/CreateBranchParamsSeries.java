// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBranchParamsSeries: La serie de cada tipo de CFDI que se timbra desde ella (invoice, credit_note, payment, transfer), hasta 25 caracteres cada una; la que no mande usa la del emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBranchParamsSeries {
    /**
     * Serie de sus facturas (tipo I); sin ella, la del emisor.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Serie de sus notas de crédito (tipo E); sin ella, la del emisor.
     */
    @JsonProperty("credit_note")
    private String creditNote;

    /**
     * Serie de sus complementos de pago (tipo P); sin ella, la del emisor.
     */
    @JsonProperty("payment")
    private String payment;

    /**
     * Serie de sus traslados (tipo T); sin ella, la del emisor.
     */
    @JsonProperty("transfer")
    private String transfer;

    /**
     * Serie de sus facturas (tipo I); sin ella, la del emisor.
     */
    public String getInvoice() {
        return invoice;
    }

    public CreateBranchParamsSeries setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Serie de sus notas de crédito (tipo E); sin ella, la del emisor.
     */
    public String getCreditNote() {
        return creditNote;
    }

    public CreateBranchParamsSeries setCreditNote(String creditNote) {
        this.creditNote = creditNote;
        return this;
    }

    /**
     * Serie de sus complementos de pago (tipo P); sin ella, la del emisor.
     */
    public String getPayment() {
        return payment;
    }

    public CreateBranchParamsSeries setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Serie de sus traslados (tipo T); sin ella, la del emisor.
     */
    public String getTransfer() {
        return transfer;
    }

    public CreateBranchParamsSeries setTransfer(String transfer) {
        this.transfer = transfer;
        return this;
    }
}
