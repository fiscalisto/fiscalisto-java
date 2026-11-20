// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreatePayrollApprovalParams: los campos de «Pedir aprobación de la prenómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("period")
    private CreatePayrollApprovalParamsPeriod period;

    /**
     * El recibo de cada empleado de la nómina, como se timbraría con POST /v1/payroll_receipts. Todos de la misma periodicidad.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("receipts")
    private List<CreatePayrollApprovalParamsReceipt> receipts;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollApprovalParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     * <p>
     * Obligatorio.
     */
    public CreatePayrollApprovalParamsPeriod getPeriod() {
        return period;
    }

    public CreatePayrollApprovalParams setPeriod(CreatePayrollApprovalParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * El recibo de cada empleado de la nómina, como se timbraría con POST /v1/payroll_receipts. Todos de la misma periodicidad.
     * <p>
     * Obligatorio.
     */
    public List<CreatePayrollApprovalParamsReceipt> getReceipts() {
        return receipts;
    }

    public CreatePayrollApprovalParams setReceipts(List<CreatePayrollApprovalParamsReceipt> receipts) {
        this.receipts = receipts;
        return this;
    }
}
