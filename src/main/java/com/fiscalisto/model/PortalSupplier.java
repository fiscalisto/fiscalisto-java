// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PortalSupplier: Un proveedor del Portal de proveedores del emisor: su alta, sus documentos, la cuenta a la que se le paga y su calificación.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalSupplier {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
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
     * El emisor de su cuenta (iss_…) cuyo portal es.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre o razón social, o null si aún no lo da.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Los correos a los que le escribimos.
     */
    @JsonProperty("emails")
    private List<String> emails;

    /**
     * Su teléfono, o null.
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * invited (invitado), onboarding (dando su alta), in_review (alta por revisar), approved (puede mandar facturas), rejected o suspended.
     * <p>
     * Valores: invited, onboarding, in_review, approved, rejected, suspended.
     */
    @JsonProperty("status")
    private String status;

    /**
     * true si da servicios especializados (REPSE).
     */
    @JsonProperty("repse")
    private Boolean repse;

    /**
     * Su alta: complete cuando todo lo obligatorio está aprobado y vigente, y cuántos documentos faltan, esperan revisión, vencieron o están por vencer.
     */
    @JsonProperty("documents")
    private PortalSupplierDocuments documents;

    /**
     * La cuenta a la que se le paga, o null. Una nueva queda pending hasta que se aprueba en la app; mientras, se le paga a previous_clabe.
     */
    @JsonProperty("bank_account")
    private PortalSupplierBankAccount bankAccount;

    /**
     * Su calificación de 0 a 100 de los últimos 12 meses (value, null sin datos; level excellent, good, fair o poor) y cada parte: invoices (facturas a la primera), deliveries (entregas a tiempo), prices (precio y cantidad de la orden), documents (documentos al día) y complements (complementos de pago), con good de total casos.
     */
    @JsonProperty("score")
    private PortalSupplierScore score;

    /**
     * La última vez que entró a su portal, o null.
     */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    /**
     * Cuándo se invitó o se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PortalSupplier setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PortalSupplier setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PortalSupplier setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor de su cuenta (iss_…) cuyo portal es.
     */
    public String getIssuer() {
        return issuer;
    }

    public PortalSupplier setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getTaxId() {
        return taxId;
    }

    public PortalSupplier setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre o razón social, o null si aún no lo da.
     */
    public String getName() {
        return name;
    }

    public PortalSupplier setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Los correos a los que le escribimos.
     */
    public List<String> getEmails() {
        return emails;
    }

    public PortalSupplier setEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Su teléfono, o null.
     */
    public String getPhone() {
        return phone;
    }

    public PortalSupplier setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * invited (invitado), onboarding (dando su alta), in_review (alta por revisar), approved (puede mandar facturas), rejected o suspended.
     * <p>
     * Valores: invited, onboarding, in_review, approved, rejected, suspended.
     */
    public String getStatus() {
        return status;
    }

    public PortalSupplier setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * true si da servicios especializados (REPSE).
     */
    public Boolean getRepse() {
        return repse;
    }

    public PortalSupplier setRepse(Boolean repse) {
        this.repse = repse;
        return this;
    }

    /**
     * Su alta: complete cuando todo lo obligatorio está aprobado y vigente, y cuántos documentos faltan, esperan revisión, vencieron o están por vencer.
     */
    public PortalSupplierDocuments getDocuments() {
        return documents;
    }

    public PortalSupplier setDocuments(PortalSupplierDocuments documents) {
        this.documents = documents;
        return this;
    }

    /**
     * La cuenta a la que se le paga, o null. Una nueva queda pending hasta que se aprueba en la app; mientras, se le paga a previous_clabe.
     */
    public PortalSupplierBankAccount getBankAccount() {
        return bankAccount;
    }

    public PortalSupplier setBankAccount(PortalSupplierBankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * Su calificación de 0 a 100 de los últimos 12 meses (value, null sin datos; level excellent, good, fair o poor) y cada parte: invoices (facturas a la primera), deliveries (entregas a tiempo), prices (precio y cantidad de la orden), documents (documentos al día) y complements (complementos de pago), con good de total casos.
     */
    public PortalSupplierScore getScore() {
        return score;
    }

    public PortalSupplier setScore(PortalSupplierScore score) {
        this.score = score;
        return this;
    }

    /**
     * La última vez que entró a su portal, o null.
     */
    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public PortalSupplier setLastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    /**
     * Cuándo se invitó o se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PortalSupplier setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public PortalSupplier setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
