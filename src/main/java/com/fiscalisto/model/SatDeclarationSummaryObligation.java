// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * SatDeclarationSummaryObligation: SatDeclarationSummaryObligation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationSummaryObligation {
    /**
     * Qué obligación es.
     * <p>
     * Valores: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings, other.
     */
    @JsonProperty("obligation")
    private String obligation;

    /**
     * Su nombre como lo imprime el SAT.
     */
    @JsonProperty("name")
    private String name;

    /**
     * true si sus cifras se leyeron de la declaración; false si solo vienen del acuse.
     */
    @JsonProperty("read")
    private Boolean read;

    /**
     * La cantidad a cargo.
     */
    @JsonProperty("amount_due")
    private BigDecimal amountDue;

    /**
     * La cantidad a pagar.
     */
    @JsonProperty("amount_to_pay")
    private BigDecimal amountToPay;

    /**
     * Sus cifras con nombres fijos. ISR: income, invoiced_income, income_ytd, deductions, profit_coefficient, taxable_profit, losses_applied, tax_base, tax_caused, prior_payments, withheld. IVA: taxable_16, taxable_0, exempt, charged, paid_16, creditable, withheld, balance_applied. Salarios: workers, payments, exempt, withheld. Todas: surcharges, inflation, paid_before, due, in_favor, to_pay. null si no viene o no se pudo leer.
     */
    @JsonProperty("figures")
    private Map<String, Object> figures;

    /**
     * Qué obligación es.
     * <p>
     * Valores: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings, other.
     */
    public String getObligation() {
        return obligation;
    }

    public SatDeclarationSummaryObligation setObligation(String obligation) {
        this.obligation = obligation;
        return this;
    }

    /**
     * Su nombre como lo imprime el SAT.
     */
    public String getName() {
        return name;
    }

    public SatDeclarationSummaryObligation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * true si sus cifras se leyeron de la declaración; false si solo vienen del acuse.
     */
    public Boolean getRead() {
        return read;
    }

    public SatDeclarationSummaryObligation setRead(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * La cantidad a cargo.
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public SatDeclarationSummaryObligation setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    @JsonIgnore
    public SatDeclarationSummaryObligation setAmountDue(double amountDue) {
        return setAmountDue(BigDecimal.valueOf(amountDue));
    }

    /**
     * La cantidad a pagar.
     */
    public BigDecimal getAmountToPay() {
        return amountToPay;
    }

    public SatDeclarationSummaryObligation setAmountToPay(BigDecimal amountToPay) {
        this.amountToPay = amountToPay;
        return this;
    }

    @JsonIgnore
    public SatDeclarationSummaryObligation setAmountToPay(double amountToPay) {
        return setAmountToPay(BigDecimal.valueOf(amountToPay));
    }

    /**
     * Sus cifras con nombres fijos. ISR: income, invoiced_income, income_ytd, deductions, profit_coefficient, taxable_profit, losses_applied, tax_base, tax_caused, prior_payments, withheld. IVA: taxable_16, taxable_0, exempt, charged, paid_16, creditable, withheld, balance_applied. Salarios: workers, payments, exempt, withheld. Todas: surcharges, inflation, paid_before, due, in_favor, to_pay. null si no viene o no se pudo leer.
     */
    public Map<String, Object> getFigures() {
        return figures;
    }

    public SatDeclarationSummaryObligation setFigures(Map<String, Object> figures) {
        this.figures = figures;
        return this;
    }
}
