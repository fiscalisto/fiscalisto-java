// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayrollBatchParamsReceipt: CreatePayrollBatchParamsReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollBatchParamsReceipt {
    /**
     * El empleado (emp_…) del emisor del lote.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su periodo de pago (FechaInicialPago, FechaFinalPago y FechaPago), si no es el del lote (period).
     */
    @JsonProperty("period")
    private CreatePayrollBatchParamsReceiptPeriod period;

    /**
     * Días pagados; sin él, todos los días que le tocan del periodo menos absences y disability_days.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Faltas del periodo (días sin goce de sueldo), de 0 a 31: no se pagan (salen de days) y cotizan al IMSS solo en enfermedades y maternidad, hasta 7 por mes (LSS art. 31 fr. I).
     */
    @JsonProperty("absences")
    private Long absences;

    /**
     * Días de incapacidad que expidió el IMSS en el periodo, de 0 a 31: no se pagan (salen de days) y no causan cuotas obreras del IMSS (LSS art. 31 fr. IV).
     */
    @JsonProperty("disability_days")
    private Long disabilityDays;

    /**
     * Mandarle su recibo por correo; sin él, lo que diga send_email del lote. Con true el empleado debe tener correo.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Su identificador de este recibo, hasta 100 caracteres.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El empleado (emp_…) del emisor del lote.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreatePayrollBatchParamsReceipt setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su periodo de pago (FechaInicialPago, FechaFinalPago y FechaPago), si no es el del lote (period).
     */
    public CreatePayrollBatchParamsReceiptPeriod getPeriod() {
        return period;
    }

    public CreatePayrollBatchParamsReceipt setPeriod(CreatePayrollBatchParamsReceiptPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados; sin él, todos los días que le tocan del periodo menos absences y disability_days.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreatePayrollBatchParamsReceipt setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreatePayrollBatchParamsReceipt setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Faltas del periodo (días sin goce de sueldo), de 0 a 31: no se pagan (salen de days) y cotizan al IMSS solo en enfermedades y maternidad, hasta 7 por mes (LSS art. 31 fr. I).
     */
    public Long getAbsences() {
        return absences;
    }

    public CreatePayrollBatchParamsReceipt setAbsences(Long absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public CreatePayrollBatchParamsReceipt setAbsences(long absences) {
        return setAbsences(Long.valueOf(absences));
    }

    /**
     * Días de incapacidad que expidió el IMSS en el periodo, de 0 a 31: no se pagan (salen de days) y no causan cuotas obreras del IMSS (LSS art. 31 fr. IV).
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public CreatePayrollBatchParamsReceipt setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollBatchParamsReceipt setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Mandarle su recibo por correo; sin él, lo que diga send_email del lote. Con true el empleado debe tener correo.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreatePayrollBatchParamsReceipt setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Su identificador de este recibo, hasta 100 caracteres.
     */
    public String getReference() {
        return reference;
    }

    public CreatePayrollBatchParamsReceipt setReference(String reference) {
        this.reference = reference;
        return this;
    }
}
