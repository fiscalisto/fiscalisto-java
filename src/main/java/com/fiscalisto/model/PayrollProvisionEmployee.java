// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * PayrollProvisionEmployee: PayrollProvisionEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollProvisionEmployee {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su salario base de cotización: el SDI del recibo, entre el salario mínimo y 25 UMA.
     */
    @JsonProperty("sbc")
    private BigDecimal sbc;

    /**
     * Días del mes en enfermedades y maternidad: menos las incapacidades.
     */
    @JsonProperty("days_health")
    private BigDecimal daysHealth;

    /**
     * Días en invalidez y vida, riesgos de trabajo, guarderías y cesantía y vejez: menos faltas (hasta 7 al mes) e incapacidades.
     */
    @JsonProperty("days_disability_life")
    private BigDecimal daysDisabilityLife;

    /**
     * Días en retiro e Infonavit: menos las faltas; las incapacidades sí cuentan.
     */
    @JsonProperty("days_retirement")
    private BigDecimal daysRetirement;

    /**
     * Gana el salario mínimo: la empresa paga también su parte (LSS art. 36).
     */
    @JsonProperty("minimum_wage")
    private Boolean minimumWage;

    /**
     * Sus cuotas patronales al IMSS.
     */
    @JsonProperty("imss")
    private BigDecimal imss;

    /**
     * Su retiro y cesantía y vejez.
     */
    @JsonProperty("sar")
    private BigDecimal sar;

    /**
     * Su aportación al Infonavit.
     */
    @JsonProperty("infonavit")
    private BigDecimal infonavit;

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public PayrollProvisionEmployee setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollProvisionEmployee setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public PayrollProvisionEmployee setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollProvisionEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su salario base de cotización: el SDI del recibo, entre el salario mínimo y 25 UMA.
     */
    public BigDecimal getSbc() {
        return sbc;
    }

    public PayrollProvisionEmployee setSbc(BigDecimal sbc) {
        this.sbc = sbc;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setSbc(double sbc) {
        return setSbc(BigDecimal.valueOf(sbc));
    }

    /**
     * Días del mes en enfermedades y maternidad: menos las incapacidades.
     */
    public BigDecimal getDaysHealth() {
        return daysHealth;
    }

    public PayrollProvisionEmployee setDaysHealth(BigDecimal daysHealth) {
        this.daysHealth = daysHealth;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setDaysHealth(double daysHealth) {
        return setDaysHealth(BigDecimal.valueOf(daysHealth));
    }

    /**
     * Días en invalidez y vida, riesgos de trabajo, guarderías y cesantía y vejez: menos faltas (hasta 7 al mes) e incapacidades.
     */
    public BigDecimal getDaysDisabilityLife() {
        return daysDisabilityLife;
    }

    public PayrollProvisionEmployee setDaysDisabilityLife(BigDecimal daysDisabilityLife) {
        this.daysDisabilityLife = daysDisabilityLife;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setDaysDisabilityLife(double daysDisabilityLife) {
        return setDaysDisabilityLife(BigDecimal.valueOf(daysDisabilityLife));
    }

    /**
     * Días en retiro e Infonavit: menos las faltas; las incapacidades sí cuentan.
     */
    public BigDecimal getDaysRetirement() {
        return daysRetirement;
    }

    public PayrollProvisionEmployee setDaysRetirement(BigDecimal daysRetirement) {
        this.daysRetirement = daysRetirement;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setDaysRetirement(double daysRetirement) {
        return setDaysRetirement(BigDecimal.valueOf(daysRetirement));
    }

    /**
     * Gana el salario mínimo: la empresa paga también su parte (LSS art. 36).
     */
    public Boolean getMinimumWage() {
        return minimumWage;
    }

    public PayrollProvisionEmployee setMinimumWage(Boolean minimumWage) {
        this.minimumWage = minimumWage;
        return this;
    }

    /**
     * Sus cuotas patronales al IMSS.
     */
    public BigDecimal getImss() {
        return imss;
    }

    public PayrollProvisionEmployee setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Su retiro y cesantía y vejez.
     */
    public BigDecimal getSar() {
        return sar;
    }

    public PayrollProvisionEmployee setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * Su aportación al Infonavit.
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public PayrollProvisionEmployee setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionEmployee setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }
}
