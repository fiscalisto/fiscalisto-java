// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RenumberAccountsParams: los campos de «Renumerar el catálogo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RenumberAccountsParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Lo que separa los niveles: «-» (601-48), «.» (601.48) o «» (60148).
     * <p>
     * Valores: -, ., .
     */
    @JsonProperty("separator")
    private String separator;

    /**
     * Los dígitos de cada nivel, rellenados con ceros a la izquierda: [4, 3] hace 601-48 0601-048. Los niveles que no lleva conservan los suyos.
     */
    @JsonProperty("widths")
    private List<Long> widths;

    /**
     * En vez de separator y widths: el número nuevo de cada cuenta que cambia, por ejemplo los del sistema de su contador.
     */
    @JsonProperty("mapping")
    private List<RenumberAccountsParamsMappingItem> mapping;

    /**
     * true: dice qué cambiaría, sin cambiar nada.
     */
    @JsonProperty("dry_run")
    private Boolean dryRun;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public RenumberAccountsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Lo que separa los niveles: «-» (601-48), «.» (601.48) o «» (60148).
     * <p>
     * Valores: -, ., .
     */
    public String getSeparator() {
        return separator;
    }

    public RenumberAccountsParams setSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    /**
     * Los dígitos de cada nivel, rellenados con ceros a la izquierda: [4, 3] hace 601-48 0601-048. Los niveles que no lleva conservan los suyos.
     */
    public List<Long> getWidths() {
        return widths;
    }

    public RenumberAccountsParams setWidths(List<Long> widths) {
        this.widths = widths;
        return this;
    }

    /**
     * En vez de separator y widths: el número nuevo de cada cuenta que cambia, por ejemplo los del sistema de su contador.
     */
    public List<RenumberAccountsParamsMappingItem> getMapping() {
        return mapping;
    }

    public RenumberAccountsParams setMapping(List<RenumberAccountsParamsMappingItem> mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * true: dice qué cambiaría, sin cambiar nada.
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public RenumberAccountsParams setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
}
