// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTrustLease: Complemento de arrendamiento en fideicomiso (Arrendamientoenfideicomiso 1.0), obligatorio con code 17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTrustLease {
    /**
     * Pago provisional que el fiduciario efectuó al arrendador en el periodo (PagProvEfecPorFiduc).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("trustee_payment")
    private BigDecimal trusteePayment;

    /**
     * Rendimientos del periodo por el arrendamiento de los bienes (RendimFideicom).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("income")
    private BigDecimal income;

    /**
     * Deducciones del arrendamiento en el periodo (DeduccCorresp).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * Monto total retenido del arrendamiento en el periodo (MontTotRet).
     */
    @JsonProperty("withheld_total")
    private BigDecimal withheldTotal;

    /**
     * Resultado fiscal distribuido por FIBRAS (MontResFiscDistFibras).
     */
    @JsonProperty("fibra_result")
    private BigDecimal fibraResult;

    /**
     * Monto de otros conceptos distribuidos (MontOtrosConceptDistr).
     */
    @JsonProperty("other_amount")
    private BigDecimal otherAmount;

    /**
     * Qué son los otros conceptos distribuidos (DescrMontOtrosConceptDistr); obligatoria con other_amount.
     */
    @JsonProperty("other_description")
    private String otherDescription;

    /**
     * Pago provisional que el fiduciario efectuó al arrendador en el periodo (PagProvEfecPorFiduc).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTrusteePayment() {
        return trusteePayment;
    }

    public CreateRetentionParamsTrustLease setTrusteePayment(BigDecimal trusteePayment) {
        this.trusteePayment = trusteePayment;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setTrusteePayment(double trusteePayment) {
        return setTrusteePayment(BigDecimal.valueOf(trusteePayment));
    }

    /**
     * Rendimientos del periodo por el arrendamiento de los bienes (RendimFideicom).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getIncome() {
        return income;
    }

    public CreateRetentionParamsTrustLease setIncome(BigDecimal income) {
        this.income = income;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setIncome(double income) {
        return setIncome(BigDecimal.valueOf(income));
    }

    /**
     * Deducciones del arrendamiento en el periodo (DeduccCorresp).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public CreateRetentionParamsTrustLease setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * Monto total retenido del arrendamiento en el periodo (MontTotRet).
     */
    public BigDecimal getWithheldTotal() {
        return withheldTotal;
    }

    public CreateRetentionParamsTrustLease setWithheldTotal(BigDecimal withheldTotal) {
        this.withheldTotal = withheldTotal;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setWithheldTotal(double withheldTotal) {
        return setWithheldTotal(BigDecimal.valueOf(withheldTotal));
    }

    /**
     * Resultado fiscal distribuido por FIBRAS (MontResFiscDistFibras).
     */
    public BigDecimal getFibraResult() {
        return fibraResult;
    }

    public CreateRetentionParamsTrustLease setFibraResult(BigDecimal fibraResult) {
        this.fibraResult = fibraResult;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setFibraResult(double fibraResult) {
        return setFibraResult(BigDecimal.valueOf(fibraResult));
    }

    /**
     * Monto de otros conceptos distribuidos (MontOtrosConceptDistr).
     */
    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    public CreateRetentionParamsTrustLease setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustLease setOtherAmount(double otherAmount) {
        return setOtherAmount(BigDecimal.valueOf(otherAmount));
    }

    /**
     * Qué son los otros conceptos distribuidos (DescrMontOtrosConceptDistr); obligatoria con other_amount.
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    public CreateRetentionParamsTrustLease setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
        return this;
    }
}
