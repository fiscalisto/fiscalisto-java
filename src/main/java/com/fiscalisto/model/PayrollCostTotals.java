// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollCostTotals: Totales (Totales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCostTotals {
    /**
     * Lo pagado a los empleados en el año.
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
     * El costo total, o null si las tasas del año aún no están cargadas.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo pagado a los empleados en el año.
     */
    public BigDecimal getPaid() {
        return paid;
    }

    public PayrollCostTotals setPaid(BigDecimal paid) {
        this.paid = paid;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setPaid(double paid) {
        return setPaid(BigDecimal.valueOf(paid));
    }

    /**
     * Cuotas del patrón al IMSS, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getImss() {
        return imss;
    }

    public PayrollCostTotals setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Retiro y cesantía y vejez del patrón, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getSar() {
        return sar;
    }

    public PayrollCostTotals setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * Aportación al Infonavit, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public PayrollCostTotals setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }

    /**
     * Impuesto sobre nómina, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public PayrollCostTotals setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }

    /**
     * El costo total, o null si las tasas del año aún no están cargadas.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollCostTotals setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollCostTotals setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
