// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkSatInvoicePaidParams: los campos de «Marcar como pagada una factura recibida».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkSatInvoicePaidParams {
    /**
     * El día en que se pagó (AAAA-MM-DD, no después de hoy). En una PPD, si no se indica, queda sin fecha; en una PUE, la fecha de la factura.
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * Solo PPD: con qué se pagó, clave c_FormaPago (01 efectivo, 02 cheque nominativo, 03 transferencia…). Una PUE ya dice la suya.
     * <p>
     * Valores: 12, 13, 14, 15, 17, 23, 24, 25, 26, 27, 28, 29, 30, 31, 01, 02, 03, 04, 05, 06, 08.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * De dónde salió el dinero: petty_cash (caja chica), reimbursement (lo pagó una persona y se le reembolsó), bank u other. Obligatorio en una PUE.
     * <p>
     * Valores: petty_cash, reimbursement, bank, other.
     */
    @JsonProperty("money_source")
    private String moneySource;

    /**
     * Una nota, hasta 500 caracteres.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El día en que se pagó (AAAA-MM-DD, no después de hoy). En una PPD, si no se indica, queda sin fecha; en una PUE, la fecha de la factura.
     */
    public String getPaidOn() {
        return paidOn;
    }

    public MarkSatInvoicePaidParams setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * Solo PPD: con qué se pagó, clave c_FormaPago (01 efectivo, 02 cheque nominativo, 03 transferencia…). Una PUE ya dice la suya.
     * <p>
     * Valores: 12, 13, 14, 15, 17, 23, 24, 25, 26, 27, 28, 29, 30, 31, 01, 02, 03, 04, 05, 06, 08.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public MarkSatInvoicePaidParams setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * De dónde salió el dinero: petty_cash (caja chica), reimbursement (lo pagó una persona y se le reembolsó), bank u other. Obligatorio en una PUE.
     * <p>
     * Valores: petty_cash, reimbursement, bank, other.
     */
    public String getMoneySource() {
        return moneySource;
    }

    public MarkSatInvoicePaidParams setMoneySource(String moneySource) {
        this.moneySource = moneySource;
        return this;
    }

    /**
     * Una nota, hasta 500 caracteres.
     */
    public String getNote() {
        return note;
    }

    public MarkSatInvoicePaidParams setNote(String note) {
        this.note = note;
        return this;
    }
}
