// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCustomer: InvoiceCreateCustomer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCustomer {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private InvoiceCreateCustomerForeign foreign;

    /**
     * true si el cliente es contribuyente de IEPS: el IEPS va desglosado en vez de sumado al precio.
     */
    @JsonProperty("ieps_taxpayer")
    private Boolean iepsTaxpayer;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     * <p>
     * Obligatorio.
     */
    public String getLegalName() {
        return legalName;
    }

    public InvoiceCreateCustomer setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     * <p>
     * Obligatorio.
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public InvoiceCreateCustomer setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     * <p>
     * Obligatorio.
     */
    public String getZip() {
        return zip;
    }

    public InvoiceCreateCustomer setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public InvoiceCreateCustomer setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public InvoiceCreateCustomerForeign getForeign() {
        return foreign;
    }

    public InvoiceCreateCustomer setForeign(InvoiceCreateCustomerForeign foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * true si el cliente es contribuyente de IEPS: el IEPS va desglosado en vez de sumado al precio.
     */
    public Boolean getIepsTaxpayer() {
        return iepsTaxpayer;
    }

    public InvoiceCreateCustomer setIepsTaxpayer(Boolean iepsTaxpayer) {
        this.iepsTaxpayer = iepsTaxpayer;
        return this;
    }
}
