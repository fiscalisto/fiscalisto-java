// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateCartaPorteFigure: InvoiceCreateCartaPorteFigure.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteFigure {
    /**
     * Tipo de figura (TipoFigura): 02 propietario, 03 arrendador, 04 notificado, 05 integrante.
     * <p>
     * Valores: 02, 03, 04, 05.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * RFC de la figura (RFCFigura).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private InvoiceCreateCartaPorteFigureForeign foreign;

    /**
     * Nombre de la figura (NombreFigura).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Partes del transporte que posee o arrienda (ParteTransporte), c_ParteTransporte.
     */
    @JsonProperty("parts")
    private List<String> parts;

    /**
     * Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
     */
    @JsonProperty("address")
    private InvoiceCreateCartaPorteFigureAddress address;

    /**
     * Tipo de figura (TipoFigura): 02 propietario, 03 arrendador, 04 notificado, 05 integrante.
     * <p>
     * Valores: 02, 03, 04, 05.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteFigure setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * RFC de la figura (RFCFigura).
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateCartaPorteFigure setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public InvoiceCreateCartaPorteFigureForeign getForeign() {
        return foreign;
    }

    public InvoiceCreateCartaPorteFigure setForeign(InvoiceCreateCartaPorteFigureForeign foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * Nombre de la figura (NombreFigura).
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateCartaPorteFigure setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Partes del transporte que posee o arrienda (ParteTransporte), c_ParteTransporte.
     */
    public List<String> getParts() {
        return parts;
    }

    public InvoiceCreateCartaPorteFigure setParts(List<String> parts) {
        this.parts = parts;
        return this;
    }

    /**
     * Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
     */
    public InvoiceCreateCartaPorteFigureAddress getAddress() {
        return address;
    }

    public InvoiceCreateCartaPorteFigure setAddress(InvoiceCreateCartaPorteFigureAddress address) {
        this.address = address;
        return this;
    }
}
