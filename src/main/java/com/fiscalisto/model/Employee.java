// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Employee: Un empleado de un emisor, para sus recibos de nómina.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre completo del empleado.
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
     * Correo del empleado, a donde van sus recibos.
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
     * El SDI de los elementos fijos (cuota diaria con aguinaldo, prima vacacional y demás prestaciones fijas).
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * La parte variable del SDI desde variable_salary_from: lo que las horas extra triples, la prima dominical y los premios del bimestre anterior suman por día (artículo 30 de la LSS). Se fija con POST /v1/variable_salaries; los recibos usan integrated_daily_salary más esta.
     */
    @JsonProperty("variable_integrated_daily_salary")
    private BigDecimal variableIntegratedDailySalary;

    /**
     * Desde cuándo aplica variable_integrated_daily_salary (AAAA-MM-DD).
     */
    @JsonProperty("variable_salary_from")
    private String variableSalaryFrom;

    /**
     * Días de aguinaldo al año (al menos 15).
     */
    @JsonProperty("aguinaldo_days")
    private BigDecimal aguinaldoDays;

    /**
     * Prima vacacional, fracción del salario de las vacaciones (al menos 0.25).
     */
    @JsonProperty("vacation_premium")
    private BigDecimal vacationPremium;

    /**
     * Vales de despensa al mes que lleva cada recibo ordinario (percepción 029).
     */
    @JsonProperty("pantry_vouchers")
    private BigDecimal pantryVouchers;

    /**
     * Fracción del sueldo que aportan al fondo de ahorro la empresa y el trabajador por igual (percepción 005).
     */
    @JsonProperty("savings_fund_rate")
    private BigDecimal savingsFundRate;

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     */
    @JsonProperty("contract_type")
    private String contractType;

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
     * CLABE de su cuenta, a donde le paga el archivo para el banco, o null.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * Nombre(s) como en su CURP, o null (los archivos del IMSS lo separan con la CURP).
     */
    @JsonProperty("given_names")
    private String givenNames;

    /**
     * Primer apellido como en su CURP, o null.
     */
    @JsonProperty("first_surname")
    private String firstSurname;

    /**
     * Segundo apellido, o null.
     */
    @JsonProperty("second_surname")
    private String secondSurname;

    /**
     * Tipo de trabajador del IMSS: 1 permanente, 2 eventual de la ciudad, 3 eventual de la construcción, 4 eventual del campo.
     */
    @JsonProperty("imss_worker_type")
    private String imssWorkerType;

    /**
     * Tipo de salario del IMSS: 0 fijo, 1 variable, 2 mixto.
     */
    @JsonProperty("imss_salary_type")
    private String imssSalaryType;

    /**
     * Semana o jornada reducida: 0 normal, 1 a 5 días a la semana, 6 jornada de menos de 8 horas.
     */
    @JsonProperty("imss_reduced_week")
    private String imssReducedWeek;

    /**
     * Unidad de medicina familiar del IMSS, o null.
     */
    @JsonProperty("family_medicine_unit")
    private String familyMedicineUnit;

    /**
     * Causa de la baja ante el IMSS cuando tiene end_date (2 separación voluntaria por omisión), o null.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

    /**
     * Lo que el SAT podría observar de sus datos, antes de timbrar.
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Employee setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Employee setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Employee setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Employee setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Employee setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public Employee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre completo del empleado.
     */
    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public Employee setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public Employee setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Employee setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public Employee setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Correo del empleado, a donde van sus recibos.
     */
    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Fecha de inicio de la relación laboral (FechaInicioRelLaboral), AAAA-MM-DD.
     */
    public String getStartDate() {
        return startDate;
    }

    public Employee setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día trabajado si ya no trabaja ahí, AAAA-MM-DD.
     */
    public String getEndDate() {
        return endDate;
    }

    public Employee setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Salario diario.
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public Employee setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    @JsonIgnore
    public Employee setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * El SDI de los elementos fijos (cuota diaria con aguinaldo, prima vacacional y demás prestaciones fijas).
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public Employee setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public Employee setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * La parte variable del SDI desde variable_salary_from: lo que las horas extra triples, la prima dominical y los premios del bimestre anterior suman por día (artículo 30 de la LSS). Se fija con POST /v1/variable_salaries; los recibos usan integrated_daily_salary más esta.
     */
    public BigDecimal getVariableIntegratedDailySalary() {
        return variableIntegratedDailySalary;
    }

    public Employee setVariableIntegratedDailySalary(BigDecimal variableIntegratedDailySalary) {
        this.variableIntegratedDailySalary = variableIntegratedDailySalary;
        return this;
    }

    @JsonIgnore
    public Employee setVariableIntegratedDailySalary(double variableIntegratedDailySalary) {
        return setVariableIntegratedDailySalary(BigDecimal.valueOf(variableIntegratedDailySalary));
    }

    /**
     * Desde cuándo aplica variable_integrated_daily_salary (AAAA-MM-DD).
     */
    public String getVariableSalaryFrom() {
        return variableSalaryFrom;
    }

    public Employee setVariableSalaryFrom(String variableSalaryFrom) {
        this.variableSalaryFrom = variableSalaryFrom;
        return this;
    }

    /**
     * Días de aguinaldo al año (al menos 15).
     */
    public BigDecimal getAguinaldoDays() {
        return aguinaldoDays;
    }

    public Employee setAguinaldoDays(BigDecimal aguinaldoDays) {
        this.aguinaldoDays = aguinaldoDays;
        return this;
    }

    @JsonIgnore
    public Employee setAguinaldoDays(double aguinaldoDays) {
        return setAguinaldoDays(BigDecimal.valueOf(aguinaldoDays));
    }

    /**
     * Prima vacacional, fracción del salario de las vacaciones (al menos 0.25).
     */
    public BigDecimal getVacationPremium() {
        return vacationPremium;
    }

    public Employee setVacationPremium(BigDecimal vacationPremium) {
        this.vacationPremium = vacationPremium;
        return this;
    }

    @JsonIgnore
    public Employee setVacationPremium(double vacationPremium) {
        return setVacationPremium(BigDecimal.valueOf(vacationPremium));
    }

    /**
     * Vales de despensa al mes que lleva cada recibo ordinario (percepción 029).
     */
    public BigDecimal getPantryVouchers() {
        return pantryVouchers;
    }

    public Employee setPantryVouchers(BigDecimal pantryVouchers) {
        this.pantryVouchers = pantryVouchers;
        return this;
    }

    @JsonIgnore
    public Employee setPantryVouchers(double pantryVouchers) {
        return setPantryVouchers(BigDecimal.valueOf(pantryVouchers));
    }

    /**
     * Fracción del sueldo que aportan al fondo de ahorro la empresa y el trabajador por igual (percepción 005).
     */
    public BigDecimal getSavingsFundRate() {
        return savingsFundRate;
    }

    public Employee setSavingsFundRate(BigDecimal savingsFundRate) {
        this.savingsFundRate = savingsFundRate;
        return this;
    }

    @JsonIgnore
    public Employee setSavingsFundRate(double savingsFundRate) {
        return setSavingsFundRate(BigDecimal.valueOf(savingsFundRate));
    }

    /**
     * Tipo de contrato (TipoContrato), c_TipoContrato. Por omisión 01, por tiempo indeterminado.
     */
    public String getContractType() {
        return contractType;
    }

    public Employee setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Tipo de jornada (TipoJornada), c_TipoJornada. Por omisión 01, diurna.
     */
    public String getWorkdayType() {
        return workdayType;
    }

    public Employee setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
        return this;
    }

    /**
     * Tipo de régimen (TipoRegimen): 02 sueldos y salarios.
     */
    public String getRegimeType() {
        return regimeType;
    }

    public Employee setRegimeType(String regimeType) {
        this.regimeType = regimeType;
        return this;
    }

    /**
     * Periodicidad del pago (PeriodicidadPago): 02 semanal, 03 catorcenal, 04 quincenal (por omisión), 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public Employee setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * Clase de riesgo del puesto ante el IMSS (RiesgoPuesto), 1 a 5. Por omisión 1.
     */
    public String getRiskClass() {
        return riskClass;
    }

    public Employee setRiskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    public String getState() {
        return state;
    }

    public Employee setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * true si trabaja en la zona libre de la frontera norte (salario mínimo de frontera).
     */
    public Boolean getBorderZone() {
        return borderZone;
    }

    public Employee setBorderZone(Boolean borderZone) {
        this.borderZone = borderZone;
        return this;
    }

    /**
     * true si es sindicalizado (Sindicalizado).
     */
    public Boolean getUnionized() {
        return unionized;
    }

    public Employee setUnionized(Boolean unionized) {
        this.unionized = unionized;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public Employee setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * CLABE de su cuenta, a donde le paga el archivo para el banco, o null.
     */
    public String getClabe() {
        return clabe;
    }

    public Employee setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * Nombre(s) como en su CURP, o null (los archivos del IMSS lo separan con la CURP).
     */
    public String getGivenNames() {
        return givenNames;
    }

    public Employee setGivenNames(String givenNames) {
        this.givenNames = givenNames;
        return this;
    }

    /**
     * Primer apellido como en su CURP, o null.
     */
    public String getFirstSurname() {
        return firstSurname;
    }

    public Employee setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
        return this;
    }

    /**
     * Segundo apellido, o null.
     */
    public String getSecondSurname() {
        return secondSurname;
    }

    public Employee setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return this;
    }

    /**
     * Tipo de trabajador del IMSS: 1 permanente, 2 eventual de la ciudad, 3 eventual de la construcción, 4 eventual del campo.
     */
    public String getImssWorkerType() {
        return imssWorkerType;
    }

    public Employee setImssWorkerType(String imssWorkerType) {
        this.imssWorkerType = imssWorkerType;
        return this;
    }

    /**
     * Tipo de salario del IMSS: 0 fijo, 1 variable, 2 mixto.
     */
    public String getImssSalaryType() {
        return imssSalaryType;
    }

    public Employee setImssSalaryType(String imssSalaryType) {
        this.imssSalaryType = imssSalaryType;
        return this;
    }

    /**
     * Semana o jornada reducida: 0 normal, 1 a 5 días a la semana, 6 jornada de menos de 8 horas.
     */
    public String getImssReducedWeek() {
        return imssReducedWeek;
    }

    public Employee setImssReducedWeek(String imssReducedWeek) {
        this.imssReducedWeek = imssReducedWeek;
        return this;
    }

    /**
     * Unidad de medicina familiar del IMSS, o null.
     */
    public String getFamilyMedicineUnit() {
        return familyMedicineUnit;
    }

    public Employee setFamilyMedicineUnit(String familyMedicineUnit) {
        this.familyMedicineUnit = familyMedicineUnit;
        return this;
    }

    /**
     * Causa de la baja ante el IMSS cuando tiene end_date (2 separación voluntaria por omisión), o null.
     */
    public String getExitReason() {
        return exitReason;
    }

    public Employee setExitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }

    /**
     * Lo que el SAT podría observar de sus datos, antes de timbrar.
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public Employee setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public Employee setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Employee setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
