// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateReviewCycleParamsRules: Cómo se califica. Por omisión, escala de 1 a 5, autoevaluación y jefe, objetivos 60 %.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateReviewCycleParamsRules {
    /**
     * La escala.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("scale")
    private UpdateReviewCycleParamsRulesScale scale;

    /**
     * Quién evalúa: self (autoevaluación), manager (su jefe en el organigrama), peer (compañeros), report (las personas a su cargo).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("raters")
    private UpdateReviewCycleParamsRulesRaters raters;

    /**
     * El peso de cada uno en la calificación de competencias, de 0 a 100. Cuentan solo los que evalúan; no tienen que sumar 100.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rater_weights")
    private UpdateReviewCycleParamsRulesRaterWeights raterWeights;

    /**
     * Cuánto pesan los objetivos en el resultado, de 0 a 100; el resto son las competencias.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("objectives_weight")
    private BigDecimal objectivesWeight;

    /**
     * Compañeros o personas a su cargo con menos respuestas no cuentan, para que no se sepa quién contestó qué.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("anonymous_min")
    private Long anonymousMin;

    /**
     * Los cortes de desempeño de la matriz de 9 cuadros: debajo del primero es bajo, desde el segundo es alto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("box_cuts")
    private List<BigDecimal> boxCuts;

    /**
     * La escala.
     * <p>
     * Obligatorio.
     */
    public UpdateReviewCycleParamsRulesScale getScale() {
        return scale;
    }

    public UpdateReviewCycleParamsRules setScale(UpdateReviewCycleParamsRulesScale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Quién evalúa: self (autoevaluación), manager (su jefe en el organigrama), peer (compañeros), report (las personas a su cargo).
     * <p>
     * Obligatorio.
     */
    public UpdateReviewCycleParamsRulesRaters getRaters() {
        return raters;
    }

    public UpdateReviewCycleParamsRules setRaters(UpdateReviewCycleParamsRulesRaters raters) {
        this.raters = raters;
        return this;
    }

    /**
     * El peso de cada uno en la calificación de competencias, de 0 a 100. Cuentan solo los que evalúan; no tienen que sumar 100.
     * <p>
     * Obligatorio.
     */
    public UpdateReviewCycleParamsRulesRaterWeights getRaterWeights() {
        return raterWeights;
    }

    public UpdateReviewCycleParamsRules setRaterWeights(UpdateReviewCycleParamsRulesRaterWeights raterWeights) {
        this.raterWeights = raterWeights;
        return this;
    }

    /**
     * Cuánto pesan los objetivos en el resultado, de 0 a 100; el resto son las competencias.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getObjectivesWeight() {
        return objectivesWeight;
    }

    public UpdateReviewCycleParamsRules setObjectivesWeight(BigDecimal objectivesWeight) {
        this.objectivesWeight = objectivesWeight;
        return this;
    }

    @JsonIgnore
    public UpdateReviewCycleParamsRules setObjectivesWeight(double objectivesWeight) {
        return setObjectivesWeight(BigDecimal.valueOf(objectivesWeight));
    }

    /**
     * Compañeros o personas a su cargo con menos respuestas no cuentan, para que no se sepa quién contestó qué.
     * <p>
     * Obligatorio.
     */
    public Long getAnonymousMin() {
        return anonymousMin;
    }

    public UpdateReviewCycleParamsRules setAnonymousMin(Long anonymousMin) {
        this.anonymousMin = anonymousMin;
        return this;
    }

    @JsonIgnore
    public UpdateReviewCycleParamsRules setAnonymousMin(long anonymousMin) {
        return setAnonymousMin(Long.valueOf(anonymousMin));
    }

    /**
     * Los cortes de desempeño de la matriz de 9 cuadros: debajo del primero es bajo, desde el segundo es alto.
     * <p>
     * Obligatorio.
     */
    public List<BigDecimal> getBoxCuts() {
        return boxCuts;
    }

    public UpdateReviewCycleParamsRules setBoxCuts(List<BigDecimal> boxCuts) {
        this.boxCuts = boxCuts;
        return this;
    }
}
