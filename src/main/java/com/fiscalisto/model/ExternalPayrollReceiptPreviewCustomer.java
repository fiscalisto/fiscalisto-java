// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalPayrollReceiptPreviewCustomer: El empleado como receptor del CFDI (Receptor).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewCustomer {
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
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public ExternalPayrollReceiptPreviewCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public ExternalPayrollReceiptPreviewCustomer setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     */
    public String getZip() {
        return zip;
    }

    public ExternalPayrollReceiptPreviewCustomer setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
