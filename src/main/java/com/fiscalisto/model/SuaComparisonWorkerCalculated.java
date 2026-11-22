// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SuaComparisonWorkerCalculated: SuaComparisonWorkerCalculated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuaComparisonWorkerCalculated {
    /**
     * Días en enfermedades y maternidad: los del mes menos las incapacidades.
     */
    @JsonProperty("days_health")
    private BigDecimal daysHealth;

    /**
     * Días en invalidez y vida: menos incapacidades y ausentismos.
     */
    @JsonProperty("days_disability_life")
    private BigDecimal daysDisabilityLife;

    /**
     * El salario base de cotización.
     */
    @JsonProperty("sbc")
    private BigDecimal sbc;

    /**
     * Sus cuotas patronales al IMSS.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Días en enfermedades y maternidad: los del mes menos las incapacidades.
     */
    public BigDecimal getDaysHealth() {
        return daysHealth;
    }

    public SuaComparisonWorkerCalculated setDaysHealth(BigDecimal daysHealth) {
        this.daysHealth = daysHealth;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerCalculated setDaysHealth(double daysHealth) {
        return setDaysHealth(BigDecimal.valueOf(daysHealth));
    }

    /**
     * Días en invalidez y vida: menos incapacidades y ausentismos.
     */
    public BigDecimal getDaysDisabilityLife() {
        return daysDisabilityLife;
    }

    public SuaComparisonWorkerCalculated setDaysDisabilityLife(BigDecimal daysDisabilityLife) {
        this.daysDisabilityLife = daysDisabilityLife;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerCalculated setDaysDisabilityLife(double daysDisabilityLife) {
        return setDaysDisabilityLife(BigDecimal.valueOf(daysDisabilityLife));
    }

    /**
     * El salario base de cotización.
     */
    public BigDecimal getSbc() {
        return sbc;
    }

    public SuaComparisonWorkerCalculated setSbc(BigDecimal sbc) {
        this.sbc = sbc;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerCalculated setSbc(double sbc) {
        return setSbc(BigDecimal.valueOf(sbc));
    }

    /**
     * Sus cuotas patronales al IMSS.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SuaComparisonWorkerCalculated setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerCalculated setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
