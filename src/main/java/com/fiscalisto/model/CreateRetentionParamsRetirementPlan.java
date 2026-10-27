// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateRetentionParamsRetirementPlan: Complemento de planes personales de retiro (Planesderetiro 1.1), obligatorio con code 22: lo del año anterior.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsRetirementPlan {
    /**
     * true si el plan es del sistema financiero (SistemaFinanc).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("financial_system")
    private Boolean financialSystem;

    /**
     * Aportaciones actualizadas del año anterior (MontTotAportAnioInmAnterior).
     */
    @JsonProperty("contributions_last_year")
    private BigDecimal contributionsLastYear;

    /**
     * Intereses reales devengados o percibidos el año anterior (MontIntRealesDevengAniooInmAnt).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("real_interest")
    private BigDecimal realInterest;

    /**
     * true si hubo retiros antes de cumplir los requisitos de permanencia (HuboRetirosAnioInmAntPer).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("early_withdrawals")
    private Boolean earlyWithdrawals;

    /**
     * Monto retirado antes de cumplir la permanencia (MontTotRetiradoAnioInmAntPer); obligatorio con early_withdrawals.
     */
    @JsonProperty("early_withdrawn")
    private BigDecimal earlyWithdrawn;

    /**
     * Monto exento de lo retirado el año anterior (MontTotExentRetiradoAnioInmAnt).
     */
    @JsonProperty("exempt_withdrawn")
    private BigDecimal exemptWithdrawn;

    /**
     * Excedente del monto exento de lo retirado el año anterior (MontTotExedenteAnioInmAnt).
     */
    @JsonProperty("excess_withdrawn")
    private BigDecimal excessWithdrawn;

    /**
     * true si hubo retiros el año anterior (HuboRetirosAnioInmAnt).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("withdrawals")
    private Boolean withdrawals;

    /**
     * Monto retirado el año anterior (MontTotRetiradoAnioInmAnt); obligatorio con withdrawals.
     */
    @JsonProperty("withdrawn")
    private BigDecimal withdrawn;

    /**
     * Número de referencia, contrato o cuenta del cliente (NumReferencia).
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * Aportaciones o depósitos (AportacionesODepositos), uno por tipo y hasta tres.
     */
    @JsonProperty("contributions")
    private List<CreateRetentionParamsRetirementPlanContribution> contributions;

    /**
     * true si el plan es del sistema financiero (SistemaFinanc).
     * <p>
     * Obligatorio.
     */
    public Boolean getFinancialSystem() {
        return financialSystem;
    }

    public CreateRetentionParamsRetirementPlan setFinancialSystem(Boolean financialSystem) {
        this.financialSystem = financialSystem;
        return this;
    }

    /**
     * Aportaciones actualizadas del año anterior (MontTotAportAnioInmAnterior).
     */
    public BigDecimal getContributionsLastYear() {
        return contributionsLastYear;
    }

    public CreateRetentionParamsRetirementPlan setContributionsLastYear(BigDecimal contributionsLastYear) {
        this.contributionsLastYear = contributionsLastYear;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setContributionsLastYear(double contributionsLastYear) {
        return setContributionsLastYear(BigDecimal.valueOf(contributionsLastYear));
    }

    /**
     * Intereses reales devengados o percibidos el año anterior (MontIntRealesDevengAniooInmAnt).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getRealInterest() {
        return realInterest;
    }

    public CreateRetentionParamsRetirementPlan setRealInterest(BigDecimal realInterest) {
        this.realInterest = realInterest;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setRealInterest(double realInterest) {
        return setRealInterest(BigDecimal.valueOf(realInterest));
    }

    /**
     * true si hubo retiros antes de cumplir los requisitos de permanencia (HuboRetirosAnioInmAntPer).
     * <p>
     * Obligatorio.
     */
    public Boolean getEarlyWithdrawals() {
        return earlyWithdrawals;
    }

    public CreateRetentionParamsRetirementPlan setEarlyWithdrawals(Boolean earlyWithdrawals) {
        this.earlyWithdrawals = earlyWithdrawals;
        return this;
    }

    /**
     * Monto retirado antes de cumplir la permanencia (MontTotRetiradoAnioInmAntPer); obligatorio con early_withdrawals.
     */
    public BigDecimal getEarlyWithdrawn() {
        return earlyWithdrawn;
    }

    public CreateRetentionParamsRetirementPlan setEarlyWithdrawn(BigDecimal earlyWithdrawn) {
        this.earlyWithdrawn = earlyWithdrawn;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setEarlyWithdrawn(double earlyWithdrawn) {
        return setEarlyWithdrawn(BigDecimal.valueOf(earlyWithdrawn));
    }

    /**
     * Monto exento de lo retirado el año anterior (MontTotExentRetiradoAnioInmAnt).
     */
    public BigDecimal getExemptWithdrawn() {
        return exemptWithdrawn;
    }

    public CreateRetentionParamsRetirementPlan setExemptWithdrawn(BigDecimal exemptWithdrawn) {
        this.exemptWithdrawn = exemptWithdrawn;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setExemptWithdrawn(double exemptWithdrawn) {
        return setExemptWithdrawn(BigDecimal.valueOf(exemptWithdrawn));
    }

    /**
     * Excedente del monto exento de lo retirado el año anterior (MontTotExedenteAnioInmAnt).
     */
    public BigDecimal getExcessWithdrawn() {
        return excessWithdrawn;
    }

    public CreateRetentionParamsRetirementPlan setExcessWithdrawn(BigDecimal excessWithdrawn) {
        this.excessWithdrawn = excessWithdrawn;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setExcessWithdrawn(double excessWithdrawn) {
        return setExcessWithdrawn(BigDecimal.valueOf(excessWithdrawn));
    }

    /**
     * true si hubo retiros el año anterior (HuboRetirosAnioInmAnt).
     * <p>
     * Obligatorio.
     */
    public Boolean getWithdrawals() {
        return withdrawals;
    }

    public CreateRetentionParamsRetirementPlan setWithdrawals(Boolean withdrawals) {
        this.withdrawals = withdrawals;
        return this;
    }

    /**
     * Monto retirado el año anterior (MontTotRetiradoAnioInmAnt); obligatorio con withdrawals.
     */
    public BigDecimal getWithdrawn() {
        return withdrawn;
    }

    public CreateRetentionParamsRetirementPlan setWithdrawn(BigDecimal withdrawn) {
        this.withdrawn = withdrawn;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlan setWithdrawn(double withdrawn) {
        return setWithdrawn(BigDecimal.valueOf(withdrawn));
    }

    /**
     * Número de referencia, contrato o cuenta del cliente (NumReferencia).
     */
    public String getReference() {
        return reference;
    }

    public CreateRetentionParamsRetirementPlan setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Aportaciones o depósitos (AportacionesODepositos), uno por tipo y hasta tres.
     */
    public List<CreateRetentionParamsRetirementPlanContribution> getContributions() {
        return contributions;
    }

    public CreateRetentionParamsRetirementPlan setContributions(List<CreateRetentionParamsRetirementPlanContribution> contributions) {
        this.contributions = contributions;
        return this;
    }
}
