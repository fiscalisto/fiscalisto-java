// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreatePayrollBatchParams: los campos de «Timbrar una nómina completa (lote)».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollBatchParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre del lote, para usted (Quincena 20).
     */
    @JsonProperty("name")
    private String name;

    /**
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y, si no es el último, el día de pago (FechaPago). Va para todos los recibos de receipts que no traen el suyo.
     */
    @JsonProperty("period")
    private CreatePayrollBatchParamsPeriod period;

    /**
     * Mandar a cada empleado su recibo por correo (a los que tienen correo). Solo con receipts.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Los recibos que Fiscalisto calcula: un empleado (emp_…) en cada uno, como en POST /v1/payroll_receipts.
     */
    @JsonProperty("receipts")
    private List<CreatePayrollBatchParamsReceipt> receipts;

    /**
     * Los recibos que calculó su sistema de nómina, timbrados tal cual. En lugar de receipts.
     */
    @JsonProperty("external_receipts")
    private List<CreatePayrollBatchParamsExternalReceipt> externalReceipts;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollBatchParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre del lote, para usted (Quincena 20).
     */
    public String getName() {
        return name;
    }

    public CreatePayrollBatchParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y, si no es el último, el día de pago (FechaPago). Va para todos los recibos de receipts que no traen el suyo.
     */
    public CreatePayrollBatchParamsPeriod getPeriod() {
        return period;
    }

    public CreatePayrollBatchParams setPeriod(CreatePayrollBatchParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Mandar a cada empleado su recibo por correo (a los que tienen correo). Solo con receipts.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreatePayrollBatchParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Los recibos que Fiscalisto calcula: un empleado (emp_…) en cada uno, como en POST /v1/payroll_receipts.
     */
    public List<CreatePayrollBatchParamsReceipt> getReceipts() {
        return receipts;
    }

    public CreatePayrollBatchParams setReceipts(List<CreatePayrollBatchParamsReceipt> receipts) {
        this.receipts = receipts;
        return this;
    }

    /**
     * Los recibos que calculó su sistema de nómina, timbrados tal cual. En lugar de receipts.
     */
    public List<CreatePayrollBatchParamsExternalReceipt> getExternalReceipts() {
        return externalReceipts;
    }

    public CreatePayrollBatchParams setExternalReceipts(List<CreatePayrollBatchParamsExternalReceipt> externalReceipts) {
        this.externalReceipts = externalReceipts;
        return this;
    }
}
