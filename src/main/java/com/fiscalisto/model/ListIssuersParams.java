// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIssuersParams: los campos de «Listar emisores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListIssuersParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * Solo el de este RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * true para incluir los archivados.
     */
    @JsonProperty("include_archived")
    private Boolean includeArchived;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListIssuersParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListIssuersParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListIssuersParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo el de este RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public ListIssuersParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * true para incluir los archivados.
     */
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    public ListIssuersParams setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }
}
