// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PreviewExternalPayrollReceiptParamsEmployee: El empleado (Receptor y Nomina/Receptor) con los datos de su sistema de nómina; no usa ni cambia los empleados de Fiscalisto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParamsEmployee {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * CURP, 18 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * NumEmpleado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Para send_email; no va en el XML.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    @JsonProperty("social_security_number")
    private String socialSecurityNumber;

    /**
     * FechaInicioRelLaboral.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Antigüedad (P52W o P1Y2M3D). Sin el campo y con registro patronal: semanas desde start_date hasta el fin del periodo.
     */
    @JsonProperty("seniority")
    private String seniority;

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("contract_type")
    private String contractType;

    /**
     * Tipo de régimen (TipoRegimen): 02 sueldos y salarios.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("regime_type")
    private String regimeType;

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    @JsonProperty("unionized")
    private Boolean unionized;

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    @JsonProperty("workday_type")
    private String workdayType;

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    @JsonProperty("risk_class")
    private String riskClass;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Puesto (Puesto).
     */
    @JsonProperty("position")
    private String position;

    /**
     * SalarioBaseCotApor.
     */
    @JsonProperty("contribution_base_salary")
    private BigDecimal contributionBaseSalary;

    /**
     * SalarioDiarioIntegrado.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * ClaveEntFed (c_Estado): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Banco (c_Banco); no va con una CLABE.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * CuentaBancaria: CLABE de 18 dígitos, tarjeta o cuenta.
     */
    @JsonProperty("bank_account")
    private String bankAccount;

    /**
     * SubContratacion: el porcentaje suma 100.
     */
    @JsonProperty("subcontracting")
    private List<PreviewExternalPayrollReceiptParamsEmployeeSubcontractingItem> subcontracting;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getCurp() {
        return curp;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * NumEmpleado.
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Para send_email; no va en el XML.
     */
    public String getEmail() {
        return email;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * FechaInicioRelLaboral.
     */
    public String getStartDate() {
        return startDate;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Antigüedad (P52W o P1Y2M3D). Sin el campo y con registro patronal: semanas desde start_date hasta el fin del periodo.
     */
    public String getSeniority() {
        return seniority;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setSeniority(String seniority) {
        this.seniority = seniority;
        return this;
    }

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     * <p>
     * Obligatorio.
     */
    public String getContractType() {
        return contractType;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Tipo de régimen (TipoRegimen): 02 sueldos y salarios.
     * <p>
     * Obligatorio.
     */
    public String getRegimeType() {
        return regimeType;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setRegimeType(String regimeType) {
        this.regimeType = regimeType;
        return this;
    }

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    public Boolean getUnionized() {
        return unionized;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setUnionized(Boolean unionized) {
        this.unionized = unionized;
        return this;
    }

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    public String getWorkdayType() {
        return workdayType;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
        return this;
    }

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    public String getRiskClass() {
        return riskClass;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setRiskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * SalarioBaseCotApor.
     */
    public BigDecimal getContributionBaseSalary() {
        return contributionBaseSalary;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setContributionBaseSalary(BigDecimal contributionBaseSalary) {
        this.contributionBaseSalary = contributionBaseSalary;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsEmployee setContributionBaseSalary(double contributionBaseSalary) {
        return setContributionBaseSalary(BigDecimal.valueOf(contributionBaseSalary));
    }

    /**
     * SalarioDiarioIntegrado.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsEmployee setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * ClaveEntFed (c_Estado): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    public String getState() {
        return state;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Banco (c_Banco); no va con una CLABE.
     */
    public String getBank() {
        return bank;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * CuentaBancaria: CLABE de 18 dígitos, tarjeta o cuenta.
     */
    public String getBankAccount() {
        return bankAccount;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * SubContratacion: el porcentaje suma 100.
     */
    public List<PreviewExternalPayrollReceiptParamsEmployeeSubcontractingItem> getSubcontracting() {
        return subcontracting;
    }

    public PreviewExternalPayrollReceiptParamsEmployee setSubcontracting(List<PreviewExternalPayrollReceiptParamsEmployeeSubcontractingItem> subcontracting) {
        this.subcontracting = subcontracting;
        return this;
    }
}
