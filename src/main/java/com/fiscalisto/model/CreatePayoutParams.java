// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreatePayoutParams: los campos de «Preparar un pago a proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayoutParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * Una nota para quien lo revisa y lo firma.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Las facturas recibidas a pagar (de 1 a 500). Las de un mismo proveedor van en una sola transferencia a su cuenta aprobada.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoices")
    private List<CreatePayoutParamsInvoice> invoices;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayoutParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    public String getPayOn() {
        return payOn;
    }

    public CreatePayoutParams setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * Una nota para quien lo revisa y lo firma.
     */
    public String getNote() {
        return note;
    }

    public CreatePayoutParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Las facturas recibidas a pagar (de 1 a 500). Las de un mismo proveedor van en una sola transferencia a su cuenta aprobada.
     * <p>
     * Obligatorio.
     */
    public List<CreatePayoutParamsInvoice> getInvoices() {
        return invoices;
    }

    public CreatePayoutParams setInvoices(List<CreatePayoutParamsInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }
}
