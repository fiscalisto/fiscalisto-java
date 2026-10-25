// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CheckSatListsParams: los campos de «Revisar varios RFC en las listas del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckSatListsParams {
    /**
     * Los RFC a revisar, hasta 1000.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_ids")
    private List<String> taxIds;

    /**
     * Los RFC a revisar, hasta 1000.
     * <p>
     * Obligatorio.
     */
    public List<String> getTaxIds() {
        return taxIds;
    }

    public CheckSatListsParams setTaxIds(List<String> taxIds) {
        this.taxIds = taxIds;
        return this;
    }
}
