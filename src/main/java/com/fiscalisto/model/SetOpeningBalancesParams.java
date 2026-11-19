// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetOpeningBalancesParams: los campos de «Guardar los saldos iniciales».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetOpeningBalancesParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuándo empiezan sus libros (el día 1 de un mes): lo anterior no se cuenta.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El saldo de cada cuenta, deudor o acreedor; las dos columnas suman lo mismo. Sin renglones, borra los saldos iniciales.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<SetOpeningBalancesParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SetOpeningBalancesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuándo empiezan sus libros (el día 1 de un mes): lo anterior no se cuenta.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public SetOpeningBalancesParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El saldo de cada cuenta, deudor o acreedor; las dos columnas suman lo mismo. Sin renglones, borra los saldos iniciales.
     * <p>
     * Obligatorio.
     */
    public List<SetOpeningBalancesParamsLine> getLines() {
        return lines;
    }

    public SetOpeningBalancesParams setLines(List<SetOpeningBalancesParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
