// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteDriver: InvoiceCreateCartaPorteDriver.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteDriver {
    /**
     * RFC del operador (RFCFigura); vacío si es extranjero (con foreign).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Número de licencia (NumLicencia).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("license")
    private String license;

    /**
     * Nombre del operador (NombreFigura).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private InvoiceCreateCartaPorteDriverForeign foreign;

    /**
     * RFC del operador (RFCFigura); vacío si es extranjero (con foreign).
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateCartaPorteDriver setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Número de licencia (NumLicencia).
     * <p>
     * Obligatorio.
     */
    public String getLicense() {
        return license;
    }

    public InvoiceCreateCartaPorteDriver setLicense(String license) {
        this.license = license;
        return this;
    }

    /**
     * Nombre del operador (NombreFigura).
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateCartaPorteDriver setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public InvoiceCreateCartaPorteDriverForeign getForeign() {
        return foreign;
    }

    public InvoiceCreateCartaPorteDriver setForeign(InvoiceCreateCartaPorteDriverForeign foreign) {
        this.foreign = foreign;
        return this;
    }
}
