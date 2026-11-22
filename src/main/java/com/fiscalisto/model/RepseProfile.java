// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RepseProfile: Lo que el SISUB pide del sujeto obligado (el contratista); la razón social y el registro patronal salen de sus datos fiscales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseProfile {
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
    private String issuer;

    /**
     * Folio de su registro en el REPSE que dio la STPS.
     */
    @JsonProperty("stps_folio")
    private String stpsFolio;

    /**
     * Correo del sujeto obligado.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Teléfono, 10 dígitos.
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * Domicilio fiscal en una línea.
     */
    @JsonProperty("address")
    private String address;

    /**
     * Representante legal (persona moral).
     */
    @JsonProperty("legal_representative")
    private String legalRepresentative;

    /**
     * Administrador único (persona moral).
     */
    @JsonProperty("sole_administrator")
    private String soleAdministrator;

    /**
     * Número de la escritura constitutiva.
     */
    @JsonProperty("deed_number")
    private String deedNumber;

    /**
     * Nombre del notario público.
     */
    @JsonProperty("notary_name")
    private String notaryName;

    /**
     * Número de la notaría.
     */
    @JsonProperty("notary_number")
    private String notaryNumber;

    /**
     * Fecha de la escritura (YYYY-MM-DD).
     */
    @JsonProperty("deed_date")
    private String deedDate;

    /**
     * Folio mercantil.
     */
    @JsonProperty("commercial_folio")
    private String commercialFolio;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RepseProfile setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public RepseProfile setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public RepseProfile setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Folio de su registro en el REPSE que dio la STPS.
     */
    public String getStpsFolio() {
        return stpsFolio;
    }

    public RepseProfile setStpsFolio(String stpsFolio) {
        this.stpsFolio = stpsFolio;
        return this;
    }

    /**
     * Correo del sujeto obligado.
     */
    public String getEmail() {
        return email;
    }

    public RepseProfile setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Teléfono, 10 dígitos.
     */
    public String getPhone() {
        return phone;
    }

    public RepseProfile setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Domicilio fiscal en una línea.
     */
    public String getAddress() {
        return address;
    }

    public RepseProfile setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Representante legal (persona moral).
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public RepseProfile setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }

    /**
     * Administrador único (persona moral).
     */
    public String getSoleAdministrator() {
        return soleAdministrator;
    }

    public RepseProfile setSoleAdministrator(String soleAdministrator) {
        this.soleAdministrator = soleAdministrator;
        return this;
    }

    /**
     * Número de la escritura constitutiva.
     */
    public String getDeedNumber() {
        return deedNumber;
    }

    public RepseProfile setDeedNumber(String deedNumber) {
        this.deedNumber = deedNumber;
        return this;
    }

    /**
     * Nombre del notario público.
     */
    public String getNotaryName() {
        return notaryName;
    }

    public RepseProfile setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }

    /**
     * Número de la notaría.
     */
    public String getNotaryNumber() {
        return notaryNumber;
    }

    public RepseProfile setNotaryNumber(String notaryNumber) {
        this.notaryNumber = notaryNumber;
        return this;
    }

    /**
     * Fecha de la escritura (YYYY-MM-DD).
     */
    public String getDeedDate() {
        return deedDate;
    }

    public RepseProfile setDeedDate(String deedDate) {
        this.deedDate = deedDate;
        return this;
    }

    /**
     * Folio mercantil.
     */
    public String getCommercialFolio() {
        return commercialFolio;
    }

    public RepseProfile setCommercialFolio(String commercialFolio) {
        this.commercialFolio = commercialFolio;
        return this;
    }
}
