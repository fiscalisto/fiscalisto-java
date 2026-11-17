// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatDeclarationPaymentPayment: SatDeclarationPaymentPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationPaymentPayment {
    /**
     * La institución de crédito.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * El día del pago (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * La línea de captura pagada.
     */
    @JsonProperty("payment_line")
    private String paymentLine;

    /**
     * Cómo se pagó, como lo dice el SAT («Ventanilla», «Internet»).
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * El importe pagado.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El número de operación del banco.
     */
    @JsonProperty("bank_operation_number")
    private String bankOperationNumber;

    /**
     * La llave de pago.
     */
    @JsonProperty("payment_key")
    private String paymentKey;

    /**
     * La institución de crédito.
     */
    public String getBank() {
        return bank;
    }

    public SatDeclarationPaymentPayment setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * El día del pago (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public SatDeclarationPaymentPayment setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * La línea de captura pagada.
     */
    public String getPaymentLine() {
        return paymentLine;
    }

    public SatDeclarationPaymentPayment setPaymentLine(String paymentLine) {
        this.paymentLine = paymentLine;
        return this;
    }

    /**
     * Cómo se pagó, como lo dice el SAT («Ventanilla», «Internet»).
     */
    public String getChannel() {
        return channel;
    }

    public SatDeclarationPaymentPayment setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * El importe pagado.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatDeclarationPaymentPayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatDeclarationPaymentPayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El número de operación del banco.
     */
    public String getBankOperationNumber() {
        return bankOperationNumber;
    }

    public SatDeclarationPaymentPayment setBankOperationNumber(String bankOperationNumber) {
        this.bankOperationNumber = bankOperationNumber;
        return this;
    }

    /**
     * La llave de pago.
     */
    public String getPaymentKey() {
        return paymentKey;
    }

    public SatDeclarationPaymentPayment setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
        return this;
    }
}
