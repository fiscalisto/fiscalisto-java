// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceSubstitutes: La factura que esta sustituyó y si quedó cancelada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceSubstitutes {
    /**
     * La factura sustituida (inv_…).
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * true si la sustituida ya quedó cancelada.
     */
    @JsonProperty("canceled")
    private Boolean canceled;

    /**
     * Por qué no se pudo cancelar la sustituida (cancélela con POST /v1/invoices/{id}/cancel).
     */
    @JsonProperty("cancel_error")
    private String cancelError;

    /**
     * La factura sustituida (inv_…).
     */
    public String getInvoice() {
        return invoice;
    }

    public InvoiceSubstitutes setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * true si la sustituida ya quedó cancelada.
     */
    public Boolean getCanceled() {
        return canceled;
    }

    public InvoiceSubstitutes setCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * Por qué no se pudo cancelar la sustituida (cancélela con POST /v1/invoices/{id}/cancel).
     */
    public String getCancelError() {
        return cancelError;
    }

    public InvoiceSubstitutes setCancelError(String cancelError) {
        this.cancelError = cancelError;
        return this;
    }
}
