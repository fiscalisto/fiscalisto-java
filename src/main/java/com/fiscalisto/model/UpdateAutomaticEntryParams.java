// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateAutomaticEntryParams: los campos de «Editar la póliza de un CFDI».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAutomaticEntryParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su concepto. Sin él, queda el que tiene.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Sus cargos y abonos en lugar de los que arma Fiscalisto: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<UpdateAutomaticEntryParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateAutomaticEntryParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su concepto. Sin él, queda el que tiene.
     */
    public String getDescription() {
        return description;
    }

    public UpdateAutomaticEntryParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Sus cargos y abonos en lugar de los que arma Fiscalisto: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    public List<UpdateAutomaticEntryParamsLine> getLines() {
        return lines;
    }

    public UpdateAutomaticEntryParams setLines(List<UpdateAutomaticEntryParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
