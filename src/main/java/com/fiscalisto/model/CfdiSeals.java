// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CfdiSeals: Si los sellos del XML son auténticos, como los revisa el SAT: el Sello del emisor contra la cadena original y su certificado, y el SelloSAT del timbre contra el certificado del SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiSeals {
    /**
     * true si no hay ningún problema: el Sello corresponde a los datos y al certificado del emisor (un CSD de su RFC, vigente en la fecha de emisión) y el timbre es de este comprobante y del SAT.
     */
    @JsonProperty("valid")
    private Boolean valid;

    /**
     * Si el Sello del emisor firma la cadena original de este XML con la llave del certificado que trae. false si alguien cambió un monto, un nombre o una fecha después de sellar.
     */
    @JsonProperty("issuer_seal_valid")
    private Boolean issuerSealValid;

    /**
     * El certificado del emisor que trae el XML (Certificado): número, RFC, nombre, si es CSD o e.firma y su vigencia. null si no se pudo leer.
     */
    @JsonProperty("certificate")
    private CfdiSealsCertificate certificate;

    /**
     * El timbre (TimbreFiscalDigital): si su SelloSAT es del SAT, con qué certificado del SAT y qué PAC lo timbró. null si el XML no está timbrado.
     */
    @JsonProperty("stamp")
    private CfdiSealsStamp stamp;

    /**
     * Cada problema, con su código y qué significa. Vacía si valid es true.
     */
    @JsonProperty("problems")
    private List<CfdiSealsProblem> problems;

    /**
     * La cadena original del comprobante, como la arma el SAT con sus XSLT. null si el XML no se pudo leer.
     */
    @JsonProperty("original_string")
    private String originalString;

    /**
     * true si no hay ningún problema: el Sello corresponde a los datos y al certificado del emisor (un CSD de su RFC, vigente en la fecha de emisión) y el timbre es de este comprobante y del SAT.
     */
    public Boolean getValid() {
        return valid;
    }

    public CfdiSeals setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Si el Sello del emisor firma la cadena original de este XML con la llave del certificado que trae. false si alguien cambió un monto, un nombre o una fecha después de sellar.
     */
    public Boolean getIssuerSealValid() {
        return issuerSealValid;
    }

    public CfdiSeals setIssuerSealValid(Boolean issuerSealValid) {
        this.issuerSealValid = issuerSealValid;
        return this;
    }

    /**
     * El certificado del emisor que trae el XML (Certificado): número, RFC, nombre, si es CSD o e.firma y su vigencia. null si no se pudo leer.
     */
    public CfdiSealsCertificate getCertificate() {
        return certificate;
    }

    public CfdiSeals setCertificate(CfdiSealsCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * El timbre (TimbreFiscalDigital): si su SelloSAT es del SAT, con qué certificado del SAT y qué PAC lo timbró. null si el XML no está timbrado.
     */
    public CfdiSealsStamp getStamp() {
        return stamp;
    }

    public CfdiSeals setStamp(CfdiSealsStamp stamp) {
        this.stamp = stamp;
        return this;
    }

    /**
     * Cada problema, con su código y qué significa. Vacía si valid es true.
     */
    public List<CfdiSealsProblem> getProblems() {
        return problems;
    }

    public CfdiSeals setProblems(List<CfdiSealsProblem> problems) {
        this.problems = problems;
        return this;
    }

    /**
     * La cadena original del comprobante, como la arma el SAT con sus XSLT. null si el XML no se pudo leer.
     */
    public String getOriginalString() {
        return originalString;
    }

    public CfdiSeals setOriginalString(String originalString) {
        this.originalString = originalString;
        return this;
    }
}
