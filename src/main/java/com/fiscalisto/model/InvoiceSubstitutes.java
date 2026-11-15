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
     * true si la sustituida ya quedó cancelada. false no es definitivo: vea substitutes.cancellation.
     */
    @JsonProperty("canceled")
    private Boolean canceled;

    /**
     * Por qué no se pudo cancelar la sustituida (cancélela con POST /v1/invoices/{id}/cancel).
     */
    @JsonProperty("cancel_error")
    private String cancelError;

    /**
     * La cancelación de la anterior, igual que su `cancellation` en GET /v1/invoices/{id}: `accepted` si ya quedó cancelada, `pending` si el SAT la está terminando (o espera al receptor), `scheduled` si Fiscalisto la vuelve a pedir sola, `failed` si hay que pedirla de nuevo. El webhook de la anterior dice cuando cambia.
     */
    @JsonProperty("cancellation")
    private InvoiceSubstitutesCancellation cancellation;

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
     * true si la sustituida ya quedó cancelada. false no es definitivo: vea substitutes.cancellation.
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

    /**
     * La cancelación de la anterior, igual que su `cancellation` en GET /v1/invoices/{id}: `accepted` si ya quedó cancelada, `pending` si el SAT la está terminando (o espera al receptor), `scheduled` si Fiscalisto la vuelve a pedir sola, `failed` si hay que pedirla de nuevo. El webhook de la anterior dice cuando cambia.
     */
    public InvoiceSubstitutesCancellation getCancellation() {
        return cancellation;
    }

    public InvoiceSubstitutes setCancellation(InvoiceSubstitutesCancellation cancellation) {
        this.cancellation = cancellation;
        return this;
    }
}
