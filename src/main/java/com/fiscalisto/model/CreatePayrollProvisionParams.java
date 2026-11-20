// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayrollProvisionParams: los campos de «Registrar las cuotas patronales de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollProvisionParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La prima de riesgo de trabajo de su determinación anual, como fracción (0.0054355 es 0.54355%). Se guarda para los meses siguientes. Sin ella, la guardada o la prima media de la clase.
     */
    @JsonProperty("employer_risk_premium")
    private BigDecimal employerRiskPremium;

    /**
     * Las cuotas patronales al IMSS en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    @JsonProperty("imss")
    private BigDecimal imss;

    /**
     * Retiro y cesantía y vejez en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    @JsonProperty("sar")
    private BigDecimal sar;

    /**
     * La aportación al Infonavit en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    @JsonProperty("infonavit")
    private BigDecimal infonavit;

    /**
     * El impuesto sobre nómina en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    @JsonProperty("payroll_tax")
    private BigDecimal payrollTax;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollProvisionParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La prima de riesgo de trabajo de su determinación anual, como fracción (0.0054355 es 0.54355%). Se guarda para los meses siguientes. Sin ella, la guardada o la prima media de la clase.
     */
    public BigDecimal getEmployerRiskPremium() {
        return employerRiskPremium;
    }

    public CreatePayrollProvisionParams setEmployerRiskPremium(BigDecimal employerRiskPremium) {
        this.employerRiskPremium = employerRiskPremium;
        return this;
    }

    @JsonIgnore
    public CreatePayrollProvisionParams setEmployerRiskPremium(double employerRiskPremium) {
        return setEmployerRiskPremium(BigDecimal.valueOf(employerRiskPremium));
    }

    /**
     * Las cuotas patronales al IMSS en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    public BigDecimal getImss() {
        return imss;
    }

    public CreatePayrollProvisionParams setImss(BigDecimal imss) {
        this.imss = imss;
        return this;
    }

    @JsonIgnore
    public CreatePayrollProvisionParams setImss(double imss) {
        return setImss(BigDecimal.valueOf(imss));
    }

    /**
     * Retiro y cesantía y vejez en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    public BigDecimal getSar() {
        return sar;
    }

    public CreatePayrollProvisionParams setSar(BigDecimal sar) {
        this.sar = sar;
        return this;
    }

    @JsonIgnore
    public CreatePayrollProvisionParams setSar(double sar) {
        return setSar(BigDecimal.valueOf(sar));
    }

    /**
     * La aportación al Infonavit en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    public BigDecimal getInfonavit() {
        return infonavit;
    }

    public CreatePayrollProvisionParams setInfonavit(BigDecimal infonavit) {
        this.infonavit = infonavit;
        return this;
    }

    @JsonIgnore
    public CreatePayrollProvisionParams setInfonavit(double infonavit) {
        return setInfonavit(BigDecimal.valueOf(infonavit));
    }

    /**
     * El impuesto sobre nómina en pesos, si no quiere el calculado (el del SUA, por ejemplo).
     */
    public BigDecimal getPayrollTax() {
        return payrollTax;
    }

    public CreatePayrollProvisionParams setPayrollTax(BigDecimal payrollTax) {
        this.payrollTax = payrollTax;
        return this;
    }

    @JsonIgnore
    public CreatePayrollProvisionParams setPayrollTax(double payrollTax) {
        return setPayrollTax(BigDecimal.valueOf(payrollTax));
    }
}
