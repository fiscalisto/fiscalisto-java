// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CustomerPaymentBehaviorMonth: CustomerPaymentBehaviorMonth.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehaviorMonth {
    /**
     * El mes de los pagos (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Días promedio (por monto) de los pagos de ese mes; null sin pagos.
     */
    @JsonProperty("average_days_to_pay")
    private BigDecimal averageDaysToPay;

    /**
     * Lo pagado ese mes, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Facturas con un pago ese mes.
     */
    @JsonProperty("paid_invoices")
    private Long paidInvoices;

    /**
     * El mes de los pagos (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CustomerPaymentBehaviorMonth setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Días promedio (por monto) de los pagos de ese mes; null sin pagos.
     */
    public BigDecimal getAverageDaysToPay() {
        return averageDaysToPay;
    }

    public CustomerPaymentBehaviorMonth setAverageDaysToPay(BigDecimal averageDaysToPay) {
        this.averageDaysToPay = averageDaysToPay;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorMonth setAverageDaysToPay(double averageDaysToPay) {
        return setAverageDaysToPay(BigDecimal.valueOf(averageDaysToPay));
    }

    /**
     * Lo pagado ese mes, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CustomerPaymentBehaviorMonth setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorMonth setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Facturas con un pago ese mes.
     */
    public Long getPaidInvoices() {
        return paidInvoices;
    }

    public CustomerPaymentBehaviorMonth setPaidInvoices(Long paidInvoices) {
        this.paidInvoices = paidInvoices;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorMonth setPaidInvoices(long paidInvoices) {
        return setPaidInvoices(Long.valueOf(paidInvoices));
    }
}
