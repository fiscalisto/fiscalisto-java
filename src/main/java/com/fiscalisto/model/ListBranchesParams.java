// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListBranchesParams: los campos de «Listar sucursales».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListBranchesParams {
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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true para incluir las archivadas.
     */
    @JsonProperty("include_archived")
    private Boolean includeArchived;

    /**
     * Solo la de este código postal.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListBranchesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListBranchesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListBranchesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListBranchesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true para incluir las archivadas.
     */
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    public ListBranchesParams setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }

    /**
     * Solo la de este código postal.
     */
    public String getZip() {
        return zip;
    }

    public ListBranchesParams setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
