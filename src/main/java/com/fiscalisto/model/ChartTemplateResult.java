// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ChartTemplateResult: Lo que agregó un catálogo por giro y lo que ya estaba.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartTemplateResult {
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
     * El giro.
     */
    @JsonProperty("chart_template")
    private String chartTemplate;

    /**
     * Las cuentas que se agregaron.
     */
    @JsonProperty("added")
    private List<ChartTemplateResultAddedItem> added;

    /**
     * Las que ya estaban (su código ya tenía cuenta).
     */
    @JsonProperty("existing")
    private List<ChartTemplateResultExistingItem> existing;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ChartTemplateResult setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ChartTemplateResult setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El giro.
     */
    public String getChartTemplate() {
        return chartTemplate;
    }

    public ChartTemplateResult setChartTemplate(String chartTemplate) {
        this.chartTemplate = chartTemplate;
        return this;
    }

    /**
     * Las cuentas que se agregaron.
     */
    public List<ChartTemplateResultAddedItem> getAdded() {
        return added;
    }

    public ChartTemplateResult setAdded(List<ChartTemplateResultAddedItem> added) {
        this.added = added;
        return this;
    }

    /**
     * Las que ya estaban (su código ya tenía cuenta).
     */
    public List<ChartTemplateResultExistingItem> getExisting() {
        return existing;
    }

    public ChartTemplateResult setExisting(List<ChartTemplateResultExistingItem> existing) {
        this.existing = existing;
        return this;
    }
}
