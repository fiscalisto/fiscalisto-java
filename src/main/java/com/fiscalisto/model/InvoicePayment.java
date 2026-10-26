// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePayment: InvoicePayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayment {
    /**
     * Fecha del pago (FechaPago).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Moneda del pago (MonedaP).
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Monto del pago (Monto).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Número de operación del pago (NumOperacion), como el rastreo SPEI.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * Las facturas que paga (DoctoRelacionado).
     */
    @JsonProperty("documents")
    private List<InvoicePaymentDocument> documents;

    /**
     * Fecha del pago (FechaPago).
     */
    public String getDate() {
        return date;
    }

    public InvoicePayment setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public InvoicePayment setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Moneda del pago (MonedaP).
     */
    public String getCurrency() {
        return currency;
    }

    public InvoicePayment setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public InvoicePayment setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public InvoicePayment setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Monto del pago (Monto).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InvoicePayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InvoicePayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Número de operación del pago (NumOperacion), como el rastreo SPEI.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public InvoicePayment setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }

    /**
     * Las facturas que paga (DoctoRelacionado).
     */
    public List<InvoicePaymentDocument> getDocuments() {
        return documents;
    }

    public InvoicePayment setDocuments(List<InvoicePaymentDocument> documents) {
        this.documents = documents;
        return this;
    }
}
