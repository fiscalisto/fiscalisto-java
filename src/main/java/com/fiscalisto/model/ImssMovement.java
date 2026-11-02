// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ImssMovement: Un movimiento afiliatorio del IMSS de un empleado: alta, modificación de salario, baja o reingreso.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImssMovement {
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
    private String issuer;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su número de empleado.
     */
    @JsonProperty("employee_number")
    private String employeeNumber;

    /**
     * Su nombre completo.
     */
    @JsonProperty("employee_name")
    private String employeeName;

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    @JsonProperty("social_security_number")
    private String socialSecurityNumber;

    /**
     * alta, reingreso, modificacion (de salario) o baja.
     * <p>
     * Valores: alta, reingreso, modificacion, baja.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * El tipo de movimiento del IMSS: 08 alta o reingreso, 07 modificación, 02 baja.
     * <p>
     * Valores: 08, 07, 02.
     */
    @JsonProperty("movement_type")
    private String movementType;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * En bajas, la causa (1 a 9 o A); null en los demás.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

    /**
     * automatic: lo registró el alta o el cambio del empleado; manual: se agregó a mano.
     * <p>
     * Valores: automatic, manual.
     */
    @JsonProperty("source")
    private String source;

    /**
     * pending: falta presentarlo al IMSS; reported: ya se presentó (ya no cambia).
     * <p>
     * Valores: pending, reported.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo se marcó como presentado, o null.
     */
    @JsonProperty("reported_at")
    private String reportedAt;

    /**
     * Lo que el IMSS rechazaría en su renglón (vacío: listo para el archivo).
     */
    @JsonProperty("problems")
    private List<String> problems;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ImssMovement setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ImssMovement setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ImssMovement setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public ImssMovement setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ImssMovement setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su número de empleado.
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public ImssMovement setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * Su nombre completo.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public ImssMovement setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * Número de seguridad social (NumSeguridadSocial), 11 dígitos.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public ImssMovement setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * alta, reingreso, modificacion (de salario) o baja.
     * <p>
     * Valores: alta, reingreso, modificacion, baja.
     */
    public String getKind() {
        return kind;
    }

    public ImssMovement setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * El tipo de movimiento del IMSS: 08 alta o reingreso, 07 modificación, 02 baja.
     * <p>
     * Valores: 08, 07, 02.
     */
    public String getMovementType() {
        return movementType;
    }

    public ImssMovement setMovementType(String movementType) {
        this.movementType = movementType;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public ImssMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Salario diario integrado (SalarioDiarioIntegrado): no menor al salario diario.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public ImssMovement setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public ImssMovement setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * En bajas, la causa (1 a 9 o A); null en los demás.
     */
    public String getExitReason() {
        return exitReason;
    }

    public ImssMovement setExitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }

    /**
     * automatic: lo registró el alta o el cambio del empleado; manual: se agregó a mano.
     * <p>
     * Valores: automatic, manual.
     */
    public String getSource() {
        return source;
    }

    public ImssMovement setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * pending: falta presentarlo al IMSS; reported: ya se presentó (ya no cambia).
     * <p>
     * Valores: pending, reported.
     */
    public String getStatus() {
        return status;
    }

    public ImssMovement setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo se marcó como presentado, o null.
     */
    public String getReportedAt() {
        return reportedAt;
    }

    public ImssMovement setReportedAt(String reportedAt) {
        this.reportedAt = reportedAt;
        return this;
    }

    /**
     * Lo que el IMSS rechazaría en su renglón (vacío: listo para el archivo).
     */
    public List<String> getProblems() {
        return problems;
    }

    public ImssMovement setProblems(List<String> problems) {
        this.problems = problems;
        return this;
    }
}
