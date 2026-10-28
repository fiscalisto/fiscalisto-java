// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewExternalPayrollReceiptParamsPeriod: FechaInicialPago, FechaFinalPago y FechaPago.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParamsPeriod {
    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * Primer día del periodo (FechaInicialPago), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getStart() {
        return start;
    }

    public PreviewExternalPayrollReceiptParamsPeriod setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Último día del periodo (FechaFinalPago), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getEnd() {
        return end;
    }

    public PreviewExternalPayrollReceiptParamsPeriod setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     * <p>
     * Obligatorio.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public PreviewExternalPayrollReceiptParamsPeriod setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
}
