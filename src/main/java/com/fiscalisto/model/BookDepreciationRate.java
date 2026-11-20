// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BookDepreciationRate: La tasa anual y el valor residual con que los libros deprecian un activo o un tipo de activo desde un mes (NIF C-6), aparte de la deducción fiscal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDepreciationRate {
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
     * El activo fijo que lleva la tasa, o null si es de un tipo.
     */
    @JsonProperty("fixed_asset")
    private String fixedAsset;

    /**
     * El tipo de activo (uso CFDI) que la lleva, o null si es de un activo.
     */
    @JsonProperty("cfdi_use")
    private String cfdiUse;

    /**
     * El mes (AAAA-MM) desde el que aplica.
     */
    @JsonProperty("from_month")
    private String fromMonth;

    /**
     * La tasa anual contable, o null si se quitó.
     */
    @JsonProperty("annual_rate")
    private BigDecimal annualRate;

    /**
     * El valor residual como fracción del monto original, o null si se quitó.
     */
    @JsonProperty("residual_rate")
    private BigDecimal residualRate;

    /**
     * true si quitó la tasa de ese mes.
     */
    @JsonProperty("removed")
    private Boolean removed;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public BookDepreciationRate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public BookDepreciationRate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public BookDepreciationRate setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El activo fijo que lleva la tasa, o null si es de un tipo.
     */
    public String getFixedAsset() {
        return fixedAsset;
    }

    public BookDepreciationRate setFixedAsset(String fixedAsset) {
        this.fixedAsset = fixedAsset;
        return this;
    }

    /**
     * El tipo de activo (uso CFDI) que la lleva, o null si es de un activo.
     */
    public String getCfdiUse() {
        return cfdiUse;
    }

    public BookDepreciationRate setCfdiUse(String cfdiUse) {
        this.cfdiUse = cfdiUse;
        return this;
    }

    /**
     * El mes (AAAA-MM) desde el que aplica.
     */
    public String getFromMonth() {
        return fromMonth;
    }

    public BookDepreciationRate setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    /**
     * La tasa anual contable, o null si se quitó.
     */
    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    public BookDepreciationRate setAnnualRate(BigDecimal annualRate) {
        this.annualRate = annualRate;
        return this;
    }

    @JsonIgnore
    public BookDepreciationRate setAnnualRate(double annualRate) {
        return setAnnualRate(BigDecimal.valueOf(annualRate));
    }

    /**
     * El valor residual como fracción del monto original, o null si se quitó.
     */
    public BigDecimal getResidualRate() {
        return residualRate;
    }

    public BookDepreciationRate setResidualRate(BigDecimal residualRate) {
        this.residualRate = residualRate;
        return this;
    }

    @JsonIgnore
    public BookDepreciationRate setResidualRate(double residualRate) {
        return setResidualRate(BigDecimal.valueOf(residualRate));
    }

    /**
     * true si quitó la tasa de ese mes.
     */
    public Boolean getRemoved() {
        return removed;
    }

    public BookDepreciationRate setRemoved(Boolean removed) {
        this.removed = removed;
        return this;
    }
}
