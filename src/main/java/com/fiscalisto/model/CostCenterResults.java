// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CostCenterResults: El estado de resultados por centro de costo: lo que cada uno dejó de utilidad, de las facturas que se le pusieron y de los renglones de póliza que lo llevan. Juntos suman el estado de resultados de la empresa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostCenterResults {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Cada centro de costo en el mes.
     */
    @JsonProperty("month_results")
    private List<CostCenterResultsMonthResult> monthResults;

    /**
     * Cada centro de costo de enero al mes.
     */
    @JsonProperty("year_to_date")
    private List<CostCenterResultsYearToDateItem> yearToDate;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CostCenterResults setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CostCenterResults setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CostCenterResults setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CostCenterResults setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Cada centro de costo en el mes.
     */
    public List<CostCenterResultsMonthResult> getMonthResults() {
        return monthResults;
    }

    public CostCenterResults setMonthResults(List<CostCenterResultsMonthResult> monthResults) {
        this.monthResults = monthResults;
        return this;
    }

    /**
     * Cada centro de costo de enero al mes.
     */
    public List<CostCenterResultsYearToDateItem> getYearToDate() {
        return yearToDate;
    }

    public CostCenterResults setYearToDate(List<CostCenterResultsYearToDateItem> yearToDate) {
        this.yearToDate = yearToDate;
        return this;
    }
}
