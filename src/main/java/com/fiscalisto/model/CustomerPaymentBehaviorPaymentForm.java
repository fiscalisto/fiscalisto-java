// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CustomerPaymentBehaviorPaymentForm: CustomerPaymentBehaviorPaymentForm.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehaviorPaymentForm {
    /**
     * Clave de forma de pago del SAT (c_FormaPago): 03 transferencia, 02 cheque…
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Lo pagado así, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Su parte de lo pagado (0 a 1).
     */
    @JsonProperty("share")
    private BigDecimal share;

    /**
     * Clave de forma de pago del SAT (c_FormaPago): 03 transferencia, 02 cheque…
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CustomerPaymentBehaviorPaymentForm setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Lo pagado así, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CustomerPaymentBehaviorPaymentForm setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorPaymentForm setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Su parte de lo pagado (0 a 1).
     */
    public BigDecimal getShare() {
        return share;
    }

    public CustomerPaymentBehaviorPaymentForm setShare(BigDecimal share) {
        this.share = share;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorPaymentForm setShare(double share) {
        return setShare(BigDecimal.valueOf(share));
    }
}
