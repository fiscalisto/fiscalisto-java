// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollProvisionPosted: PayrollProvisionPosted.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollProvisionPosted {
    /**
     * Registrado: enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías.
     */
    @JsonProperty("imss")
    private BigDecimal imss;

    /**
     * Registrado: retiro y cesantía en edad avanzada y vejez.
     */
    @JsonProperty("sar")
    private BigDecimal sar;

    /**
     * Registrado: la aportación al Infonavit (5%).
     */
    @JsonProperty("infonavit")
    private BigDecimal infonavit;

    /**
     * Registrado: el impuesto sobre nómina del mes.
     */
    @JsonProperty("payroll_tax")
    private BigDecimal payrollTax;

    /**
     * Registrado: enfermedades y maternidad, invalidez y vida, riesgos de trabajo y guarderías.
     */
    public BigDecimal getImss() {
        return imss;
    }

    public PayrollProvisionPosted setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPosted setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Registrado: retiro y cesantía en edad avanzada y vejez.
     */
    public BigDecimal getSar() {
        return sar;
    }

    public PayrollProvisionPosted setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPosted setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * Registrado: la aportación al Infonavit (5%).
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public PayrollProvisionPosted setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPosted setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }

    /**
     * Registrado: el impuesto sobre nómina del mes.
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public PayrollProvisionPosted setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public PayrollProvisionPosted setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }
}
