// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollProvision: Las cuotas patronales de un mes en la contabilidad: lo que la empresa debe al IMSS, al SAR y al Infonavit por los días del mes según sus recibos de nómina timbrados, el impuesto sobre nómina del mes y la póliza de provisión que los registra, si ya se registró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollProvision {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El último día del mes: la fecha de la póliza.
     */
    @JsonProperty("date")
    private String date;

    /**
     * La prima de riesgo de trabajo del cálculo, como fracción (0.0054355 es 0.54355%).
     */
    @JsonProperty("employer_risk_premium")
    private BigDecimal employerRiskPremium;

    /**
     * true si es la que se guardó al registrar; false si es la prima media de la clase de sus empleados.
     */
    @JsonProperty("employer_risk_premium_saved")
    private Boolean employerRiskPremiumSaved;

    /**
     * Lo calculado: imss (enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías), sar (retiro y cesantía y vejez), infonavit y payroll_tax (el impuesto sobre nómina del mes, como GET /v1/payroll_taxes).
     */
    @JsonProperty("calculated")
    private PayrollProvisionCalculated calculated;

    /**
     * Los importes de la póliza registrada (pueden ser los que escribió), o null si no se ha registrado.
     */
    @JsonProperty("posted")
    private PayrollProvisionPosted posted;

    /**
     * El cálculo por empleado: su salario base de cotización, los días de cada ramo (las faltas solo cotizan en enfermedades y maternidad; las incapacidades solo en retiro e Infonavit) y lo que toca a cada parte. minimum_wage: la empresa paga también la parte del trabajador (LSS art. 36).
     */
    @JsonProperty("employees")
    private List<PayrollProvisionEmployee> employees;

    /**
     * El impuesto sobre nómina de cada estado.
     */
    @JsonProperty("payroll_tax_states")
    private List<PayrollProvisionPayrollTaxState> payrollTaxStates;

    /**
     * La póliza de provisión (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    @JsonProperty("manual_entry")
    private String manualEntry;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollProvision setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollProvision setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollProvision setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public PayrollProvision setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El último día del mes: la fecha de la póliza.
     */
    public String getDate() {
        return date;
    }

    public PayrollProvision setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * La prima de riesgo de trabajo del cálculo, como fracción (0.0054355 es 0.54355%).
     */
    public BigDecimal getEmployerRiskPremium() {
        return employerRiskPremium;
    }

    public PayrollProvision setEmployerRiskPremium(BigDecimal employerRiskPremium) {
        this.employerRiskPremium = employerRiskPremium;
        return this;
    }

    @JsonIgnore
    public PayrollProvision setEmployerRiskPremium(double employerRiskPremium) {
        return setEmployerRiskPremium(BigDecimal.valueOf(employerRiskPremium));
    }

    /**
     * true si es la que se guardó al registrar; false si es la prima media de la clase de sus empleados.
     */
    public Boolean getEmployerRiskPremiumSaved() {
        return employerRiskPremiumSaved;
    }

    public PayrollProvision setEmployerRiskPremiumSaved(Boolean employerRiskPremiumSaved) {
        this.employerRiskPremiumSaved = employerRiskPremiumSaved;
        return this;
    }

    /**
     * Lo calculado: imss (enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías), sar (retiro y cesantía y vejez), infonavit y payroll_tax (el impuesto sobre nómina del mes, como GET /v1/payroll_taxes).
     */
    public PayrollProvisionCalculated getCalculated() {
        return calculated;
    }

    public PayrollProvision setCalculated(PayrollProvisionCalculated calculated) {
        this.calculated = calculated;
        return this;
    }

    /**
     * Los importes de la póliza registrada (pueden ser los que escribió), o null si no se ha registrado.
     */
    public PayrollProvisionPosted getPosted() {
        return posted;
    }

    public PayrollProvision setPosted(PayrollProvisionPosted posted) {
        this.posted = posted;
        return this;
    }

    /**
     * El cálculo por empleado: su salario base de cotización, los días de cada ramo (las faltas solo cotizan en enfermedades y maternidad; las incapacidades solo en retiro e Infonavit) y lo que toca a cada parte. minimum_wage: la empresa paga también la parte del trabajador (LSS art. 36).
     */
    public List<PayrollProvisionEmployee> getEmployees() {
        return employees;
    }

    public PayrollProvision setEmployees(List<PayrollProvisionEmployee> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * El impuesto sobre nómina de cada estado.
     */
    public List<PayrollProvisionPayrollTaxState> getPayrollTaxStates() {
        return payrollTaxStates;
    }

    public PayrollProvision setPayrollTaxStates(List<PayrollProvisionPayrollTaxState> payrollTaxStates) {
        this.payrollTaxStates = payrollTaxStates;
        return this;
    }

    /**
     * La póliza de provisión (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    public String getManualEntry() {
        return manualEntry;
    }

    public PayrollProvision setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
