// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CompanyReportFiscalHealth: La salud fiscal: una calificación de 0 a 1,000 que explica cada punto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportFiscalHealth {
    /**
     * De 0 a 1,000; null si ningún factor tuvo datos.
     */
    @JsonProperty("score")
    private Long score;

    /**
     * attention (menos de 250), fair (250 a 499), good (500 a 749) o excellent (750 o más).
     * <p>
     * Valores: attention, fair, good, excellent.
     */
    @JsonProperty("band")
    private String band;

    /**
     * Factores con datos.
     */
    @JsonProperty("factors_used")
    private Long factorsUsed;

    /**
     * Todos los factores.
     */
    @JsonProperty("factors_total")
    private Long factorsTotal;

    /**
     * Cada factor, con su razón.
     */
    @JsonProperty("factors")
    private List<CompanyReportFiscalHealthFactor> factors;

    /**
     * De 0 a 1,000; null si ningún factor tuvo datos.
     */
    public Long getScore() {
        return score;
    }

    public CompanyReportFiscalHealth setScore(Long score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public CompanyReportFiscalHealth setScore(long score) {
        return setScore(Long.valueOf(score));
    }

    /**
     * attention (menos de 250), fair (250 a 499), good (500 a 749) o excellent (750 o más).
     * <p>
     * Valores: attention, fair, good, excellent.
     */
    public String getBand() {
        return band;
    }

    public CompanyReportFiscalHealth setBand(String band) {
        this.band = band;
        return this;
    }

    /**
     * Factores con datos.
     */
    public Long getFactorsUsed() {
        return factorsUsed;
    }

    public CompanyReportFiscalHealth setFactorsUsed(Long factorsUsed) {
        this.factorsUsed = factorsUsed;
        return this;
    }

    @JsonIgnore
    public CompanyReportFiscalHealth setFactorsUsed(long factorsUsed) {
        return setFactorsUsed(Long.valueOf(factorsUsed));
    }

    /**
     * Todos los factores.
     */
    public Long getFactorsTotal() {
        return factorsTotal;
    }

    public CompanyReportFiscalHealth setFactorsTotal(Long factorsTotal) {
        this.factorsTotal = factorsTotal;
        return this;
    }

    @JsonIgnore
    public CompanyReportFiscalHealth setFactorsTotal(long factorsTotal) {
        return setFactorsTotal(Long.valueOf(factorsTotal));
    }

    /**
     * Cada factor, con su razón.
     */
    public List<CompanyReportFiscalHealthFactor> getFactors() {
        return factors;
    }

    public CompanyReportFiscalHealth setFactors(List<CompanyReportFiscalHealthFactor> factors) {
        this.factors = factors;
        return this;
    }
}
