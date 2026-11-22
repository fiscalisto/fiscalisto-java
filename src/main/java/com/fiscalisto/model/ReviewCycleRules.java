// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ReviewCycleRules: Cómo se califica (al ver un ciclo).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleRules {
    /**
     * La escala.
     */
    @JsonProperty("scale")
    private ReviewCycleRulesScale scale;

    /**
     * Quién evalúa.
     */
    @JsonProperty("raters")
    private ReviewCycleRulesRaters raters;

    /**
     * El peso de cada uno en las competencias; cuentan solo los que evalúan.
     */
    @JsonProperty("rater_weights")
    private ReviewCycleRulesRaterWeights raterWeights;

    /**
     * Cuánto pesan los objetivos en el resultado, de 0 a 100.
     */
    @JsonProperty("objectives_weight")
    private BigDecimal objectivesWeight;

    /**
     * Compañeros o personas a su cargo con menos respuestas no cuentan.
     */
    @JsonProperty("anonymous_min")
    private Long anonymousMin;

    /**
     * Los cortes de desempeño medio y alto de la matriz de 9 cuadros.
     */
    @JsonProperty("box_cuts")
    private List<BigDecimal> boxCuts;

    /**
     * La escala.
     */
    public ReviewCycleRulesScale getScale() {
        return scale;
    }

    public ReviewCycleRules setScale(ReviewCycleRulesScale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Quién evalúa.
     */
    public ReviewCycleRulesRaters getRaters() {
        return raters;
    }

    public ReviewCycleRules setRaters(ReviewCycleRulesRaters raters) {
        this.raters = raters;
        return this;
    }

    /**
     * El peso de cada uno en las competencias; cuentan solo los que evalúan.
     */
    public ReviewCycleRulesRaterWeights getRaterWeights() {
        return raterWeights;
    }

    public ReviewCycleRules setRaterWeights(ReviewCycleRulesRaterWeights raterWeights) {
        this.raterWeights = raterWeights;
        return this;
    }

    /**
     * Cuánto pesan los objetivos en el resultado, de 0 a 100.
     */
    public BigDecimal getObjectivesWeight() {
        return objectivesWeight;
    }

    public ReviewCycleRules setObjectivesWeight(BigDecimal objectivesWeight) {
        this.objectivesWeight = objectivesWeight;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRules setObjectivesWeight(double objectivesWeight) {
        return setObjectivesWeight(BigDecimal.valueOf(objectivesWeight));
    }

    /**
     * Compañeros o personas a su cargo con menos respuestas no cuentan.
     */
    public Long getAnonymousMin() {
        return anonymousMin;
    }

    public ReviewCycleRules setAnonymousMin(Long anonymousMin) {
        this.anonymousMin = anonymousMin;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRules setAnonymousMin(long anonymousMin) {
        return setAnonymousMin(Long.valueOf(anonymousMin));
    }

    /**
     * Los cortes de desempeño medio y alto de la matriz de 9 cuadros.
     */
    public List<BigDecimal> getBoxCuts() {
        return boxCuts;
    }

    public ReviewCycleRules setBoxCuts(List<BigDecimal> boxCuts) {
        this.boxCuts = boxCuts;
        return this;
    }
}
