// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateReviewCycleParamsRulesRaterWeights: El peso de cada uno en la calificación de competencias, de 0 a 100. Cuentan solo los que evalúan; no tienen que sumar 100.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateReviewCycleParamsRulesRaterWeights {
    /**
     * El peso de lo que dice la persona misma.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("self")
    private BigDecimal self;

    /**
     * El peso de lo que dice su jefe en el organigrama.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("manager")
    private BigDecimal manager;

    /**
     * El peso de lo que dice sus compañeros.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("peer")
    private BigDecimal peer;

    /**
     * El peso de lo que dice las personas a su cargo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("report")
    private BigDecimal report;

    /**
     * El peso de lo que dice la persona misma.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getSelf() {
        return self;
    }

    public CreateReviewCycleParamsRulesRaterWeights setSelf(BigDecimal self) {
        this.self = self;
        return this;
    }

    @JsonIgnore
    public CreateReviewCycleParamsRulesRaterWeights setSelf(double self) {
        return setSelf(BigDecimal.valueOf(self));
    }

    /**
     * El peso de lo que dice su jefe en el organigrama.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getManager() {
        return manager;
    }

    public CreateReviewCycleParamsRulesRaterWeights setManager(BigDecimal manager) {
        this.manager = manager;
        return this;
    }

    @JsonIgnore
    public CreateReviewCycleParamsRulesRaterWeights setManager(double manager) {
        return setManager(BigDecimal.valueOf(manager));
    }

    /**
     * El peso de lo que dice sus compañeros.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPeer() {
        return peer;
    }

    public CreateReviewCycleParamsRulesRaterWeights setPeer(BigDecimal peer) {
        this.peer = peer;
        return this;
    }

    @JsonIgnore
    public CreateReviewCycleParamsRulesRaterWeights setPeer(double peer) {
        return setPeer(BigDecimal.valueOf(peer));
    }

    /**
     * El peso de lo que dice las personas a su cargo.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getReport() {
        return report;
    }

    public CreateReviewCycleParamsRulesRaterWeights setReport(BigDecimal report) {
        this.report = report;
        return this;
    }

    @JsonIgnore
    public CreateReviewCycleParamsRulesRaterWeights setReport(double report) {
        return setReport(BigDecimal.valueOf(report));
    }
}
