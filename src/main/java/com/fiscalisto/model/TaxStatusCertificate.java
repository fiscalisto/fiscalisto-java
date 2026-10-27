// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * TaxStatusCertificate: La constancia de situación fiscal más reciente del emisor, generada en el SAT con su e.firma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxStatusCertificate {
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
     * El día que la emitió el SAT (AAAA-MM-DD), o null.
     */
    @JsonProperty("issued_on")
    private String issuedOn;

    /**
     * Su idCIF, o null.
     */
    @JsonProperty("id_cif")
    private String idCif;

    /**
     * El RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre o razón social como la tiene el SAT, o null.
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Sus regímenes fiscales (clave de c_RegimenFiscal y nombre).
     */
    @JsonProperty("tax_systems")
    private List<TaxStatusCertificateTaxSystem> taxSystems;

    /**
     * El código postal de su domicilio fiscal, o null.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Estatus en el padrón (ACTIVO, SUSPENDIDO…), o null.
     */
    @JsonProperty("status")
    private String status;

    /**
     * true si su PDF está en GET /v1/issuers/{id}/tax_status_certificate/pdf.
     */
    @JsonProperty("pdf")
    private Boolean pdf;

    /**
     * Cuándo se generó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TaxStatusCertificate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TaxStatusCertificate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public TaxStatusCertificate setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El día que la emitió el SAT (AAAA-MM-DD), o null.
     */
    public String getIssuedOn() {
        return issuedOn;
    }

    public TaxStatusCertificate setIssuedOn(String issuedOn) {
        this.issuedOn = issuedOn;
        return this;
    }

    /**
     * Su idCIF, o null.
     */
    public String getIdCif() {
        return idCif;
    }

    public TaxStatusCertificate setIdCif(String idCif) {
        this.idCif = idCif;
        return this;
    }

    /**
     * El RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public TaxStatusCertificate setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social como la tiene el SAT, o null.
     */
    public String getLegalName() {
        return legalName;
    }

    public TaxStatusCertificate setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Sus regímenes fiscales (clave de c_RegimenFiscal y nombre).
     */
    public List<TaxStatusCertificateTaxSystem> getTaxSystems() {
        return taxSystems;
    }

    public TaxStatusCertificate setTaxSystems(List<TaxStatusCertificateTaxSystem> taxSystems) {
        this.taxSystems = taxSystems;
        return this;
    }

    /**
     * El código postal de su domicilio fiscal, o null.
     */
    public String getZip() {
        return zip;
    }

    public TaxStatusCertificate setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Estatus en el padrón (ACTIVO, SUSPENDIDO…), o null.
     */
    public String getStatus() {
        return status;
    }

    public TaxStatusCertificate setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * true si su PDF está en GET /v1/issuers/{id}/tax_status_certificate/pdf.
     */
    public Boolean getPdf() {
        return pdf;
    }

    public TaxStatusCertificate setPdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }

    /**
     * Cuándo se generó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public TaxStatusCertificate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
