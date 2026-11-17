// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportIndicator: CompanyReportIndicator.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportIndicator {
    /**
     * El indicador (el de PATCH del umbral en la app).
     */
    @JsonProperty("key")
    private String key;

    /**
     * Su nombre, como en la app.
     */
    @JsonProperty("label")
    private String label;

    /**
     * ok, risk (pasa el umbral) o no_data.
     * <p>
     * Valores: ok, risk, no_data.
     */
    @JsonProperty("state")
    private String state;

    /**
     * La cifra: por ciento 0 a 100, HHI, cuántos, pesos o días; null sin datos.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * La cifra en palabras («HHI 1,954», «3 %»).
     */
    @JsonProperty("display")
    private String display;

    /**
     * Desde dónde se marca en riesgo.
     */
    @JsonProperty("threshold")
    private BigDecimal threshold;

    /**
     * El umbral es el que puso la empresa, no el de Fiscalisto.
     */
    @JsonProperty("custom_threshold")
    private Boolean customThreshold;

    /**
     * El indicador (el de PATCH del umbral en la app).
     */
    public String getKey() {
        return key;
    }

    public CompanyReportIndicator setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre, como en la app.
     */
    public String getLabel() {
        return label;
    }

    public CompanyReportIndicator setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * ok, risk (pasa el umbral) o no_data.
     * <p>
     * Valores: ok, risk, no_data.
     */
    public String getState() {
        return state;
    }

    public CompanyReportIndicator setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * La cifra: por ciento 0 a 100, HHI, cuántos, pesos o días; null sin datos.
     */
    public BigDecimal getValue() {
        return value;
    }

    public CompanyReportIndicator setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public CompanyReportIndicator setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * La cifra en palabras («HHI 1,954», «3 %»).
     */
    public String getDisplay() {
        return display;
    }

    public CompanyReportIndicator setDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * Desde dónde se marca en riesgo.
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    public CompanyReportIndicator setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    @JsonIgnore
    public CompanyReportIndicator setThreshold(double threshold) {
        return setThreshold(BigDecimal.valueOf(threshold));
    }

    /**
     * El umbral es el que puso la empresa, no el de Fiscalisto.
     */
    public Boolean getCustomThreshold() {
        return customThreshold;
    }

    public CompanyReportIndicator setCustomThreshold(Boolean customThreshold) {
        this.customThreshold = customThreshold;
        return this;
    }
}
