// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePaymentDocument: InvoicePaymentDocument.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePaymentDocument {
    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Serie de la factura pagada.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Folio de la factura pagada.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Moneda de la factura pagada (MonedaDR).
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Número de parcialidad (NumParcialidad).
     */
    @JsonProperty("partiality")
    private Long partiality;

    /**
     * Saldo anterior de la factura (ImpSaldoAnt).
     */
    @JsonProperty("previous_balance")
    private BigDecimal previousBalance;

    /**
     * Lo que se paga de esa factura (ImpPagado), en la moneda de la factura.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Saldo insoluto después de este pago (ImpSaldoInsoluto).
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public InvoicePaymentDocument setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Serie de la factura pagada.
     */
    public String getSeries() {
        return series;
    }

    public InvoicePaymentDocument setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Folio de la factura pagada.
     */
    public String getFolio() {
        return folio;
    }

    public InvoicePaymentDocument setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Moneda de la factura pagada (MonedaDR).
     */
    public String getCurrency() {
        return currency;
    }

    public InvoicePaymentDocument setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Número de parcialidad (NumParcialidad).
     */
    public Long getPartiality() {
        return partiality;
    }

    public InvoicePaymentDocument setPartiality(Long partiality) {
        this.partiality = partiality;
        return this;
    }

    @JsonIgnore
    public InvoicePaymentDocument setPartiality(long partiality) {
        return setPartiality(Long.valueOf(partiality));
    }

    /**
     * Saldo anterior de la factura (ImpSaldoAnt).
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    public InvoicePaymentDocument setPreviousBalance(BigDecimal previousBalance) {
        this.previousBalance = previousBalance;
        return this;
    }

    @JsonIgnore
    public InvoicePaymentDocument setPreviousBalance(double previousBalance) {
        return setPreviousBalance(BigDecimal.valueOf(previousBalance));
    }

    /**
     * Lo que se paga de esa factura (ImpPagado), en la moneda de la factura.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InvoicePaymentDocument setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InvoicePaymentDocument setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Saldo insoluto después de este pago (ImpSaldoInsoluto).
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public InvoicePaymentDocument setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public InvoicePaymentDocument setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
