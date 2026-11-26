// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParamsComercioExteriorRecipient: Destinatario, si no es el receptor (Destinatario).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsComercioExteriorRecipient {
    /**
     * Nombre del destinatario (Nombre).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Número de registro tributario del destinatario (NumRegIdTrib).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Domicilio del destinatario (Domicilio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("address")
    private UpdateInvoiceParamsComercioExteriorRecipientAddress address;

    /**
     * Nombre del destinatario (Nombre).
     */
    public String getName() {
        return name;
    }

    public UpdateInvoiceParamsComercioExteriorRecipient setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Número de registro tributario del destinatario (NumRegIdTrib).
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateInvoiceParamsComercioExteriorRecipient setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Domicilio del destinatario (Domicilio).
     * <p>
     * Obligatorio.
     */
    public UpdateInvoiceParamsComercioExteriorRecipientAddress getAddress() {
        return address;
    }

    public UpdateInvoiceParamsComercioExteriorRecipient setAddress(UpdateInvoiceParamsComercioExteriorRecipientAddress address) {
        this.address = address;
        return this;
    }
}
