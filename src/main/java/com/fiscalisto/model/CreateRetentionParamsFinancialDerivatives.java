// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsFinancialDerivatives: Complemento de operaciones financieras derivadas de capital (Operacionesconderivados 1.0), obligatorio con code 24.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsFinancialDerivatives {
    /**
     * Ganancia acumulable (MontGanAcum).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("gain")
    private BigDecimal gain;

    /**
     * Pérdida deducible (MontPerdDed).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("loss")
    private BigDecimal loss;

    /**
     * Ganancia acumulable (MontGanAcum).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGain() {
        return gain;
    }

    public CreateRetentionParamsFinancialDerivatives setGain(BigDecimal gain) {
        this.gain = gain;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsFinancialDerivatives setGain(double gain) {
        return setGain(BigDecimal.valueOf(gain));
    }

    /**
     * Pérdida deducible (MontPerdDed).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getLoss() {
        return loss;
    }

    public CreateRetentionParamsFinancialDerivatives setLoss(BigDecimal loss) {
        this.loss = loss;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsFinancialDerivatives setLoss(double loss) {
        return setLoss(BigDecimal.valueOf(loss));
    }
}
