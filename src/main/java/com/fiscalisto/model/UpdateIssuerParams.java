// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * UpdateIssuerParams: los campos de «Actualizar un emisor».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateIssuerParams {
    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    @JsonProperty("employer_registration")
    private String employerRegistration;

    /**
     * CURP, 18 caracteres.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public UpdateIssuerParams setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public UpdateIssuerParams setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public UpdateIssuerParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    public String getEmployerRegistration() {
        return employerRegistration;
    }

    public UpdateIssuerParams setEmployerRegistration(String employerRegistration) {
        this.employerRegistration = employerRegistration;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public UpdateIssuerParams setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public UpdateIssuerParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
