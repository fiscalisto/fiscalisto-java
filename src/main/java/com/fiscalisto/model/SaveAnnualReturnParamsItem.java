// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveAnnualReturnParamsItem: SaveAnnualReturnParamsItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsItem {
    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * taxable_income (ingreso fiscal no contable), non_deductible_expense (gasto contable no deducible), tax_deduction (deducción fiscal no contable) o non_taxable_income (ingreso contable no acumulable, como dividendos de personas morales mexicanas).
     * <p>
     * Valores: taxable_income, non_deductible_expense, tax_deduction, non_taxable_income.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true en un gasto no deducible que resta de la utilidad fiscal neta (artículo 77).
     */
    @JsonProperty("reduces_net_tax_profit")
    private Boolean reducesNetTaxProfit;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public SaveAnnualReturnParamsItem setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * taxable_income (ingreso fiscal no contable), non_deductible_expense (gasto contable no deducible), tax_deduction (deducción fiscal no contable) o non_taxable_income (ingreso contable no acumulable, como dividendos de personas morales mexicanas).
     * <p>
     * Valores: taxable_income, non_deductible_expense, tax_deduction, non_taxable_income.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public SaveAnnualReturnParamsItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SaveAnnualReturnParamsItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true en un gasto no deducible que resta de la utilidad fiscal neta (artículo 77).
     */
    public Boolean getReducesNetTaxProfit() {
        return reducesNetTaxProfit;
    }

    public SaveAnnualReturnParamsItem setReducesNetTaxProfit(Boolean reducesNetTaxProfit) {
        this.reducesNetTaxProfit = reducesNetTaxProfit;
        return this;
    }
}
