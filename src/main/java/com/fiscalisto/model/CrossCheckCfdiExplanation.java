// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CrossCheckCfdiExplanation: CrossCheckCfdiExplanation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdiExplanation {
    /**
     * La diferencia.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * Los CFDI cuyo effect suma la diferencia; null si ninguno.
     */
    @JsonProperty("exact")
    private CrossCheckCfdiExplanationExact exact;

    /**
     * true si varias combinaciones la suman.
     */
    @JsonProperty("ambiguous")
    private Boolean ambiguous;

    /**
     * Las posibles causas, por motivo.
     */
    @JsonProperty("causes")
    private List<CrossCheckCfdiExplanationCause> causes;

    /**
     * La diferencia.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public CrossCheckCfdiExplanation setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiExplanation setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }

    /**
     * Los CFDI cuyo effect suma la diferencia; null si ninguno.
     */
    public CrossCheckCfdiExplanationExact getExact() {
        return exact;
    }

    public CrossCheckCfdiExplanation setExact(CrossCheckCfdiExplanationExact exact) {
        this.exact = exact;
        return this;
    }

    /**
     * true si varias combinaciones la suman.
     */
    public Boolean getAmbiguous() {
        return ambiguous;
    }

    public CrossCheckCfdiExplanation setAmbiguous(Boolean ambiguous) {
        this.ambiguous = ambiguous;
        return this;
    }

    /**
     * Las posibles causas, por motivo.
     */
    public List<CrossCheckCfdiExplanationCause> getCauses() {
        return causes;
    }

    public CrossCheckCfdiExplanation setCauses(List<CrossCheckCfdiExplanationCause> causes) {
        this.causes = causes;
        return this;
    }
}
