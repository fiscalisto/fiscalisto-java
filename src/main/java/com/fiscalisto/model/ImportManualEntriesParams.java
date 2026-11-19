// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ImportManualEntriesParams: los campos de «Importar pólizas de otro sistema».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImportManualEntriesParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Las pólizas, hasta 3,000.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("entries")
    private List<ImportManualEntriesParamsEntry> entries;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ImportManualEntriesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las pólizas, hasta 3,000.
     * <p>
     * Obligatorio.
     */
    public List<ImportManualEntriesParamsEntry> getEntries() {
        return entries;
    }

    public ImportManualEntriesParams setEntries(List<ImportManualEntriesParamsEntry> entries) {
        this.entries = entries;
        return this;
    }
}
