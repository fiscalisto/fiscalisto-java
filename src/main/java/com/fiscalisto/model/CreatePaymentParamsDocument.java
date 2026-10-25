// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePaymentParamsDocument: CreatePaymentParamsDocument.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePaymentParamsDocument {
    /**
     * La factura (inv_… o su UUID).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Lo que se paga de esa factura (ImpPagado), en la moneda de la factura.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Solo si la factura es de otra moneda que el pago: lo que recibió por ella en la moneda del pago. Fiscalisto calcula la equivalencia (EquivalenciaDR).
     */
    @JsonProperty("received")
    private BigDecimal received;

    /**
     * La factura (inv_… o su UUID).
     * <p>
     * Obligatorio.
     */
    public String getInvoice() {
        return invoice;
    }

    public CreatePaymentParamsDocument setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Lo que se paga de esa factura (ImpPagado), en la moneda de la factura.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreatePaymentParamsDocument setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CreatePaymentParamsDocument setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Solo si la factura es de otra moneda que el pago: lo que recibió por ella en la moneda del pago. Fiscalisto calcula la equivalencia (EquivalenciaDR).
     */
    public BigDecimal getReceived() {
        return received;
    }

    public CreatePaymentParamsDocument setReceived(BigDecimal received) {
        this.received = received;
        return this;
    }

    public CreatePaymentParamsDocument setReceived(double received) {
        return setReceived(BigDecimal.valueOf(received));
    }
}
