// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePayrollBatchParamsPeriod: El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y, si no es el último, el día de pago (FechaPago). Va para todos los recibos de receipts que no traen el suyo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollBatchParamsPeriod {
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

    public CreatePayrollBatchParamsPeriod setStart(String start) {
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

    public CreatePayrollBatchParamsPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Día de pago (FechaPago); sin él, el último día del periodo.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public CreatePayrollBatchParamsPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
