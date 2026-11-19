// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * OpeningBalances: Los saldos iniciales del emisor: con qué saldo empieza cada cuenta el día en que empiezan sus libros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningBalances {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El día en que empiezan sus libros, o null si no tiene saldos iniciales.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El saldo de cada cuenta: deudor (debit) o acreedor (credit).
     */
    @JsonProperty("lines")
    private List<OpeningBalancesLine> lines;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public OpeningBalances setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public OpeningBalances setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public OpeningBalances setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El día en que empiezan sus libros, o null si no tiene saldos iniciales.
     */
    public String getDate() {
        return date;
    }

    public OpeningBalances setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El saldo de cada cuenta: deudor (debit) o acreedor (credit).
     */
    public List<OpeningBalancesLine> getLines() {
        return lines;
    }

    public OpeningBalances setLines(List<OpeningBalancesLine> lines) {
        this.lines = lines;
        return this;
    }
}
