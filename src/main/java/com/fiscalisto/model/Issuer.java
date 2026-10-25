// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Issuer: Un emisor: un RFC que timbra desde su cuenta API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Issuer {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

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
     * active: puede timbrar. needs_certificate: falta su CSD. needs_efirma: falta firmar una vez el contrato con el PAC con su e.firma (solo en producción). certificate_expired: su CSD venció. archived: archivado.
     * <p>
     * Valores: active, needs_certificate, certificate_expired, needs_efirma, archived.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Qué le falta al emisor para timbrar, y cómo dárselo.
     */
    @JsonProperty("requirement")
    private String requirement;

    /**
     * El sello digital (CSD) cargado: número de serie y vencimiento.
     */
    @JsonProperty("certificate")
    private IssuerCertificate certificate;

    /**
     * Si puede pedirle al SAT sus facturas (POST /v1/sat_downloads): available es true en pruebas, y en producción mientras su e.firma guardada esté vigente (efirma_expires_at).
     */
    @JsonProperty("sat_downloads")
    private IssuerSatDownloads satDownloads;

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
     * RFC con el que se timbra: el del emisor en producción y el de pruebas del SAT (EKU9003173C9) en pruebas.
     */
    @JsonProperty("stamps_as")
    private String stampsAs;

    /**
     * El entorno de prueba (sbx_…) al que pertenece, o null si es de la cuenta. Vea /v1/sandboxes.
     */
    @JsonProperty("sandbox")
    private String sandbox;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo se archivó (ya no timbra), o null.
     */
    @JsonProperty("archived_at")
    private String archivedAt;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Issuer setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Issuer setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Issuer setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public Issuer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public Issuer setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public Issuer setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public Issuer setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * active: puede timbrar. needs_certificate: falta su CSD. needs_efirma: falta firmar una vez el contrato con el PAC con su e.firma (solo en producción). certificate_expired: su CSD venció. archived: archivado.
     * <p>
     * Valores: active, needs_certificate, certificate_expired, needs_efirma, archived.
     */
    public String getStatus() {
        return status;
    }

    public Issuer setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Qué le falta al emisor para timbrar, y cómo dárselo.
     */
    public String getRequirement() {
        return requirement;
    }

    public Issuer setRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }

    /**
     * El sello digital (CSD) cargado: número de serie y vencimiento.
     */
    public IssuerCertificate getCertificate() {
        return certificate;
    }

    public Issuer setCertificate(IssuerCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Si puede pedirle al SAT sus facturas (POST /v1/sat_downloads): available es true en pruebas, y en producción mientras su e.firma guardada esté vigente (efirma_expires_at).
     */
    public IssuerSatDownloads getSatDownloads() {
        return satDownloads;
    }

    public Issuer setSatDownloads(IssuerSatDownloads satDownloads) {
        this.satDownloads = satDownloads;
        return this;
    }

    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    public String getEmployerRegistration() {
        return employerRegistration;
    }

    public Issuer setEmployerRegistration(String employerRegistration) {
        this.employerRegistration = employerRegistration;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public Issuer setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * RFC con el que se timbra: el del emisor en producción y el de pruebas del SAT (EKU9003173C9) en pruebas.
     */
    public String getStampsAs() {
        return stampsAs;
    }

    public Issuer setStampsAs(String stampsAs) {
        this.stampsAs = stampsAs;
        return this;
    }

    /**
     * El entorno de prueba (sbx_…) al que pertenece, o null si es de la cuenta. Vea /v1/sandboxes.
     */
    public String getSandbox() {
        return sandbox;
    }

    public Issuer setSandbox(String sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Issuer setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo se archivó (ya no timbra), o null.
     */
    public String getArchivedAt() {
        return archivedAt;
    }

    public Issuer setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public Issuer setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
