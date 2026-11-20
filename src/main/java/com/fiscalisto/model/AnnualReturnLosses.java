// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualReturnLosses: Las pérdidas de ejercicios anteriores, de la más vieja a la más nueva.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnLosses {
    /**
     * Lo aplicado de pérdidas anteriores.
     */
    @JsonProperty("applied")
    private BigDecimal applied;

    /**
     * Lo más que se podía aplicar: la utilidad fiscal, o la mitad con el artículo 78-C.
     */
    @JsonProperty("cap")
    private BigDecimal cap;

    /**
     * El plazo para aplicarlas: 10 años, o 20 con el Capítulo X.
     */
    @JsonProperty("term_years")
    private Long termYears;

    /**
     * Cada pérdida, con lo que se aplicó.
     */
    @JsonProperty("rows")
    private List<AnnualReturnLossesRow> rows;

    /**
     * Lo aplicado de pérdidas anteriores.
     */
    public BigDecimal getApplied() {
        return applied;
    }

    public AnnualReturnLosses setApplied(BigDecimal applied) {
        this.applied = applied;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLosses setApplied(double applied) {
        return setApplied(BigDecimal.valueOf(applied));
    }

    /**
     * Lo más que se podía aplicar: la utilidad fiscal, o la mitad con el artículo 78-C.
     */
    public BigDecimal getCap() {
        return cap;
    }

    public AnnualReturnLosses setCap(BigDecimal cap) {
        this.cap = cap;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLosses setCap(double cap) {
        return setCap(BigDecimal.valueOf(cap));
    }

    /**
     * El plazo para aplicarlas: 10 años, o 20 con el Capítulo X.
     */
    public Long getTermYears() {
        return termYears;
    }

    public AnnualReturnLosses setTermYears(Long termYears) {
        this.termYears = termYears;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLosses setTermYears(long termYears) {
        return setTermYears(Long.valueOf(termYears));
    }

    /**
     * Cada pérdida, con lo que se aplicó.
     */
    public List<AnnualReturnLossesRow> getRows() {
        return rows;
    }

    public AnnualReturnLosses setRows(List<AnnualReturnLossesRow> rows) {
        this.rows = rows;
        return this;
    }
}
