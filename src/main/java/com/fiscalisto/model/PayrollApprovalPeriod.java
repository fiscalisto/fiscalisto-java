// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollApprovalPeriod: El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollApprovalPeriod {
    /**
     * Primer día pagado.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Último día pagado.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Día de pago.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * Primer día pagado.
     */
    public String getStart() {
        return start;
    }

    public PayrollApprovalPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Último día pagado.
     */
    public String getEnd() {
        return end;
    }

    public PayrollApprovalPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Día de pago.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public PayrollApprovalPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
