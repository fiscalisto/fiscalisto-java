// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListWarehousesParams: los campos de «Listar almacenes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListWarehousesParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true para incluir los archivados.
     */
    @JsonProperty("include_archived")
    private Boolean includeArchived;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListWarehousesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true para incluir los archivados.
     */
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    public ListWarehousesParams setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }
}
