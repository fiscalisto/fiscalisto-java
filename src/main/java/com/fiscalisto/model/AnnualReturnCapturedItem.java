// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnCapturedItem: AnnualReturnCapturedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnCapturedItem {
    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * taxable_income (ingreso fiscal no contable, suma), non_deductible_expense (gasto contable no deducible, suma), tax_deduction (deducción fiscal no contable, resta) o non_taxable_income (ingreso contable no acumulable, resta).
     * <p>
     * Valores: taxable_income, non_deductible_expense, tax_deduction, non_taxable_income.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true si resta de la utilidad fiscal neta.
     */
    @JsonProperty("reduces_net_tax_profit")
    private Boolean reducesNetTaxProfit;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    public String getConcept() {
        return concept;
    }

    public AnnualReturnCapturedItem setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * taxable_income (ingreso fiscal no contable, suma), non_deductible_expense (gasto contable no deducible, suma), tax_deduction (deducción fiscal no contable, resta) o non_taxable_income (ingreso contable no acumulable, resta).
     * <p>
     * Valores: taxable_income, non_deductible_expense, tax_deduction, non_taxable_income.
     */
    public String getType() {
        return type;
    }

    public AnnualReturnCapturedItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnCapturedItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCapturedItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true si resta de la utilidad fiscal neta.
     */
    public Boolean getReducesNetTaxProfit() {
        return reducesNetTaxProfit;
    }

    public AnnualReturnCapturedItem setReducesNetTaxProfit(Boolean reducesNetTaxProfit) {
        this.reducesNetTaxProfit = reducesNetTaxProfit;
        return this;
    }
}
