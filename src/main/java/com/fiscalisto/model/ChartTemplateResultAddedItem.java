// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChartTemplateResultAddedItem: ChartTemplateResultAddedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartTemplateResultAddedItem {
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
     * El número de la cuenta en su catálogo.
     */
    public String getNumber() {
        return number;
    }

    public ChartTemplateResultAddedItem setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ChartTemplateResultAddedItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public ChartTemplateResultAddedItem setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }
}
