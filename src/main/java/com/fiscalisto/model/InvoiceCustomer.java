// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * InvoiceCustomer: Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCustomer {
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
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private Map<String, Object> foreign;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public InvoiceCustomer setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public InvoiceCustomer setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal del domicilio fiscal del cliente (DomicilioFiscalReceptor), 5 dígitos.
     */
    public String getZip() {
        return zip;
    }

    public InvoiceCustomer setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public Map<String, Object> getForeign() {
        return foreign;
    }

    public InvoiceCustomer setForeign(Map<String, Object> foreign) {
        this.foreign = foreign;
        return this;
    }
}
