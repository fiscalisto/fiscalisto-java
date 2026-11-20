// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollProvisionCalculated: Lo calculado: imss (enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías), sar (retiro y cesantía y vejez), infonavit y payroll_tax (el impuesto sobre nómina del mes, como GET /v1/payroll_taxes).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollProvisionCalculated {
    /**
     * Calculado: enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías.
     */
    @JsonProperty("imss")
    private BigDecimal imss;

    /**
     * Calculado: retiro y cesantía en edad avanzada y vejez.
     */
    @JsonProperty("sar")
    private BigDecimal sar;

    /**
     * Calculado: la aportación al Infonavit (5%).
     */
    @JsonProperty("infonavit")
    private BigDecimal infonavit;

    /**
     * Calculado: el impuesto sobre nómina del mes.
     */
    @JsonProperty("payroll_tax")
    private BigDecimal payrollTax;

    /**
     * Calculado: enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías.
     */
    public BigDecimal getImss() {
        return imss;
    }

    public PayrollProvisionCalculated setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionCalculated setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Calculado: retiro y cesantía en edad avanzada y vejez.
     */
    public BigDecimal getSar() {
        return sar;
    }

    public PayrollProvisionCalculated setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionCalculated setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * Calculado: la aportación al Infonavit (5%).
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public PayrollProvisionCalculated setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionCalculated setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }

    /**
     * Calculado: el impuesto sobre nómina del mes.
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public PayrollProvisionCalculated setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionCalculated setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }
}
