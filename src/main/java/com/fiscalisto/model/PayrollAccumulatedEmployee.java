// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollAccumulatedEmployee: PayrollAccumulatedEmployee.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollAccumulatedEmployee {
    /**
     * emp_…, o null.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El RFC del empleado.
     */
    @JsonProperty("rfc")
    private String rfc;

    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Sus recibos en el año.
     */
    @JsonProperty("receipts")
    private BigDecimal receipts;

    /**
     * El total de sus percepciones del año, gravado más exento.
     */
    @JsonProperty("perceptions")
    private BigDecimal perceptions;

    /**
     * Monto gravado (MontoTotGrav). Por omisión, operation menos exempt.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Monto exento (MontoTotExent). Por omisión 0.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * ISR retenido (deducción 002).
     */
    @JsonProperty("isr_withheld")
    private BigDecimal isrWithheld;

    /**
     * IMSS retenido (deducción 001).
     */
    @JsonProperty("imss_withheld")
    private BigDecimal imssWithheld;

    /**
     * Las demás deducciones (Infonavit, préstamos, fondo de ahorro…).
     */
    @JsonProperty("other_deductions")
    private BigDecimal otherDeductions;

    /**
     * El total de sus otros pagos del año (el subsidio entregado entre ellos).
     */
    @JsonProperty("other_payments")
    private BigDecimal otherPayments;

    /**
     * Subsidio para el empleo causado (otro pago 002).
     */
    @JsonProperty("employment_subsidy")
    private BigDecimal employmentSubsidy;

    /**
     * Su neto del año.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * emp_…, o null.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollAccumulatedEmployee setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollAccumulatedEmployee setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El RFC del empleado.
     */
    public String getRfc() {
        return rfc;
    }

    public PayrollAccumulatedEmployee setRfc(String rfc) {
        this.rfc = rfc;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public PayrollAccumulatedEmployee setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Sus recibos en el año.
     */
    public BigDecimal getReceipts() {
        return receipts;
    }

    public PayrollAccumulatedEmployee setReceipts(BigDecimal receipts) {
        this.receipts = receipts;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setReceipts(double receipts) {
        return setReceipts(BigDecimal.valueOf(receipts));
    }

    /**
     * El total de sus percepciones del año, gravado más exento.
     */
    public BigDecimal getPerceptions() {
        return perceptions;
    }

    public PayrollAccumulatedEmployee setPerceptions(BigDecimal perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setPerceptions(double perceptions) {
        return setPerceptions(BigDecimal.valueOf(perceptions));
    }

    /**
     * Monto gravado (MontoTotGrav). Por omisión, operation menos exempt.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public PayrollAccumulatedEmployee setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Monto exento (MontoTotExent). Por omisión 0.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public PayrollAccumulatedEmployee setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * ISR retenido (deducción 002).
     */
    public BigDecimal getIsrWithheld() {
        return isrWithheld;
    }

    public PayrollAccumulatedEmployee setIsrWithheld(BigDecimal isrWithheld) {
        this.isrWithheld = isrWithheld;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setIsrWithheld(double isrWithheld) {
        return setIsrWithheld(BigDecimal.valueOf(isrWithheld));
    }

    /**
     * IMSS retenido (deducción 001).
     */
    public BigDecimal getImssWithheld() {
        return imssWithheld;
    }

    public PayrollAccumulatedEmployee setImssWithheld(BigDecimal imssWithheld) {
        this.imssWithheld = imssWithheld;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setImssWithheld(double imssWithheld) {
        return setImssWithheld(BigDecimal.valueOf(imssWithheld));
    }

    /**
     * Las demás deducciones (Infonavit, préstamos, fondo de ahorro…).
     */
    public BigDecimal getOtherDeductions() {
        return otherDeductions;
    }

    public PayrollAccumulatedEmployee setOtherDeductions(BigDecimal otherDeductions) {
        this.otherDeductions = otherDeductions;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setOtherDeductions(double otherDeductions) {
        return setOtherDeductions(BigDecimal.valueOf(otherDeductions));
    }

    /**
     * El total de sus otros pagos del año (el subsidio entregado entre ellos).
     */
    public BigDecimal getOtherPayments() {
        return otherPayments;
    }

    public PayrollAccumulatedEmployee setOtherPayments(BigDecimal otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setOtherPayments(double otherPayments) {
        return setOtherPayments(BigDecimal.valueOf(otherPayments));
    }

    /**
     * Subsidio para el empleo causado (otro pago 002).
     */
    public BigDecimal getEmploymentSubsidy() {
        return employmentSubsidy;
    }

    public PayrollAccumulatedEmployee setEmploymentSubsidy(BigDecimal employmentSubsidy) {
        this.employmentSubsidy = employmentSubsidy;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setEmploymentSubsidy(double employmentSubsidy) {
        return setEmploymentSubsidy(BigDecimal.valueOf(employmentSubsidy));
    }

    /**
     * Su neto del año.
     */
    public BigDecimal getNet() {
        return net;
    }

    public PayrollAccumulatedEmployee setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedEmployee setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }
}
