// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * CreateExternalPayrollReceiptParams: los campos de «Timbrar un recibo calculado por su sistema».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParams {
    /**
     * El emisor (patrón) del recibo; sin él, el único emisor de su cuenta en este modo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * TipoNomina: O ordinaria (periodicidad 01–10) o E extraordinaria (periodicidad 99).
     * <p>
     * Valores: O, E.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * PeriodicidadPago (c_PeriodicidadPago).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * FechaInicialPago, FechaFinalPago y FechaPago.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("period")
    private CreateExternalPayrollReceiptParamsPeriod period;

    /**
     * NumDiasPagados: de 0.001 a 36160, hasta 3 decimales.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    @JsonProperty("employer")
    private CreateExternalPayrollReceiptParamsEmployer employer;

    /**
     * El empleado (Receptor y Nomina/Receptor) con los datos de su sistema de nómina; no usa ni cambia los empleados de Fiscalisto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private CreateExternalPayrollReceiptParamsEmployee employee;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<CreateExternalPayrollReceiptParamsPerception> perceptions;

    /**
     * SeparacionIndemnizacion: con las percepciones 022, 023 o 025.
     */
    @JsonProperty("separation")
    private CreateExternalPayrollReceiptParamsSeparation separation;

    /**
     * JubilacionPensionRetiro: con las percepciones 039 o 044.
     */
    @JsonProperty("retirement")
    private CreateExternalPayrollReceiptParamsRetirement retirement;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<CreateExternalPayrollReceiptParamsDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<CreateExternalPayrollReceiptParamsOtherPayment> otherPayments;

    /**
     * Incapacidades: con la percepción 014 o la deducción 006.
     */
    @JsonProperty("disabilities")
    private List<CreateExternalPayrollReceiptParamsDisability> disabilities;

    /**
     * Los totales que calculó su sistema: Fiscalisto los compara al centavo con las líneas y rechaza el recibo si no cuadran.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("totals")
    private CreateExternalPayrollReceiptParamsTotals totals;

    /**
     * Sus ids: el empleado y la corrida de nómina. payroll_run_id es obligatorio en un recibo extraordinario.
     */
    @JsonProperty("references")
    private CreateExternalPayrollReceiptParamsReferences references;

    /**
     * El recibo vigente (inv_… o UUID) que este sustituye: relación 04 y se cancela con motivo 01.
     */
    @JsonProperty("replaces")
    private String replaces;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El emisor (patrón) del recibo; sin él, el único emisor de su cuenta en este modo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateExternalPayrollReceiptParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * TipoNomina: O ordinaria (periodicidad 01–10) o E extraordinaria (periodicidad 99).
     * <p>
     * Valores: O, E.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateExternalPayrollReceiptParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * PeriodicidadPago (c_PeriodicidadPago).
     * <p>
     * Obligatorio.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public CreateExternalPayrollReceiptParams setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * FechaInicialPago, FechaFinalPago y FechaPago.
     * <p>
     * Obligatorio.
     */
    public CreateExternalPayrollReceiptParamsPeriod getPeriod() {
        return period;
    }

    public CreateExternalPayrollReceiptParams setPeriod(CreateExternalPayrollReceiptParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * NumDiasPagados: de 0.001 a 36160, hasta 3 decimales.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreateExternalPayrollReceiptParams setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParams setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    public CreateExternalPayrollReceiptParamsEmployer getEmployer() {
        return employer;
    }

    public CreateExternalPayrollReceiptParams setEmployer(CreateExternalPayrollReceiptParamsEmployer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * El empleado (Receptor y Nomina/Receptor) con los datos de su sistema de nómina; no usa ni cambia los empleados de Fiscalisto.
     * <p>
     * Obligatorio.
     */
    public CreateExternalPayrollReceiptParamsEmployee getEmployee() {
        return employee;
    }

    public CreateExternalPayrollReceiptParams setEmployee(CreateExternalPayrollReceiptParamsEmployee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<CreateExternalPayrollReceiptParamsPerception> getPerceptions() {
        return perceptions;
    }

    public CreateExternalPayrollReceiptParams setPerceptions(List<CreateExternalPayrollReceiptParamsPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * SeparacionIndemnizacion: con las percepciones 022, 023 o 025.
     */
    public CreateExternalPayrollReceiptParamsSeparation getSeparation() {
        return separation;
    }

    public CreateExternalPayrollReceiptParams setSeparation(CreateExternalPayrollReceiptParamsSeparation separation) {
        this.separation = separation;
        return this;
    }

    /**
     * JubilacionPensionRetiro: con las percepciones 039 o 044.
     */
    public CreateExternalPayrollReceiptParamsRetirement getRetirement() {
        return retirement;
    }

    public CreateExternalPayrollReceiptParams setRetirement(CreateExternalPayrollReceiptParamsRetirement retirement) {
        this.retirement = retirement;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<CreateExternalPayrollReceiptParamsDeduction> getDeductions() {
        return deductions;
    }

    public CreateExternalPayrollReceiptParams setDeductions(List<CreateExternalPayrollReceiptParamsDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<CreateExternalPayrollReceiptParamsOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public CreateExternalPayrollReceiptParams setOtherPayments(List<CreateExternalPayrollReceiptParamsOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    /**
     * Incapacidades: con la percepción 014 o la deducción 006.
     */
    public List<CreateExternalPayrollReceiptParamsDisability> getDisabilities() {
        return disabilities;
    }

    public CreateExternalPayrollReceiptParams setDisabilities(List<CreateExternalPayrollReceiptParamsDisability> disabilities) {
        this.disabilities = disabilities;
        return this;
    }

    /**
     * Los totales que calculó su sistema: Fiscalisto los compara al centavo con las líneas y rechaza el recibo si no cuadran.
     * <p>
     * Obligatorio.
     */
    public CreateExternalPayrollReceiptParamsTotals getTotals() {
        return totals;
    }

    public CreateExternalPayrollReceiptParams setTotals(CreateExternalPayrollReceiptParamsTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Sus ids: el empleado y la corrida de nómina. payroll_run_id es obligatorio en un recibo extraordinario.
     */
    public CreateExternalPayrollReceiptParamsReferences getReferences() {
        return references;
    }

    public CreateExternalPayrollReceiptParams setReferences(CreateExternalPayrollReceiptParamsReferences references) {
        this.references = references;
        return this;
    }

    /**
     * El recibo vigente (inv_… o UUID) que este sustituye: relación 04 y se cancela con motivo 01.
     */
    public String getReplaces() {
        return replaces;
    }

    public CreateExternalPayrollReceiptParams setReplaces(String replaces) {
        this.replaces = replaces;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateExternalPayrollReceiptParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateExternalPayrollReceiptParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
