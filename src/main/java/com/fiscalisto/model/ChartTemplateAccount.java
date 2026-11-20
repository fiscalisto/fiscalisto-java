// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChartTemplateAccount: ChartTemplateAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartTemplateAccount {
    /**
     * El número de la cuenta en su catálogo.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * true si su código agrupador ya tiene cuenta en su catálogo (number y name son los de esa); no se agrega.
     */
    @JsonProperty("in_chart")
    private Boolean inChart;

    /**
     * El número de la cuenta en su catálogo.
     */
    public String getNumber() {
        return number;
    }

    public ChartTemplateAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ChartTemplateAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public ChartTemplateAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * true si su código agrupador ya tiene cuenta en su catálogo (number y name son los de esa); no se agrega.
     */
    public Boolean getInChart() {
        return inChart;
    }

    public ChartTemplateAccount setInChart(Boolean inChart) {
        this.inChart = inChart;
        return this;
    }
}
