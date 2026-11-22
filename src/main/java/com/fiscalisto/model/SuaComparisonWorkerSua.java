// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SuaComparisonWorkerSua: SuaComparisonWorkerSua.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuaComparisonWorkerSua {
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
     * Los días de incapacidad que trae el SUA.
     */
    @JsonProperty("disability_days")
    private BigDecimal disabilityDays;

    /**
     * Los ausentismos que trae el SUA.
     */
    @JsonProperty("absences")
    private BigDecimal absences;

    /**
     * Lo que paga el patrón del renglón (Patronal, más Obrera si gana el salario mínimo), o null si sus importes no se pudieron leer.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Días en enfermedades y maternidad: los del mes menos las incapacidades.
     */
    public BigDecimal getDaysHealth() {
        return daysHealth;
    }

    public SuaComparisonWorkerSua setDaysHealth(BigDecimal daysHealth) {
        this.daysHealth = daysHealth;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setDaysHealth(double daysHealth) {
        return setDaysHealth(BigDecimal.valueOf(daysHealth));
    }

    /**
     * Días en invalidez y vida: menos incapacidades y ausentismos.
     */
    public BigDecimal getDaysDisabilityLife() {
        return daysDisabilityLife;
    }

    public SuaComparisonWorkerSua setDaysDisabilityLife(BigDecimal daysDisabilityLife) {
        this.daysDisabilityLife = daysDisabilityLife;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setDaysDisabilityLife(double daysDisabilityLife) {
        return setDaysDisabilityLife(BigDecimal.valueOf(daysDisabilityLife));
    }

    /**
     * El salario base de cotización.
     */
    public BigDecimal getSbc() {
        return sbc;
    }

    public SuaComparisonWorkerSua setSbc(BigDecimal sbc) {
        this.sbc = sbc;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setSbc(double sbc) {
        return setSbc(BigDecimal.valueOf(sbc));
    }

    /**
     * Los días de incapacidad que trae el SUA.
     */
    public BigDecimal getDisabilityDays() {
        return disabilityDays;
    }

    public SuaComparisonWorkerSua setDisabilityDays(BigDecimal disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setDisabilityDays(double disabilityDays) {
        return setDisabilityDays(BigDecimal.valueOf(disabilityDays));
    }

    /**
     * Los ausentismos que trae el SUA.
     */
    public BigDecimal getAbsences() {
        return absences;
    }

    public SuaComparisonWorkerSua setAbsences(BigDecimal absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setAbsences(double absences) {
        return setAbsences(BigDecimal.valueOf(absences));
    }

    /**
     * Lo que paga el patrón del renglón (Patronal, más Obrera si gana el salario mínimo), o null si sus importes no se pudieron leer.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SuaComparisonWorkerSua setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SuaComparisonWorkerSua setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
