// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * CreatePayrollReceiptParams: los campos de «Timbrar un recibo de nómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollReceiptParams {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y, si no es el último, el día de pago (FechaPago).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("period")
    private CreatePayrollReceiptParamsPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
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
     * Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos, descansos y festivos trabajados, vacaciones, premios y comisiones. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
     */
    @JsonProperty("incidents")
    private CreatePayrollReceiptParamsIncidents incidents;

    /**
     * El recibo vigente (inv_… o UUID) que este corrige, calculado por Fiscalisto para el mismo empleado: el nuevo se calcula con los datos del empleado como están ahora, va relacionado con 04 y el anterior se cancela con motivo 01. Para un recibo que calculó su sistema use POST /v1/payroll_receipts/external con replaces.
     */
    @JsonProperty("replaces")
    private String replaces;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía. A un cliente con «Enviar al timbrar: Nunca» no se le envía aunque sea true: warnings lo dice y POST /v1/invoices/{id}/send sí se la manda.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El confirmation_token de POST /v1/payroll_receipts/preview: timbra solo si el recibo calculado ahora es exactamente el que revisó (si no, 409 payroll_calculation_changed y no timbra). Sin él, timbra el que calcule en ese momento.
     */
    @JsonProperty("confirmation_token")
    private String confirmationToken;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreatePayrollReceiptParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * El periodo de pago: primer y último día (FechaInicialPago, FechaFinalPago) y, si no es el último, el día de pago (FechaPago).
     * <p>
     * Obligatorio.
     */
    public CreatePayrollReceiptParamsPeriod getPeriod() {
        return period;
    }

    public CreatePayrollReceiptParams setPeriod(CreatePayrollReceiptParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreatePayrollReceiptParams setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParams setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Faltas del periodo (días sin goce de sueldo), de 0 a 31: no se pagan (salen de days) y cotizan al IMSS solo en enfermedades y maternidad, hasta 7 por mes (LSS art. 31 fr. I).
     */
    public Long getAbsences() {
        return absences;
    }

    public CreatePayrollReceiptParams setAbsences(Long absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParams setAbsences(long absences) {
        return setAbsences(Long.valueOf(absences));
    }

    /**
     * Días de incapacidad que expidió el IMSS en el periodo, de 0 a 31: no se pagan (salen de days) y no causan cuotas obreras del IMSS (LSS art. 31 fr. IV).
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public CreatePayrollReceiptParams setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParams setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos, descansos y festivos trabajados, vacaciones, premios y comisiones. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
     */
    public CreatePayrollReceiptParamsIncidents getIncidents() {
        return incidents;
    }

    public CreatePayrollReceiptParams setIncidents(CreatePayrollReceiptParamsIncidents incidents) {
        this.incidents = incidents;
        return this;
    }

    /**
     * El recibo vigente (inv_… o UUID) que este corrige, calculado por Fiscalisto para el mismo empleado: el nuevo se calcula con los datos del empleado como están ahora, va relacionado con 04 y el anterior se cancela con motivo 01. Para un recibo que calculó su sistema use POST /v1/payroll_receipts/external con replaces.
     */
    public String getReplaces() {
        return replaces;
    }

    public CreatePayrollReceiptParams setReplaces(String replaces) {
        this.replaces = replaces;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía. A un cliente con «Enviar al timbrar: Nunca» no se le envía aunque sea true: warnings lo dice y POST /v1/invoices/{id}/send sí se la manda.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreatePayrollReceiptParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreatePayrollReceiptParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * El confirmation_token de POST /v1/payroll_receipts/preview: timbra solo si el recibo calculado ahora es exactamente el que revisó (si no, 409 payroll_calculation_changed y no timbra). Sin él, timbra el que calcule en ese momento.
     */
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public CreatePayrollReceiptParams setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
        return this;
    }
}
