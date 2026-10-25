// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerDataRequestSubmission: CustomerDataRequestSubmission.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDataRequestSubmission {
    /**
     * Su RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre o razón social, como en su constancia.
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Su régimen fiscal (c_RegimenFiscal).
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * El código postal de su domicilio fiscal.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * El uso del CFDI que eligió (c_UsoCFDI).
     */
    @JsonProperty("use")
    private String use;

    /**
     * Su correo para recibir facturas, si lo dio.
     */
    @JsonProperty("email")
    private String email;

    /**
     * constancia (leído de su constancia o del SAT con su idCIF) o manual (escrito).
     * <p>
     * Valores: constancia, manual.
     */
    @JsonProperty("source")
    private String source;

    /**
     * El cliente (cus_…) en el catálogo del emisor: el nuevo, o el que ya existía con ese RFC.
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * true si quedó en el catálogo. false si el cliente ya existía con otros datos: aplíquelos con POST /v1/customers/{id} si son correctos.
     */
    @JsonProperty("applied")
    private Boolean applied;

    /**
     * Cuándo los mandó.
     */
    @JsonProperty("submitted_at")
    private String submittedAt;

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public CustomerDataRequestSubmission setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre o razón social, como en su constancia.
     */
    public String getLegalName() {
        return legalName;
    }

    public CustomerDataRequestSubmission setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Su régimen fiscal (c_RegimenFiscal).
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public CustomerDataRequestSubmission setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * El código postal de su domicilio fiscal.
     */
    public String getZip() {
        return zip;
    }

    public CustomerDataRequestSubmission setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * El uso del CFDI que eligió (c_UsoCFDI).
     */
    public String getUse() {
        return use;
    }

    public CustomerDataRequestSubmission setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Su correo para recibir facturas, si lo dio.
     */
    public String getEmail() {
        return email;
    }

    public CustomerDataRequestSubmission setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * constancia (leído de su constancia o del SAT con su idCIF) o manual (escrito).
     * <p>
     * Valores: constancia, manual.
     */
    public String getSource() {
        return source;
    }

    public CustomerDataRequestSubmission setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El cliente (cus_…) en el catálogo del emisor: el nuevo, o el que ya existía con ese RFC.
     */
    public String getCustomer() {
        return customer;
    }

    public CustomerDataRequestSubmission setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * true si quedó en el catálogo. false si el cliente ya existía con otros datos: aplíquelos con POST /v1/customers/{id} si son correctos.
     */
    public Boolean getApplied() {
        return applied;
    }

    public CustomerDataRequestSubmission setApplied(Boolean applied) {
        this.applied = applied;
        return this;
    }

    /**
     * Cuándo los mandó.
     */
    public String getSubmittedAt() {
        return submittedAt;
    }

    public CustomerDataRequestSubmission setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }
}
