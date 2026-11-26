// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Climate: El clima laboral de un emisor (Nómina › Clima laboral).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Climate {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Lo que se configura en POST /v1/climate/policy.
     */
    @JsonProperty("settings")
    private ClimateSettings settings;

    /**
     * Cada centro de trabajo con su guía y cuándo le toca.
     */
    @JsonProperty("centros")
    private List<ClimateCentro> centros;

    /**
     * Las acciones del Programa de intervención.
     */
    @JsonProperty("actions")
    private ClimateActions actions;

    /**
     * Las quejas del buzón que esperan atención.
     */
    @JsonProperty("complaints")
    private ClimateComplaints complaints;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Climate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Climate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Climate setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Climate setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Climate setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Lo que se configura en POST /v1/climate/policy.
     */
    public ClimateSettings getSettings() {
        return settings;
    }

    public Climate setSettings(ClimateSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Cada centro de trabajo con su guía y cuándo le toca.
     */
    public List<ClimateCentro> getCentros() {
        return centros;
    }

    public Climate setCentros(List<ClimateCentro> centros) {
        this.centros = centros;
        return this;
    }

    /**
     * Las acciones del Programa de intervención.
     */
    public ClimateActions getActions() {
        return actions;
    }

    public Climate setActions(ClimateActions actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Las quejas del buzón que esperan atención.
     */
    public ClimateComplaints getComplaints() {
        return complaints;
    }

    public Climate setComplaints(ClimateComplaints complaints) {
        this.complaints = complaints;
        return this;
    }
}
