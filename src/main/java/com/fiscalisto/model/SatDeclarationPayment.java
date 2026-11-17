// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatDeclarationPayment: SatDeclarationPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationPayment {
    /**
     * paid, unpaid (algo a pagar que el SAT no tenía pagado), overdue (igual, línea de captura vencida), nothing_to_pay o unchecked.
     * <p>
     * Valores: paid, unpaid, overdue, nothing_to_pay, unchecked.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El día del pago más reciente (AAAA-MM-DD).
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * Lo pagado, en pesos (la suma de los pagos).
     */
    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;

    /**
     * El banco del pago más reciente.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * Cuándo se buscó por última vez en «Declaraciones pagadas».
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Cada pago como el SAT lo registró del banco.
     */
    @JsonProperty("payments")
    private List<SatDeclarationPaymentPayment> payments;

    /**
     * paid, unpaid (algo a pagar que el SAT no tenía pagado), overdue (igual, línea de captura vencida), nothing_to_pay o unchecked.
     * <p>
     * Valores: paid, unpaid, overdue, nothing_to_pay, unchecked.
     */
    public String getStatus() {
        return status;
    }

    public SatDeclarationPayment setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El día del pago más reciente (AAAA-MM-DD).
     */
    public String getPaidOn() {
        return paidOn;
    }

    public SatDeclarationPayment setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * Lo pagado, en pesos (la suma de los pagos).
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public SatDeclarationPayment setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    @JsonIgnore
    public SatDeclarationPayment setAmountPaid(double amountPaid) {
        return setAmountPaid(BigDecimal.valueOf(amountPaid));
    }

    /**
     * El banco del pago más reciente.
     */
    public String getBank() {
        return bank;
    }

    public SatDeclarationPayment setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Cuándo se buscó por última vez en «Declaraciones pagadas».
     */
    public String getCheckedAt() {
        return checkedAt;
    }

    public SatDeclarationPayment setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    /**
     * Cada pago como el SAT lo registró del banco.
     */
    public List<SatDeclarationPaymentPayment> getPayments() {
        return payments;
    }

    public SatDeclarationPayment setPayments(List<SatDeclarationPaymentPayment> payments) {
        this.payments = payments;
        return this;
    }
}
