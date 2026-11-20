// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollCalendarEventPayrollPeriod: El periodo de pago: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCalendarEventPayrollPeriod {
    /**
     * FechaInicialPago.
     */
    @JsonProperty("start")
    private String start;

    /**
     * FechaFinalPago.
     */
    @JsonProperty("end")
    private String end;

    /**
     * FechaPago.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * FechaInicialPago.
     */
    public String getStart() {
        return start;
    }

    public PayrollCalendarEventPayrollPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * FechaFinalPago.
     */
    public String getEnd() {
        return end;
    }

    public PayrollCalendarEventPayrollPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * FechaPago.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public PayrollCalendarEventPayrollPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
