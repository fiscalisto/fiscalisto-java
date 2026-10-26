// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsInterest: Complemento de intereses.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsInterest {
    /**
     * true si los intereses vienen del sistema financiero (SistFinanciero).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("financial_system")
    private Boolean financialSystem;

    /**
     * true si se retiraron los intereses en el periodo (RetiroAORESRetInt).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("retirement")
    private Boolean retirement;

    /**
     * true si son operaciones financieras derivadas (OperFinancDerivad).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("derivatives")
    private Boolean derivatives;

    /**
     * Interés nominal (MontIntNominal).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("nominal")
    private BigDecimal nominal;

    /**
     * Interés real (MontIntReal).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("real")
    private BigDecimal real;

    /**
     * Pérdida (Perdida).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("loss")
    private BigDecimal loss;

    /**
     * true si los intereses vienen del sistema financiero (SistFinanciero).
     * <p>
     * Obligatorio.
     */
    public Boolean getFinancialSystem() {
        return financialSystem;
    }

    public CreateRetentionParamsInterest setFinancialSystem(Boolean financialSystem) {
        this.financialSystem = financialSystem;
        return this;
    }

    /**
     * true si se retiraron los intereses en el periodo (RetiroAORESRetInt).
     * <p>
     * Obligatorio.
     */
    public Boolean getRetirement() {
        return retirement;
    }

    public CreateRetentionParamsInterest setRetirement(Boolean retirement) {
        this.retirement = retirement;
        return this;
    }

    /**
     * true si son operaciones financieras derivadas (OperFinancDerivad).
     * <p>
     * Obligatorio.
     */
    public Boolean getDerivatives() {
        return derivatives;
    }

    public CreateRetentionParamsInterest setDerivatives(Boolean derivatives) {
        this.derivatives = derivatives;
        return this;
    }

    /**
     * Interés nominal (MontIntNominal).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNominal() {
        return nominal;
    }

    public CreateRetentionParamsInterest setNominal(BigDecimal nominal) {
        this.nominal = nominal;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsInterest setNominal(double nominal) {
        return setNominal(BigDecimal.valueOf(nominal));
    }

    /**
     * Interés real (MontIntReal).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getReal() {
        return real;
    }

    public CreateRetentionParamsInterest setReal(BigDecimal real) {
        this.real = real;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsInterest setReal(double real) {
        return setReal(BigDecimal.valueOf(real));
    }

    /**
     * Pérdida (Perdida).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getLoss() {
        return loss;
    }

    public CreateRetentionParamsInterest setLoss(BigDecimal loss) {
        this.loss = loss;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsInterest setLoss(double loss) {
        return setLoss(BigDecimal.valueOf(loss));
    }
}
