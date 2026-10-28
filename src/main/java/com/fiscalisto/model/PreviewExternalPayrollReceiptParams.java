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
 * PreviewExternalPayrollReceiptParams: los campos de «Revisar un recibo calculado por su sistema, sin timbrar».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParams {
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
    private PreviewExternalPayrollReceiptParamsPeriod period;

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
    private PreviewExternalPayrollReceiptParamsEmployer employer;

    /**
     * El empleado (Receptor y Nomina/Receptor) con los datos de su sistema de nómina; no usa ni cambia los empleados de Fiscalisto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private PreviewExternalPayrollReceiptParamsEmployee employee;

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    @JsonProperty("perceptions")
    private List<PreviewExternalPayrollReceiptParamsPerception> perceptions;

    /**
     * SeparacionIndemnizacion: con las percepciones 022, 023 o 025.
     */
    @JsonProperty("separation")
    private PreviewExternalPayrollReceiptParamsSeparation separation;

    /**
     * JubilacionPensionRetiro: con las percepciones 039 o 044.
     */
    @JsonProperty("retirement")
    private PreviewExternalPayrollReceiptParamsRetirement retirement;

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    @JsonProperty("deductions")
    private List<PreviewExternalPayrollReceiptParamsDeduction> deductions;

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    @JsonProperty("other_payments")
    private List<PreviewExternalPayrollReceiptParamsOtherPayment> otherPayments;

    /**
     * Incapacidades: con la percepción 014 o la deducción 006.
     */
    @JsonProperty("disabilities")
    private List<PreviewExternalPayrollReceiptParamsDisability> disabilities;

    /**
     * Los totales que calculó su sistema: Fiscalisto los compara al centavo con las líneas y rechaza el recibo si no cuadran.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("totals")
    private PreviewExternalPayrollReceiptParamsTotals totals;

    /**
     * Sus ids: el empleado y la corrida de nómina. payroll_run_id es obligatorio en un recibo extraordinario.
     */
    @JsonProperty("references")
    private PreviewExternalPayrollReceiptParamsReferences references;

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

    public PreviewExternalPayrollReceiptParams setIssuer(String issuer) {
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

    public PreviewExternalPayrollReceiptParams setType(String type) {
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

    public PreviewExternalPayrollReceiptParams setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * FechaInicialPago, FechaFinalPago y FechaPago.
     * <p>
     * Obligatorio.
     */
    public PreviewExternalPayrollReceiptParamsPeriod getPeriod() {
        return period;
    }

    public PreviewExternalPayrollReceiptParams setPeriod(PreviewExternalPayrollReceiptParamsPeriod period) {
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

    public PreviewExternalPayrollReceiptParams setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParams setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
     */
    public PreviewExternalPayrollReceiptParamsEmployer getEmployer() {
        return employer;
    }

    public PreviewExternalPayrollReceiptParams setEmployer(PreviewExternalPayrollReceiptParamsEmployer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * El empleado (Receptor y Nomina/Receptor) con los datos de su sistema de nómina; no usa ni cambia los empleados de Fiscalisto.
     * <p>
     * Obligatorio.
     */
    public PreviewExternalPayrollReceiptParamsEmployee getEmployee() {
        return employee;
    }

    public PreviewExternalPayrollReceiptParams setEmployee(PreviewExternalPayrollReceiptParamsEmployee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Percepciones (Percepcion): sueldo y demás, gravado y exento.
     */
    public List<PreviewExternalPayrollReceiptParamsPerception> getPerceptions() {
        return perceptions;
    }

    public PreviewExternalPayrollReceiptParams setPerceptions(List<PreviewExternalPayrollReceiptParamsPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * SeparacionIndemnizacion: con las percepciones 022, 023 o 025.
     */
    public PreviewExternalPayrollReceiptParamsSeparation getSeparation() {
        return separation;
    }

    public PreviewExternalPayrollReceiptParams setSeparation(PreviewExternalPayrollReceiptParamsSeparation separation) {
        this.separation = separation;
        return this;
    }

    /**
     * JubilacionPensionRetiro: con las percepciones 039 o 044.
     */
    public PreviewExternalPayrollReceiptParamsRetirement getRetirement() {
        return retirement;
    }

    public PreviewExternalPayrollReceiptParams setRetirement(PreviewExternalPayrollReceiptParamsRetirement retirement) {
        this.retirement = retirement;
        return this;
    }

    /**
     * Deducciones (Deduccion): ISR, cuotas IMSS y demás.
     */
    public List<PreviewExternalPayrollReceiptParamsDeduction> getDeductions() {
        return deductions;
    }

    public PreviewExternalPayrollReceiptParams setDeductions(List<PreviewExternalPayrollReceiptParamsDeduction> deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Otros pagos (OtroPago): subsidio para el empleo.
     */
    public List<PreviewExternalPayrollReceiptParamsOtherPayment> getOtherPayments() {
        return otherPayments;
    }

    public PreviewExternalPayrollReceiptParams setOtherPayments(List<PreviewExternalPayrollReceiptParamsOtherPayment> otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    /**
     * Incapacidades: con la percepción 014 o la deducción 006.
     */
    public List<PreviewExternalPayrollReceiptParamsDisability> getDisabilities() {
        return disabilities;
    }

    public PreviewExternalPayrollReceiptParams setDisabilities(List<PreviewExternalPayrollReceiptParamsDisability> disabilities) {
        this.disabilities = disabilities;
        return this;
    }

    /**
     * Los totales que calculó su sistema: Fiscalisto los compara al centavo con las líneas y rechaza el recibo si no cuadran.
     * <p>
     * Obligatorio.
     */
    public PreviewExternalPayrollReceiptParamsTotals getTotals() {
        return totals;
    }

    public PreviewExternalPayrollReceiptParams setTotals(PreviewExternalPayrollReceiptParamsTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Sus ids: el empleado y la corrida de nómina. payroll_run_id es obligatorio en un recibo extraordinario.
     */
    public PreviewExternalPayrollReceiptParamsReferences getReferences() {
        return references;
    }

    public PreviewExternalPayrollReceiptParams setReferences(PreviewExternalPayrollReceiptParamsReferences references) {
        this.references = references;
        return this;
    }

    /**
     * El recibo vigente (inv_… o UUID) que este sustituye: relación 04 y se cancela con motivo 01.
     */
    public String getReplaces() {
        return replaces;
    }

    public PreviewExternalPayrollReceiptParams setReplaces(String replaces) {
        this.replaces = replaces;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public PreviewExternalPayrollReceiptParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public PreviewExternalPayrollReceiptParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
