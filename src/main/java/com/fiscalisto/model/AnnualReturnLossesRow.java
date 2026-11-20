// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnLossesRow: AnnualReturnLossesRow.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnLossesRow {
    /**
     * El ejercicio en que nació.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Lo que quedaba, actualizado hasta updated_to.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * AAAA-MM de su última actualización.
     */
    @JsonProperty("updated_to")
    private String updatedTo;

    /**
     * El factor de actualización hasta junio del año (artículo 57, cuarto párrafo; CFF 17-A), al diezmilésimo y nunca menor que 1; 1 si el año no aplica nada.
     */
    @JsonProperty("factor")
    private BigDecimal factor;

    /**
     * amount por factor.
     */
    @JsonProperty("updated_amount")
    private BigDecimal updatedAmount;

    /**
     * Lo aplicado este año.
     */
    @JsonProperty("applied")
    private BigDecimal applied;

    /**
     * Lo que queda para los años siguientes.
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * AAAA-MM hasta el que está remaining.
     */
    @JsonProperty("remaining_updated_to")
    private String remainingUpdatedTo;

    /**
     * El último ejercicio en que se puede aplicar.
     */
    @JsonProperty("last_year")
    private Long lastYear;

    /**
     * true si pasó su plazo: se perdió.
     */
    @JsonProperty("expired")
    private Boolean expired;

    /**
     * true si algún INPC aún no se publica.
     */
    @JsonProperty("estimated")
    private Boolean estimated;

    /**
     * El ejercicio en que nació.
     */
    public Long getYear() {
        return year;
    }

    public AnnualReturnLossesRow setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Lo que quedaba, actualizado hasta updated_to.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnLossesRow setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * AAAA-MM de su última actualización.
     */
    public String getUpdatedTo() {
        return updatedTo;
    }

    public AnnualReturnLossesRow setUpdatedTo(String updatedTo) {
        this.updatedTo = updatedTo;
        return this;
    }

    /**
     * El factor de actualización hasta junio del año (artículo 57, cuarto párrafo; CFF 17-A), al diezmilésimo y nunca menor que 1; 1 si el año no aplica nada.
     */
    public BigDecimal getFactor() {
        return factor;
    }

    public AnnualReturnLossesRow setFactor(BigDecimal factor) {
        this.factor = factor;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setFactor(double factor) {
        return setFactor(BigDecimal.valueOf(factor));
    }

    /**
     * amount por factor.
     */
    public BigDecimal getUpdatedAmount() {
        return updatedAmount;
    }

    public AnnualReturnLossesRow setUpdatedAmount(BigDecimal updatedAmount) {
        this.updatedAmount = updatedAmount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setUpdatedAmount(double updatedAmount) {
        return setUpdatedAmount(BigDecimal.valueOf(updatedAmount));
    }

    /**
     * Lo aplicado este año.
     */
    public BigDecimal getApplied() {
        return applied;
    }

    public AnnualReturnLossesRow setApplied(BigDecimal applied) {
        this.applied = applied;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setApplied(double applied) {
        return setApplied(BigDecimal.valueOf(applied));
    }

    /**
     * Lo que queda para los años siguientes.
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public AnnualReturnLossesRow setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }

    /**
     * AAAA-MM hasta el que está remaining.
     */
    public String getRemainingUpdatedTo() {
        return remainingUpdatedTo;
    }

    public AnnualReturnLossesRow setRemainingUpdatedTo(String remainingUpdatedTo) {
        this.remainingUpdatedTo = remainingUpdatedTo;
        return this;
    }

    /**
     * El último ejercicio en que se puede aplicar.
     */
    public Long getLastYear() {
        return lastYear;
    }

    public AnnualReturnLossesRow setLastYear(Long lastYear) {
        this.lastYear = lastYear;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLossesRow setLastYear(long lastYear) {
        return setLastYear(Long.valueOf(lastYear));
    }

    /**
     * true si pasó su plazo: se perdió.
     */
    public Boolean getExpired() {
        return expired;
    }

    public AnnualReturnLossesRow setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * true si algún INPC aún no se publica.
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public AnnualReturnLossesRow setEstimated(Boolean estimated) {
        this.estimated = estimated;
        return this;
    }
}
