// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateBankTransactionsParamsTransaction: CreateBankTransactionsParamsTransaction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBankTransactionsParamsTransaction {
    /**
     * El día del depósito (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo depositado, en pesos. Los retiros no se mandan.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El concepto del banco, como viene (SPEI, nombre del ordenante…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La referencia o clave de rastreo.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El RFC de quien depositó, si lo sabe (ayuda a sugerir la factura).
     */
    @JsonProperty("payer_tax_id")
    private String payerTaxId;

    /**
     * El día del depósito (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateBankTransactionsParamsTransaction setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Lo depositado, en pesos. Los retiros no se mandan.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateBankTransactionsParamsTransaction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateBankTransactionsParamsTransaction setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El concepto del banco, como viene (SPEI, nombre del ordenante…).
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateBankTransactionsParamsTransaction setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La referencia o clave de rastreo.
     */
    public String getReference() {
        return reference;
    }

    public CreateBankTransactionsParamsTransaction setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El RFC de quien depositó, si lo sabe (ayuda a sugerir la factura).
     */
    public String getPayerTaxId() {
        return payerTaxId;
    }

    public CreateBankTransactionsParamsTransaction setPayerTaxId(String payerTaxId) {
        this.payerTaxId = payerTaxId;
        return this;
    }
}
