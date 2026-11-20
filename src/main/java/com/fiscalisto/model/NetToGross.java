// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * NetToGross: Neto a bruto: el salario diario cuyo recibo ordinario de un periodo completo paga un neto, sin faltas, incidencias ni descuentos como Infonavit o préstamos. No guarda nada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetToGross {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El empleado (emp_…) cuyas prestaciones usó, o null.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * 02 semanal, 03 catorcenal, 04 quincenal o 05 mensual.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * El neto que pidió.
     */
    @JsonProperty("net_requested")
    private BigDecimal netRequested;

    /**
     * El salario diario cuyo recibo paga al menos ese neto (redondeado al centavo hacia arriba).
     */
    @JsonProperty("daily_salary")
    private BigDecimal dailySalary;

    /**
     * Su salario diario integrado (SDI) con el factor de sus prestaciones.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * El periodo con que se calculó (el actual de la periodicidad).
     */
    @JsonProperty("period")
    private NetToGrossPeriod period;

    /**
     * Los días pagados de un periodo completo.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Total de percepciones del recibo.
     */
    @JsonProperty("perceptions")
    private BigDecimal perceptions;

    /**
     * Total de deducciones (ISR, IMSS, fondo de ahorro).
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * ISR retenido.
     */
    @JsonProperty("taxes_withheld")
    private BigDecimal taxesWithheld;

    /**
     * Otros pagos.
     */
    @JsonProperty("other_payments")
    private BigDecimal otherPayments;

    /**
     * El neto del recibo con ese salario.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public NetToGross setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El empleado (emp_…) cuyas prestaciones usó, o null.
     */
    public String getEmployee() {
        return employee;
    }

    public NetToGross setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * 02 semanal, 03 catorcenal, 04 quincenal o 05 mensual.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public NetToGross setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * El neto que pidió.
     */
    public BigDecimal getNetRequested() {
        return netRequested;
    }

    public NetToGross setNetRequested(BigDecimal netRequested) {
        this.netRequested = netRequested;
        return this;
    }

    @JsonIgnore
    public NetToGross setNetRequested(double netRequested) {
        return setNetRequested(BigDecimal.valueOf(netRequested));
    }

    /**
     * El salario diario cuyo recibo paga al menos ese neto (redondeado al centavo hacia arriba).
     */
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public NetToGross setDailySalary(BigDecimal dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    @JsonIgnore
    public NetToGross setDailySalary(double dailySalary) {
        return setDailySalary(BigDecimal.valueOf(dailySalary));
    }

    /**
     * Su salario diario integrado (SDI) con el factor de sus prestaciones.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public NetToGross setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public NetToGross setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * El periodo con que se calculó (el actual de la periodicidad).
     */
    public NetToGrossPeriod getPeriod() {
        return period;
    }

    public NetToGross setPeriod(NetToGrossPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Los días pagados de un periodo completo.
     */
    public BigDecimal getDays() {
        return days;
    }

    public NetToGross setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public NetToGross setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Total de percepciones del recibo.
     */
    public BigDecimal getPerceptions() {
        return perceptions;
    }

    public NetToGross setPerceptions(BigDecimal perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    @JsonIgnore
    public NetToGross setPerceptions(double perceptions) {
        return setPerceptions(BigDecimal.valueOf(perceptions));
    }

    /**
     * Total de deducciones (ISR, IMSS, fondo de ahorro).
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public NetToGross setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public NetToGross setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * ISR retenido.
     */
    public BigDecimal getTaxesWithheld() {
        return taxesWithheld;
    }

    public NetToGross setTaxesWithheld(BigDecimal taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
        return this;
    }

    @JsonIgnore
    public NetToGross setTaxesWithheld(double taxesWithheld) {
        return setTaxesWithheld(BigDecimal.valueOf(taxesWithheld));
    }

    /**
     * Otros pagos.
     */
    public BigDecimal getOtherPayments() {
        return otherPayments;
    }

    public NetToGross setOtherPayments(BigDecimal otherPayments) {
        this.otherPayments = otherPayments;
        return this;
    }

    @JsonIgnore
    public NetToGross setOtherPayments(double otherPayments) {
        return setOtherPayments(BigDecimal.valueOf(otherPayments));
    }

    /**
     * El neto del recibo con ese salario.
     */
    public BigDecimal getNet() {
        return net;
    }

    public NetToGross setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public NetToGross setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }
}
