// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * RepseReturnWorker: RepseReturnWorker.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturnWorker {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su NSS.
     */
    @JsonProperty("nss")
    private String nss;

    /**
     * El bimestre del año (1 a 6).
     */
    @JsonProperty("bimester")
    private Long bimester;

    /**
     * Los números de los contratos en que trabajó ese bimestre.
     */
    @JsonProperty("contracts")
    private List<String> contracts;

    /**
     * Las percepciones variables del bimestre anterior que integraron su salario (LSS arts. 27 y 30).
     */
    @JsonProperty("variable_perceptions")
    private BigDecimal variablePerceptions;

    /**
     * Lo pagado en el bimestre de sueldos, aguinaldo y prima vacacional.
     */
    @JsonProperty("fixed_perceptions")
    private BigDecimal fixedPerceptions;

    /**
     * Días de incapacidad del bimestre.
     */
    @JsonProperty("disability_days")
    private Long disabilityDays;

    /**
     * Lo demás pagado en el bimestre que no integra el salario.
     */
    @JsonProperty("non_integrable_perceptions")
    private BigDecimal nonIntegrablePerceptions;

    /**
     * Su salario base al cierre del bimestre, hasta 25 UMA.
     */
    @JsonProperty("capped_salary")
    private BigDecimal cappedSalary;

    /**
     * Su aportación al Infonavit del bimestre (5% del salario base).
     */
    @JsonProperty("infonavit_contribution")
    private BigDecimal infonavitContribution;

    /**
     * true si tuvo descuento de crédito Infonavit en el bimestre.
     */
    @JsonProperty("has_credit")
    private Boolean hasCredit;

    /**
     * Lo que se le descontó de amortización del crédito en el bimestre.
     */
    @JsonProperty("amortization")
    private BigDecimal amortization;

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public RepseReturnWorker setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public RepseReturnWorker setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public RepseReturnWorker setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public RepseReturnWorker setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su NSS.
     */
    public String getNss() {
        return nss;
    }

    public RepseReturnWorker setNss(String nss) {
        this.nss = nss;
        return this;
    }

    /**
     * El bimestre del año (1 a 6).
     */
    public Long getBimester() {
        return bimester;
    }

    public RepseReturnWorker setBimester(Long bimester) {
        this.bimester = bimester;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setBimester(long bimester) {
        return setBimester(Long.valueOf(bimester));
    }

    /**
     * Los números de los contratos en que trabajó ese bimestre.
     */
    public List<String> getContracts() {
        return contracts;
    }

    public RepseReturnWorker setContracts(List<String> contracts) {
        this.contracts = contracts;
        return this;
    }

    /**
     * Las percepciones variables del bimestre anterior que integraron su salario (LSS arts. 27 y 30).
     */
    public BigDecimal getVariablePerceptions() {
        return variablePerceptions;
    }

    public RepseReturnWorker setVariablePerceptions(BigDecimal variablePerceptions) {
        this.variablePerceptions = variablePerceptions;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setVariablePerceptions(double variablePerceptions) {
        return setVariablePerceptions(BigDecimal.valueOf(variablePerceptions));
    }

    /**
     * Lo pagado en el bimestre de sueldos, aguinaldo y prima vacacional.
     */
    public BigDecimal getFixedPerceptions() {
        return fixedPerceptions;
    }

    public RepseReturnWorker setFixedPerceptions(BigDecimal fixedPerceptions) {
        this.fixedPerceptions = fixedPerceptions;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setFixedPerceptions(double fixedPerceptions) {
        return setFixedPerceptions(BigDecimal.valueOf(fixedPerceptions));
    }

    /**
     * Días de incapacidad del bimestre.
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public RepseReturnWorker setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Lo demás pagado en el bimestre que no integra el salario.
     */
    public BigDecimal getNonIntegrablePerceptions() {
        return nonIntegrablePerceptions;
    }

    public RepseReturnWorker setNonIntegrablePerceptions(BigDecimal nonIntegrablePerceptions) {
        this.nonIntegrablePerceptions = nonIntegrablePerceptions;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setNonIntegrablePerceptions(double nonIntegrablePerceptions) {
        return setNonIntegrablePerceptions(BigDecimal.valueOf(nonIntegrablePerceptions));
    }

    /**
     * Su salario base al cierre del bimestre, hasta 25 UMA.
     */
    public BigDecimal getCappedSalary() {
        return cappedSalary;
    }

    public RepseReturnWorker setCappedSalary(BigDecimal cappedSalary) {
        this.cappedSalary = cappedSalary;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setCappedSalary(double cappedSalary) {
        return setCappedSalary(BigDecimal.valueOf(cappedSalary));
    }

    /**
     * Su aportación al Infonavit del bimestre (5% del salario base).
     */
    public BigDecimal getInfonavitContribution() {
        return infonavitContribution;
    }

    public RepseReturnWorker setInfonavitContribution(BigDecimal infonavitContribution) {
        this.infonavitContribution = infonavitContribution;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setInfonavitContribution(double infonavitContribution) {
        return setInfonavitContribution(BigDecimal.valueOf(infonavitContribution));
    }

    /**
     * true si tuvo descuento de crédito Infonavit en el bimestre.
     */
    public Boolean getHasCredit() {
        return hasCredit;
    }

    public RepseReturnWorker setHasCredit(Boolean hasCredit) {
        this.hasCredit = hasCredit;
        return this;
    }

    /**
     * Lo que se le descontó de amortización del crédito en el bimestre.
     */
    public BigDecimal getAmortization() {
        return amortization;
    }

    public RepseReturnWorker setAmortization(BigDecimal amortization) {
        this.amortization = amortization;
        return this;
    }

    @JsonIgnore
    public RepseReturnWorker setAmortization(double amortization) {
        return setAmortization(BigDecimal.valueOf(amortization));
    }
}
