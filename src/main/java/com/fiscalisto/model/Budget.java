// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Budget: El presupuesto de un año (de toda la empresa o de un centro de costo) por cuenta de resultados y mes, y cómo va lo real contra él: el mes y de enero a ese mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Budget {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El mes de la comparación: el que pidió, el actual en el año en curso, 12 en uno pasado (0 en uno futuro).
     */
    @JsonProperty("month")
    private Long month;

    /**
     * El centro de costo (ccn_…) del presupuesto, o null: toda la empresa.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Lo presupuestado por cuenta, como se guardó.
     */
    @JsonProperty("lines")
    private List<BudgetLine> lines;

    /**
     * Cada cuenta con presupuesto o con movimiento: lo presupuestado contra lo real.
     */
    @JsonProperty("comparison")
    private List<BudgetComparisonItem> comparison;

    /**
     * La utilidad antes de impuestos.
     */
    @JsonProperty("income_before_taxes")
    private BudgetIncomeBeforeTaxes incomeBeforeTaxes;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Budget setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Budget setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Budget setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Año (Ejercicio).
     */
    public Long getYear() {
        return year;
    }

    public Budget setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public Budget setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El mes de la comparación: el que pidió, el actual en el año en curso, 12 en uno pasado (0 en uno futuro).
     */
    public Long getMonth() {
        return month;
    }

    public Budget setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public Budget setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * El centro de costo (ccn_…) del presupuesto, o null: toda la empresa.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public Budget setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Lo presupuestado por cuenta, como se guardó.
     */
    public List<BudgetLine> getLines() {
        return lines;
    }

    public Budget setLines(List<BudgetLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Cada cuenta con presupuesto o con movimiento: lo presupuestado contra lo real.
     */
    public List<BudgetComparisonItem> getComparison() {
        return comparison;
    }

    public Budget setComparison(List<BudgetComparisonItem> comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * La utilidad antes de impuestos.
     */
    public BudgetIncomeBeforeTaxes getIncomeBeforeTaxes() {
        return incomeBeforeTaxes;
    }

    public Budget setIncomeBeforeTaxes(BudgetIncomeBeforeTaxes incomeBeforeTaxes) {
        this.incomeBeforeTaxes = incomeBeforeTaxes;
        return this;
    }
}
