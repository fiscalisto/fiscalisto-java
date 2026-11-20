// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * FinancialRatios: Razones financieras al cierre de un mes: de su balance general y de sus resultados de enero al mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialRatios {
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
     * Liquidez, endeudamiento, rentabilidad y rotación.
     */
    @JsonProperty("ratios")
    private List<FinancialRatiosRatio> ratios;

    /**
     * Las cifras de que salen.
     */
    @JsonProperty("inputs")
    private FinancialRatiosInputs inputs;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public FinancialRatios setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public FinancialRatios setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public FinancialRatios setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public FinancialRatios setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Liquidez, endeudamiento, rentabilidad y rotación.
     */
    public List<FinancialRatiosRatio> getRatios() {
        return ratios;
    }

    public FinancialRatios setRatios(List<FinancialRatiosRatio> ratios) {
        this.ratios = ratios;
        return this;
    }

    /**
     * Las cifras de que salen.
     */
    public FinancialRatiosInputs getInputs() {
        return inputs;
    }

    public FinancialRatios setInputs(FinancialRatiosInputs inputs) {
        this.inputs = inputs;
        return this;
    }
}
