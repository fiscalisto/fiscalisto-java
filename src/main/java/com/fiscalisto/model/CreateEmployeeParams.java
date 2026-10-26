// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateEmployeeParams: los campos de «Crear un empleado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateEmployeeParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Número de empleado (NumEmpleado).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre completo del empleado, como en su constancia de situación fiscal.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * CURP, 18 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("social_security_number")
    private String socialSecurityNumber;

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Correo del empleado, a donde van sus recibos con send_email.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Salario diario.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("daily_salary")
    private BigDecimal dailySalary;

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06, 07, 08.
     */
    @JsonProperty("contract_type")
    private String contractType;

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    @JsonProperty("workday_type")
    private String workdayType;

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    @JsonProperty("risk_class")
    private String riskClass;

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("state")
    private String state;

    /**
     * true si trabaja en la zona libre de la frontera norte (salario mínimo de frontera).
     */
    @JsonProperty("border_zone")
    private Boolean borderZone;

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    @JsonProperty("unionized")
    private Boolean unionized;

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
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateEmployeeParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public CreateEmployeeParams setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre completo del empleado, como en su constancia de situación fiscal.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateEmployeeParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public CreateEmployeeParams setTaxId(String taxId) {
        this.taxId = taxId;
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

    public CreateEmployeeParams setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     * <p>
     * Obligatorio.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public CreateEmployeeParams setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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

    public CreateEmployeeParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Correo del empleado, a donde van sus recibos con send_email.
     */
    public String getEmail() {
        return email;
    }

    public CreateEmployeeParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getStartDate() {
        return startDate;
    }

    public CreateEmployeeParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public CreateEmployeeParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Salario diario.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public CreateEmployeeParams setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    @JsonIgnore
    public CreateEmployeeParams setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public CreateEmployeeParams setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public CreateEmployeeParams setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06, 07, 08.
     */
    public String getContractType() {
        return contractType;
    }

    public CreateEmployeeParams setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    public String getWorkdayType() {
        return workdayType;
    }

    public CreateEmployeeParams setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
        return this;
    }

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public CreateEmployeeParams setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    public String getRiskClass() {
        return riskClass;
    }

    public CreateEmployeeParams setRiskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    public String getState() {
        return state;
    }

    public CreateEmployeeParams setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * true si trabaja en la zona libre de la frontera norte (salario mínimo de frontera).
     */
    public Boolean getBorderZone() {
        return borderZone;
    }

    public CreateEmployeeParams setBorderZone(Boolean borderZone) {
        this.borderZone = borderZone;
        return this;
    }

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    public Boolean getUnionized() {
        return unionized;
    }

    public CreateEmployeeParams setUnionized(Boolean unionized) {
        this.unionized = unionized;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public CreateEmployeeParams setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public CreateEmployeeParams setPosition(String position) {
        this.position = position;
        return this;
    }
}
