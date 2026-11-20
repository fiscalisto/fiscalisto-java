// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePayrollApprovalParamsPeriod: El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParamsPeriod {
    /**
     * Primer día pagado (FechaInicialPago).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Último día pagado (FechaFinalPago).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Día de pago (FechaPago); sin él, el último día del periodo.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * Primer día pagado (FechaInicialPago).
     * <p>
     * Obligatorio.
     */
    public String getStart() {
        return start;
    }

    public CreatePayrollApprovalParamsPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Último día pagado (FechaFinalPago).
     * <p>
     * Obligatorio.
     */
    public String getEnd() {
        return end;
    }

    public CreatePayrollApprovalParamsPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Día de pago (FechaPago); sin él, el último día del periodo.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public CreatePayrollApprovalParamsPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
