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
     * CLABE de 18 dígitos de la cuenta del empleado: a donde le paga el archivo para el banco (POST /v1/payroll_bank_files).
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * Nombre(s), como en su CURP. Con first_surname y second_surname, los archivos del IMSS (IDSE y SUA) escriben el nombre en sus tres partes; sin ellos, Fiscalisto lo separa con la CURP.
     */
    @JsonProperty("given_names")
    private String givenNames;

    /**
     * Primer apellido, como en su CURP.
     */
    @JsonProperty("first_surname")
    private String firstSurname;

    /**
     * Segundo apellido (vacío si tiene uno).
     */
    @JsonProperty("second_surname")
    private String secondSurname;

    /**
     * Tipo de trabajador del IMSS: 1 permanente, 2 eventual de la ciudad, 3 eventual de la construcción, 4 eventual del campo. Por omisión 1.
     * <p>
     * Valores: 1, 2, 3, 4.
     */
    @JsonProperty("imss_worker_type")
    private String imssWorkerType;

    /**
     * Tipo de salario del IMSS: 0 fijo, 1 variable, 2 mixto. Por omisión 0.
     * <p>
     * Valores: 0, 1, 2.
     */
    @JsonProperty("imss_salary_type")
    private String imssSalaryType;

    /**
     * Semana o jornada reducida: 0 normal, 1 a 5 los días que trabaja a la semana, 6 jornada de menos de 8 horas. Por omisión 0.
     * <p>
     * Valores: 0, 1, 2, 3, 4, 5, 6.
     */
    @JsonProperty("imss_reduced_week")
    private String imssReducedWeek;

    /**
     * Unidad de medicina familiar (UMF) del IMSS, opcional.
     */
    @JsonProperty("family_medicine_unit")
    private String familyMedicineUnit;

    /**
     * Causa de la baja ante el IMSS, con end_date: 1 término de contrato, 2 separación voluntaria (la usual), 3 abandono, 4 defunción, 5 clausura, 6 otras, 7 ausentismo, 8 rescisión, 9 jubilación, A pensión.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9, A.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

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

    /**
     * CLABE de 18 dígitos de la cuenta del empleado: a donde le paga el archivo para el banco (POST /v1/payroll_bank_files).
     */
    public String getClabe() {
        return clabe;
    }

    public CreateEmployeeParams setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * Nombre(s), como en su CURP. Con first_surname y second_surname, los archivos del IMSS (IDSE y SUA) escriben el nombre en sus tres partes; sin ellos, Fiscalisto lo separa con la CURP.
     */
    public String getGivenNames() {
        return givenNames;
    }

    public CreateEmployeeParams setGivenNames(String givenNames) {
        this.givenNames = givenNames;
        return this;
    }

    /**
     * Primer apellido, como en su CURP.
     */
    public String getFirstSurname() {
        return firstSurname;
    }

    public CreateEmployeeParams setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
        return this;
    }

    /**
     * Segundo apellido (vacío si tiene uno).
     */
    public String getSecondSurname() {
        return secondSurname;
    }

    public CreateEmployeeParams setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return this;
    }

    /**
     * Tipo de trabajador del IMSS: 1 permanente, 2 eventual de la ciudad, 3 eventual de la construcción, 4 eventual del campo. Por omisión 1.
     * <p>
     * Valores: 1, 2, 3, 4.
     */
    public String getImssWorkerType() {
        return imssWorkerType;
    }

    public CreateEmployeeParams setImssWorkerType(String imssWorkerType) {
        this.imssWorkerType = imssWorkerType;
        return this;
    }

    /**
     * Tipo de salario del IMSS: 0 fijo, 1 variable, 2 mixto. Por omisión 0.
     * <p>
     * Valores: 0, 1, 2.
     */
    public String getImssSalaryType() {
        return imssSalaryType;
    }

    public CreateEmployeeParams setImssSalaryType(String imssSalaryType) {
        this.imssSalaryType = imssSalaryType;
        return this;
    }

    /**
     * Semana o jornada reducida: 0 normal, 1 a 5 los días que trabaja a la semana, 6 jornada de menos de 8 horas. Por omisión 0.
     * <p>
     * Valores: 0, 1, 2, 3, 4, 5, 6.
     */
    public String getImssReducedWeek() {
        return imssReducedWeek;
    }

    public CreateEmployeeParams setImssReducedWeek(String imssReducedWeek) {
        this.imssReducedWeek = imssReducedWeek;
        return this;
    }

    /**
     * Unidad de medicina familiar (UMF) del IMSS, opcional.
     */
    public String getFamilyMedicineUnit() {
        return familyMedicineUnit;
    }

    public CreateEmployeeParams setFamilyMedicineUnit(String familyMedicineUnit) {
        this.familyMedicineUnit = familyMedicineUnit;
        return this;
    }

    /**
     * Causa de la baja ante el IMSS, con end_date: 1 término de contrato, 2 separación voluntaria (la usual), 3 abandono, 4 defunción, 5 clausura, 6 otras, 7 ausentismo, 8 rescisión, 9 jubilación, A pensión.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9, A.
     */
    public String getExitReason() {
        return exitReason;
    }

    public CreateEmployeeParams setExitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }
}
