// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * ClimateSurveyResultsClimateItem: ClimateSurveyResultsClimateItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsClimateItem {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    @JsonProperty("text")
    private String text;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cuántos la contestaron.
     */
    @JsonProperty("answered")
    private Long answered;

    /**
     * scale y nps: el promedio.
     */
    @JsonProperty("average")
    private BigDecimal average;

    /**
     * Cuántos dieron cada respuesta (cada número o cada opción).
     */
    @JsonProperty("counts")
    private Map<String, Object> counts;

    /**
     * nps: el porcentaje de promotores menos el de detractores.
     */
    @JsonProperty("enps")
    private BigDecimal enps;

    /**
     * text: las respuestas, en orden alfabético y sin nombre.
     */
    @JsonProperty("texts")
    private List<String> texts;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ClimateSurveyResultsClimateItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    public String getText() {
        return text;
    }

    public ClimateSurveyResultsClimateItem setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    public String getType() {
        return type;
    }

    public ClimateSurveyResultsClimateItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Cuántos la contestaron.
     */
    public Long getAnswered() {
        return answered;
    }

    public ClimateSurveyResultsClimateItem setAnswered(Long answered) {
        this.answered = answered;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsClimateItem setAnswered(long answered) {
        return setAnswered(Long.valueOf(answered));
    }

    /**
     * scale y nps: el promedio.
     */
    public BigDecimal getAverage() {
        return average;
    }

    public ClimateSurveyResultsClimateItem setAverage(BigDecimal average) {
        this.average = average;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsClimateItem setAverage(double average) {
        return setAverage(BigDecimal.valueOf(average));
    }

    /**
     * Cuántos dieron cada respuesta (cada número o cada opción).
     */
    public Map<String, Object> getCounts() {
        return counts;
    }

    public ClimateSurveyResultsClimateItem setCounts(Map<String, Object> counts) {
        this.counts = counts;
        return this;
    }

    /**
     * nps: el porcentaje de promotores menos el de detractores.
     */
    public BigDecimal getEnps() {
        return enps;
    }

    public ClimateSurveyResultsClimateItem setEnps(BigDecimal enps) {
        this.enps = enps;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsClimateItem setEnps(double enps) {
        return setEnps(BigDecimal.valueOf(enps));
    }

    /**
     * text: las respuestas, en orden alfabético y sin nombre.
     */
    public List<String> getTexts() {
        return texts;
    }

    public ClimateSurveyResultsClimateItem setTexts(List<String> texts) {
        this.texts = texts;
        return this;
    }
}
