// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveBookDepreciationRateParams: los campos de «Fijar la tasa de depreciación contable».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveBookDepreciationRateParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El activo fijo (fxa_… o fxc_…) que lleva su propia tasa. Mande este o cfdi_use.
     */
    @JsonProperty("fixed_asset")
    private String fixedAsset;

    /**
     * El tipo de activo (uso CFDI I01–I08) cuyos activos toman la tasa. Mande este o fixed_asset.
     * <p>
     * Valores: I01, I02, I03, I04, I05, I06, I07, I08.
     */
    @JsonProperty("cfdi_use")
    private String cfdiUse;

    /**
     * El mes, AAAA-MM y abierto, desde el que aplica.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from_month")
    private String fromMonth;

    /**
     * La tasa anual de los libros (0.2 son 5 años de vida útil). null quita la de ese mes y regresa a la anterior.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("annual_rate")
    private BigDecimal annualRate;

    /**
     * El valor residual como fracción del monto original (NIF C-6); 0 si no se manda.
     */
    @JsonProperty("residual_rate")
    private BigDecimal residualRate;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SaveBookDepreciationRateParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El activo fijo (fxa_… o fxc_…) que lleva su propia tasa. Mande este o cfdi_use.
     */
    public String getFixedAsset() {
        return fixedAsset;
    }

    public SaveBookDepreciationRateParams setFixedAsset(String fixedAsset) {
        this.fixedAsset = fixedAsset;
        return this;
    }

    /**
     * El tipo de activo (uso CFDI I01–I08) cuyos activos toman la tasa. Mande este o fixed_asset.
     * <p>
     * Valores: I01, I02, I03, I04, I05, I06, I07, I08.
     */
    public String getCfdiUse() {
        return cfdiUse;
    }

    public SaveBookDepreciationRateParams setCfdiUse(String cfdiUse) {
        this.cfdiUse = cfdiUse;
        return this;
    }

    /**
     * El mes, AAAA-MM y abierto, desde el que aplica.
     * <p>
     * Obligatorio.
     */
    public String getFromMonth() {
        return fromMonth;
    }

    public SaveBookDepreciationRateParams setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    /**
     * La tasa anual de los libros (0.2 son 5 años de vida útil). null quita la de ese mes y regresa a la anterior.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    public SaveBookDepreciationRateParams setAnnualRate(BigDecimal annualRate) {
        this.annualRate = annualRate;
        return this;
    }

    @JsonIgnore
    public SaveBookDepreciationRateParams setAnnualRate(double annualRate) {
        return setAnnualRate(BigDecimal.valueOf(annualRate));
    }

    /**
     * El valor residual como fracción del monto original (NIF C-6); 0 si no se manda.
     */
    public BigDecimal getResidualRate() {
        return residualRate;
    }

    public SaveBookDepreciationRateParams setResidualRate(BigDecimal residualRate) {
        this.residualRate = residualRate;
        return this;
    }

    @JsonIgnore
    public SaveBookDepreciationRateParams setResidualRate(double residualRate) {
        return setResidualRate(BigDecimal.valueOf(residualRate));
    }
}
