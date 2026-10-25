// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateComercioExteriorRecipient: Destinatario, si no es el receptor (Destinatario).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExteriorRecipient {
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
    private InvoiceCreateComercioExteriorRecipientAddress address;

    /**
     * Nombre del destinatario (Nombre).
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateComercioExteriorRecipient setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Número de registro tributario del destinatario (NumRegIdTrib).
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoiceCreateComercioExteriorRecipient setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Domicilio del destinatario (Domicilio).
     * <p>
     * Obligatorio.
     */
    public InvoiceCreateComercioExteriorRecipientAddress getAddress() {
        return address;
    }

    public InvoiceCreateComercioExteriorRecipient setAddress(InvoiceCreateComercioExteriorRecipientAddress address) {
        this.address = address;
        return this;
    }
}
