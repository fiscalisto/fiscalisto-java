// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateInvoiceBatchParams: los campos de «Timbrar un lote de facturas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateInvoiceBatchParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre del lote, para usted.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Las facturas, como el cuerpo de POST /v1/invoices, con reference opcional.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoices")
    private List<CreateInvoiceBatchParamsInvoice> invoices;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateInvoiceBatchParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre del lote, para usted.
     */
    public String getName() {
        return name;
    }

    public CreateInvoiceBatchParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Las facturas, como el cuerpo de POST /v1/invoices, con reference opcional.
     * <p>
     * Obligatorio.
     */
    public List<CreateInvoiceBatchParamsInvoice> getInvoices() {
        return invoices;
    }

    public CreateInvoiceBatchParams setInvoices(List<CreateInvoiceBatchParamsInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }
}
