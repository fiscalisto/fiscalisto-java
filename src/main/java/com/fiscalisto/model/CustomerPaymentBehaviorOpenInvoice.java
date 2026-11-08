// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CustomerPaymentBehaviorOpenInvoice: CustomerPaymentBehaviorOpenInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehaviorOpenInvoice {
    /**
     * El UUID (folio fiscal) de la factura.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Su fecha (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * PPD a crédito; PUE que le pagan este mes.
     * <p>
     * Valores: PPD, PUE.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * Lo que falta, en pesos.
     */
    @JsonProperty("amount_due")
    private BigDecimal amountDue;

    /**
     * Cuándo vence: su fecha más los días de crédito (una PUE, al fin de su mes).
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Cuándo le llegaría: su fecha más lo que el cliente suele tardar (sin historial, el vencimiento).
     */
    @JsonProperty("expected_payment_date")
    private String expectedPaymentDate;

    /**
     * El UUID (folio fiscal) de la factura.
     */
    public String getUuid() {
        return uuid;
    }

    public CustomerPaymentBehaviorOpenInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Su fecha (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CustomerPaymentBehaviorOpenInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * PPD a crédito; PUE que le pagan este mes.
     * <p>
     * Valores: PPD, PUE.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public CustomerPaymentBehaviorOpenInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Lo que falta, en pesos.
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public CustomerPaymentBehaviorOpenInvoice setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorOpenInvoice setAmountDue(double amountDue) {
        return setAmountDue(BigDecimal.valueOf(amountDue));
    }

    /**
     * Cuándo vence: su fecha más los días de crédito (una PUE, al fin de su mes).
     */
    public String getDueDate() {
        return dueDate;
    }

    public CustomerPaymentBehaviorOpenInvoice setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Cuándo le llegaría: su fecha más lo que el cliente suele tardar (sin historial, el vencimiento).
     */
    public String getExpectedPaymentDate() {
        return expectedPaymentDate;
    }

    public CustomerPaymentBehaviorOpenInvoice setExpectedPaymentDate(String expectedPaymentDate) {
        this.expectedPaymentDate = expectedPaymentDate;
        return this;
    }
}
