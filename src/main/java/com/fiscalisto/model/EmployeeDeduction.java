// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * EmployeeDeduction: Un descuento que se repite en cada recibo ordinario de un empleado: Infonavit, Fonacot, pensión alimenticia, préstamo, caja de ahorro o cuota sindical. Cada recibo lo toma con los límites de la Ley Federal del Trabajo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDeduction {
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
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * infonavit, fonacot, pension (pensión alimenticia), prestamo, anticipo (de salarios), caja (de ahorro) o sindical.
     * <p>
     * Valores: infonavit, fonacot, pension, prestamo, anticipo, caja, sindical.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * La clave del SAT con que va en el recibo (c_TipoDeduccion): 010, 011, 007, 004, 012, 018 o 019.
     */
    @JsonProperty("deduction_type")
    private String deductionType;

    /**
     * Cómo se calcula (vea POST /v1/employee_deductions).
     * <p>
     * Valores: percent_sbc, fixed_month, vsm, percent_net, percent_gross, fixed_period, percent_salary.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * El porcentaje, el factor de VSM o el monto.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * El monto de un préstamo o anticipo.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que ya descontaron los recibos timbrados.
     */
    @JsonProperty("paid")
    private BigDecimal paid;

    /**
     * Lo que falta de un préstamo o anticipo.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * El número de crédito, el expediente o una nota.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * A quién se paga una pensión.
     */
    @JsonProperty("beneficiary")
    private String beneficiary;

    /**
     * Desde qué día se descuenta.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Hasta qué día, o null.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Una pensión que también se descuenta del aguinaldo, la PTU y el finiquito.
     */
    @JsonProperty("extraordinary")
    private Boolean extraordinary;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public EmployeeDeduction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeeDeduction setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeeDeduction setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public EmployeeDeduction setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeDeduction setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public EmployeeDeduction setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public EmployeeDeduction setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeDeduction setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public EmployeeDeduction setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * infonavit, fonacot, pension (pensión alimenticia), prestamo, anticipo (de salarios), caja (de ahorro) o sindical.
     * <p>
     * Valores: infonavit, fonacot, pension, prestamo, anticipo, caja, sindical.
     */
    public String getKind() {
        return kind;
    }

    public EmployeeDeduction setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * La clave del SAT con que va en el recibo (c_TipoDeduccion): 010, 011, 007, 004, 012, 018 o 019.
     */
    public String getDeductionType() {
        return deductionType;
    }

    public EmployeeDeduction setDeductionType(String deductionType) {
        this.deductionType = deductionType;
        return this;
    }

    /**
     * Cómo se calcula (vea POST /v1/employee_deductions).
     * <p>
     * Valores: percent_sbc, fixed_month, vsm, percent_net, percent_gross, fixed_period, percent_salary.
     */
    public String getMode() {
        return mode;
    }

    public EmployeeDeduction setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * El porcentaje, el factor de VSM o el monto.
     */
    public BigDecimal getValue() {
        return value;
    }

    public EmployeeDeduction setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public EmployeeDeduction setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * El monto de un préstamo o anticipo.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public EmployeeDeduction setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public EmployeeDeduction setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que ya descontaron los recibos timbrados.
     */
    public BigDecimal getPaid() {
        return paid;
    }

    public EmployeeDeduction setPaid(BigDecimal paid) {
        this.paid = paid;
        return this;
    }

    @JsonIgnore
    public EmployeeDeduction setPaid(double paid) {
        return setPaid(BigDecimal.valueOf(paid));
    }

    /**
     * Lo que falta de un préstamo o anticipo.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public EmployeeDeduction setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public EmployeeDeduction setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * El número de crédito, el expediente o una nota.
     */
    public String getReference() {
        return reference;
    }

    public EmployeeDeduction setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A quién se paga una pensión.
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    public EmployeeDeduction setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * Desde qué día se descuenta.
     */
    public String getStartDate() {
        return startDate;
    }

    public EmployeeDeduction setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Hasta qué día, o null.
     */
    public String getEndDate() {
        return endDate;
    }

    public EmployeeDeduction setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Una pensión que también se descuenta del aguinaldo, la PTU y el finiquito.
     */
    public Boolean getExtraordinary() {
        return extraordinary;
    }

    public EmployeeDeduction setExtraordinary(Boolean extraordinary) {
        this.extraordinary = extraordinary;
        return this;
    }
}
