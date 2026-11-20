// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateConsolidationEliminationParams: los campos de «Capturar una eliminación de consolidación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateConsolidationEliminationParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM) a cuyo cierre se elimina.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * El concepto: «Ventas entre empresas del grupo».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Los RFC entre los que es, del espacio del emisor: se aplica cuando todos están en el consolidado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rfcs")
    private List<String> rfcs;

    /**
     * Sus renglones: los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<CreateConsolidationEliminationParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateConsolidationEliminationParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM) a cuyo cierre se elimina.
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public CreateConsolidationEliminationParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El concepto: «Ventas entre empresas del grupo».
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateConsolidationEliminationParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Los RFC entre los que es, del espacio del emisor: se aplica cuando todos están en el consolidado.
     * <p>
     * Obligatorio.
     */
    public List<String> getRfcs() {
        return rfcs;
    }

    public CreateConsolidationEliminationParams setRfcs(List<String> rfcs) {
        this.rfcs = rfcs;
        return this;
    }

    /**
     * Sus renglones: los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    public List<CreateConsolidationEliminationParamsLine> getLines() {
        return lines;
    }

    public CreateConsolidationEliminationParams setLines(List<CreateConsolidationEliminationParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
