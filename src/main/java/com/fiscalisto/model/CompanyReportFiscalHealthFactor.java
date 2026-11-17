// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportFiscalHealthFactor: CompanyReportFiscalHealthFactor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportFiscalHealthFactor {
    /**
     * cumplimiento, listas, declaraciones, contrapartes, cancelaciones, concentracion, cobranza, buzon o crecimiento.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Su nombre, como en la app.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Los puntos que puede dar.
     */
    @JsonProperty("max_points")
    private Long maxPoints;

    /**
     * Los que dio; null sin datos (no cuenta en la calificación).
     */
    @JsonProperty("points")
    private BigDecimal points;

    /**
     * Por qué dio esos puntos.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Qué daría los que faltan, o null si dio todos.
     */
    @JsonProperty("to_improve")
    private String toImprove;

    /**
     * cumplimiento, listas, declaraciones, contrapartes, cancelaciones, concentracion, cobranza, buzon o crecimiento.
     */
    public String getKey() {
        return key;
    }

    public CompanyReportFiscalHealthFactor setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre, como en la app.
     */
    public String getLabel() {
        return label;
    }

    public CompanyReportFiscalHealthFactor setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Los puntos que puede dar.
     */
    public Long getMaxPoints() {
        return maxPoints;
    }

    public CompanyReportFiscalHealthFactor setMaxPoints(Long maxPoints) {
        this.maxPoints = maxPoints;
        return this;
    }

    @JsonIgnore
    public CompanyReportFiscalHealthFactor setMaxPoints(long maxPoints) {
        return setMaxPoints(Long.valueOf(maxPoints));
    }

    /**
     * Los que dio; null sin datos (no cuenta en la calificación).
     */
    public BigDecimal getPoints() {
        return points;
    }

    public CompanyReportFiscalHealthFactor setPoints(BigDecimal points) {
        this.points = points;
        return this;
    }

    @JsonIgnore
    public CompanyReportFiscalHealthFactor setPoints(double points) {
        return setPoints(BigDecimal.valueOf(points));
    }

    /**
     * Por qué dio esos puntos.
     */
    public String getReason() {
        return reason;
    }

    public CompanyReportFiscalHealthFactor setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Qué daría los que faltan, o null si dio todos.
     */
    public String getToImprove() {
        return toImprove;
    }

    public CompanyReportFiscalHealthFactor setToImprove(String toImprove) {
        this.toImprove = toImprove;
        return this;
    }
}
