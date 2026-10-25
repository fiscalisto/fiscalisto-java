// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplyAdvanceParamsRemainder: Cómo se paga lo que falta del anticipo: ahora con su forma de pago, o después (PPD).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplyAdvanceParamsRemainder {
    /**
     * true si lo que falta se paga ahora (PUE); false si después (PPD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("paid_now")
    private Boolean paidNow;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * true si lo que falta se paga ahora (PUE); false si después (PPD).
     * <p>
     * Obligatorio.
     */
    public Boolean getPaidNow() {
        return paidNow;
    }

    public ApplyAdvanceParamsRemainder setPaidNow(Boolean paidNow) {
        this.paidNow = paidNow;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public ApplyAdvanceParamsRemainder setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }
}
