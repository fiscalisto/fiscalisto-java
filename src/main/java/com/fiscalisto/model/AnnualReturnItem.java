// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnItem: AnnualReturnItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnItem {
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
     * El artículo de la ley.
     */
    @JsonProperty("legal_basis")
    private String legalBasis;

    /**
     * De dónde sale: books (cuentas de los libros por su código agrupador), cfdi, payroll (nómina), calculation (ajuste por inflación, deducción de inversiones) o captured.
     * <p>
     * Valores: books, cfdi, payroll, calculation, captured.
     */
    @JsonProperty("source")
    private String source;

    /**
     * true si resta de la utilidad fiscal neta (artículo 77).
     */
    @JsonProperty("reduces_net_tax_profit")
    private Boolean reducesNetTaxProfit;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    public String getConcept() {
        return concept;
    }

    public AnnualReturnItem setConcept(String concept) {
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

    public AnnualReturnItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El artículo de la ley.
     */
    public String getLegalBasis() {
        return legalBasis;
    }

    public AnnualReturnItem setLegalBasis(String legalBasis) {
        this.legalBasis = legalBasis;
        return this;
    }

    /**
     * De dónde sale: books (cuentas de los libros por su código agrupador), cfdi, payroll (nómina), calculation (ajuste por inflación, deducción de inversiones) o captured.
     * <p>
     * Valores: books, cfdi, payroll, calculation, captured.
     */
    public String getSource() {
        return source;
    }

    public AnnualReturnItem setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * true si resta de la utilidad fiscal neta (artículo 77).
     */
    public Boolean getReducesNetTaxProfit() {
        return reducesNetTaxProfit;
    }

    public AnnualReturnItem setReducesNetTaxProfit(Boolean reducesNetTaxProfit) {
        this.reducesNetTaxProfit = reducesNetTaxProfit;
        return this;
    }
}
