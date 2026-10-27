// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsShareSale: Complemento de enajenación de acciones u operaciones de valores (EnajenaciondeAcciones 1.0), obligatorio con code 19.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsShareSale {
    /**
     * Descripción del contrato de intermediación (ContratoIntermediacion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("contract")
    private String contract;

    /**
     * Ganancia obtenida (Ganancia).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("gain")
    private BigDecimal gain;

    /**
     * Pérdida (Perdida).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("loss")
    private BigDecimal loss;

    /**
     * Descripción del contrato de intermediación (ContratoIntermediacion).
     * <p>
     * Obligatorio.
     */
    public String getContract() {
        return contract;
    }

    public CreateRetentionParamsShareSale setContract(String contract) {
        this.contract = contract;
        return this;
    }

    /**
     * Ganancia obtenida (Ganancia).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGain() {
        return gain;
    }

    public CreateRetentionParamsShareSale setGain(BigDecimal gain) {
        this.gain = gain;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsShareSale setGain(double gain) {
        return setGain(BigDecimal.valueOf(gain));
    }

    /**
     * Pérdida (Perdida).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getLoss() {
        return loss;
    }

    public CreateRetentionParamsShareSale setLoss(BigDecimal loss) {
        this.loss = loss;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsShareSale setLoss(double loss) {
        return setLoss(BigDecimal.valueOf(loss));
    }
}
