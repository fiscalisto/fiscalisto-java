// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * DepreciationReconciliationItem: DepreciationReconciliationItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepreciationReconciliationItem {
    /**
     * El activo fijo (fxa_… o fxc_…), o null si no tiene registro contable.
     */
    @JsonProperty("fixed_asset")
    private String fixedAsset;

    /**
     * Qué es.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Su tipo por uso CFDI (I01 a I08).
     */
    @JsonProperty("cfdi_use")
    private String cfdiUse;

    /**
     * Su depreciación contable del año.
     */
    @JsonProperty("book_depreciation")
    private BigDecimal bookDepreciation;

    /**
     * Su deducción fiscal del año, actualizada con el INPC.
     */
    @JsonProperty("tax_deduction")
    private BigDecimal taxDeduction;

    /**
     * El factor de actualización de la deducción fiscal (1 sin actualizar).
     */
    @JsonProperty("inflation_factor")
    private BigDecimal inflationFactor;

    /**
     * tax_deduction menos book_depreciation.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * El activo fijo (fxa_… o fxc_…), o null si no tiene registro contable.
     */
    public String getFixedAsset() {
        return fixedAsset;
    }

    public DepreciationReconciliationItem setFixedAsset(String fixedAsset) {
        this.fixedAsset = fixedAsset;
        return this;
    }

    /**
     * Qué es.
     */
    public String getDescription() {
        return description;
    }

    public DepreciationReconciliationItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Su tipo por uso CFDI (I01 a I08).
     */
    public String getCfdiUse() {
        return cfdiUse;
    }

    public DepreciationReconciliationItem setCfdiUse(String cfdiUse) {
        this.cfdiUse = cfdiUse;
        return this;
    }

    /**
     * Su depreciación contable del año.
     */
    public BigDecimal getBookDepreciation() {
        return bookDepreciation;
    }

    public DepreciationReconciliationItem setBookDepreciation(BigDecimal bookDepreciation) {
        this.bookDepreciation = bookDepreciation;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliationItem setBookDepreciation(double bookDepreciation) {
        return setBookDepreciation(BigDecimal.valueOf(bookDepreciation));
    }

    /**
     * Su deducción fiscal del año, actualizada con el INPC.
     */
    public BigDecimal getTaxDeduction() {
        return taxDeduction;
    }

    public DepreciationReconciliationItem setTaxDeduction(BigDecimal taxDeduction) {
        this.taxDeduction = taxDeduction;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliationItem setTaxDeduction(double taxDeduction) {
        return setTaxDeduction(BigDecimal.valueOf(taxDeduction));
    }

    /**
     * El factor de actualización de la deducción fiscal (1 sin actualizar).
     */
    public BigDecimal getInflationFactor() {
        return inflationFactor;
    }

    public DepreciationReconciliationItem setInflationFactor(BigDecimal inflationFactor) {
        this.inflationFactor = inflationFactor;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliationItem setInflationFactor(double inflationFactor) {
        return setInflationFactor(BigDecimal.valueOf(inflationFactor));
    }

    /**
     * tax_deduction menos book_depreciation.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public DepreciationReconciliationItem setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public DepreciationReconciliationItem setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }
}
