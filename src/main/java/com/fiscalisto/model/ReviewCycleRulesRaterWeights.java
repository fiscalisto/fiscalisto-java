// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ReviewCycleRulesRaterWeights: El peso de cada uno en las competencias; cuentan solo los que evalúan.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleRulesRaterWeights {
    /**
     * El peso de lo que dice la persona misma.
     */
    @JsonProperty("self")
    private BigDecimal self;

    /**
     * El peso de lo que dice su jefe en el organigrama.
     */
    @JsonProperty("manager")
    private BigDecimal manager;

    /**
     * El peso de lo que dice sus compañeros.
     */
    @JsonProperty("peer")
    private BigDecimal peer;

    /**
     * El peso de lo que dice las personas a su cargo.
     */
    @JsonProperty("report")
    private BigDecimal report;

    /**
     * El peso de lo que dice la persona misma.
     */
    public BigDecimal getSelf() {
        return self;
    }

    public ReviewCycleRulesRaterWeights setSelf(BigDecimal self) {
        this.self = self;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRulesRaterWeights setSelf(double self) {
        return setSelf(BigDecimal.valueOf(self));
    }

    /**
     * El peso de lo que dice su jefe en el organigrama.
     */
    public BigDecimal getManager() {
        return manager;
    }

    public ReviewCycleRulesRaterWeights setManager(BigDecimal manager) {
        this.manager = manager;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRulesRaterWeights setManager(double manager) {
        return setManager(BigDecimal.valueOf(manager));
    }

    /**
     * El peso de lo que dice sus compañeros.
     */
    public BigDecimal getPeer() {
        return peer;
    }

    public ReviewCycleRulesRaterWeights setPeer(BigDecimal peer) {
        this.peer = peer;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRulesRaterWeights setPeer(double peer) {
        return setPeer(BigDecimal.valueOf(peer));
    }

    /**
     * El peso de lo que dice las personas a su cargo.
     */
    public BigDecimal getReport() {
        return report;
    }

    public ReviewCycleRulesRaterWeights setReport(BigDecimal report) {
        this.report = report;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRulesRaterWeights setReport(double report) {
        return setReport(BigDecimal.valueOf(report));
    }
}
