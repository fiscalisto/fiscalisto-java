// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatInvoicePaidOtherwise: SatInvoicePaidOtherwise.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatInvoicePaidOtherwise {
    /**
     * true: una PPD pagada sin complemento, fuera de Por pagar. false: una PUE, ya pagada, con su origen del dinero.
     */
    @JsonProperty("without_complement")
    private Boolean withoutComplement;

    /**
     * El día en que se pagó (AAAA-MM-DD), si se dijo.
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * Con qué se pagó: clave c_FormaPago (01 efectivo, 03 transferencia…).
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * De dónde salió el dinero: petty_cash (caja chica), reimbursement (una persona, que después se le reembolsó), bank u other.
     * <p>
     * Valores: petty_cash, reimbursement, bank, other.
     */
    @JsonProperty("money_source")
    private String moneySource;

    /**
     * true cuando la marcó una regla de Ajustes › Pagos sin complemento.
     */
    @JsonProperty("by_rule")
    private Boolean byRule;

    /**
     * true: una PPD pagada sin complemento, fuera de Por pagar. false: una PUE, ya pagada, con su origen del dinero.
     */
    public Boolean getWithoutComplement() {
        return withoutComplement;
    }

    public SatInvoicePaidOtherwise setWithoutComplement(Boolean withoutComplement) {
        this.withoutComplement = withoutComplement;
        return this;
    }

    /**
     * El día en que se pagó (AAAA-MM-DD), si se dijo.
     */
    public String getPaidOn() {
        return paidOn;
    }

    public SatInvoicePaidOtherwise setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * Con qué se pagó: clave c_FormaPago (01 efectivo, 03 transferencia…).
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public SatInvoicePaidOtherwise setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * De dónde salió el dinero: petty_cash (caja chica), reimbursement (una persona, que después se le reembolsó), bank u other.
     * <p>
     * Valores: petty_cash, reimbursement, bank, other.
     */
    public String getMoneySource() {
        return moneySource;
    }

    public SatInvoicePaidOtherwise setMoneySource(String moneySource) {
        this.moneySource = moneySource;
        return this;
    }

    /**
     * true cuando la marcó una regla de Ajustes › Pagos sin complemento.
     */
    public Boolean getByRule() {
        return byRule;
    }

    public SatInvoicePaidOtherwise setByRule(Boolean byRule) {
        this.byRule = byRule;
        return this;
    }
}
