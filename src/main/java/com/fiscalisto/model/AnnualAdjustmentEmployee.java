// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualAdjustmentEmployee: AnnualAdjustmentEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualAdjustmentEmployee {
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
     * Su nombre.
     */
    @JsonProperty("employee_name")
    private String employeeName;

    /**
     * Todo lo que le pagaron sus recibos del año, gravado y exento: si pasa de $400,000 presenta su propia declaración.
     */
    @JsonProperty("income")
    private BigDecimal income;

    /**
     * Lo gravado del año.
     */
    @JsonProperty("taxable_income")
    private BigDecimal taxableIncome;

    /**
     * El ISR del ejercicio: la tarifa del artículo 152 sobre taxable_income.
     */
    @JsonProperty("annual_tax")
    private BigDecimal annualTax;

    /**
     * El subsidio para el empleo que le correspondió en el año.
     */
    @JsonProperty("employment_subsidy")
    private BigDecimal employmentSubsidy;

    /**
     * annual_tax menos employment_subsidy, nunca negativo.
     */
    @JsonProperty("tax_due")
    private BigDecimal taxDue;

    /**
     * El ISR que le retuvieron sus recibos del año.
     */
    @JsonProperty("tax_withheld")
    private BigDecimal taxWithheld;

    /**
     * tax_due menos tax_withheld: positivo a cargo, negativo a favor.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Por qué no se le calcula (artículo 97): started, entró después del 1 de enero; left, salió antes del 1 de diciembre; income, ganó más de $400,000; files_own, presenta su declaración; minimum, gana el salario mínimo y su saldo a cargo no se le descuenta (Constitución art. 123-A-VIII, LFT 97).
     * <p>
     * Valores: started, left, income, files_own, minimum.
     */
    @JsonProperty("excluded")
    private String excluded;

    /**
     * Si avisó por escrito que presentará su declaración anual.
     */
    @JsonProperty("files_own_return")
    private Boolean filesOwnReturn;

    /**
     * Los meses sin recibo timbrado: falta alguno de otro sistema.
     */
    @JsonProperty("missing_months")
    private List<Long> missingMonths;

    /**
     * La diferencia aplicada (positiva a cargo, negativa a favor), o null.
     */
    @JsonProperty("applied_amount")
    private BigDecimal appliedAmount;

    /**
     * Lo que de applied_amount aún no lleva ningún recibo timbrado.
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public AnnualAdjustmentEmployee setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su número de empleado.
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public AnnualAdjustmentEmployee setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public AnnualAdjustmentEmployee setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * Todo lo que le pagaron sus recibos del año, gravado y exento: si pasa de $400,000 presenta su propia declaración.
     */
    public BigDecimal getIncome() {
        return income;
    }

    public AnnualAdjustmentEmployee setIncome(BigDecimal income) {
        this.income = income;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setIncome(double income) {
        return setIncome(BigDecimal.valueOf(income));
    }

    /**
     * Lo gravado del año.
     */
    public BigDecimal getTaxableIncome() {
        return taxableIncome;
    }

    public AnnualAdjustmentEmployee setTaxableIncome(BigDecimal taxableIncome) {
        this.taxableIncome = taxableIncome;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setTaxableIncome(double taxableIncome) {
        return setTaxableIncome(BigDecimal.valueOf(taxableIncome));
    }

    /**
     * El ISR del ejercicio: la tarifa del artículo 152 sobre taxable_income.
     */
    public BigDecimal getAnnualTax() {
        return annualTax;
    }

    public AnnualAdjustmentEmployee setAnnualTax(BigDecimal annualTax) {
        this.annualTax = annualTax;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setAnnualTax(double annualTax) {
        return setAnnualTax(BigDecimal.valueOf(annualTax));
    }

    /**
     * El subsidio para el empleo que le correspondió en el año.
     */
    public BigDecimal getEmploymentSubsidy() {
        return employmentSubsidy;
    }

    public AnnualAdjustmentEmployee setEmploymentSubsidy(BigDecimal employmentSubsidy) {
        this.employmentSubsidy = employmentSubsidy;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setEmploymentSubsidy(double employmentSubsidy) {
        return setEmploymentSubsidy(BigDecimal.valueOf(employmentSubsidy));
    }

    /**
     * annual_tax menos employment_subsidy, nunca negativo.
     */
    public BigDecimal getTaxDue() {
        return taxDue;
    }

    public AnnualAdjustmentEmployee setTaxDue(BigDecimal taxDue) {
        this.taxDue = taxDue;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setTaxDue(double taxDue) {
        return setTaxDue(BigDecimal.valueOf(taxDue));
    }

    /**
     * El ISR que le retuvieron sus recibos del año.
     */
    public BigDecimal getTaxWithheld() {
        return taxWithheld;
    }

    public AnnualAdjustmentEmployee setTaxWithheld(BigDecimal taxWithheld) {
        this.taxWithheld = taxWithheld;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setTaxWithheld(double taxWithheld) {
        return setTaxWithheld(BigDecimal.valueOf(taxWithheld));
    }

    /**
     * tax_due menos tax_withheld: positivo a cargo, negativo a favor.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public AnnualAdjustmentEmployee setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * Por qué no se le calcula (artículo 97): started, entró después del 1 de enero; left, salió antes del 1 de diciembre; income, ganó más de $400,000; files_own, presenta su declaración; minimum, gana el salario mínimo y su saldo a cargo no se le descuenta (Constitución art. 123-A-VIII, LFT 97).
     * <p>
     * Valores: started, left, income, files_own, minimum.
     */
    public String getExcluded() {
        return excluded;
    }

    public AnnualAdjustmentEmployee setExcluded(String excluded) {
        this.excluded = excluded;
        return this;
    }

    /**
     * Si avisó por escrito que presentará su declaración anual.
     */
    public Boolean getFilesOwnReturn() {
        return filesOwnReturn;
    }

    public AnnualAdjustmentEmployee setFilesOwnReturn(Boolean filesOwnReturn) {
        this.filesOwnReturn = filesOwnReturn;
        return this;
    }

    /**
     * Los meses sin recibo timbrado: falta alguno de otro sistema.
     */
    public List<Long> getMissingMonths() {
        return missingMonths;
    }

    public AnnualAdjustmentEmployee setMissingMonths(List<Long> missingMonths) {
        this.missingMonths = missingMonths;
        return this;
    }

    /**
     * La diferencia aplicada (positiva a cargo, negativa a favor), o null.
     */
    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public AnnualAdjustmentEmployee setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setAppliedAmount(double appliedAmount) {
        return setAppliedAmount(BigDecimal.valueOf(appliedAmount));
    }

    /**
     * Lo que de applied_amount aún no lleva ningún recibo timbrado.
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public AnnualAdjustmentEmployee setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustmentEmployee setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
