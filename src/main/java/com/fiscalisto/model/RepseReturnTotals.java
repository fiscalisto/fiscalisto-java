// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * RepseReturnTotals: Lo que el archivo del sujeto obligado del SISUB suma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturnTotals {
    /**
     * Aportaciones de los trabajadores sin crédito.
     */
    @JsonProperty("contributions_without_credit")
    private BigDecimal contributionsWithoutCredit;

    /**
     * Aportaciones de los trabajadores con crédito.
     */
    @JsonProperty("contributions_with_credit")
    private BigDecimal contributionsWithCredit;

    /**
     * Amortizaciones descontadas.
     */
    @JsonProperty("amortizations")
    private BigDecimal amortizations;

    /**
     * Aportaciones de los trabajadores sin crédito.
     */
    public BigDecimal getContributionsWithoutCredit() {
        return contributionsWithoutCredit;
    }

    public RepseReturnTotals setContributionsWithoutCredit(BigDecimal contributionsWithoutCredit) {
        this.contributionsWithoutCredit = contributionsWithoutCredit;
        return this;
    }

    @JsonIgnore
    public RepseReturnTotals setContributionsWithoutCredit(double contributionsWithoutCredit) {
        return setContributionsWithoutCredit(BigDecimal.valueOf(contributionsWithoutCredit));
    }

    /**
     * Aportaciones de los trabajadores con crédito.
     */
    public BigDecimal getContributionsWithCredit() {
        return contributionsWithCredit;
    }

    public RepseReturnTotals setContributionsWithCredit(BigDecimal contributionsWithCredit) {
        this.contributionsWithCredit = contributionsWithCredit;
        return this;
    }

    @JsonIgnore
    public RepseReturnTotals setContributionsWithCredit(double contributionsWithCredit) {
        return setContributionsWithCredit(BigDecimal.valueOf(contributionsWithCredit));
    }

    /**
     * Amortizaciones descontadas.
     */
    public BigDecimal getAmortizations() {
        return amortizations;
    }

    public RepseReturnTotals setAmortizations(BigDecimal amortizations) {
        this.amortizations = amortizations;
        return this;
    }

    @JsonIgnore
    public RepseReturnTotals setAmortizations(double amortizations) {
        return setAmortizations(BigDecimal.valueOf(amortizations));
    }
}
