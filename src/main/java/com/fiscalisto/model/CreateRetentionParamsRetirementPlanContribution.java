// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsRetirementPlanContribution: CreateRetentionParamsRetirementPlanContribution.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsRetirementPlanContribution {
    /**
     * Tipo de aportación (TipoAportacionODeposito): a (art. 151 fracc. V LISR), b (art. 185 LISR) o c (art. 258 RLISR, con trustee_rfc).
     * <p>
     * Valores: a, b, c.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Monto de la aportación o depósito (MontAportODep).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * RFC de la fiduciaria que administra el plan (RFCFiduciaria); obligatorio con el tipo c.
     */
    @JsonProperty("trustee_rfc")
    private String trusteeRfc;

    /**
     * Tipo de aportación (TipoAportacionODeposito): a (art. 151 fracc. V LISR), b (art. 185 LISR) o c (art. 258 RLISR, con trustee_rfc).
     * <p>
     * Valores: a, b, c.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateRetentionParamsRetirementPlanContribution setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Monto de la aportación o depósito (MontAportODep).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRetentionParamsRetirementPlanContribution setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsRetirementPlanContribution setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * RFC de la fiduciaria que administra el plan (RFCFiduciaria); obligatorio con el tipo c.
     */
    public String getTrusteeRfc() {
        return trusteeRfc;
    }

    public CreateRetentionParamsRetirementPlanContribution setTrusteeRfc(String trusteeRfc) {
        this.trusteeRfc = trusteeRfc;
        return this;
    }
}
