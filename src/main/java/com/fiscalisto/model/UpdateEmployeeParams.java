// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateEmployeeParams: los campos de «Actualizar un empleado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeeParams {
    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre completo del empleado, como en su constancia de situación fiscal.
     */
    @JsonProperty("name")
    private String name;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

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
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
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
     */
    @JsonProperty("daily_salary")
    private BigDecimal dailySalary;

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
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
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public UpdateEmployeeParams setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre completo del empleado, como en su constancia de situación fiscal.
     */
    public String getName() {
        return name;
    }

    public UpdateEmployeeParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateEmployeeParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public UpdateEmployeeParams setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public UpdateEmployeeParams setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public UpdateEmployeeParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Correo del empleado, a donde van sus recibos con send_email.
     */
    public String getEmail() {
        return email;
    }

    public UpdateEmployeeParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdateEmployeeParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public UpdateEmployeeParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Salario diario.
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public UpdateEmployeeParams setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    public UpdateEmployeeParams setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public UpdateEmployeeParams setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    public UpdateEmployeeParams setIntegratedDailySalary(double integratedDailySalary) {
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

    public UpdateEmployeeParams setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    public String getWorkdayType() {
        return workdayType;
    }

    public UpdateEmployeeParams setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
        return this;
    }

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public UpdateEmployeeParams setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    public String getRiskClass() {
        return riskClass;
    }

    public UpdateEmployeeParams setRiskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    public String getState() {
        return state;
    }

    public UpdateEmployeeParams setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * true si trabaja en la zona libre de la frontera norte (salario mínimo de frontera).
     */
    public Boolean getBorderZone() {
        return borderZone;
    }

    public UpdateEmployeeParams setBorderZone(Boolean borderZone) {
        this.borderZone = borderZone;
        return this;
    }

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    public Boolean getUnionized() {
        return unionized;
    }

    public UpdateEmployeeParams setUnionized(Boolean unionized) {
        this.unionized = unionized;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public UpdateEmployeeParams setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public UpdateEmployeeParams setPosition(String position) {
        this.position = position;
        return this;
    }
}
