// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollCostMonth: PayrollCostMonth.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCostMonth {
    /**
     * 2026-11
     */
    @JsonProperty("month")
    private String month;

    /**
     * Los recibos con fecha de pago en el mes.
     */
    @JsonProperty("receipts")
    private BigDecimal receipts;

    /**
     * Los empleados con recibo en el mes.
     */
    @JsonProperty("employees")
    private BigDecimal employees;

    /**
     * Percepciones y otros pagos de los recibos, sin el subsidio para el empleo.
     */
    @JsonProperty("paid")
    private BigDecimal paid;

    /**
     * Cuotas del patrón al IMSS, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("imss")
    private BigDecimal imss;

    /**
     * Retiro y cesantía y vejez del patrón, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("sar")
    private BigDecimal sar;

    /**
     * Aportación al Infonavit, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("infonavit")
    private BigDecimal infonavit;

    /**
     * Impuesto sobre nómina, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("payroll_tax")
    private BigDecimal payrollTax;

    /**
     * Lo pagado más las cuotas y el ISN, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * 2026-11
     */
    public String getMonth() {
        return month;
    }

    public PayrollCostMonth setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Los recibos con fecha de pago en el mes.
     */
    public BigDecimal getReceipts() {
        return receipts;
    }

    public PayrollCostMonth setReceipts(BigDecimal receipts) {
        this.receipts = receipts;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setReceipts(double receipts) {
        return setReceipts(BigDecimal.valueOf(receipts));
    }

    /**
     * Los empleados con recibo en el mes.
     */
    public BigDecimal getEmployees() {
        return employees;
    }

    public PayrollCostMonth setEmployees(BigDecimal employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setEmployees(double employees) {
        return setEmployees(BigDecimal.valueOf(employees));
    }

    /**
     * Percepciones y otros pagos de los recibos, sin el subsidio para el empleo.
     */
    public BigDecimal getPaid() {
        return paid;
    }

    public PayrollCostMonth setPaid(BigDecimal paid) {
        this.paid = paid;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setPaid(double paid) {
        return setPaid(BigDecimal.valueOf(paid));
    }

    /**
     * Cuotas del patrón al IMSS, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getImss() {
        return imss;
    }

    public PayrollCostMonth setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Retiro y cesantía y vejez del patrón, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getSar() {
        return sar;
    }

    public PayrollCostMonth setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * Aportación al Infonavit, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public PayrollCostMonth setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }

    /**
     * Impuesto sobre nómina, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public PayrollCostMonth setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }

    /**
     * Lo pagado más las cuotas y el ISN, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollCostMonth setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollCostMonth setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
