// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * DepreciationReconciliation: La depreciación contable del año contra la deducción de inversiones (artículos 31 y 34 de la Ley del ISR) de cada activo, para la conciliación contable-fiscal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepreciationReconciliation {
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
     * El año.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Cada activo con depreciación contable o deducción fiscal en el año.
     */
    @JsonProperty("items")
    private List<DepreciationReconciliationItem> items;

    /**
     * La depreciación contable del año de todos los activos.
     */
    @JsonProperty("book_depreciation")
    private BigDecimal bookDepreciation;

    /**
     * La deducción de inversiones del año, actualizada.
     */
    @JsonProperty("tax_deduction")
    private BigDecimal taxDeduction;

    /**
     * tax_deduction menos book_depreciation: la partida de la conciliación contable-fiscal.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * Los meses cuyo INPC no se ha publicado, estimados con el último (AAAA-MM).
     */
    @JsonProperty("inpc_estimated_months")
    private List<String> inpcEstimatedMonths;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public DepreciationReconciliation setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public DepreciationReconciliation setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public DepreciationReconciliation setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El año.
     */
    public Long getYear() {
        return year;
    }

    public DepreciationReconciliation setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliation setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Cada activo con depreciación contable o deducción fiscal en el año.
     */
    public List<DepreciationReconciliationItem> getItems() {
        return items;
    }

    public DepreciationReconciliation setItems(List<DepreciationReconciliationItem> items) {
        this.items = items;
        return this;
    }

    /**
     * La depreciación contable del año de todos los activos.
     */
    public BigDecimal getBookDepreciation() {
        return bookDepreciation;
    }

    public DepreciationReconciliation setBookDepreciation(BigDecimal bookDepreciation) {
        this.bookDepreciation = bookDepreciation;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliation setBookDepreciation(double bookDepreciation) {
        return setBookDepreciation(BigDecimal.valueOf(bookDepreciation));
    }

    /**
     * La deducción de inversiones del año, actualizada.
     */
    public BigDecimal getTaxDeduction() {
        return taxDeduction;
    }

    public DepreciationReconciliation setTaxDeduction(BigDecimal taxDeduction) {
        this.taxDeduction = taxDeduction;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliation setTaxDeduction(double taxDeduction) {
        return setTaxDeduction(BigDecimal.valueOf(taxDeduction));
    }

    /**
     * tax_deduction menos book_depreciation: la partida de la conciliación contable-fiscal.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public DepreciationReconciliation setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliation setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }

    /**
     * Los meses cuyo INPC no se ha publicado, estimados con el último (AAAA-MM).
     */
    public List<String> getInpcEstimatedMonths() {
        return inpcEstimatedMonths;
    }

    public DepreciationReconciliation setInpcEstimatedMonths(List<String> inpcEstimatedMonths) {
        this.inpcEstimatedMonths = inpcEstimatedMonths;
        return this;
    }
}
