// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoicePayrollPeriod: Periodo (Periodo): mes inicial, mes final y año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollPeriod {
    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     */
    public String getStart() {
        return start;
    }

    public InvoicePayrollPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     */
    public String getEnd() {
        return end;
    }

    public InvoicePayrollPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public InvoicePayrollPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
