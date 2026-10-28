// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePayrollEmployee: El empleado (Nomina/Receptor), como se timbró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollEmployee {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * CURP, 18 caracteres.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    @JsonProperty("social_security_number")
    private String socialSecurityNumber;

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Antigüedad (P52W, P1Y2M3D).
     */
    @JsonProperty("seniority")
    private String seniority;

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     */
    @JsonProperty("contract_type")
    private String contractType;

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
     * Tipo de régimen (TipoRegimen): 02 sueldos y salarios.
     */
    @JsonProperty("regime_type")
    private String regimeType;

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
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    @JsonProperty("risk_class")
    private String riskClass;

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    @JsonProperty("contribution_base_salary")
    private BigDecimal contributionBaseSalary;

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    @JsonProperty("state")
    private String state;

    /**
     * Banco (Banco), c_Banco.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * Cuenta bancaria o CLABE (CuentaBancaria).
     */
    @JsonProperty("bank_account")
    private String bankAccount;

    /**
     * Subcontratación (SubContratacion).
     */
    @JsonProperty("subcontracting")
    private List<InvoicePayrollEmployeeSubcontractingItem> subcontracting;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public InvoicePayrollEmployee setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public InvoicePayrollEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public InvoicePayrollEmployee setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public InvoicePayrollEmployee setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public InvoicePayrollEmployee setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Antigüedad (P52W, P1Y2M3D).
     */
    public String getSeniority() {
        return seniority;
    }

    public InvoicePayrollEmployee setSeniority(String seniority) {
        this.seniority = seniority;
        return this;
    }

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     */
    public String getContractType() {
        return contractType;
    }

    public InvoicePayrollEmployee setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    public Boolean getUnionized() {
        return unionized;
    }

    public InvoicePayrollEmployee setUnionized(Boolean unionized) {
        this.unionized = unionized;
        return this;
    }

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    public String getWorkdayType() {
        return workdayType;
    }

    public InvoicePayrollEmployee setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
        return this;
    }

    /**
     * Tipo de régimen (TipoRegimen): 02 sueldos y salarios.
     */
    public String getRegimeType() {
        return regimeType;
    }

    public InvoicePayrollEmployee setRegimeType(String regimeType) {
        this.regimeType = regimeType;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public InvoicePayrollEmployee setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public InvoicePayrollEmployee setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    public String getRiskClass() {
        return riskClass;
    }

    public InvoicePayrollEmployee setRiskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * Salario base de cotización (SalarioBaseCotApor).
     */
    public BigDecimal getContributionBaseSalary() {
        return contributionBaseSalary;
    }

    public InvoicePayrollEmployee setContributionBaseSalary(BigDecimal contributionBaseSalary) {
        this.contributionBaseSalary = contributionBaseSalary;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollEmployee setContributionBaseSalary(double contributionBaseSalary) {
        return setContributionBaseSalary(BigDecimal.valueOf(contributionBaseSalary));
    }

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public InvoicePayrollEmployee setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollEmployee setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    public String getState() {
        return state;
    }

    public InvoicePayrollEmployee setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Banco (Banco), c_Banco.
     */
    public String getBank() {
        return bank;
    }

    public InvoicePayrollEmployee setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Cuenta bancaria o CLABE (CuentaBancaria).
     */
    public String getBankAccount() {
        return bankAccount;
    }

    public InvoicePayrollEmployee setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * Subcontratación (SubContratacion).
     */
    public List<InvoicePayrollEmployeeSubcontractingItem> getSubcontracting() {
        return subcontracting;
    }

    public InvoicePayrollEmployee setSubcontracting(List<InvoicePayrollEmployeeSubcontractingItem> subcontracting) {
        this.subcontracting = subcontracting;
        return this;
    }
}
