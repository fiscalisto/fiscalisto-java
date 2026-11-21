// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayableInvoiceEarlyPayment: PayableInvoiceEarlyPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayableInvoiceEarlyPayment {
    /**
     * requested: el proveedor lo pidió en el portal y nadie lo ha decidido; accepted: se aceptó.
     * <p>
     * Valores: requested, accepted.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El día en que se paga (AAAA-MM-DD).
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * El descuento por pagar antes.
     */
    @JsonProperty("discount")
    private BigDecimal discount;

    /**
     * Lo del descuento que su nota de crédito aún no cubre. Ya está fuera de amount_due.
     */
    @JsonProperty("discount_pending")
    private BigDecimal discountPending;

    /**
     * requested: el proveedor lo pidió en el portal y nadie lo ha decidido; accepted: se aceptó.
     * <p>
     * Valores: requested, accepted.
     */
    public String getStatus() {
        return status;
    }

    public PayableInvoiceEarlyPayment setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El día en que se paga (AAAA-MM-DD).
     */
    public String getPayOn() {
        return payOn;
    }

    public PayableInvoiceEarlyPayment setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * El descuento por pagar antes.
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public PayableInvoiceEarlyPayment setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    @JsonIgnore
    public PayableInvoiceEarlyPayment setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * Lo del descuento que su nota de crédito aún no cubre. Ya está fuera de amount_due.
     */
    public BigDecimal getDiscountPending() {
        return discountPending;
    }

    public PayableInvoiceEarlyPayment setDiscountPending(BigDecimal discountPending) {
        this.discountPending = discountPending;
        return this;
    }

    @JsonIgnore
    public PayableInvoiceEarlyPayment setDiscountPending(double discountPending) {
        return setDiscountPending(BigDecimal.valueOf(discountPending));
    }
}
