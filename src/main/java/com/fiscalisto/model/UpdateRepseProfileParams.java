// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRepseProfileParams: los campos de «Guardar los datos del sujeto obligado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRepseProfileParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Folio de su registro en el REPSE que dio la STPS (AR65000).
     */
    @JsonProperty("stps_folio")
    private String stpsFolio;

    /**
     * Fecha en que la STPS otorgó el registro o su última renovación (YYYY-MM-DD). Se renueva cada tres años (LFT art. 15).
     */
    @JsonProperty("stps_registration_date")
    private String stpsRegistrationDate;

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
     * Domicilio fiscal en una línea: calle, números, colonia, C.P., municipio y estado.
     */
    @JsonProperty("address")
    private String address;

    /**
     * Representante legal (persona moral).
     */
    @JsonProperty("legal_representative")
    private String legalRepresentative;

    /**
     * Administrador único, si tiene (persona moral).
     */
    @JsonProperty("sole_administrator")
    private String soleAdministrator;

    /**
     * Número de la escritura constitutiva (persona moral).
     */
    @JsonProperty("deed_number")
    private String deedNumber;

    /**
     * Nombre del notario público de la escritura.
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
     * Folio mercantil (persona moral).
     */
    @JsonProperty("commercial_folio")
    private String commercialFolio;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateRepseProfileParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Folio de su registro en el REPSE que dio la STPS (AR65000).
     */
    public String getStpsFolio() {
        return stpsFolio;
    }

    public UpdateRepseProfileParams setStpsFolio(String stpsFolio) {
        this.stpsFolio = stpsFolio;
        return this;
    }

    /**
     * Fecha en que la STPS otorgó el registro o su última renovación (YYYY-MM-DD). Se renueva cada tres años (LFT art. 15).
     */
    public String getStpsRegistrationDate() {
        return stpsRegistrationDate;
    }

    public UpdateRepseProfileParams setStpsRegistrationDate(String stpsRegistrationDate) {
        this.stpsRegistrationDate = stpsRegistrationDate;
        return this;
    }

    /**
     * Correo del sujeto obligado.
     */
    public String getEmail() {
        return email;
    }

    public UpdateRepseProfileParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Teléfono, 10 dígitos.
     */
    public String getPhone() {
        return phone;
    }

    public UpdateRepseProfileParams setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Domicilio fiscal en una línea: calle, números, colonia, C.P., municipio y estado.
     */
    public String getAddress() {
        return address;
    }

    public UpdateRepseProfileParams setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Representante legal (persona moral).
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public UpdateRepseProfileParams setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }

    /**
     * Administrador único, si tiene (persona moral).
     */
    public String getSoleAdministrator() {
        return soleAdministrator;
    }

    public UpdateRepseProfileParams setSoleAdministrator(String soleAdministrator) {
        this.soleAdministrator = soleAdministrator;
        return this;
    }

    /**
     * Número de la escritura constitutiva (persona moral).
     */
    public String getDeedNumber() {
        return deedNumber;
    }

    public UpdateRepseProfileParams setDeedNumber(String deedNumber) {
        this.deedNumber = deedNumber;
        return this;
    }

    /**
     * Nombre del notario público de la escritura.
     */
    public String getNotaryName() {
        return notaryName;
    }

    public UpdateRepseProfileParams setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }

    /**
     * Número de la notaría.
     */
    public String getNotaryNumber() {
        return notaryNumber;
    }

    public UpdateRepseProfileParams setNotaryNumber(String notaryNumber) {
        this.notaryNumber = notaryNumber;
        return this;
    }

    /**
     * Fecha de la escritura (YYYY-MM-DD).
     */
    public String getDeedDate() {
        return deedDate;
    }

    public UpdateRepseProfileParams setDeedDate(String deedDate) {
        this.deedDate = deedDate;
        return this;
    }

    /**
     * Folio mercantil (persona moral).
     */
    public String getCommercialFolio() {
        return commercialFolio;
    }

    public UpdateRepseProfileParams setCommercialFolio(String commercialFolio) {
        this.commercialFolio = commercialFolio;
        return this;
    }
}
