// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsMortgageInterest: Complemento de intereses reales deducibles por créditos hipotecarios (Intereseshipotecarios 1.0), obligatorio con code 23.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsMortgageInterest {
    /**
     * true si el crédito lo otorgó una institución financiera (CreditoDeInstFinanc).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("financial_institution")
    private Boolean financialInstitution;

    /**
     * Saldo insoluto al 31 de diciembre del año anterior, o a la fecha del contrato si es de este año (SaldoInsoluto).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("outstanding_balance")
    private BigDecimal outstandingBalance;

    /**
     * Proporción deducible del crédito sobre los intereses reales devengados y pagados (PropDeducDelCredit).
     */
    @JsonProperty("deductible_proportion")
    private BigDecimal deductibleProportion;

    /**
     * Intereses nominales devengados (MontTotIntNominalesDev).
     */
    @JsonProperty("nominal_accrued")
    private BigDecimal nominalAccrued;

    /**
     * Intereses nominales devengados y pagados (MontTotIntNominalesDevYPag).
     */
    @JsonProperty("nominal_accrued_paid")
    private BigDecimal nominalAccruedPaid;

    /**
     * Intereses reales pagados deducibles (MontTotIntRealPagDeduc).
     */
    @JsonProperty("real_deductible")
    private BigDecimal realDeductible;

    /**
     * Número de contrato del crédito hipotecario (NumContrato).
     */
    @JsonProperty("contract")
    private String contract;

    /**
     * true si el crédito lo otorgó una institución financiera (CreditoDeInstFinanc).
     * <p>
     * Obligatorio.
     */
    public Boolean getFinancialInstitution() {
        return financialInstitution;
    }

    public CreateRetentionParamsMortgageInterest setFinancialInstitution(Boolean financialInstitution) {
        this.financialInstitution = financialInstitution;
        return this;
    }

    /**
     * Saldo insoluto al 31 de diciembre del año anterior, o a la fecha del contrato si es de este año (SaldoInsoluto).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    public CreateRetentionParamsMortgageInterest setOutstandingBalance(BigDecimal outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsMortgageInterest setOutstandingBalance(double outstandingBalance) {
        return setOutstandingBalance(BigDecimal.valueOf(outstandingBalance));
    }

    /**
     * Proporción deducible del crédito sobre los intereses reales devengados y pagados (PropDeducDelCredit).
     */
    public BigDecimal getDeductibleProportion() {
        return deductibleProportion;
    }

    public CreateRetentionParamsMortgageInterest setDeductibleProportion(BigDecimal deductibleProportion) {
        this.deductibleProportion = deductibleProportion;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsMortgageInterest setDeductibleProportion(double deductibleProportion) {
        return setDeductibleProportion(BigDecimal.valueOf(deductibleProportion));
    }

    /**
     * Intereses nominales devengados (MontTotIntNominalesDev).
     */
    public BigDecimal getNominalAccrued() {
        return nominalAccrued;
    }

    public CreateRetentionParamsMortgageInterest setNominalAccrued(BigDecimal nominalAccrued) {
        this.nominalAccrued = nominalAccrued;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsMortgageInterest setNominalAccrued(double nominalAccrued) {
        return setNominalAccrued(BigDecimal.valueOf(nominalAccrued));
    }

    /**
     * Intereses nominales devengados y pagados (MontTotIntNominalesDevYPag).
     */
    public BigDecimal getNominalAccruedPaid() {
        return nominalAccruedPaid;
    }

    public CreateRetentionParamsMortgageInterest setNominalAccruedPaid(BigDecimal nominalAccruedPaid) {
        this.nominalAccruedPaid = nominalAccruedPaid;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsMortgageInterest setNominalAccruedPaid(double nominalAccruedPaid) {
        return setNominalAccruedPaid(BigDecimal.valueOf(nominalAccruedPaid));
    }

    /**
     * Intereses reales pagados deducibles (MontTotIntRealPagDeduc).
     */
    public BigDecimal getRealDeductible() {
        return realDeductible;
    }

    public CreateRetentionParamsMortgageInterest setRealDeductible(BigDecimal realDeductible) {
        this.realDeductible = realDeductible;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsMortgageInterest setRealDeductible(double realDeductible) {
        return setRealDeductible(BigDecimal.valueOf(realDeductible));
    }

    /**
     * Número de contrato del crédito hipotecario (NumContrato).
     */
    public String getContract() {
        return contract;
    }

    public CreateRetentionParamsMortgageInterest setContract(String contract) {
        this.contract = contract;
        return this;
    }
}
