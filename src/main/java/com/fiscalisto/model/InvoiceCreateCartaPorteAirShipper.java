// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteAirShipper: Embarcador (RFCEmbarcador o NumRegIdTribEmbarc y ResidenciaFiscalEmbarc, NombreEmbarcador).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteAirShipper {
    /**
     * RFC del embarcador (RFCEmbarcador).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private InvoiceCreateCartaPorteAirShipperForeign foreign;

    /**
     * Nombre del embarcador (NombreEmbarcador).
     */
    @JsonProperty("name")
    private String name;

    /**
     * RFC del embarcador (RFCEmbarcador).
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateCartaPorteAirShipper setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public InvoiceCreateCartaPorteAirShipperForeign getForeign() {
        return foreign;
    }

    public InvoiceCreateCartaPorteAirShipper setForeign(InvoiceCreateCartaPorteAirShipperForeign foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * Nombre del embarcador (NombreEmbarcador).
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateCartaPorteAirShipper setName(String name) {
        this.name = name;
        return this;
    }
}
